package Q3;

import java.util.Scanner;

public class TollBooth {
    int carsPassed;
    float moneyCollected;

    TollBooth(){
        this.carsPassed=0;
        this.moneyCollected=0;
    }
    void payingCar(){
        this.carsPassed += 1;
        this.moneyCollected += 50;
    }
    void noPayCar(){
        this.carsPassed += 1;
    }
    void display(){
        System.out.println("Total Cars passed: " + this.carsPassed);
        System.out.println("Total money collected: " + this.moneyCollected);
        System.out.println("No Pay Cars: " + (this.carsPassed-(this.moneyCollected/50)));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TollBooth tollBooth = new TollBooth();
        boolean doQuit = false;
        String input;

        System.out.println("p for Pay, n for no pay, q to quit");

        while (!doQuit){
            input = scanner.next();
            if(input.equals("p")){
                tollBooth.payingCar();
            } else if (input.equals("n")) {
                tollBooth.noPayCar();
            } else if (input.equals("q")) {
                doQuit = true;
            } else {
                System.out.println("Invalid Key");
            }
        }
        scanner.close();
        tollBooth.display();
    }
}
