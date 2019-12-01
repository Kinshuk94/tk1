package rest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.glassfish.jersey.client.ClientConfig;
import org.json.JSONObject;

import flight.Flight;
import flight.Flights;
import flight.JFlightDetails;

@Path("/bookingservice")
public class ReservationBookingController implements Serializable {

	Flight flight;
	// JFlightDetails flightDetails;
	List<Flight> flights;

	// ReservationBookingController(){
	// flightDetails = new JFlightDetails();
	// }
	@Path("getFlights")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getAllFlights() throws JsonParseException, JsonMappingException, IOException {
		// flightDetails = new JFlightDetails();
		// flight = new Flight();
		List<Flight> flights = new ArrayList<Flight>();
		GenericEntity<List<Flight>> Flightlist ;
	
		 ObjectMapper mapper = new ObjectMapper();
		 String path = new File("").getAbsolutePath()+"/src/main/java/rest/DefaultData.json";
		System.out.println("Current Path"+new File("").getAbsolutePath());

		 Flights allFlights = new Flights();
			flights = mapper.readValue(new File(path), new TypeReference<List<Flight>>() {
			});
			allFlights.setFlights(flights);
			 Flightlist = new GenericEntity<List<Flight>> (flights){};
			System.out.println("Current Path"+new File(".").getAbsoluteFile());
		
	
	
		// InputStream is = Flight.class.getResourceAsStream("DefaultData.json");
		// try {
		// 	flight = mapper.readValue(is, Flight.class);
		// } catch (IOException e) {
		// 	// TODO Auto-generated catch block
		// 	e.printStackTrace();
		// }

		//JSONObject jsonObject = new JSONObject("../Flights/DefaultData.json");
		//String flightName = (String) jsonObject.get("flightName");
		System.out.println("Right hhere");
		return Response.ok(Flightlist).build();
	}

	// @Path("flight/{flightId}")
	// @PUT
	// public  int setFlight(final Flight flight) {
	// 	 Iterator<Flight> it = flights.iterator();
	// 	ResponseBuilder response = new ResponseBuil
	// 	List<Flight> replaceableList = new ArrayList<>();
	// 	int count = 0;
	// 	boolean set;
	// 	while(it.hasNext()){
	// 		if(flight.equals(it)){
				
	// 			flights.set(count,flight);
	// 			response.status(Status.CREATED);
	// 	//		flights.replaceAll(flight);
					
	// 		}
	// 		count ++;
	// 	}
	// 	return response.getStatus();
	// }

	
	// @Path("showFlight")
	// @GET
	// @Produces(MediaType.TEXT_PLAIN)
	// public String getAllFlights( ) {
	// 	JSONObject jsonObject = new JSONObject("DefaultData.json");
	// 	String flightName = (String) jsonObject.get("flightName");
	// 	System.out.println("Right hhere");
	// 	return flightName ;
	// }



	// public static Object readJsonSimpleDemo(String filename) throws Exception {
	// 	FileReader reader = new FileReader(filename);
		
	// 	JSONParser jsonParser = new JSONParser();
	// 	return jsonParser.parse(reader);
	// }

	// public List<Flight> getAllFlights( List<Flight> flights) {
	// 	JSONObject jsonObject = new JSONObject("DefaultData.json");
	// 	String flightName = (String) jsonObject.get("flightName");
	// 	return flights;
	// }

}

