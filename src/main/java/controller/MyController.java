package controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import beans.UsingResourceBean;

@Controller
public class MyController {

	@Autowired
	private UsingResourceBean myBean;

	@RequestMapping("/*")
	@ResponseBody
	public String serve() throws IOException {
		return myBean.getContent();
	}

}
