public class week2 {
    public static void pyramid(int num){
        for(int i=1;i<=num;i++){
            for (int j=num-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pyramid12(int num){
        for(int i=1;i<=num;i++){
            for (int j=num-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=i;k>=1;k--){
                System.out.print(k);
            }
            for (int x =2; x<=i;x++){
                System.out.print(x);
            }
            System.out.println("");
        }
    }

    public static void main(String args[]){
        pyramid(5);
        pyramid12(5);
    }
}
