package by.senla.lessons.aircraft;

public class PassengerAircraft extends Aircraft {
    private int place;

    public PassengerAircraft() {

        System.out.println("PassengerAircraft");
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void yourSeatPlace() {
        System.out.println("place = " + place);
    }


}