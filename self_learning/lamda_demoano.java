//annonimous class

interface DemoAno{
    void meth1(int a);
  //  void meth2();
}

//NO NEED TO USE THIS JUST USE DEMO ANO

//class call implements DemoAno {
//    public void meth1(){
//        System.out.println("i am meth1");
//    }
//
//    public void meth2(){
//        System.out.println(" i am meth 2");
//    }
//}

public class lamda_demoano {
    public static void main(String[] args) {
        /*
        call h = new call(); // we dont need to do this we can use annonimous class in replace to this so that we can do it less lines
        h.meth1();
            */

        //NO USING DEMO ANO FROM HERE
        /*
        DemoAno no= new DemoAno() {
            public void meth1() {
                System.out.println("i am meth1");
            }

            public void meth2() {
                System.out.println("i am meth2");
            }
        };
        no.meth1();
         */
        // THIS IS LAMDA CLASS USE FOR SINGLE INTERFACE
        DemoAno b1=(a)->{
                System.out.println("this is lamda class "+ a);
            };
        b1.meth1(6);
        }
    }
