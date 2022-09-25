public class Stack{
    int arr[]; //stack
    int size;
    int indis;

    public Stack(int size){
        this.size = size;
        arr = new int[size];
        indis = -1;
    }

    void push(int data){
        //add
        if(isFull()){
            System.out.println("Stack is full.");
        }else{
            indis++;
            arr[indis] = data;
        }        
    }

    int pop(){    
        if(!isEmpty()){
            return arr[indis--];
        }else{
            System.out.println("stack is Empty");
            return -1;
        }   
        
    }

    boolean isFull(){
        return (indis == size-1);
    }

    boolean isEmpty(){
        return (indis == -1);
    }
}
