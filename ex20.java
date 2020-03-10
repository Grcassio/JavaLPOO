import java.util.Scanner;

public class ex20{

    public static void main(String args[]){

        int v[]=new int[5];
        Scanner ler = new Scanner(System.in);
        int maior=0;

        for(int i=0;i<5;i++){
            v[i]=ler.nextInt();

        }

        for(int i=0;i<5;i++){
            if(i!=5 || v[i]>v[i+1]){
                maior=v[i];
            }
        }

        System.out.println(maior);

    }


}