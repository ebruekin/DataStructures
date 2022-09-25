public class TreeS {
    Node root;

    public TreeS(){
        root = null;
    }


    Node nNode(int data){
        root = new Node(data);
        return root;
    }

    Node insert(Node root,int data){
        if(root != null){
            if(data < root.data){
                root.left = insert(root.left, data);
            }else{
                root.right = insert(root.right, data);
            }
        }else{
            root = new Node(data);
        }
        return root;
    }

    void preOrder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    int height(Node root){
        if(root == null){
            return -1;
        }else{
            int l=0;
            int r=0;
            l = height(root.left);
            r = height(root.right);
            if(l>r)
                return l+ 1;
            else
                return r +1;
        }
    }

    int size(Node root){
        if(root == null){
            return 0;
        }else{
            return size(root.left ) + 1 + size(root.right) ;
        }
    }
}
