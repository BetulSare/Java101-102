
package boxing.match;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    
    public Ring(Fighter f1,Fighter f2,int minWeight,int maxWeight){
    this.f1=f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight <= maxWeight && f2.weight >= minWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçın kazananı: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçın kazananı: " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("--------------------------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                //eğer random sayı 0.5 ten küçükse f1 başlayacak ,eğer 0.5 ten büyükse f2 başlayacak.
                double order = Math.random();
                //order 0.5 ten büyük ise f1 başlıyor.
                if (order >= 0.5) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
                //order 0.5 ten küçük ise f2 başlıyor.
                else{
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    
    
    
}
