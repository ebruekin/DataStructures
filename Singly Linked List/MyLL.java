public class MyLL {
    Node head;
    Node tail;

    
    public MyLL(){
        head = null;
        tail = null;
    }

    public boolean isFull(){
        if(head != null){
            return true;
        }else{
            return false;
        }
    }

    public void addNodeHead(int x){
        Node a = new Node(x);
        if(isFull()){
            //if list is full
            a.next = head;
            head = a;
        }else{
            //if list is empty            
            head = a;
            tail = a;
        }
    }

    public void addNodeIndex(int x , int index){
        Node a = new Node(x);
        if(isFull()){
            if(index == 0){
                addNodeHead(x);
            }else{
                Node temp = null;
                Node temp2 = head;
                int mevcutIndex = 0;
                while(temp2!=null && mevcutIndex < index){
                    temp = temp2;
                    temp2 = temp2.next;
                    mevcutIndex++;
                }
                if(temp2 == null){
                    addNodeTail(x);
                }else{
                    a.next = temp2;
                    temp.next =a;
                }
            }

        }else{
            //if list is empty
            head = a;
            tail = a;
            tail.next = null;
        }

    }

    public void addNodeTail(int x){        
        Node a = new Node(x);              
        if(isFull()){
            // if list is full
            tail.next = a;
            tail = a;
            a.next = null;
        }else{
            //if list is empty
            a.next =  null;
            head = a;
            tail = a;
        }
    }

    public void delFromHead(){        
        if(isFull()){
            //if list is full 
            // list has one element
            if(head.next == null){
                head = null;
                tail = null;
            }else{
                Node a = head.next;
                head.next = null;
                head = a;
            }
            
        }else{
            System.out.println("nothing to delete");
        }
    }

    public void delFromTail(){
        if(isFull()){
            if(head == tail){
                head = null;
                tail = null;
            }else{
                Node temp = head;
                while(temp.next != tail){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
            }
        }else{
            System.out.println("nothing to delete");
        }
    }


    public void delIndex(int index){
        if(isFull()){
            if(head == tail){
                head = null;
                tail = null;
            }else{
                if(index == 0){
                    delFromHead();
                }else{
                   Node temp = null;
                   Node temp2 = head;
                   int mIndex = 0;
                   while(temp2 != null && mIndex < index){
                    temp = temp2;
                    temp2 = temp2.next;
                    mIndex++;
                   }
                   if(temp2 != null){
                    if(temp2 ==tail){
                        delFromTail();
                    }else{
                        Node temp3 = temp2.next;
                        temp2.next = null;
                        temp.next = temp3;
                    }
                   } 
                }
            }
        }else{
            System.out.println("nothing to delete");
        }
    }    

    public void write(){
        Node temp = head;
        while(temp != null){
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

}
