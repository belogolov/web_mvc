package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.service.Service;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {

	@RequestMapping(value = "cars", method = RequestMethod.GET)
	public String printCars(ModelMap model) {
		Service serv = new Service();
		model.addAttribute("listCars", serv.listCars());
		return "cars";
	}
	
}