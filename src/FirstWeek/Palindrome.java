package FirstWeek;



public class Palindrome {
    public Boolean isPalindrome(int x){
        int n=x;
        if(x<0){
            return false;
        }
        int rem;
        int revNumber=0;

        while(n>0){
            rem=n%10;

            revNumber=revNumber*10+rem;

            n=n/10;
        }

        if(revNumber==x){
            return true;
        }else{
            return false;
        }


    }
    public static void main(String[] args) {
        Palindrome p=new Palindrome();

        System.out.println(p.isPalindrome(234));

    }

}
