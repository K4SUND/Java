package Unknown;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){

    // custom constructor
    public GroceryItem(String name){

        //constructor chaining
        this(name,"DAIRY",1);
    }

}


public class Main {
    public static void main(String[] args) {

        Object[] groceryItems = new Object[3];
        // create data
        // custom constructor
        groceryItems[0]= new GroceryItem("milk");
        // default constructor
        groceryItems[1]= new GroceryItem("apple","PRODUCE",6);

        // add another object to object array
        groceryItems[2] = "Third Element";



        // this is one dimentional array of objects
        //
        System.out.println(Arrays.toString(groceryItems));
        System.out.println(Arrays.deepToString((groceryItems)));


        // create Array of grocery
        GroceryItem[] groceryItemArray = new GroceryItem[3];
        groceryItemArray[0]= new GroceryItem("milk");
        groceryItemArray[1]= new GroceryItem("apple","PRODUCE",6);
        groceryItemArray[2] = new GroceryItem("oranges","PRODUCE",7);

        System.out.println("+".repeat(30));
        System.out.println(Arrays.toString(groceryItemArray));


        // create ArrrayList
        // method 1
        ArrayList arrayList = new ArrayList();
        arrayList.add(groceryItems[0]);
        arrayList.add(groceryItems[1]);
        // here it can add other object types as well
        // because didn't specify the types

        arrayList.add("Hello");

        // method 2
        // angle brackets <> - specify type ( only need in left side )
        ArrayList<GroceryItem> groceryItemsList = new ArrayList<>();
        groceryItemsList.add(new GroceryItem("milk"));
        groceryItemsList.add(new GroceryItem("apple","PRODUCE",6));
        groceryItemsList.add( new GroceryItem("oranges","PRODUCE",7));
        // here it shows compile error when adding other types

//        groceryItemsList.add("Hello");



        //common mistake
        ArrayList<GroceryItem> groceryItemsListTwo = new ArrayList();

        //but it is ask GroceryItem
//        groceryItemsListTwo.add("Hello");



    }
}