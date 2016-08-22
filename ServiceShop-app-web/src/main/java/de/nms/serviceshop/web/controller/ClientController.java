package de.nms.serviceshop.web.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import de.nms.serviceshop.web.model.Client;

@Controller
public class ClientController {

	@RequestMapping(value = "/clientManager", method = RequestMethod.GET)
	public String showClientManager() {
		return "clientManagerView";
	}

	@RequestMapping(value = "/clientManager/{clientId}", 
			method = RequestMethod.GET)
	public final ModelAndView showClient(@PathVariable final long clientId) {
		Client client = new Client();
		client.setClientId(clientId);
		return new ModelAndView("clientView", "client", client);
	}

}
