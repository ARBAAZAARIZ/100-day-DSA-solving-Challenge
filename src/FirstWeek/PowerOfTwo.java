package FirstWeek;




public class PowerOfTwo {
//    public boolean isPowerOfTwo(int x){
//        if(x<1){
//            return false;
//        }else if(x==1){
//            return true;
//        }
//        else if((x & x-1 )==0){
//            return true;
//        }else{
//            return false;
//        }
//    }
public boolean isPowerOfTwo(int x){

    if(x<1){
        return false;
    }else if(x==1){
        return true;
    }

    while (x!=1){
        if(x%2!=0){
            return false;
        }
        else{
            x=x/2;
        }

    }
     if(x==1){

        return true;
    }
     else{
         return false;
     }

}


    public static void main(String[] args) {
        PowerOfTwo p=new PowerOfTwo();
        System.out.println(p.isPowerOfTwo(64));

    }
}
