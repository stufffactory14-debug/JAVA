// class Employ{
//     int id;
//     int salary;
//     String name;
//
//    public void script(){
//         System.out.println("my id is : " + id);
//         System.out.println(("my name is : "+ name));
//     }
//     public int getsalary(){
//         return salary;
//    }
// }
//
//public class oops_concepts {
//    public static void main(String[] args) {
//     Employ lakhan= new Employ();
//     lakhan.id= 10;
//     lakhan.salary=12;
//     lakhan.name="bhavya gupta";
//
//     int salary=lakhan.getsalary();
//      lakhan.script();
//        System.out.println(salary);
//
//
//    }
//}

//                              PRACTICE OOPS CONCEPTS

//class Employ{
//    int id;
//    String name;
//    int salary;
//    int age;
//    String role;
//    int hike;
//
//    public void details(){
//        System.out.println("the id of staff : "+ id);
//        System.out.println("the name of staff : "+ name);
//        System.out.println("the salary of staff : "+ salary);
//        System.out.println("the age of staff : "+ age);
//        System.out.println("the role of staff : "+ role);
//
//
//
//    }
//    public int gethike(){
//        return hike;
//    }
//}
//public class oops_concepts {
//    public static void main(String[] args) {
//        Employ lakhan= new Employ();
//        lakhan.id=1;
//        lakhan.name="bhavya gupta";
//        lakhan.salary=100000;
//        lakhan.age=18;
//        lakhan.role= "manager";
//        lakhan.hike=20;
//        lakhan.details();
//        int hike = lakhan.gethike();
//        System.out.println(hike);
//    }
//}
//

//         CREATE A CLASS CELLPHONE METHOD TO PRINT RINING VIBRATING
//
//class Cellphone{
//       public void ring(){
//           System.out.println("ringing....");
//       }
//
//       public void vib(){
//           System.out.println("vibrating");
//       }
//}
//
//public class oops_concepts{
//    public static void main(String[] args) {
//        Cellphone lakhan= new Cellphone();
//        lakhan.ring();
//        lakhan.vib();
//    }
//}
//         CREATE A CLASS SQAUARE TO INITIALIZE ITS SIDES CALCULATING AREA AND PARAMETER
//
//class   Square{
//    int sides;
//
//    public int area(){
//        return sides*sides;
//    }
//    public int parameter(){
//        return 4*sides;
//    }
//}
//public class oops_concepts {
//    public static void main(String[] args) {
//        Square lakhan= new Square();
//        lakhan.sides=3;
//
//        System.out.println(lakhan.area());
//        System.out.println(lakhan.parameter());
//    }
//}

//CREATE A CLASS RECTANGLE TO INITIALIZE ITS AREA AND PARAMETER
class Rectangle{
    int length;
    int weidth;
public int area(){
    return length*weidth;
}
public int parameter(){
    return 2*(length+weidth);
}

}
public class oops_concepts {
    public static void main(String[] args) {
    Rectangle lakhan= new Rectangle();
    lakhan.length=4;
    lakhan.weidth=5;
        System.out.println(lakhan.area());
        System.out.println(lakhan.parameter());
    }
}