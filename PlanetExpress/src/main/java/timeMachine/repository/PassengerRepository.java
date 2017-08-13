package timeMachine.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import timeMachine.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {
	Passenger findByPgid(Long pgid);
	Passenger findByPgidAndPlaceAndDate(Long pgid, String place, Date date);
}
