package com.hta.studyroom.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hta.studyroom.repository.StudyroomDto;
import com.hta.studyroom.service.StudyroomService;

@Controller
public class DeleteReservationController {
	
	private StudyroomService studyroomService;
	
	public void setStudyroomService(StudyroomService studyroomService) {
		this.studyroomService = studyroomService;
	}
	
	@RequestMapping("/reservation.delete")
	public String delete(StudyroomDto dto, @RequestParam int reservation_num){
		System.out.println("1. 삭제할 예약 넘버:"+reservation_num);
		System.out.println("2. dto 삭제할 예약 넘버:"+dto.getReservation_num());
		try {
			studyroomService.resDelete(reservation_num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:reservation.search";
	}
	
}
