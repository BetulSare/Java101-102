import java.time.LocalTime;

public abstract class Academicians extends Employee {
    private String department;
    private String title;

    public Academicians(String nameSurname, int tel, String mail, int breaktime, String department, String title) {
        super(nameSurname, tel, mail, breaktime);
        this.department = department;
        this.title = title;
    }

    public void entrySubject() {
        LocalTime time = LocalTime.now();
        System.out.println(this.department + "course was entered at " + time);
    }


    public String getDepartment() {
        return this.department;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String department) {
        this.department = department;

    }

    public void setDepartment(String title) {
        this.title = title;
    }

}