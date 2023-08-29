import java.util.*;
import java.util.Random;

// import javafx.scene.paint.Stop;  


public class CourierManagementSystem {
    static Scanner scanner= new Scanner(System.in);
    static Random random = new Random();   

    static String text,name,Destination,r_name,state,district,House_no;
    static String Locations[] = new String[]{"Jalandhar", "Phagwara", "Chandigarh", "Amritsar", "Ludhiana","Delhi"};

    // Locations[]= {"Jalandhar","Phagwara","Chandigarh","Amritsar","Ludhiana"};
    

    static String[] new_Locations= new String[5];
   static int ons,size,ID;
    static Integer[] new_id= new Integer[5];
    static int newid,pincode;
    static String[] newLocations = new String[5];
    // static String[] Admin= new String[3];
    static int[] pkgid=new int[5];

    static Double packageWeight,cost;
    static String Admin[]={"Vishvajeet","Nikhil","Dipanshu"};
    static Integer[] Admin_Pass={6267,72096,9111};
     static String[] packages= new String[5];
     

    public static void main(String[] args) throws InterruptedException {
       
        // Locations[0]="Jalandhar";
        // Locations[1]="Phagwara";
        // Locations[2]="Chandigarh";
        // Locations[3]="Amritsar";
        // Locations[4]="Ludhiana";
        // Locations[5]="Delhi";
       String ansi="\u001B[41m";
       String ansi_reset="\u001B[0m";
       
       
       
        try{
        String text = ansi+"****************Welcome To Courier Management System****************"+ansi_reset;
        int delay = 55; // Delay between each character (in milliseconds)
        
        
        for (int i = 0; i < text.length(); i++) {
            Thread.sleep(delay);
            System.out.print("\r" + text.substring(0, i+1));
        }
            
        
        
        
        try (Scanner scanner = new Scanner(System.in)) {
            int option;
            System.out.println("\n-----------------------------------------------------------------");
            // System.out.println("\033[0;4m" +"**** Welcome to the Courier Management System ****");
            // System.out.println("***************\n");
            do {
                System.out.println("\u001B[34m"+"1.Create Shipment"+"");
                System.out.println("2. Track Shipment");
                System.out.println(""+"3. View All Shipments  (For Admin)"+"");
                System.out.println(""+"4. View Invoice"+"");
                System.out.println(""+"5. Exit");
                System.out.println("6. Return to Main Menu");
                System.out.print("Choose an option: ");
                 option=scanner.nextInt();
               
                
               
            	

                switch (option) {
                    case 1:
                        addPackage();
                        break;
                    case 2:
                        trackPackage();
                        break;
                    case 3:
                    view_All_Shipmetns();
                        break;
                    case 4:
                        viewInvoice();
                        break;
                    case 5:
                        exit();
                        break;
                    case 6:
                        System.out.println("Return to main Menu");
                     default:
                        System.out.println("!!Oops Invalid Option Try Again :(");
                }
            } while (option != 5);
        }
       }
       catch(InputMismatchException e){
        System.out.println("Invalid input....");
        System.out.println("Exiting....");
       }

    }

//Create Shipment
    public static void addPackage() throws InputMismatchException {
       try{
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter  Your Name : ");
        name = scanner.next();
        System.out.println("Enter  Receiver's Name:- ");
        r_name=scanner.next();
        System.out.print("Enter the weight of the Package in KG: ");
        packageWeight = scanner.nextDouble();
        // scanner.nextLine();

    while (packageWeight <= 0 || packageWeight > 50) {
    if (packageWeight == 0) {
        System.out.println("You have entered an invalid weight. Please enter a valid weight.");
        System.out.println("Enter the weight again: ");
        packageWeight = scanner.nextDouble();
    } else if (packageWeight > 50) {
        System.out.println("Sorry! We cannot deliver packages above 50KG.");
        System.out.println("Enter the weight again: ");
        packageWeight = scanner.nextDouble();
        scanner.nextLine();
    }
scanner.close();
}

    


System.out.println("Enter the Destination of the Package:- ");
     Destination=scanner.next();
    
        boolean destinationFound = true;
        for (int i=0;i<Locations.length;i++) {
            if (Locations[i].equals(Destination)) {   //for String Comparision we have to use equals
                destinationFound = false;
                // System.out.println(destinationFound);
                break;
            }
        }
        
        // System.out.println(destinationFound);
    
        if (destinationFound==false) {
            System.out.println("Enter the PIN CODE of Area:- ");
            pincode=scanner.nextInt(); 
            System.out.println("Enter the House Number:- ");
            House_no=scanner.next();
            System.out.println("Package added successfully!");
            ID = random.nextInt(2000);
            System.out.println("Your Tracking ID is: " + ID);

            String[] newPackages = Arrays.copyOf(packages, packages.length + 1);
            newPackages[newPackages.length - 1] = name;
            packages = newPackages;
            
            int[] newPkgid = Arrays.copyOf(pkgid, pkgid.length + 1);
            newPkgid[newPkgid.length - 1] = ID;
            pkgid = newPkgid;

            String[] newLocations = Arrays.copyOf(Locations, Locations.length + 1);
            newLocations[newLocations.length - 1] = Destination;
            Locations = newLocations;
            

        } 
        else {
            
            System.out.println("Sorry, our services are not available in " + Destination);
            System.out.println("To send the Package to " + Destination + " you have to pay extra charges:");
            System.out.println("NOTE: For other locations we need help of third-party courier services, so the charges may be high compared to domestic locations.");
    
            System.out.println("Enter the State:- ");
            state=scanner.next();

            System.out.print("Enter the name of the Destination: ");
            String newLocation = scanner.next();

            System.out.println("Enter the PIN CODE of Area:- ");
            pincode=scanner.nextInt(); 
            System.out.println("Enter the House Number:- ");
            House_no=scanner.next();
    
            newid = random.nextInt(2000);
            System.out.println("Package added successfully!");
            System.out.println("Your Tracking ID is: " + newid);
    
            // add the new location to the Locations array
            String[] newPackages = Arrays.copyOf(packages, packages.length + 1);
            newPackages[newPackages.length - 1] = name;
            packages = newPackages;
            //add the Tracking id to pkgid array
            int[] newPkgid = Arrays.copyOf(pkgid, pkgid.length + 1);
            newPkgid[newPkgid.length - 1] = newid;
            pkgid = newPkgid;

            String[] newLocations = Arrays.copyOf(new_Locations, new_Locations.length + 1);
            newLocations[newLocations.length - 1] = newLocation;
            new_Locations = newLocations;
            
        }
    }
    catch(InputMismatchException e){
        System.out.println("Invalid input.....");
    }
    }
    

            
    //track Shipment 
    public static void trackPackage() throws InterruptedException {
        try{
        //    System.out.println("This Functionality is Coming Soon....:)");
        System.out.println("Enter the Tracking id of the Package:- ");
        int track_id=scanner.nextInt();
        int time=random.nextInt(25);
        if (track_id==ID || track_id==newid) {
            System.out.println("Your Package will be Delivered Within "+time+" hour at your Desired Destination");
            System.out.println("Thanks for choosing Our Service :)");
        }
        else{
            System.out.println("Your Package was not Found....");
            
        }
    }
catch(InputMismatchException e){
    System.out.println("Invalid input....");

}

}
    

    
    //View all Shipments
    public static void view_All_Shipmetns() throws InterruptedException {
        boolean t1=true;
        
        System.out.println("Enter  Admin ID:- ");
        

         try {
            String Admin_id=scanner.next();
                // scanner.nextLine(); 
			
			
        if (t1==true) {
            for (int i = 0; i < Admin.length;i++) {
                
                if((Admin[i]).equals(Admin_id)){
                    
                    System.out.println("Welcome "+Admin_id);
                    t1=false;
                   
                }
            }
        }
        else{
            System.out.println("Invalid Admin ID...!!");
          String s="EXITING"+"\\/\\/\\/\\/\\/\\/\\/\\";
          int delay=150;
            for (int j = 0; j<s.length(); j++) {
                    Thread.sleep(delay);
                    System.out.print("\r"+s.substring(0,j+1));
           }
            // System.out.println("Exiting.......");
            System.exit(0);
        }
                
        
       
        
        
        System.out.println("Enter Admin Password: ");
        int adminpass = scanner.nextInt();
if (t1==false) {
    for (int i = 0; i < Admin_Pass.length; i++) {
        if (adminpass==Admin_Pass[i]) {
            text = "LOADING..."+"\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/"; 
            int delay = 100; // Delay between each character (in milliseconds)
            for (int j = 0; j < text.length(); j++) {
                Thread.sleep(delay);
                System.out.print("\r" + text.substring(0, j+1));
            }
            System.out.println("\nLOGIN SUCCESSFULL.....");
           
            break;
        }
    }
    
} 
else {
    System.out.println("Invalid Password!");
    System.out.println("Exiting...");
    System.exit(1);
}

        
        System.out.println("\nEnter the Destination Type:- \n1.Predefined Locations\n2.Custom Locations");
        int loc_type=scanner.nextInt();
        System.out.println("----------------------------------------");
        switch (loc_type) {
            case 1:
            System.out.println("List of Packages:");
            for (int i = 0; i < packages.length; i++) {
                if (packages[i] != null) {
                    System.out.println("--------------------------");
                  
                    System.out.println("Sender Name: " + packages[i]);
                    for (int j = 0; j < pkgid.length; j++) {
                       if(pkgid[j]!=0){
                        System.out.println("Tracking ID: " + pkgid[j]);
                       }
                    }
                    for (int k = 0; k < Locations.length; k++) {
                        if(Locations[k]!=null){
                        System.out.println("Destination: " + Locations[i]);
                        }
                    }
                  
                    System.out.println("-------------------------");
                }
                // else if(packages[i]==null){
                //             System.out.println("No Package....");
                // }
            }
            break;
        
        
            case 2:
            for (int i = 0; i < packages.length; i++) {
                if (packages[i] != null) {

                System.out.println("---------------------------------");
                    System.out.println("Sender Name: " +" "+i+ packages[i]);
                
                    for(int j=0;j<pkgid.length;j++){
                        if(pkgid[j] != 0){
                        System.out.println("Tracking ID: "+""+j+pkgid[j] );
                        }
                    }
                    for (int k = 0; k < new_Locations.length; k++) {
                       if(new_Locations[k] != null){
                        System.out.println("Destination: " +" "+k+ new_Locations[k]);
                       }
                    }
                    
                    System.out.println("-------------------------");
                
                //  if(packages[i]==null){
                //             System.out.println("No Package....");
                // }
            }
            
                
            }
            break;
                default:
                    System.out.println("Invalid Input...");
                break;
        }
        
    }
    catch (InputMismatchException e)
			{
				System.out.println("Invalid input.");

				// option=0;
			}
        }
//View Invoice
    public static void viewInvoice() throws InterruptedException {
        // System.out.println("This Functionality is Coming Soon....");
       try{
        System.out.println("Enter the ID of the Package :- ");
        int invoice_id=scanner.nextInt();
        System.out.println(ID);
        if (invoice_id==ID || invoice_id==newid) {
            // System.out.println("Thanks...");   
            System.out.println("************************************");        
            System.out.println("                                        ");
            System.out.println("ID:- "+invoice_id);
            System.out.println("Sender:- "+name);
            System.out.println("Reciever:- "+r_name);
            System.out.println("Destination:- "+Destination+" ,"+House_no);
            System.out.println("Weight:- "+packageWeight+" KG");
            Double cost=50*packageWeight;
            System.out.println("Total Cost:- "+""+cost);
            System.out.println("***********************************************************");
            System.out.println("Thanks for Choosing Our Service :) ");
            
    }
         else{
        //     System.out.println("Thanks...");   
        //     System.out.println("************************************");        
        //     System.out.println("                                        ");
        //     System.out.println("ID:- "+ID);
        //     System.out.println("Sender:- "+name);
        //     System.out.println("Reciver:- "+r_name);
        //     System.out.println("Destination:- "+Destination);
        //     System.out.println("Weight:- "+packageWeight);
        //    Double cost= 50*packageWeight;
        //     System.out.println("Total Cost:- "+cost);
        //     System.out.println("75 Rupees/KG Additional Charges...");
        //     System.out.println("***********************************************************");
        //     System.out.println("Thanks for Choosing Our Service :)");
        System.out.println("Tracking ID does not Exist...........");
        System.out.println("Kindly Create the Package :( ");
        while(invoice_id==ID){
            if(invoice_id!=ID){
                System.out.println("Invalid Package id...");
            }
            }    
    }

        
    //  
      
    }
    catch(InputMismatchException e){
        System.out.println("Invalid Input...");
}


}

public static void exit() throws InterruptedException{
   try{
    String t = "\\/\\/\\/\\/\\/\\/";
                    int d = 300; // Delay between each character (in milliseconds)
                    
                    
                    System.out.println("Exiting the program please wait");
                    for (int i = 0; i < t.length(); i++) {
                        Thread.sleep(d);
                        System.out.print("\r" + t.substring(0, i+1));
                    }
                    System.out.println("\nThanks for Choosing Our Service :) ");
}

catch(InputMismatchException e){
        System.out.println("Invalid Input.....");
}
    
}
}
//

// public class CourierManagementSystem {
//     public static void main(String[] args) {
//         System.out.println("\033[0;1m" + "Big Text" + "\033[0m");
//         System.out.println("\033[0;4m" + "Underline Text" + "\033[0m");
//         System.out.println("\033[0;7m" + "Reverse Text" + "\033[0m");
//         System.out.println("\033[0;2m" + "Small Text" + "\033[0m");
//     }
// }