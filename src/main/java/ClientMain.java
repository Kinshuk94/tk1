import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.xml.ws.Endpoint;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import flight.Flight;
import flight.JFlightBook;
import soap.ReservationBookingService;

public class ClientMain {
	static JFlightBook flightBook;

	public static void main(String[] args) {

		flightBook = new JFlightBook();

		String uri = "http://localhost:8090/bookingservice";
		// run SOAP server
		// Endpoint.publish("http://localhost:8090/bookingservice", new ReservationBookingService());

		// // run REST server
		Client client = ClientBuilder.newClient();
		Flight flight = client.target(uri).request().get(Flight.class);
		 ResourceConfig rc = new ResourceConfig().packages("rest");
		 JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
	}

}