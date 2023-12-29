package online.film.system;

public class Films {

    private String name;
    public boolean isThere=false;
    private double price;


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name; }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price; }
}