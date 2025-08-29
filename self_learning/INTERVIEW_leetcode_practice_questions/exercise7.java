class libraraymanagemnt{
    String [] books;
    int no_of_books;
    String [] author;

    libraraymanagemnt(){
        this.books= new String[100];
        this.author=new String[100];
        no_of_books=0;
    }
    public void addbook(String book,String auth){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+"book has been added succusfully ");
        this.author[no_of_books]=auth;
        System.out.println(" the authure of "+book +" is "+ auth);
    }
    public void available(){
        System.out.println("available books are :");
        for(String book:this.books){
            if(book==null){
                continue;
            }
            else{
                System.out.println(book);
            }
        }
    }
    public void issue(String book){
        for(int i=0; i<this.books.length; i++){
        if(this.books[i]==book){
                System.out.println(book +" book has been issued");
                this.books[i] = null;
            }
        }
    }
    public void retrn(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println("thanks for returning "+book+" book");

    }
}



public class exercise7 {
    public static void main(String[] args) {
        libraraymanagemnt l1= new libraraymanagemnt();
        l1.addbook("harry op","hulululu");
        l1.addbook("c++","pata ni");
        l1.addbook("java","koi to hoga");
        //l1.available();
      //  l1.issue("c++");
        //l1.retrn("c++");
    }
}
