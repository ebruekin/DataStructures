public class ListS {
    Node head = null;
    Node tail = null;
    Node temp = null;
    Node temp2 = null;

    public boolean isFull(){
        if(head != null){
            return true;
        }else{
            return false;
        }
    }
    

    void addH(int data){
        Node a  = new Node(data);
        if(isFull()){
            a.next = head;
            head.prev = a;
            head = a;            
        }else{
            head = a;
            tail = a;
        }
    }

    void addT(int data){
        Node a  = new Node(data);
        if(isFull()){
            tail.next = a;
            a.prev = tail;
            tail = a;
        }else{
            tail = a;
            head = a;
        }
    }

    void addI(int data , int index){
        Node a = new Node(data);
        Node temp = null;
        Node temp2 = head;
        int mIndex = 0;
        if(isFull()){
            if(index == 0){
                addH(data);
            }else{
                while(temp2 != null && mIndex < index){
                    temp = temp2;
                    temp2 = temp2.next;
                    mIndex++;
                }
                temp.next = a;
                a.prev = a;
                a.next = temp2;
                
            }
        }else{
            head = a;
            tail = a; 
        }
    }

    void delH(){
        if(isFull()){
            if(head.next == null){
                head = null;
                tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
        }else{
            System.out.println("Nothing to del");
        }
    }

    void delT(){
        Node temp = head;
        if(isFull()){
            if(head == tail){
                head = null;
                tail = null;
            }else{
                while(temp != null){
                    temp = temp.next;
                }
                tail = tail.prev;
                tail.next = null;
            }
        }else{
            System.out.println("nothing to delete..");
        }
    }

    void delI(int index){
        if(isFull()){
            if(head == tail){
                head = null;
                tail = null;
            }else if(head.next != null && index == 0){
                delH();
            }else{
                Node temp = null;
                Node temp2 = head;
                int mIndex = 0;
                while(temp2 != null && mIndex < index){
                    temp = temp2;
                    temp2 = temp2.next;
                    mIndex++;
                }
                temp2.prev = temp;
                temp.next = temp2.next;
            }            
        }else{
            System.out.println("Nothing to dell..");
        }
    }

    void write(){
        temp = head;
        while(temp != null){
            System.out.print(" " + temp.data);
            temp =temp.next;
        }
    }
}
