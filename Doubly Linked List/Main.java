public class Main{
    public static void main(String[] args) {
        
        ListS x = new ListS();

        x.addH(5);
        x.addH(4);
        x.addH(6);
        x.addH(4);
        x.addH(2);
        x.addH(12);
        x.addI(11, 2);
        x.delI(6);

       
        

        x.write();
    }
}