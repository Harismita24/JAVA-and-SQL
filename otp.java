import java.util.Random;
import java.util.Scanner;
class Main {
    static int OPT(){
        Random ran = new Random();
        return 100 + ran.nextInt(500);
    }
     
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        long num=in.nextLong();
        long a=1234567890L;
        if(num == a){
            int opt = OPT();
        System.out.println("Pass word:"+opt);
            System.out.println("verified number");
        }else{
            System.out.println("Invaild number");
        }
    }
}