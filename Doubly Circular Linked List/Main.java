public class Main{
    public static void main(String[] args) {
        
        ListS a = new ListS();

        a.addH(3);
        a.addH(4);
        a.addH(5);
        a.addH(6);
        a.addH(12);

        
        
        a.addT(9);
        a.delT();
        a.addI(11, 1);
        a.delI(0);

        a.write();     
    }
}