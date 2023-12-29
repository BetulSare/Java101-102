package flight.management.system;

public class CoPilot extends Pilot {

    private String name;
    private int experience;

    public CoPilot(String name) {

        super(name);

    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getExperience() {
        return this.experience;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }
}