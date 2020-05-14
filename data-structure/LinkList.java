class LinkedList{
    int val = 0;
    LinkedList next = null;
    // add method
    void LinkAdd(LinkedList root, int element){
        // create new node
        LinkedList newNode = new LinkedList();
        newNode.val = element;
        newNode.next = null;
        // find rear
        while(root.next != null)
            root = root.next;
        // add new node
        root.next = newNode;
    }
    // reverse method
    void LinkReverse(LinkedList root){
        LinkedList tmp = root.next;
        LinkedList rSide = null;
        while(tmp != null){
            tmp = tmp.next;
            root.next.next = rSide;
            rSide = root.next;
            root.next = tmp;
        }
        root.next = rSide;
    }
    // print method
    void LinkPrint(LinkedList root){
        while(root != null){
            System.out.print("["+root.val+"]->");
            root = root.next;
        }
        System.out.println("|END");
    }
}

public class LinkList{
    public static void main(String[] args){
        LinkedList root = new LinkedList();
        for(int i=1;i<8;i++)
            root.LinkAdd(root, i);
        root.LinkPrint(root);
        root.LinkReverse(root);
        root.LinkPrint(root);
    }
}
