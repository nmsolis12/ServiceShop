package de.nms.serviceshop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientController {

	@RequestMapping(value = "/clientManager", method = RequestMethod.GET)
	public String manageClients() {
		return "clientManagerView";
	}
}
