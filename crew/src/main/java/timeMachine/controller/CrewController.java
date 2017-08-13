package timeMachine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import timeMachine.domain.Booking;
import timeMachine.domain.Passenger;

@Controller
public class CrewController {
	
	@Autowired
    private RestTemplate restTemplate;
	
	@Value("${planetexpress.url}")
	private String planetExpressUrl;
    
    @Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@GetMapping("/passenger")
	public String passenger(Model model){
		model.addAttribute("passenger", new Passenger());
        return "passenger";
	}
	
	@PostMapping("/passenger")
	public String addPassenger(@ModelAttribute Passenger passenger, BindingResult bindingResult, Model model){
		final String uri = planetExpressUrl;		 	 
	    Booking result = restTemplate.postForObject( uri, passenger, Booking.class);
	    model.addAttribute("booking", result);
		return "result";
	}
	
}
