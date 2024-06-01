class tree1 {
    //int data;
    tree1 left,right;
    tree1(int d){
        left=null;
        //data=d;
        right=null;
    }
    public static void main(String[] args) {
        //manual insertion
        tree1 root=new tree1(10);
        root.left=new tree1(20);
        root.right=new tree1(30);
        root.left.left=new tree1(40);
        root.left.left.right=new tree1(50);
        root.right.left=new tree1(60);
        //
        
    }//main ends
}//tree1 class ends
