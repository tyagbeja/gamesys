package timeMachine.controller;

import java.util.Calendar;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import timeMachine.domain.Booking;
import timeMachine.domain.Passenger;
import timeMachine.repository.PassengerRepository;

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerRepository passengerRepository;
	
	@RequestMapping("/passenger")
	public Passenger passenger(@RequestParam(value="pgid") String pgid){
		return passengerRepository.findByPgid(Long.valueOf(pgid));
	}
	
	@RequestMapping("/passenger/addOne")
	public Passenger addOnePassenger(){
		Passenger psngr = new Passenger();
		psngr.setId(1);
		psngr.setPgid(1);
		psngr.setDate(Calendar.getInstance().getTime());
		psngr.setPlace("Lagos");
		if (!passengerRepository.exists(psngr.getPgid())){
			passengerRepository.save(psngr);
		}
		return psngr;
	}
	
	@PostMapping("/passenger/add")
	public Booking addPassenger(@Valid @RequestBody Passenger passenger){
		Booking result = new Booking ("Failed","You are already have a booking for that place on that day");
		if (passengerRepository.findByPgidAndPlaceAndDate(passenger.getPgid(), passenger.getPlace(), passenger.getDate())== null){
			passengerRepository.save(passenger);
			result.setMessage("Enjoy you travel through time");
			result.setStatus("Successful");
		}
		return result;
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Passenger> getAllPassengers() {
		return passengerRepository.findAll();
	}

}
