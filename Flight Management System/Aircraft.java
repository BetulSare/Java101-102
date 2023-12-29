package flight.management.system;

public class Aircraft {
    private String id;
    private int numbersOfPilot;
    private boolean IsInRepair;
    public Aircraft(String id){
        this.id=id;
        this.numbersOfPilot=this.numbersOfPilot;
        this.IsInRepair=this.IsInRepair;
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public int getNumbersOfPilot() {
        return this.numbersOfPilot;
    }

    public void setNumbersOfPilot(String numbersOfPilot) {
        this.numbersOfPilot = this.numbersOfPilot;
    }
    public boolean getIsInRepair() {
        return this.IsInRepair;
    }

    public void setId(boolean IsInRepair) {
        this.IsInRepair = this.IsInRepair;
    }
}