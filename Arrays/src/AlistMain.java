import java.util.Scanner;

public class AlistMain {
    private static Scanner scanner = new Scanner(System.in);
    private static AlistDiff groceryList = new AlistDiff();

    public static void main(String[] args){
        boolean quit = false;
        int choice =0;
        printInstructions();
        while(!quit){
            System.out.println("enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();// to clear input buffer

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("\npress ");
        System.out.println("\t 0 - print choice operation");
        System.out.println("\t 1 - print list");
        System.out.println("\t 2 - add item");
        System.out.println("\t 3 - modify");
        System.out.println("\t 4 - remove");
        System.out.println("\t 5 - search");
        System.out.println("\t 6 - quit");
    }

    public static void addItem(){
        System.out.println("ebter the item ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("enter item number ");
        String itemNo = scanner.nextIn();
        scanner.nextLine();
        System.out.println("enter replacement item ");
        String newItem = scanner.nextLine();
        groceryList.modifyItem(itemNo -1, newItem);
    }

    public static void removeItem(){
        System.out.println("enter item number ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("enter item to search for ");
        String searchItem = scanner.nextLine();
       //if(groceryList.findItem(searchItem) != null){
        if(groceryList.onFile(searchItem)){
           System.out.println("found "+ searchItem+" in our list");
       }
       else{
           System.out.println(searchItem+" is not in list");
       }
    }


}
