package FirstWeek;
// fibonacci series 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
public class FibonacciNumber {

    public void FibonacciNum(int x){

        int a=0;
        int b=1;
        int temp;

        if(x==1){
            System.out.println(a + "  ");
        }

        else if(x>=2){
            System.out.print(a + "  ");
            System.out.print(b + "  ");
        }

        while(x>2){
            temp=a+b;
            a=b;
            b=temp;
            System.out.print(temp + "  ");
            x--;
        }
        System.out.println();
    }

    public int PrintFibonacciNumber(int x){

        x=x-1;
        int a=0;

        int b=1;
        int temp;

        while(x>0){
            temp=a+b;
            a=b;
            b=temp;
            x--;
        }
        if(x==1){
            return a;
        }else {
            return b;
        }

    }

//     print fibonacci number ex 6 fibonacci number=5


    public static void main(String[] args) {
        FibonacciNumber f=new FibonacciNumber();
        f.FibonacciNum(3);
        System.out.println(f.PrintFibonacciNumber(4));
    }




}
