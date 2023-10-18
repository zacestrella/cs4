import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static ArrayList<WaterStation> stationList = new ArrayList(); 
        public static void main(String[] args) {
            
        WaterTank homeTank = new WaterTank("John", 1000);
        WaterStation tap = new WaterStation("Tap", 1.5, 1000);
        WaterStation mw = new WaterStation("Manila Water", 8, 0);
        WaterStation maynilad = new WaterStation("Maynilad", 6.5, 0);
        
        Scanner scanner = new Scanner(System.in);
        String userInput = " ";
        
        stationList.add(tap);
        stationList.add(mw);
        stationList.add(maynilad);
        
        while ((homeTank.getAmountFilled() <= 100) && (!userInput.equals("exit"))){
            System.out.println("Current amount filled: " + homeTank.getAmountFilled() + "L");
            System.out.println("Type 'exit' to exit or choose a water station to fill the tank:");

            // Display available water stations
            System.out.println("Available Water Stations:");
            for (WaterStation station : stationList) {
                System.out.println(station.getName());
            }

            userInput = scanner.nextLine();

            if (!userInput.equals("exit")) {
                WaterStation selectedStation = null;

                // Find the selected station
                for (WaterStation station : stationList) {
                    if (station.getName().equalsIgnoreCase(userInput)) {
                        selectedStation = station;
                        break;
                    }
                }

                if (selectedStation != null) {
                    System.out.println("Enter the amount to fill the tank from " + selectedStation.getName() + ":");
                    double fillAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline character

                    homeTank.fill(selectedStation, fillAmount);
                } else {
                    System.out.println("No such water station called " + userInput + ".");
                }
            }
        }

        // Display stats
        System.out.println("\nFinal Stats:");
        homeTank.displayStats();
        for (WaterStation station : stationList) {
            station.displayStats();
        }
       
        }
        
}
