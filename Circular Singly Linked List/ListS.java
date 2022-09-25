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
            head = a;
            tail.next = head;
        }else{
            head = a;
            tail = a;
            tail.next = head;           
            
        }
    }

    void addT(int data){
        Node a  = new Node(data); 
        if(isFull()){
            tail.next = a;
            tail = a;
            a.next = head;
        }else{
            head = a;
            tail = a;
            tail.next = head;
        }
    }

    void addI(int data , int index){
        Node a = new Node(data);
        if(isFull()){
            
            if(index == 0){
                addH(data);
            }else{
                Node temp = tail;
                Node temp2 = head;
                int mIndex = 0;
                while(temp2 != tail && mIndex < index){
                    temp = temp2;
                    temp2 = temp2.next;                    
                    mIndex++;
                }
                // sona ekleme!!!!!!!!
                if(temp == tail && mIndex <= index ){
                    addT(data);

                }else{
                    temp.next = a;
                    a.next =temp2;
                }
                //temp.next = a;
                //a.next = temp2;
            }
        }else{
            head= a;
            tail = a;
            tail.next = head;
        }
    }

    void delH(){
        if(isFull()){
            if(head == tail){
                head= null;
                tail =null;
            }else{
                head = head.next;
                tail.next = head;
            }
        }else{
            System.out.println("Nothing to delete..");
        }
    }

    void delT(){
        if(isFull()){
            if(head == tail){
                head =null;
                tail =null;
            }else{
                Node temp = head;
                while(temp.next != tail){
                    temp = temp.next;
                }
                tail = temp;
                temp.next = head;
            }
        }else{
            System.out.println("nothing to delete..");
        }
    }

    void delI(int index){
        if(isFull()){
           
            if(index == 0){
                delH();
            }else{
                
                Node temp2 = head;
                Node temp = temp2;
                int mIndex = 0 ;
                while(temp2.next != tail && mIndex < index){
                    temp = temp2;
                    temp2 = temp2.next;
                    mIndex++;
                }               
               
                    temp.next = temp2.next;         
                
            }
            
        }else{
            System.out.println("nothing to delete..");
        }
    }

    void write(){
        Node temp = head;
        while(temp != tail){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println(" " + temp.data);
    }
}
