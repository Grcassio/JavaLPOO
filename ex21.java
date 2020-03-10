import java.util.Scanner;

public class ex21{

    public static void main(String args[]){

        int v[]=new int [5];
        Scanner ler = new Scanner(System.in);
        int maior=0;
        int segundomaior=0;

        for(int i=0;i<5;i++){
            v[i]=ler.nextInt();
        }

        maior=v[0];

        for(int i=0;i<5;i++){

            if(v[i]>maior){
                maior=v[i];
            }
        }

        segundomaior=v[0];
        for(int i=0;i<5;i++){
            
            if(v[i]>segundomaior){
                
                if(v[i]!=maior){
                segundomaior=v[i];
                }
            }
        }

        System.out.println("maior=" + maior);
        System.out.println("segundo=" + segundomaior);



    }



}