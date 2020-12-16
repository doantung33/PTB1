import java.util.Scanner;

public class PTB1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap a");
        int a= scanner.nextInt();
        System.out.println("nhap b");
        int b= scanner.nextInt();
        System.out.println("nhap c");
        int c= scanner.nextInt();
        if (a!=0){
            System.out.println("nghiem cua pt la: "+ (c-b)/a );
        }else{
            if (b==0){
                System.out.println("pt co nghiem la: "+ c/a);
            }else{
                System.out.println("pt vo nghiem");
            }
        }
    }
}
