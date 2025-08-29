package com.codewithharry.shape;

class rectang{
    int volu;
    int surfac;
    int leng;
    int weig;
    int height;
    int m;
    int sides;
    int d;


    rectang(int myleng, int myweig,int myheight){
        leng=myleng;
        weig=myweig;
        height=myheight;
        m=2*(leng+weig);
    }

    public int sufac(){
        return leng*weig;
    }
    public int volu(){
        return leng*weig*height;
    }
    public void set(int a){
        m=a;
    }
    public int get(){
        return  m;
    }
}

class squa extends rectang{
    squa(int myleng, int myweig,int myheight ,int myside){
        super(myleng, myweig, myheight);
        sides=myside;
    }

    public int vol(){
        return sides*sides*sides;
    }
}


public class exercise5 {
    public static void main(String[] args) {
        squa r= new squa(5,6,4,2);
        System.out.println("the surface area of rectangle is :"+r.sufac());
        System.out.println("the volume of rectangle is :"+r.volu());
        System.out.println("dimensition of rectangle:"+r.get());
        System.out.println("sides of square : "+ r.vol());


    }
}
