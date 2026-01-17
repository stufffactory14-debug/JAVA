package binaryTree;

public class buildtree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public static Node buildtree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode= new Node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;
        }

        public static void preorder(Node root){
            if(root == null) return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null) return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null) return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }
         static void levelOrder(Node root){
            if(root==null) return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node current = q.remove();
                if(current==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(current.data+" ");
                    if(current.left!=null){
                        q.add(current.left);
                    }if(current.right!=null){
                        q.add(current.right);
                    }
                }
            }

              static int heightOfTree(Node root){
            if(root== null){
                return 0;
            }
            int lh = heightOfTree(root.left);
            int rh = heightOfTree(root.right);
            int height= Math.max(lh,rh)+1;
            return height;
        }

        static int countOfNodes(Node root){
            if(root==null) return 0;

            int lh = countOfNodes(root.left);
            int rh = countOfNodes(root.right);
            return lh+rh+1;
        }

         static int sumOfNodes(Node root){
            if(root==null) return 0;

            int lh = sumOfNodes(root.left);
            int rh = sumOfNodes(root.right);
            return lh+rh+root.data;
        }

    }
    static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      //  BinaryTree tree = new BinaryTree();
        Node root =BinaryTree.buildtree(nodes);
        //System.out.println(root.data);
       // BinaryTree.inorder(root);
       // BinaryTree.postorder(root);
      //  BinaryTree.levelOrder(root);
         //  System.out.println(BinaryTree.heightOfTree(root));
        //  System.out.println(BinaryTree.countOfNodes(root));
          //System.out.println(BinaryTree.sumOfNodes(root));
        //System.out.println(BinaryTree.diameter(root));

        Node root1 = new Node(1);
        root1.left= new Node(2);
        root1.right= new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right =new Node(7);

        Node subRoot = new Node(2);
        subRoot.left= new Node(4);
        subRoot.right = new Node(5);

        System.out.println(BinaryTree.isSubtree(root1,subRoot));
    }
    }

