package OOP.interfaceLearn.challenge;

public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return root;
    }


    // previous  - left
    // next - right
    @Override
    public boolean addItem(ListItem item) {

        ListItem current = root;

        while (current != null) {

            int comparison = current.compareTo(item);
            if (comparison < 0) {
                // right
                if(current.next()!=null)
                {
                    current = current.next();
                }else {
                    //put
                    current.setNext(item);
                    return true;
                }

            }else if (comparison >0)
            {
                //left
                if(current.previous()!=null)
                {
                    current = current.previous();
                }else {
                    //put
                    current.setPrevious(item);
                    return true;
                }

            }else{
                //
                return false;
            }

        }

        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        ListItem currentItem = root;
        ListItem parentItem = currentItem;

        while (currentItem!=null)
        {
            int comparison = currentItem.compareTo(item);
            if(comparison<0)
            {
                // search in right side
                parentItem = currentItem;
                currentItem = currentItem.next();
            }else if(comparison>0)
            {
                // search in left sub tree
                parentItem = currentItem;
                currentItem = currentItem.previous();
            }
            else {
                // remove
                performRemoval(currentItem,parentItem);
                return true;
            }
        }
        return false;
    }


    //recursion
    @Override
    public void traverse(ListItem root) {

        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }

    private void performRemoval(ListItem currentItem, ListItem parentItem) {

        //no right child
        if(currentItem.next()==null)
        {
            if(parentItem.next()==currentItem)
            {
                parentItem.setNext(currentItem.previous());
            }else {
                parentItem.setPrevious(currentItem.previous());
            }

        }
        //no left chile
        else if (currentItem.previous()==null) {
            if(parentItem.next()==currentItem)
            {
                parentItem.setNext(currentItem.next());
            }else {
                parentItem.setPrevious(currentItem.next());
            }
        }
        // two children
        else {

            ListItem current = currentItem.next();
            ListItem leftMostParent = currentItem;

            while (current.previous() != null) {

                leftMostParent = current;
                current = current.previous();
            }

            currentItem.setValue(current.getValue());

            if (leftMostParent == currentItem) {
                currentItem.setNext(current.next());
            } else {
                leftMostParent.setPrevious(current.next());
            }


        }

    }
}
