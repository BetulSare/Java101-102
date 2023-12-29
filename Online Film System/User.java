package online.film.system;

import java.util.Arrays;

public class User {

    private String name;
    private double credit;
    private boolean subscriptionStatus = false;
    public Films[] myWatchlist=new Films[3];

    public User(String name) {
        this.name = name;
        this.credit = credit;
    }

    public double buyCredit(double credit) {
        this.subscriptionStatus = true;
        System.out.println("You subscribed");
        return this.credit += credit;
    }

    public void filmRequest(Films film) {
        System.out.println("Request created for "+film.getName());
    }

    public void buyFilm(Films film) {
        if (film.isThere && this.credit >= film.getPrice()) {
            System.out.println("You buy the " + film.getName());
            this.credit -= film.getPrice();
        }else{
            System.out.println(film.getName()+" does not exist . You can create a request");}
    }

    public void orderFilms(Films[] myWatclist) {
        Arrays.sort(myWatclist);
        System.out.println("Films sorted");
    }

    public void ToString() {
        System.out.println(this.name + " your watch list: ");
        for (int i = 0; i < this.myWatchlist.length; i++) {
            System.out.println((i + 1) + ". film: " + this.myWatchlist[i].getName());
        }
    }

    public void rentFilm(Films film) {
        if (film.isThere && this.credit >= film.getPrice() && this.subscriptionStatus) {
            System.out.println("You rent the " + film.getName());
            this.credit -= film.getPrice();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return this.credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public boolean getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
    public void setSubscriptionStatus(boolean subscriptionStatus) {
        this.subscriptionStatus=subscriptionStatus;
    }
}