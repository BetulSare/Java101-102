import java.time.LocalTime;
import java.util.*;

public class Employee {
    private String nameSurname;
    private int tel;
    private String mail;
    private int breaktime;

    Employee(String nameSurname, int tel, String mail, int breaktime){
        this.nameSurname = nameSurname;
        this.tel = tel;
        this.mail = mail;
        this.breaktime = breaktime;
    }

    public int entryTime(){
        LocalTime now= LocalTime.now();
        return now.getHour();
    }

    public int isExit(int entry,int exit){
        int workHour = exit-entry;
        if(workHour>=8){
            System.out.println("mesai doldu");
            workHour = 0;
        }
        else{
            System.out.println("mesai saatinin bitmesine " + workHour + " saat kaldı");
        }
        return workHour;
    }



    public void refactory(){
        boolean isEntry = true;
        this.breaktime--;
        while(isEntry){
            Scanner input = new Scanner(System.in);
            System.out.println("The refactory has been entered");
            System.out.println("Do you want to stay in the refactory? [ Y:1 | N:2 ]");
            int answer = input.nextInt();
            if(answer == 1){
                this.breaktime--;
                System.out.println("Your balance: " + this.breaktime);
            }
            else{
                isEntry = false;
                System.out.println("Your balance: " + this.breaktime);
            }
        }
    }


    public String getNameSurname(){
        return this.nameSurname;
    }
    public void setNameSurname(String ns){
        this.nameSurname = ns;
    }

    public int getTel(){
        return this.tel;
    }
    public void setTel(int tel){
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getBreaktime() {
        return breaktime;
    }

    public void setBreaktime(int breaktime) {
        this.breaktime = breaktime;
    }
}
