import java.util.Arrays;
// Q4
public class CarParkingDemo {
    public static void main(String[] args) {
        CarParking carParking = new CarParking();
        carParking.showAvailability();

        Car car1 = new Car(123, "Ford boi", 256);
        Car car2 = new Car(123, "Ford boi", 257);
        Car car3 = new Car(123, "Ford boi", 258);


        carParking.parkCar(car1);
        carParking.parkCar(car2);
        carParking.showAvailability();
        carParking.parkCar(car3);

        carParking.showAvailability();

        carParking.getCar(car1);
        carParking.showAvailability();
        carParking.getCar(car2);
        carParking.getCar(car3);

        carParking.showAvailability();
    }
}
class Car {
    int regNo;
    String ownerName;
    int tokenNo;

    public Car(int regNo, String ownerName, int tokenNo) {
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.tokenNo = tokenNo;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getTokenNo() {
        return tokenNo;
    }

    public void setTokenNo(int tokenNo) {
        this.tokenNo = tokenNo;
    }
}
class CarParking {
    int[][] parkingLot;
    final static int[] parkingLimit = new int[]{5,4,3,2,1};
    CarParking(){
        // initialising parkingLot
        this.parkingLot = new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
    }
    void showAvailability(){
        int[] parkingAvailable = new int[]{0,0,0,0,0};
        for (int i = 0; i < parkingLimit.length; i++) {
            System.out.print("Floor " + (i+1) + ": ");
            for (int j = 0; j < parkingLimit[i]; j++) {
                if (parkingLot[i][j] == 0){
                    parkingAvailable[i] +=1;
                }
                System.out.print(parkingLot[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Available Parking: ");
        Arrays.stream(parkingAvailable).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
    void parkCar(Car car){
        boolean isParked = false;
        int parkingFloor=0;
        for (int i = 0; i < parkingLimit.length; i++) {
            for (int j = 0; j < parkingLimit[i]; j++) {
                if (parkingLot[i][j] == 0){
                 parkingLot[i][j] = car.tokenNo;
                 isParked = true;
                 parkingFloor = i+1;
                 break;
                }
            }
            if(isParked){
                break;
            }
        }
        if(isParked){
            System.out.println("Car parked in Floor " + parkingFloor);
        } else {
            System.out.println("Parking unavailable");
        }

    }
    void getCar(Car car){
        boolean isRemoved = false;
        int parkingFloor=0;
        for (int i = 0; i < parkingLimit.length; i++) {
            for (int j = 0; j < parkingLimit[i]; j++) {
                if (parkingLot[i][j] == car.tokenNo){
                    parkingLot[i][j] = 0;
                    isRemoved = true;
                    parkingFloor = i+1;
                    break;
                }
            }
            if(isRemoved){
                break;
            }
        }

        if(isRemoved){
            System.out.println("Parking space freed in Floor " + parkingFloor);
        }
    }
}
