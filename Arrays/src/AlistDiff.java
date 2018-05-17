import java.util.ArrayList;

public class AlistDiff {


    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printList() {
        System.out.println("u have " + groceryList.size() + " items in ur list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " . " + groceryList.get(i));
        }
    }
    public void modifyItem(String newItem){
      int position = findItem(newItem);
      if(position >= 0){
          removeItem(position);
      }
    }

    private void modifyItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been added");
    }


    public void removeItem(int position) {
     //   String theItem = groceryList.get(position);
        groceryList.remove(position);

    }
    public void removeItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeItem(position);
        }
    }

   /* public String findItem(String searchItem) {
    //boolean exists =groceryList.contains(searchItem);
    int position = groceryList.indexOf(searchItem);
    if(position >= 0){
        return groceryList.get(position);
    }
    return null;
    }*/
   public int findItem(String searchItem) {

           return groceryList.indexOf(searchItem);

   }



}
