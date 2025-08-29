//PRACTICE GETER SETER CONSTRUCTOR
//
//class lakhan{
//    private int a;
//    private  String b;
//
//public void setA(int n){
//        a=n;
//
//}
//public int getA(){ //getter and setter can be use if class is private
//    return a;
//}
//
//public void setname(String m){
//    b=m;
//}
//public String getname(){
//    return b;
//}
//    public lakhan(){             //METHOD OVERLOADING
//     a= 11;
//     b="your name";
//    }
//
//    public lakhan(String myname, int myid){
//      a=myid;
//      b=myname;
//
//    }
//}
//public class constructorgetseter {
//    public static void main(String[] args) {
//        lakhan bhavya= new lakhan("lakhan",79);
//       // bhavya.setA(45);
//       // bhavya.setname("this is practice an practice problem"); // we can comment out this and set value in constructor
//        System.out.println(bhavya.getA());
//        System.out.println(bhavya.getname());
//    }
//}

//         PRACTICE USE OF SET GET AND FROM THERE CALCULATE SURFACE AREA WITH FORMULA
 class cylender{
      float a;
      float b;
      float c;
      float d;
      public void setsurf(float n){
          a=n;
      }
      public float getsurf(){
          return a;
      }
    public void setsur(float m){
        b=m;
    }
    public float getsur(){
        return b;
    }
    public float sur(){
         double c=(2*3.14f+a+b+2*3.14+a*2);
          return (float) c;
    }
}

public class constructorgetseter{
    public static void main(String[] args) {
        cylender lakhan= new cylender();
        lakhan.setsurf(45f);
        lakhan.setsur(58f);
        System.out.println("radius is : "+ lakhan.getsurf());
        System.out.println("height is : "+ lakhan.getsur());
        System.out.println("surface area is : "+ lakhan.sur());
    }
}