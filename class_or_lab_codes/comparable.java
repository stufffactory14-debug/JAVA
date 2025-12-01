import java.util.*;
class Man{
    private String name;
    private int age;
    private String branch;


    public Man(String name, int age, String branch){
        this.name = name;
        this.age = age;
        this.branch = branch;
    }
    //Creating getter


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBranch() {
        return branch;
    }
}

class CompareAge implements Comparator<Man> {
    public int compare(Man m1, Man m2){
        return Integer.compare(m1.getAge(),m2.getAge() );
    }
}

class CompareName implements Comparator<Man> {
    public int compare(Man m1, Man m2){
        return m1.getName().compareTo(m2.getName());
    }
}

class CompareBranch implements Comparator<Man> {
    public int compare(Man m1, Man m2){
        return m1.getBranch().compareTo(m2.getBranch());
    }
}


public class comparator {
    public static void main(String[] args) {

        ArrayList<Man> list = new ArrayList<>();
        list.add(new Man("Ayush Sharma",24,"DS"));
        list.add(new Man("Nukul",20,"CSE"));
        list.add(new Man("Shivang",18,"CSE"));
        list.add(new Man("Pari",16,"DS"));

        Collections.sort(list, new CompareAge());

        System.out.println("Comparing on the Basis of Age");
        for(Man m:list){
            System.out.println(m.getName()+" "+m.getBranch()+" "+m.getAge());
        }


        Collections.sort(list, new CompareName());
        System.out.println("Comparing on the Basis of Name");
        for(Man m:list){
            System.out.println(m.getName()+" "+m.getBranch()+" "+m.getAge());
        }

        Collections.sort(list, new CompareBranch());
        System.out.println("Comparing on the Basis of Branch");
        for(Man m:list){
            System.out.println(m.getName()+" "+m.getAge()+" "+m.getBranch());
        }





    }
}
