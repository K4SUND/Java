package OOP.interfaceLearn.challenge;

public class MyLinkedList implements NodeList{

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {


        ListItem current = root;
        while (current!=null)
        {

            // compare values
            int comparison = current.compareTo(item);
            if(comparison<0)
            {
                //move right
                if(current.next()!=null)
                {
                    current = current.next();
                }else{
                    // in last ( we put here )
                    current.setNext(item);
                    item.setPrevious(current);
                    return true;
                }

            }
            else if(comparison>0)
            {
                //put to left
                if(current.previous()!=null)
                {
                    //not first one
                    current.previous().setNext(item);
                    item.setNext(current);
                    item.setPrevious(current.previous());
                    current.setPrevious(item);


                }else {

                    root = item;
                    current.setPrevious(item);
                    item.setNext(current);


                }
                return true;
            }
            else {
                return false;
            }

        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem current = root;
        while (current!=null)
        {
            int comparison = current.compareTo(item);
            //remove
            if(comparison==0)
            {
                if(current == root)
                {
                    root = current.next();
                    root.setPrevious(null);
                }else if(current.next()==null){
                    current = current.previous();
                    current.setNext(null);
                }else{
                    current.previous().setNext(current.next());
                    current.next().setPrevious(current.previous());
                }
                return true;
            }

            //
            current = current.next();
        }

        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root==null)
        {
            System.out.println("The list is empty");
        }else {
            ListItem current = root;
            while (current!=null)
            {
                System.out.println(current.getValue());
                current = current.next();
            }

        }
    }
}
