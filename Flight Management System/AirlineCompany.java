package flight.management.system;

public class AirlineCompany {

    private String name;
    private Pilot pilot;
    private CoPilot coPilot;
    private Aircraft aircraft;

    public AirlineCompany(String name) {
        this.name = name;
        this.pilot = this.pilot;
        this.coPilot = this.coPilot;
        this.aircraft = aircraft;
    }

    public Aircraft getAircraft() {
        return this.aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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