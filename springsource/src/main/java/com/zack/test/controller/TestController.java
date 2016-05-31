package com.zack.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zack.test.mq.topic.sender.TopicSender;
import com.zack.test.service.ITestService;

@Controller
public class TestController {

	@Autowired
	private ITestService testService;
	
	@Autowired
	private TopicSender topicSender;
	
	@RequestMapping("test")
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response){
		String test = this.testService.test();
		
		topicSender.sendMsg("topic.first", "发给第一个接受者的消息");
		topicSender.sendMsg("topic.second", "发给第二个接受者的消息");
		topicSender.sendMsg("topic.second", "发给第二个接受者的消息");
		return new ModelAndView("test","test",test);
	}
}
