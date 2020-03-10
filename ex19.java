import java.util.Scanner;

class Empregado{
    int horast;
    double salarioh;
    double salariobruto; 
}

public class ex19{

    public static void main(String args[]){

        
        Scanner ler = new Scanner(System.in);

        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();
        Empregado empregado3 = new Empregado();

        System.out.println("Empregado1:");
        empregado1.horast=ler.nextInt();
        empregado1.salarioh=ler.nextDouble();

        if(empregado1.horast>40){
            empregado1.salariobruto=(40*empregado1.salarioh)+(0.5*( (empregado1.horast-40) *empregado1.salarioh));
        }else{
            empregado1.salariobruto=empregado1.salarioh*empregado1.horast;
        }

        System.out.println(empregado1.salariobruto);

        System.out.println("Empregado2:");
        empregado2.horast=ler.nextInt();
        empregado2.salarioh=ler.nextDouble();

        if(empregado2.horast>40){
            empregado2.salariobruto=(40*empregado2.salarioh)+(0.5*((empregado2.horast-40)*empregado2.salarioh));
        }else{
            empregado2.salariobruto=empregado2.salarioh*empregado2.horast;
        }

        System.out.println(empregado2.salariobruto);


        System.out.println("Empregado3:");
        empregado3.horast=ler.nextInt();
        empregado3.salarioh=ler.nextDouble();


        if(empregado3.horast>40){
            empregado3.salariobruto=(40*empregado3.salarioh)+ (0.5*((empregado3.horast-40)*empregado3.salarioh));
        }else{
            empregado3.salariobruto=empregado3.salarioh*empregado3.horast;
        }

        System.out.println(empregado3.salariobruto);


    }

}