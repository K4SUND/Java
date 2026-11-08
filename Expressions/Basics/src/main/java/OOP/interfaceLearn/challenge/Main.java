package OOP.interfaceLearn.challenge;

public class Main {

    public static void main(String[] args) {


        MyLinkedList linkedList = new MyLinkedList(new Node(30));
        linkedList.addItem(new Node(50));
        linkedList.addItem(new Node(10));
        linkedList.addItem(new Node(40));
        linkedList.addItem(new Node(20));

//        linkedList.addItem(new Node("20"));
//        linkedList.removeItem(new Node("20"));

        linkedList.traverse(linkedList.getRoot());

//
//        SearchTree searchTree = new SearchTree(new Node(21));
//        searchTree.addItem(new Node(14));
//        searchTree.addItem(new Node(11));
//        searchTree.addItem(new Node(18));
//        searchTree.addItem(new Node(5));
//        searchTree.addItem(new Node(12));
//        searchTree.addItem(new Node(15));
//        searchTree.addItem(new Node(19));
//        searchTree.addItem(new Node(28));
//        searchTree.addItem(new Node(25));
//        searchTree.addItem(new Node(32));
//        searchTree.addItem(new Node(23));
//        searchTree.addItem(new Node(27));
//        searchTree.addItem(new Node(30));
//        searchTree.addItem(new Node(37));
//
////        System.out.println(searchTree.addItem(new Node(30)));
//
//        searchTree.removeItem(new Node(14));
//        searchTree.traverse(searchTree.getRoot());




    }



}
