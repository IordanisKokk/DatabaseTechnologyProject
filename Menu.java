import java.util.Scanner;

public class Menu {

    Menu(){}
    
    public void runMenu(){
        System.out.println("Hello. Please select one of the following:");
        System.out.println("1. Create an Index for an OSM File.");
        System.out.println("2. Perform a Range Query on the Index.");
        System.out.println("3. Perform a k-nearest neighbour Query on the Index.");
        System.out.println("4. Perform a Skyline query.");
        System.out.println("5. Insert data points.");
        System.out.println("6. Delete data points.");
        System.out.println("0. Exit.\n");


        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        // scanner.close();
        if(choice == null || choice.isEmpty()){
            System.out.println("Please select a valid choice.\n");
            runMenu();
        }
        try{
            if(Integer.parseInt(choice) >= 0 && Integer.parseInt(choice) <= 6){
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
                    case "4":
                        System.out.println("Performing Skyline Query.\n");
                        break;
                    case "5":
                        System.out.println("Inserting Data Points.\n");
                        break;
                    case "6":
                        System.out.println("Deleting Data Points.\n");
                        break;
                }
    
            }else{
                System.out.println("Please select a valid choice.\n");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Your input was not a number.\n");
        }
        
        runMenu();
    }
}
