package com.hta.board.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;


import com.hta.board.repository.UploadDto;

import com.hta.board.service.BoardService;

@Controller
public class UploadController {
	private MultipartResolver files;
	

	@RequestMapping("/upload.spring")//params={"ver=first"}는 파라미터가 first인 요청을 받는다라는 뜻
	public String firstHandle(){
		return "/board/upload1";
	}
	

	@RequestMapping(value="/upload.spring", method=RequestMethod.POST)
	public ModelAndView firstSubmitHandler(@ModelAttribute UploadDto uploadDto, HttpServletRequest req, HttpSession session) throws IOException{
		ModelAndView mav = new ModelAndView("/board/write");
		//String title = req.getParameter("title");
		//System.out.println("뭐냐"+title);

		String filePath = uploadDto.getFiles().getName();
		String fileName = uploadDto.getFiles().getOriginalFilename();
		long fileSize = uploadDto.getFiles().getSize(); 
		System.out.println("업로드파일"+fileName);
		System.out.println("1업로드파일경로"+filePath);
		//String path = 
				//WebUtils.getRealPath(req.getSession().getServletContext(), "/Uploadimages/");//WebUtils.getRealPath는 실제 경로를 전달해준다. 즉, upload폴더의 위치를 알아 낼수 있다.
		//System.out.println("2업로드파일경로"+path);
		File file = new File("F:/springWorkspace2/ProjectSampleFinal-master/src/main/webapp/images/Uploadimages/"+uploadDto.getFiles().getOriginalFilename());
		System.out.println("3.업로드 파일경로"+ file.getPath());
		String path2="images/Uploadimages/";
		session.setAttribute("filename", fileName);
		session.setAttribute("filepath", path2);
		
		try{
			uploadDto.getFiles().transferTo(file);//경로부분에 저장
			mav.addObject("path", path2);
			mav.addObject("name", fileName);
		}catch(IllegalStateException e1){
			e1.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}
		return mav;
		
		
		/*
		MultipartFile file = uploadDto.getUpFile();//uploadDto.getUpFile()의 type이 MultipartFile이므로 MultipartFile로 받아준다.
		System.out.println(uploadDto.getUpFile().getOriginalFilename());
		String path = 
			WebUtils.getRealPath(req.getSession().getServletContext(), "/upload");//WebUtils.getRealPath는 실제 경로를 전달해준다. 즉, upload폴더의 위치를 알아 낼수 있다.
		System.out.println("파일경로:"+path);
		UploadDao uploadDao = new UploadDao();
	
		
		boardService.writeFile(file, path, file.getOriginalFilename());//실제 파일 업로드를 시켜주는 부분
		*/
		
	}
	
}
