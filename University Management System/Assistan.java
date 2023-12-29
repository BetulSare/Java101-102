public class Assistan extends Academicians{
    private int officeHour;
    Assistan(String nameSurname, int tel, String mail, int breaktime ,String department, String title, int officeHour){
        super(nameSurname,tel,mail, breaktime,department,title);
        this.officeHour = officeHour;
    }

    public void takeQuiz(){
        System.out.println("The quiz for " + this.getDepartment()  + " the course has been held");
    }

    public int getOfficeHour(){
        return this.officeHour;
    }
    public void setOfficeHour(int officeHour){
        this.officeHour = officeHour;
    }
}
