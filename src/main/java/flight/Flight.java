package flight;

import java.util.Map;

public class Flight {
    Map<String,Boolean> seatNumber;
    String flightName;
    String flightId;
    String source;
    String destination;
    String timing;
    String date;
    SeatType seatType; 
    MealType mealType;
    FlightType flightType;
    
    public String getFlightName() {
        return flightName;
    }
    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public Flight(String flightName) {
        this.flightName = flightName;
    }

   
    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }
    public Flight(){
        setNameOfFlight();
    }
    private void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    private void setNameOfFlight(){
        FlightType flightTyp;
        flightTyp = getFlightType();
        if(flightTyp==FlightType.Airbus)
        setFlightName("Airbus 319");
        else if(flightTyp == FlightType.Embraer)
        setFlightName("Embraer E170");
        else
        setFlightName("Boeing 737-900");
    }

    public Map<String, Boolean> getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Map<String, Boolean> seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
 }
enum SeatType{
    UnitedFirst,
    EconomyPlus,
    Economy
}   
enum MealType{
    Standard,
    Vegetarian,
    Vegan
}
enum FlightType{
    Airbus,
    Boeing,
    Embraer
}
