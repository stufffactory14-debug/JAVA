

//class animal{
//    int x;
//    public void setX(int n){
//        this.x=n;
//    }
//    public int getX(){
//        return x;
//    }
//
//     animal(){
//        System.out.println("i am a constructor");
//    }
//}
//class dog extends animal{
//
//}
//
//public class inheritence {
//    public static void main(String[] args) {
//        //animal lakhan = new animal();
//        dog lakhan = new dog();
//       lakhan.setX(44);
//        System.out.println("thr value of x: "+ lakhan.getX());
//    }
//}
 // METHOD OVERWRIDING

//class animal{
//    int x;
//    public void meth1(){
//        System.out.println("i am class 1 of a ");
//    }
//
//    public void meth2(){
//        System.out.println("i am class 2 of a");
//    }
//}
//class dog extends animal{
//    public void meth2(){
//        System.out.println("i am class 1 of b");
//    }
//
//    public void meth3(){
//        System.out.println("i am class 2 of b");
//    }
//
//}
//
//public class inheritence {
//    public static void main(String[] args) {
//        animal lakhan = new animal();
//        dog bhavya = new dog();
//        lakhan.meth1();
//        bhavya.meth2();
//        }
//}

// PRACTICE PROBLEM1
class lakhan{
    int length;
    int breath;
    lakhan(int a,int b){
        length=a;
        breath=b;
    }
    public double lak(){
        return length*breath;
    }
}

class bhavya extends lakhan{
    int height;
    bhavya(int a, int b,int c){
        super(a,b);
        height=c;
    }
    public double bhav(){
        return length*breath*height;
    }

}


public class inheritence {
    public static void main(String[] args) {
      //lakhan la= new lakhan(10,2);
        bhavya bh= new bhavya(10,2,3);
    //    System.out.println(la.lak());

        System.out.println(bh.lak());
        System.out.println(bh.bhav());

    }
}