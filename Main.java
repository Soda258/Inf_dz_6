public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, "Toyota", "Mega Cruiser", 1996, "Black", 10560000.0, "Q147WE"),
            new Car(2, "Toyota", "Land Cruiser Prado", 2021, "Black", 6500000.0, "R258TY"),
            new Car(3, "Wolkswagen", "Polo X5", 2019, "Silver", 1500000.0, "U369IO"),
            new Car(4, "Wolkswagen", "Touareg", 2008, "Red", 1340000.0, "Q147DE"),
            new Car(5, "Ford", "F-150 XL", 2022, "Blue", 1340000.0, "D032BI"),
            new Car(6, "BMW", "M3", 2020, "Black", 60000.0, "G233EX")
        };
        
        
    }

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                count++;
            }
        }
        
        Car[] result = new Car[count];
        int index = 0;
        
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result[index] = car;
                index++;
            }
        }
        
        return result;
    }
}