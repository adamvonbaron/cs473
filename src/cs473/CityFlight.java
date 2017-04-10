package cs473;

import org.mongodb.morphia.annotations.Id;
import java.util.Date;

public class CityFlight {
    @Id
	private String number;
	private String airport;
	private String to;
	private String airportTo;
	private String airline;
	private String airplane;
	private int seats;
	private int seatsTaken;
	private Date start;
	private Date end;
	private String day;

    public CityFlight(String number, String airport, String to, String airportTo,
                      String airline, String airplane, int seats, int seatsTaken,
                      Date start, Date end, String day) {
        this.number = number;
		this.airport  = airport;
		this.to 		   = to;
        this.airportTo = airportTo;
        this.airline = airline;
        this.airplane = airplane;
        this.seats = seats;
        this.seatsTaken = seatsTaken;
        this.start = start;
        this.end = end;
        this.day = day;
    }
}