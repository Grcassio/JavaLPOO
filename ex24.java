import java.util.Scanner;

public class ex24{


    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int a;
        int num=0;

        a=ler.nextInt();

        num=(a*(a-1));

        a=a-1;

        while((a-1)!=0){

            num=num*(a-1);
            

            a--;

        }

        System.out.println(num);


    }



}