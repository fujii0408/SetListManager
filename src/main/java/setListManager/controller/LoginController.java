package setListManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import setListManager.form.LoginForm;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping("")
	public String getLogin(LoginForm form) {
		return "login/login";
	}
}
