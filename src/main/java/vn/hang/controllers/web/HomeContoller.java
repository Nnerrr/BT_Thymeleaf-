package vn.hiuz.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeContoller {
	
	@GetMapping("/admin/home")
	public String index() {
		return "web/home";
	}
}
