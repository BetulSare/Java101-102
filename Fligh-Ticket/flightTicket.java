
package flight.ticket;
import java.util.Scanner;
public class FlightTicket {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the distance in km: ");
        int distance = scan.nextInt();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print("Enter trip type: \n1-Tek yön \n2-Çift yön  ");
        int type = scan.nextInt();


        if(distance>0&&age>0&&(type==1||type==2)){
        double price = distance * 0.1;
        if (age < 12) {
            price = price * 0.5;
        } else if (age < 24) {
            price = price * 0.9;
        } else if (age > 64) {
            price = price * 0.7;
        }

        if(type==2){
        price=(price-(price*0.2))*2;
        }
        System.out.printf("total price is: %f",price);
    }
    else{
            System.out.println("Inputs are incorrect. Try again");}

}
}