public class Main{
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enQueue(4);
        q.enQueue(3);
        q.enQueue(2);
        q.enQueue(5);
    //  q.enQueue(6);

        q.deQueue();
    }
}