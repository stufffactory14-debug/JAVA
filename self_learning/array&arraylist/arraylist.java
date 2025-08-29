import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.*;
//
//public class arraylist {
//    public static void main(String[] args) {
//        ArrayList<Integer> a1= new ArrayList<>();
//        a1.add(9);
//        a1.add(2);
//        a1.add(8);
//        a1.add(6);
//        a1.add(4);
//        a1.addLast(5);
//        a1.addFirst(5);
//        for(int i=0; i<a1.size(); i++){
//            System.out.print(a1.get(i));
//            System.out.print(",");
//        }
//
//    }
//}

public class arraylist {
    public static void main(String[] args) {
//        ArrayList<String> a1 = new ArrayList<String>();
//        a1.add("rahul");
//        a1.add("sohan");
//        a1.add("vipul");
//        a1.add("rohan");
//        for(Object i:a1){
//            System.out.println(i);
//        }
        LocalDateTime dt= LocalDateTime.now();
        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");//dd in small MM in big yyyy in small
        String mydate= dt.format(df);//helps to create date time
        System.out.println(mydate);
    }
}