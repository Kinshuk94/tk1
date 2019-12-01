package Client;

import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import flight.Flight;
import flight.JFlightBook;
import flight.JFlightDetails;

public class RestClient {
    JFlightDetails flightDetails;
    JFlightBook flightBook;
    List<Flight> flightList;

    public void showDetailsPage(){
        flightDetails = new JFlightDetails();
        flightDetails.setVisible(true);
        flightList = new ArrayList<Flight>();
        
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://localhost:8080/bookingservice");
        WebTarget path = webTarget.path("/getFlights");
        Invocation.Builder invocation = path.request(MediaType.APPLICATION_JSON);
        flightList = invocation.get(new GenericType<List<Flight>>(){});

        for(Flight flight:flightList){
            
        Container content =flightDetails.getContentPane();
        ComponentHandler componentHandler = content.getComponent
        }
    }
}