package flight;

import java.util.ArrayList;
import java.util.List;

public class FlightsData extends Flight {
    public static List<Flight> listOfFlights = new ArrayList<>();
    
    //Flight flight = new flight();
    public static void demoFlightValues(){
        Flight flight = new Flight();
        //flight.setFlightName("");
        setDefaultValues();
    }
    public static void main(String[] args){
        //set default values to populate.
        setDefaultValues();
    }
    public void checkFreeSeats(Flight flight){

    }
    public static void setDefaultValues(){
        Flight flight =  new Flight();
        flight.setFlightType(FlightType.Airbus);
        flight.setFlightId("Airbus 123");
        flight.setSource("FRA");
        flight.setDestination("MUM");
        flight.setTiming("10:00");
        flight.setSeatType(SeatType.EconomyPlus);
        listOfFlights.add(flight);
        System.out.println(flight.toString());
    }
}