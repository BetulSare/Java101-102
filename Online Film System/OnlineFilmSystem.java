package online.film.system;

public class OnlineFilmSystem {

    public static void main(String[] args) {

        User u1=new User("Ahmet");
        u1.setCredit(0);
        u1.buyCredit(1000);
        u1.setSubscriptionStatus(true);
        Films f1=new Films();
        Films f2=new Films();
        Films f3=new Films();
        Films f4=new Films();

        f1.setName("Arayış");
        f1.setPrice(180);
        f1.isThere=true;
        f2.setName("Descondest Of The Sun");
        f2.setPrice(100);
        f2.isThere=true;
        f3.isThere=true;
        f3.setName("Social Dilamma");
        f3.setPrice(150);
        f4.setName("Ben 4 Numara");
        f4.setPrice(120);
        u1.buyFilm(f1);
        u1.buyFilm(f4);

        u1.filmRequest(f4);
        u1.myWatchlist[0]=f1;
        u1.myWatchlist[1]=f2;
        u1.myWatchlist[2]=f3;

        u1.ToString();


    }

}