import java.time.LocalTime;
import java.util.Locale;

public class LabAssistan extends Assistan{
    LocalTime local = LocalTime.now();
    LabAssistan(String nameSurname, int tel, String mail, int breaktime, String department, String title, int officeHour){
        super(nameSurname, tel, mail, breaktime, department, title, officeHour);
    }

    public void attendLab(){
        System.out.println("The lab lesson started at " + local.getHour() + "." +local.getMinute());
    }

    public void attendLesson(){
        System.out.println("The lab lesson started at " + local.getHour() + "." +local.getMinute());
    }
}
