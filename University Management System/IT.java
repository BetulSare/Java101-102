public class IT extends Officer{
private String task;

public IT(String nameSurname, int tel, String mail, int breakTime, String department, int workHour,String task){
super(nameSurname, tel, mail, breakTime, department, workHour);
this.task=task;
}

public String getTask(){
    return this.task;
}

public void setTask(String task){
    this.task=task;

    }

    public void setupNetwork(){
    System.out.println("Network kurulum işlemi yapıldı! ");
    }
}