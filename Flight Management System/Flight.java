package flight.management.system;

import java.util.Date;

public class Flight {

    private String id;
    private Airport landingPort;
    private Airport departurePort;
    private Date landingTime;
    private Date departureTime;
    private Pilot pilot;
    private CoPilot coPilot;

    public Flight(String id) {
        this.departurePort = this.departurePort;
        this.departureTime = departureTime;
        this.id = id;
        this.landingPort = this.landingPort;
        this.landingTime = this.landingTime;
        this.pilot = this.pilot;
        this.coPilot = this.coPilot;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Airport getLandingPort() {
        return this.landingPort;
    }

    public void setLandingPort(Airport landingPort) {
        this.landingPort = landingPort;
    }

    public Airport getDeparturePort() {
        return this.departurePort;
    }

    public void setDeparturePort(Airport departurePort) {
        this.departurePort = departurePort;
    }

    public Date getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(Date departuretime) {
        this.departureTime = departuretime;
    }

    public Date getLandingTime() {
        return this.landingTime;
    }

    public void setLandingTime(Date landingtime) {
        this.landingTime = landingtime;
    }

    public Pilot getPilot() {
        return this.pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Pilot getcoPilot() {
        return this.coPilot;
    }

    public void setcoPilot(CoPilot coPilot) {
        this.coPilot = this.coPilot;
    }
}