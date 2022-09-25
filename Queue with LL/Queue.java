

public class Queue {
    Node front;
    Node rear;
    int size;
    int counter;

    public Queue(int size){
        this.size = size;
        front = null;
        rear = null;
        counter = -1;
    }

    boolean isFull(){
        return (counter == size-1);
    }

    boolean isEmpty(){
        return (counter == -1);
    }

    void enQ(int data){
        Node a = new Node(data);

        if(isFull()){
            System.out.println("queue is full");
        }else{
            if(isEmpty()){                
                front = a;
                rear = a;
                System.out.println( "First element " + a.data + " is added q");
            }else{
                rear.next = a;            
                a.next = null;
                rear = a;
            }
            counter++;
        }      
    }

    void deQ(){
        if(isEmpty()){
            System.out.println("Nothing to delete");
        }else{
            if(front.next == null){
                front = null;
                rear = null;
            }else{
               Node a = front.next;
               front.next = null;
               front = a; 
            }
            counter--;
        }
    }


    void print(){
        Node temp = front;
        while(temp.next != null){
            
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}
