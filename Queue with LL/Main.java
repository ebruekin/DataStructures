public class Main{
    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.enQ(3);
        q.enQ(4);
        q.enQ(5);

        q.deQ();       
  

        q.print();
    }
}