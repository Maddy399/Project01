package in.nit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.nit.model.ShipmentType;
import in.nit.sevice.IshipmentTypeService;

@RequestMapping("/shipment")
@Controller
public class ShipmentTypeController {
	@Autowired
	private  IshipmentTypeService service;

	@RequestMapping("/register")
	public String showRegpage() {
		return "ShipmentTypeRegisterpage";
	}


	@RequestMapping(value= "/save", method=RequestMethod.POST)
	public String saveShipment(@ModelAttribute ShipmentType ShipmentType, Model model) { 

		Integer Id= service.SaveShipmentType(ShipmentType);
		String message= "ShipmentType'"+Id+"'save";
		model.addAttribute("message", message);
		return "ShipmentTypeRegisterpage";

	}
}


