package linebot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestPage {
	
	@RequestMapping(method=RequestMethod.GET)
	public String hello() {
		return "hello world";
	}
}
