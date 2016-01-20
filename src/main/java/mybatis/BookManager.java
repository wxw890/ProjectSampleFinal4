package mybatis;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLClientInfoException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import com.hta.book.repository.BookDto;
import com.hta.book.repository.BookResDto;
import com.hta.book.repository.BookandRentalDto;
import com.hta.book.repository.ConditionDto;
import com.hta.book.repository.RentalInfoDto;

public class BookManager {
	private static SqlSessionFactory sqlFactory;
	static{
		try{
			Reader reader = Resources.getResourceAsReader("mybatis/sqlmapConfig.xml");
			sqlFactory = new SqlSessionFactoryBuilder().build(reader);
		}
		catch(IOException err){
			throw new RuntimeException("SqlSessionFactory �씤�뒪�꽩�뒪 �깮�꽦 �떎�뙣!!!");
		}
	}
	//도서 추가 메서드
	public static void bookinput(BookDto dto){
		SqlSession session = sqlFactory.openSession();
		session.insert("bookinput", dto);
		session.commit();
	}
	//전체리스트 출력
	public static List getList() {
		List list = null;
		
		SqlSession session = sqlFactory.openSession();//�꽭�뀡蹂꾨줈 sql �옉�뾽�븷�닔 �엳�룄濡� �뿴�뼱�넃�뒗寃�
		list = session.selectList("booklist");
	
		return list;
	}
	// 도서 내용 보기
	public static BookDto finBynum(int book_num){
		SqlSession session = sqlFactory.openSession();
		BookDto dto = session.selectOne("findBynum", book_num);
		return dto;
	}
	//오늘 등록한 책 리스트
	public static List todayList() {
		List list = null;
		
		SqlSession session = sqlFactory.openSession();//�꽭�뀡蹂꾨줈 sql �옉�뾽�븷�닔 �엳�룄濡� �뿴�뼱�넃�뒗寃�
		list = session.selectList("todaybooklist");
	
		return list;
	}
	//책 삭제
	public static void deletebook(int book_num) {
		SqlSession session = sqlFactory.openSession();
		System.out.println("managerag :"+ book_num);
		session.delete("deletebook", book_num);
		session.commit();
	}
	//책 수정
	public static void updatebook(BookDto dto) {
		SqlSession session = sqlFactory.openSession();
		session.update("updatebook", dto);
		session.commit();
		
	}
	
	public static List samelist(String book_title) {
		
		List list = null;
		SqlSession session = sqlFactory.openSession();//�꽭�뀡蹂꾨줈 sql �옉�뾽�븷�닔 �엳�룄濡� �뿴�뼱�넃�뒗寃�
		list = session.selectList("samelist", book_title);
		
		return list;
	}
	
	//조건검색
	public static List condition1(ConditionDto dto) {
		List list = null;
		
		
		System.out.println("manager :"+ dto.getValue() +","+dto.getItem());
		System.out.println("3번째 조건 :"+ dto.getOp() +","+dto.getThirditem());
		System.out.println("2번째조건 :"+ dto.getSecondvalue() +","+dto.getSeconditem());
		System.out.println("3번ㅉㄴ :"+ dto.getThirdvalue() +","+dto.getSecondop());
		SqlSession session = sqlFactory.openSession();//�꽭�뀡蹂꾨줈 sql �옉�뾽�븷�닔 �엳�룄濡� �뿴�뼱�넃�뒗寃�
		list = session.selectList("condition1", dto);
		
		return list;
	}
	//조건검색
	public static List condition2(ConditionDto dto) {
		List list = null;
		SqlSession session = sqlFactory.openSession();//�꽭�뀡蹂꾨줈 sql �옉�뾽�븷�닔 �엳�룄濡� �뿴�뼱�넃�뒗寃�
		list = session.selectList("condition2", dto);
		return list;
	}
	//조건검색
	public static List condition3(ConditionDto dto) {
		List list = null;
		SqlSession session = sqlFactory.openSession();//�꽭�뀡蹂꾨줈 sql �옉�뾽�븷�닔 �엳�룄濡� �뿴�뼱�넃�뒗寃�
		list = session.selectList("condition3", dto);
		return list;
	}
	
	//책 대여
	public static void rentalbook(BookDto dto, RentalInfoDto infodto) {
		System.out.println("rentalmanager:"+infodto.getMember_email());
		System.out.println("rentalmanager:"+infodto.getBook_num());
		SqlSession session = sqlFactory.openSession();
		try{
		System.out.println("rentalmanager:"+dto.getBook_num());
		session.update("rentalbook", dto);
		session.insert("rentalinfo", infodto);
		session.commit();
		}
		catch(SqlSessionException err){
			System.out.println("rentalbook:"+ err);
		}
		finally{
		session.close();
		}
	}
	public static List mylist(BookandRentalDto joindto) {
		List list = null;
		SqlSession session = sqlFactory.openSession();
		list = session.selectList("mylist", joindto);
		return list;
	}
	
	//책 반납
	public static void bookreturn(int rental_num, int book_num) {
		SqlSession session = sqlFactory.openSession();
		System.out.println("managerag :"+ rental_num);
		try{
		session.update("bookreturnupdate", book_num);
		session.delete("bookreturn", rental_num);
		session.commit();
		}
		catch(SqlSessionException err){
			System.out.println("returnbook:"+ err);
		}
		finally{
		session.close();
		}
	}
	
	//책예약
	public static void bookres(int book_num, BookResDto resdto) {

		System.out.println("resmanager:"+resdto.getMember_email());
		System.out.println("resmanager:"+resdto.getBook_num());
		SqlSession session = sqlFactory.openSession();
		try{
			session.insert("resinfo", resdto);
			session.update("bookresupdate", book_num);
			session.commit();
			}
			catch(SqlSessionException err){
				System.out.println("rentalbook:"+ err);
			}
			finally{
			session.close();
			}
	}
	
	public static List myreslist(BookandRentalDto joindto) {
		List list = null;
		System.out.println("예약 :"+joindto.getMember_email());
		SqlSession session = sqlFactory.openSession();
		list = session.selectList("myreslist", joindto);
		return list;
	}
	public static void bookextension(int book_num) {
		SqlSession session = sqlFactory.openSession();
		session.update("bookextension", book_num);
		session.commit();
		
	}
	
	public static void bookrescancel(int book_num, int res_num) {
		
		SqlSession session = sqlFactory.openSession();
		try{
		session.delete("bookrescancel", res_num);
		session.update("bookresend", book_num);
		session.commit();
		}
		catch(SqlSessionException err){
			System.out.println("rescancelbook:"+ err);
		}
		finally{
		session.close();
		}
	}
	
}
