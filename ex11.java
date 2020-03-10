import java.util.Scanner;



public class ex11{

    public static void main(String args[]){

    int x;
    int n;

    Scanner ler= new Scanner(System.in);

    int s=ler.nextInt();


    for(int i=1;i<=s;i++){

        x=i;

        for(int j=1;j<=x;j++){
            
            n=x*j;
            System.out.print(n+" ");

        }
        x++;
    
        System.out.println();
    }





    }



}