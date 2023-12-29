public class Lecturer extends Academicians{
    private int doorNumber;
    private Assistan assistan;

    Lecturer(String nameSurname, int tel, String mail, int breaktime, String department, String title, int doorNumber, Assistan assistan){
        super(nameSurname, tel, mail, breaktime, department, title);
        this.doorNumber = doorNumber;
        this.assistan = assistan;
    }

    public void senateMeeting(){
        System.out.println("A senate meeting was held with " + this.assistan.getNameSurname());
    }

    public void takeExam(){
        System.out.println("The exam for " + this.getDepartment()  + " the course has been held");
    }

    public int getDoorNumber(){
        return this.doorNumber;
    }

    public void setDoorNumber(int doorNumber){
        this.doorNumber = doorNumber;
    }
    public Assistan getAssistan(){
        return this.assistan;
    }
    public void setAssistan(Assistan assistan){
        this.assistan = assistan;
    }
}
