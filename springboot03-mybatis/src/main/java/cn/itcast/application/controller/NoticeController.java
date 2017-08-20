package cn.itcast.application.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.itcast.application.service.NoticeService;

@RestController
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@PostMapping("/findByPage")
	public Map<String, Object> findByPage(Integer page , Integer rows){
		return noticeService.findByPage((page-1)*rows,rows);
	}
}
