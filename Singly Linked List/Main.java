
public class Main {
    public static void main(String[] args) {
        MyLL ll = new MyLL();

        ll.addNodeHead(22);
        ll.addNodeTail(33);
        ll.addNodeHead(11);
        ll.addNodeTail(44);

        
        ll.addNodeIndex(55, 0);
        ll.addNodeIndex(43, 3);
        ll.addNodeIndex(47, 5);

        
        ll.delIndex(3);


        ll.write();



    }
}
