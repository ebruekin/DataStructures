public class Main{
    public static void main(String[] args) {
        TreeS t = new TreeS();

        t.root = t.insert(t.root, 10);
        t.root = t.insert(t.root, 8);
        t.root = t.insert(t.root, 15);
        t.root = t.insert(t.root, 5);
        t.root = t.insert(t.root, 12);        
        t.root = t.insert(t.root, 20);
        t.root = t.insert(t.root, 9);     

        System.out.print("preOrder : ");
        t.preOrder(t.root);
        System.out.println(" ");

        System.out.print("inOrder : ");
        t.inOrder(t.root);
        System.out.println(" ");

        System.out.print("postOrder : ");
        t.postOrder(t.root);


      
        System.out.println(" ");

        System.out.print("root data : " + t.root.data);


    }
}