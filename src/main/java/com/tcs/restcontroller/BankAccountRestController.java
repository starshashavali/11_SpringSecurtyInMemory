package com.tcs.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountRestController {
	@GetMapping("/home")
	public String getHome() {
		return "Welcome to OURBANK...";
	}

	@GetMapping("/ministatements")
	public String checkBalance() {
		return " Your bank statements are send to your email id...";
	}

	@GetMapping("/balance")
	public String accountBalance() {
		return "Available balance 6666999999993Billians ";
	}

	@GetMapping("/contact")
	public String contactUs() {
		return "Thank for contacting... ";
	}

}
