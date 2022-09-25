public class ListS {
    Node head = null;
    Node tail =null;
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
            head.prev= a;
            head = a;
            tail.next = head;
            head.prev = tail;
        }else{
            System.out.println("New list");
            head = a;
            tail = a;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
    }


    void addT(int data){
        Node a  = new Node(data);
        if(isFull()){
            
            tail.next = a;
            a.prev = tail;
            tail = a;
            tail.next = head;
            head.prev = tail;            
        }else{
            head = a;
            tail = a;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
    }


    void addI(int data ,int index){
        Node a = new Node(data);
        
        if(isFull()){
            if(index == 0){
                addH(data);
            }else{
                Node temp = head;
                Node temp2 = temp;
                int mIndex = 0;

                while(temp2 != tail && mIndex < index){
                    temp = temp2;
                    temp2 =temp2.next;
                    mIndex++;
                }
                temp.next =a;
                a.prev = temp;
                a.next =temp2;        
                temp2.prev = a;                

            }
        }else{
            head = a;
            tail = a;
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
    }


    void delH(){
        if(isFull()){
            if(head == tail){
                head = null;
                tail = null;
                System.out.println("list is empty");
                
            }else{
                tail.next = head.next;
                head = head.next;
                head.prev = tail;
                tail.next = head;            
            }
        }else{
            System.out.println("Nothing to dell");
        }
    }

    void delT(){
       if(isFull()){
        if(head == tail){
            head = null;
            tail = null;
        }else{
            Node temp2 = head;
            Node temp = temp2;
            while(temp2.next != tail){
                temp2 = temp2.next;
                temp = temp2;
            }
            temp.next = head;
            tail = temp;
            head.prev = tail;
            tail.next = head;
            temp2 = null;            
        }

       }else{
        System.out.println("Nothing to dell");
       }

    }


    void delI(int index){
        if(isFull()){
            if(head == tail){
                head = null;
                tail = null;
            }else if(head != null && index == 0){
                tail.next = head.next;
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }else{
                int mIndex = 0;
                temp = head;
                while(temp != tail){
                    mIndex++;
                    temp = temp.next;
                }
                if(index  >=  mIndex){
                    tail = temp;
                    tail.next = head;
                    head.prev = tail;
                    
                }else{
                    temp2 = head;
                    temp = temp2;
                    int i  = 0;
                    while(i < index){
                        i++;
                        temp2 = temp2.next;
                        temp = temp2;
                    }
                    temp.next = temp2.next;
                    temp2.next.prev = temp;
                }
            }
        }else{
            System.out.println("Nothing to dell");
        }
    }
    void write(){
        Node temp  = head;
        while(temp != tail){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }

        System.out.println(" " + temp.data);
    }

}
