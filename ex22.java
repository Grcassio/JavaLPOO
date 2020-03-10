import java.util.Scanner;
import java.lang.Math;

public class ex22{


    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int pali;
        int cont=0;
        int num;
        double fim=0;

        pali=ler.nextInt();
        
        

        while(pali>=1){

            num=pali%10;

            if(num==1){
                fim = fim + Math.pow(2,cont);
                
            }

            pali=pali/10;
            cont=cont+1;

        }


        System.out.println(fim);

    }




}