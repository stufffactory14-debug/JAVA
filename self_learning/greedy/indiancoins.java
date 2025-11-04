package greedy;

public class indiancoins {
    static void main(String[] args) {
        int[] currency={1,2,5,10,20,50,100,500,2000};
        int v = 590;
        int ans = 0;
        for (int i = currency.length-1; i >=0 ; i--) {
            while(currency[i]<=v){
                ans++;
                v-=currency[i];
            }
        }
        System.out.println(ans);

    }
}
