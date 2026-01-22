package Unknown;

import java.util.*;

public class Challenge {


    /*
    public static void printOption() {
        String options = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:
                """;
        System.out.println(options);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();


        while (true) {
            printOption();
            switch (Integer.parseInt(sc.nextLine())) {
                case 0:
                    return;
                case 1:
                case 2:

                default:
                    break;
            }

            arrayList.sort(Comparator.naturalOrder());
            System.out.println(arrayList);

        }

    }


     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        Scanner input2 = new Scanner(System.in);
//        Scanner input3 = new Scanner(System.in);



        ArrayList<String> groceryList = new ArrayList<>();

        int inputNumber;

        while (true) {

            System.out.println("Available actions:");
            System.out.println("0:Shutdown");
            System.out.println("1:Add item(s) ---> comma delimited lists");
            System.out.println("2:Remove items ---> comma delimited lists");
            System.out.println("Enter a number for which action you want to do:");

            inputNumber = Integer.parseInt(input.nextLine());
//            inputNumber = input.nextInt();
//            System.out.println(inputNumber);
            switch (inputNumber) {
                case 0:
                    return;
                case 1:
                    String addingItem = input.nextLine();
                    //split using ,
                    String[] addingItems = addingItem.split(",");

                    //check and add
                    //remove unnecessary spaces
                    //trim
                    for (String item : addingItems) {
                        if (groceryList.contains(item)) {
                            continue;
                        } else {
                            groceryList.add(item.trim());
                        }
                    }

                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                    break;

                case 2:
                    String removingItem = input.nextLine();
                    //split using ,
                    String[] removingItems = removingItem.split(",");
                    for (String item : removingItems) {
                        groceryList.remove(item);
                    }
                    groceryList.sort(Comparator.naturalOrder());
                    System.out.println(groceryList);
                    break;

                default:
                    break;

            }

        }




    }


}


//nextInt() only the number