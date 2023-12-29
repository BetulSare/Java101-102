public abstract class Officer extends Employee{
private String department;
private int workHour;

public Officer(String nameSurname,int tel, String mail, int breaktime, String department, int workHour){
    super(nameSurname, tel, mail, breaktime);
    this.department=department;
    this.workHour=workHour;

}

public int work(){
    int e = entryTime();
    int ex = e + this.workHour;
    int  isWork = isExit(e,ex);
    int payWorkHour = 0;
    for(int i=0; i<isWork;i++){
        System.out.println(isWork + " mesaisi başladı");
        payWorkHour++;
    }
    return payWorkHour;
}
 public int calculatePayment(){
        int time=isExit();
        int weekdaysSalary=100;
        int weekendSalary=150;
        int totalPayment;
        System.out.println("Haftaiçi '1' - Haftasonu '2'");
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        if(input==1){
        totalPayment=30*time*weekdaysSalary;
        System.out.println("Total Payment: "+totalPayment);
        return totalPayment;
        }
        else if(input==2){
        totalPayment=30*time*weekendSalary;
        System.out.println("Total Payment: "+totalPayment);
        return totalPayment;
        }
        else{
        System.out.println("Yanlış bir değer girdiniz.");
        return 0;
        }
    }
public String getDepartment(){
    return this.department;
}

public void setDepartment(String department){
    this.department=department;
}

public int getWorkHour(){
    return this.workHour;

}

public void setWorkHour(int workHour){
    this.workHour=workHour;
}


}