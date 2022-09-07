package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.Service;

@Controller
@RequestMapping("/")
public class CarController {

	@GetMapping(value = "cars")
	public String printCars(ModelMap model) {
		Service serv = new Service();
		model.addAttribute("listCars", serv.listCars());
		return "cars";
	}
	
}