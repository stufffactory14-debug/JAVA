class invalidint extends Exception{
    public String toString(){
        return "you cant use 8,9";
    }
}

class calculator{
    public double add(double a, double b) throws invalidint{
        if(a==8|| a==9||b==8||b==9){
            throw new invalidint();
        }
        return a+b;
    }
    public double minus(double a, double b){
        return a-b;
    }
    public double multi(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
}

public class exercie6 {
    public static void main(String[] args) throws invalidint {
    calculator c1= new calculator();
        System.out.println(c1.add(9,5));
    }
}
