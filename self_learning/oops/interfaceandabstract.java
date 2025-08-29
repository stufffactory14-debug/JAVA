// interface lakhan7{
//    void brek(int drecrement);
//    void speed(int increment);
// }
// class bhavya1 implements lakhan7{
//    public void brek(int drecrement){
//        System.out.println("break lag gye");
//    }
//    public void speed(int increment){
//        System.out.println("speed bhdaho be");
//    }
//
// }
//
//public class interfaceandabstract {
//    public static void main(String[] args) {
//       //lakhan7 bh= new lakhan7();//throughts an error
//   bhavya1 lk= new bhavya1();
//    lk.brek(3);
//    }
//}

// PRACTICE

interface camera {
    void takesnap();
    void takepic();
    }
interface wifi{
    String[] shoenet();
    void connect(String m);
}

class phone{
    void pickcall(){
        System.out.println("picking call");
    }
   void dialcall(){
       System.out.println("dialing call");
   }
}

class pandu extends phone implements camera,wifi{
    public void takesnap(){
        System.out.println("taking picture");
    }
    public void takepic(){
        System.out.println("taking picture");
    }
    public String[] shoenet(){
        System.out.println("showing availabe networks");
       String[] m= {"harry", "rohan", "vikas"};
        return m;
    }
    public void connect(String m){
        System.out.println("connecting to "+m);
    }
}
public class interfaceandabstract {
    public static void main(String[] args) {
     pandu loo= new pandu();
     String[] got=loo.shoenet();
     for( String lakhan:got){
         System.out.println(lakhan);
      }
        loo.connect("vikas");
    }
}