package FirstWeek;


public class TribonacciNumber {
    public int tribonacci_n_th(int n) {
        int fstNum=0;
        int secNum=1;
        int thrdNum=fstNum + secNum;
        int temp;

        if(n==0){
            return fstNum;

        }
        else if(n==1){
            return secNum;
        }
        else if(n==2){
            return thrdNum;
        }

        for(int i=fstNum;i<=n-3;i++){
            temp=thrdNum + secNum + fstNum;

            fstNum=secNum;
            secNum=thrdNum;
            thrdNum=temp;
        }
        return thrdNum;
    }
    public static void main(String[] args) {
        TribonacciNumber t=new TribonacciNumber();
        System.out.println(t.tribonacci_n_th(3));
    }
}
