public class week1 {
    public static void main(String[] args){
        System.out.println("Hello");
        largestOfThreeNumbers(6,13,42);
        evenNumbersOneToHundred();
        System.out.println(reverseNumber(23424));
        primeNumber(7);
    }
    //Largest of three numbers
    public static void largestOfThreeNumbers(int a, int b, int c){
//        int ans = Integer.MIN_VALUE;

        if(a>b && a>c){
            System.out.println("a is largest");
        }else if(b>c){
            System.out.println("b is largest");
        }else System.out.println("c is largest");
    }

    //even numbers from 1 to 100
    public static void evenNumbersOneToHundred(){
        for(int i=0;i<=100;i+=2){
            System.out.println(i);
//            if(i%2==0){
//                System.out.println(i);
//            }
        }
    }

    public static int reverseNumber(int num){
        int rev = 0;
        while(num>0){
            rev  = rev*10 + (num%10);
            num = num/10;
        }
        return rev;
    }

    //prime number
    public  static void primeNumber(int num){
        boolean flag = false;
        for (int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Not prime");
                flag = !flag;
                break;
            }
        }

        if(flag) System.out.println("Not prime");
            else System.out.println("Prime");
    }
}
