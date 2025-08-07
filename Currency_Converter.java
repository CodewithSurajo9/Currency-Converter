import java.util.*;

public class Currency_Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.print("Enter your choice (1 or 2 or 3 or 4): ");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter the amount in USD: ");
            double USD = sc.nextDouble();
            double Rupee = usdToRupee(USD);
            System.out.println("Converted amount in Rupee: " + Rupee);
        } else if(choice == 2){
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = sc.nextDouble();
            double USD = RupeeToUsd(Rupee);
            System.out.println("Converted amount in USD: " + USD);
        } else if(choice == 3){
            System.out.print("Enter the amount in Euro: ");
            double Euro = sc.nextDouble();
            double Rupee = euroToRupee(Euro);
            System.out.println("Converted amount Rupee: " + Rupee);
        } else if(choice == 4){
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = sc.nextDouble();
            double Euro = RupeeToEuro(Rupee);
            System.out.println("Converted amount in Euro: " + Euro);
        }
        else{
            System.out.println("Invalid choice. Please select the correct choice.");
        }
        sc.close();
    }

    public static double usdToRupee(double USD){
        return USD * 87.46;                                  //Date: 07/09/2025
    }
    public static double RupeeToUsd(double Rupee){
        return Rupee * 0.011;
    }
    public static double euroToRupee(double Euro){
        return Euro * 101.77;
    }
    public static double RupeeToEuro(double Rupee){
        return Rupee * 0.0098;
    }
}
