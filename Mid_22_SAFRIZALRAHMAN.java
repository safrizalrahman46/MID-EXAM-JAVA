
/**
 * Mid_22_SAFRIZALRAHMAN
 */

import java.util.Scanner;
public class Mid_22_SAFRIZALRAHMAN {

    public static void main(String[] args) {
        Scanner scanner22 = new Scanner(System.in);
        
            // INISIALISASI PERTAMA
            String numberPlate22;
            int vehicleType22, hours22;  
            double discount22, totalFee22;

            System.out.println(" --------------------------------");
            System.out.println("|    Welcome to Park arganda   |");
            System.out.println(" --------------------------------");


            System.out.print("Enter vehicle in type (2 for 2-wheeled, 4 for 4-wheeled): ");
            //INISIALISASI
            vehicleType22 = scanner22.nextInt();

            System.out.print("Enter duration of parking Vehicles  (in hours): ");
            hours22 = scanner22.nextInt();

            System.out.print("Enter vehicle number plate (e.g., N 509 AB): ");
            numberPlate22 = scanner22.next();

            int initialFee22;
            if (vehicleType22 == 2) {
                initialFee22 = 2000 * hours22;
            } else if (vehicleType22 == 4) {
                initialFee22 = 5000 * hours22;
            } else {
                System.out.println("Invalid vehicle type!");
                return;
            }

            discount22 = numberPlate22.startsWith("N 5") ? 0.005 * initialFee22 : 0;
            totalFee22 = initialFee22 - discount22;

            System.out.println("\nType of Vehicle: " + vehicleType22);
            System.out.println("Duration of Parking: " + hours22 + " hours");
            System.out.println("Number Plate: " + numberPlate22);
            System.out.println("Parking Fee: " + totalFee22);


            
            System.out.println(" --------------------------------");
            System.out.println("|           Thank You           |");
            System.out.println(" --------------------------------");

    }
}