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

        static int diameter(Node root){
            if(root==null) return 0;

            int leftdia=diameter(root.left);
            int leftheight=heightOfTree(root.left);
            int rightdia=diameter(root.right);
            int rightheight=heightOfTree(root.right);

            int selfdia = leftheight+rightheight+1;
            return Math.max(selfdia,(Math.max(leftdia,rightdia)));
        }



        public static boolean isIdentical(Node root1,Node subRoot){
            if(root1 ==null && subRoot==null){
                return true;
            }else if(root1 == null || subRoot == null || root1.data != subRoot.data){
                return false;
            }

            if(!isIdentical(root1.left,subRoot.left)) return false;
            if(!isIdentical(root1.right,subRoot.right)) return false;

            return true;
        }
        public static boolean isSubtree(Node root1,Node subRoot){
            if(root1==null){
                return false;
            }
            if(root1.data==subRoot.data){
                if(isIdentical(root1,subRoot)){
                    return true;
                }
            }
            boolean left = isSubtree(root1.left,subRoot); // if exist in ls then true else false
            boolean right = isSubtree(root1.right,subRoot); // if exist in rs then true else false

            return left || right;
        }

        static class Info{
            Node node;
            int hd;

            public Info(Node node,int hd){
                this.node=node;
                this.hd=hd;
            }
        }
        public static void topView(Node root1){
            //level order

            Queue<Info> q = new LinkedList<>();
            HashMap<Integer,Node> map = new HashMap<>();

            int min =0,max=0;
            q.add(new Info(root1,0));
            q.add(null);

            while(!q.isEmpty()){
                Info current = q.remove();
                if(current ==null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if(!map.containsKey(current.hd)){
                        map.put(current.hd,current.node);
                    }

                    if(current.node.left!=null){
                        q.add(new Info(current.node.left,current.hd-1));
                        min = Math.min(min,current.hd-1);
                    }
                    if(current.node.right!=null){
                        q.add(new Info(current.node.right,current.hd+1));
                        max = Math.max(max,current.hd+1);
                    }
                }
            }
            for(int i=min;i<=max;i++){
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }

        

        static void kthlvl(Node root,int level,int k){
            if(root == null){
                return;
            }
            if(level==k){
                System.out.print(root.data+" ");
                return;
            }
            kthlvl(root.left,level+1,k);
            kthlvl(root.right,level+1,k);
        }


        
        public static boolean getPath(Node root, int n, ArrayList<Node> path){
            if(root==null) return false;

            path.add(root);
            if(root.data == n) return true;

            boolean foundLeft = getPath(root.left,n,path);
            boolean foundRight = getPath(root.right,n,path);

            if(foundLeft || foundRight) return true;

            path.remove(path.size()-1);
            return false;
        }
        public static int lca(Node root,int n1,int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new  ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);
            int i=0;
            for(;i<path1.size() && i<path2.size();i++){
                if(path1.get(i)!=path2.get(i)){
                    break;
                }
            }
            Node lca = path1.get(i-1);
            return lca.data;
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

       
//        Node root1 = new Node(1);
//        root1.left= new Node(2);
//        root1.right= new Node(3);
//        root1.left.left = new Node(4);
//        root1.left.right = new Node(5);
//        root1.right.left = new Node(6);
//        root1.right.right =new Node(7);
//
//        Node subRoot = new Node(2);
//        subRoot.left= new Node(4);
//        subRoot.right = new Node(5);
//
//        System.out.println(BinaryTree.isSubtree(root1,subRoot));


//        Node root1 = new Node(1);
//        root1.left = new Node(2);
//        root1.right = new Node(3);
//        root1.left.left = new Node(4);
//        root1.left.right = new Node(5);
//        root1.right.left = new Node(6);
//        root1.right.right = new Node(7);
//        BinaryTree.topView(root1);

       
//        BinaryTree.kthlvl(root,1,3);

        Node root5 = new Node(1);
        root5.left = new Node(2);
        root5.right = new Node(3);
        root5.left.left = new Node(4);
        root5.left.right = new Node(5);
        root5.right.left = new Node(6);
        root5.right.right = new Node(7);

        System.out.println(BinaryTree.lca(root5,4,7));
    }
    }

