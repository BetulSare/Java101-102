package adventure.game;

import java.util.Scanner;

public class Game {

    //oyunun başlatan metot
    //oyun bu metot üzerinde ilerleyecek
    public void start() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to adventure game.");
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        Player player = new Player(name);
        System.out.println(player.getPlayerName() + " welcome");
        player.selectChar();
        Location location = new SafeHouse(player);
        location.onLocation();

//oyuncu kazanana ya da kaybedene kadar devam etmesini sağlar
        while (true) {

            System.out.println("---------------------------------------");
            System.out.println("Locations: \n1-Safe House \n2-Tool Store \n3-Mine \n4-River \n5-Cave \n6-Forest");
            System.out.println("---------------------------------------");

            System.out.print("Select location you want to go:");
            int selectLoc = scan.nextInt();
            String visitedList = "";

            switch (selectLoc) {
                case 1:
                    location = new SafeHouse(player);
                    //gidilen yerleri listeler bu liste her bölgeye gidilip gidilmediğini kontrol edecek
                    if (player.getVisitedLocations() != null) {
                        visitedList += player.getVisitedLocations();
                    }
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location=new Mine(player);
                    //bu bölgeye daha önce girilmişse girilmemesini sağlar ve oyuncuyu safe house'ye gönderir
                    if (player.getVisitedLocations().contains("Mine")) {
                        System.out.println("You have been visited, you can not visit again..");
                        location = new SafeHouse(player);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    
                    location = new River(player);
                    if (player.getVisitedLocations().contains("River")) {
                        System.out.println("You have been visited, you can not visit again..");
                        location = new SafeHouse(player);
                        break;
                    } else {
                        player.getInventory().setWater(true);
                        break;
                    }
                case 5:
                    location = new Cave(player);
                    if (player.getVisitedLocations().contains("Cave")) {
                        System.out.println("You have been visited, you can not visit again..");
                        location = new SafeHouse(player);
                        break;
                    } else {
                        player.getInventory().setFood(true);
                        break;
                    }
                case 6:
                    location = new Forest(player);
                    if (player.getVisitedLocations().contains("Forest")) {
                        System.out.println("You have been visited, you can not visit again..");
                        location = new SafeHouse(player);
                        break;
                    } else {
                        player.getInventory().setFireWood(true);
                        break;
                    }
                default:
                    location = new SafeHouse(player);
                    break;
            }

            boolean onLocation=location.onLocation();
            //onLocation metodu false ise oyunu kaybetmiştir ,
            //true ve her bölgeye gitmişse kazanılmıştır
            //sadece true ise o bölgeye ilk kez girilmiş ve temizlenmiştir ama oyun devam eder
            if (!onLocation) {
                System.out.println("GAME OVER!!");
                break;
            } else if (visitedList.contains("Forest")
                    && visitedList.contains("Cave")
                    && visitedList.contains("River")
                    && visitedList.contains("Mine")) {
                System.out.println(player.getPlayerName().toUpperCase()+" WİNN!!");
                break;
            } else if(onLocation){
                System.out.println("You earn "+location.getAward()+" from "+location.getName());
            }
            System.out.println();
            System.out.println();
        }
    }
}
