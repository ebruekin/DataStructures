public class Queue {
    int[] arr;
    int size;
    int front;
    int rear;

    public Queue(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void enQueue(int data){
        //add
        if(isFull()){
            System.out.println("queue is full");
        }else{
            rear++;
            arr[rear] = data;
            System.out.println(arr[rear] + "\t" + "added..");
        }
        
    }

    void deQueue(){

        if(isEmpty()){
            System.out.println("nothing to delete..");
        }else{
            //int num = arr[front];
            for(int i = 1; i <= rear;i++){
                arr[i-1] = arr[i];
            }
            rear--;
        }


    }

    boolean isFull(){
        return rear == size-1;
    }

    boolean isEmpty(){
        return (rear == -1);
    }





}
