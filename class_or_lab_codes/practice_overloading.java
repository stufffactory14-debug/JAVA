public class practice_overloading {
    public float discount(float price,float percentage){
        return (price*percentage)/100;
    }

    public float discount(float price){
        return (price*10)/100;
    }
    public double discount(double price){
        return (price*20)/100;
    }

    void print(String str){
        System.out.println(str);
    }

    void print(int[] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }

    void print(boolean bol){
        System.out.println(bol);
    }
    void print(int n){
        System.out.println(n);
    }
    String convert(int num){
        return Integer.toBinaryString(num);
    }
    void convert(double value){
        System.out.printf("%.2f",value);

    }
    public static void main(String[] args) {
        practice_overloading d = new practice_overloading();
        System.out.println(d.discount(800d));
        System.out.println(d.discount(800f));
        d.print(new int[]{1,4,56});
        d.print(true);
        d.print("hellow");
        System.out.println(d.convert(10));
        d.convert(12.567);
    }
    //omplement overloaded print , print string print int , print array of int print bool
}
