package cs473;

import org.mongodb.morphia.annotations.Id;
import java.util.date;

public class FlightQuery {
    @Id
    private int number;
    private String airline;
    private String from;
	private String to;
	private String airplane;
	private int seats;
	private int seatsTaken;
	private Date start;
	private Date end;
	private int distance;
	private String day;

    public FlightQuery(int number, String airline, String from, String to, String airplane,
					   int seats, int seatsTaken, Date start, Date end, int distance, String day) {
        this. number 	= number;
        this.airline	= airline;
        this.from = from;
		this.to = to;
		this.airplane = airplane;
		this.seats = seats;
		this.seatsTaken = seatsTaken;
		this.start = start;
		this.end = end;
		this.distance = distance;
		this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TravellerFlight getFlight(int id) {
        return flights.get(id);
    }
}
