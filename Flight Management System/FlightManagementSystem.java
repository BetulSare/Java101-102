package flight.management.system;

import java.util.Date;

public class FlightManagementSystem {

    public static void main(String[] args) {

        Airport istanbul=new Airport();
        Airport adana=new Airport();
        istanbul.setId("123456");
        istanbul.setName("istanbul");
        adana.setId("246802");
        adana.setName("adana");
        Flight f1=new Flight("asdfgh");
        f1.setDeparturePort(istanbul);
        f1.setLandingPort(adana);
        Date departure=new Date();
        Date landing=new Date();
        f1.setDepartureTime(departure);
        f1.setLandingTime(landing);
        Pilot p1=new Pilot("Ahmet");
        p1.setExperience(5);
        f1.setPilot(p1);
        Customer Betul=new Customer("Betul");
        Betul.setFlight(f1);
        Betul.setName("Betul");


        System.out.printf("Welcome %s to our Flight Management System",Betul.getName());
        System.out.println("\nYour flight İnformation is : "+
                "\nPNR number: "+f1.getId()+
                "\nDeparture Port: "+f1.getDeparturePort().getName()+
                "\nLanding Port: "+f1.getLandingPort().getName()+
                "\nDeparture Time: "+f1.getDepartureTime()+
                "\nLanding Time: "+f1.getLandingTime()+
                "\nPilot is: "+f1.getPilot().getName());
    }

}