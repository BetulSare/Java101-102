public class Security extends Officer{
 private String document;

 public Security(String nameSurname,int tel, String mail, int breakTime, String department, int workHour, String document){
    super(nameSurname, tel, mail, breakTime, department, workHour);
    this.document=document;
 }

 public boolean isWatching(){
    System.out.println("Nöbet tuttunuz mu?: 'Y' ya da 'N'");
    Scanner scan=new Scanner(System.in);
    String input=scan.next();
    if(input.equals('Y'){
    System.out.println("Nöbet tutuldu.");
    }
    else if(input.equals('N'){
    System.out.println("Nöbet tutulmadı.");
    }
    else{
    System.out.println("Yanlış bir değer girdiniz.");
    }
}


 public String getDocument(){
 return this.document;
 }

 public void setDocument(String setDocument){
 this.document=document;
 }
}