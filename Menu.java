import java.util.Scanner;

public class Menu {

    Menu(){}
    
    public void runMenu(){
        System.out.println("Hello. Please select one of the following:");
        System.out.println("1. Create an Index for an OSM File.");
        System.out.println("2. Perform a Range Query.");
        System.out.println("3. Perform a k-nearest neighbour Query.");
        System.out.println("0. Exit.\n");


        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        // scanner.close();
        if(choice == null || choice.isEmpty()){
            System.out.println("Please select a valid choice.\n");
            runMenu();
        }
        if(choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("0")){
            // System.out.println("You've selected a valid choice.");
            
            switch(choice){
                case "0":
                    System.out.println("Exiting...\n");
                    return;
                case "1":
                    System.out.println("Creating an R* Tree index.\n");
                    break;
                case "2":
                    System.out.println("Performing Range Query.\n");
                    break;
                case "3":
                    System.out.println("Performing k-nearest neighbour Query.\n");
                    break;
            }

        }else{
            System.out.println("Please select a valid choice.\n");
        }
        runMenu();
    }
}
