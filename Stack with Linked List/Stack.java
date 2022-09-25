public class Stack {
    Node top;
    int size;
    int count;

    public Stack(int size){
        this.size = size;
        count = 0;
        top = null;
    }

    void push(int data){
       Node a = new Node(data);
       if(isFull()){
        System.out.println("stack is full");
       }else{
        if(isEmpty()){
            top = a;
            a.next = null;
            System.out.println("Added first element to stack..");
        }else{
            a.next  = top;
            top = a;
            System.out.println(a.data + " has been added to stack");
        }
        count++;
       }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack is Emty");
        }else{
            top = top.next;
            count--;
        }
    }

    boolean isFull(){
        return count == size;
    }

    boolean isEmpty(){
        return count==0;
    }

    void print(){
        if(isEmpty()){
            System.out.print("Stcak is Empty");
        }else{
            Node temp  = top;
            while(temp != null){
                System.out.print(temp.data);
                temp  = temp.next;
            }
        }
    }
}
