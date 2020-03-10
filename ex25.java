import java.util.Scanner;

public class ex25{

    public static void main(String[] args){

        Scanner ler=new Scanner(System.in);

        int n;
        double e=1;
        int cont;
        double var=1.0;
        n=ler.nextInt();

        for(int i=1;i<=n;i++){

            for(double j=i;j<=n;j++){
                var*=j;
                
            }

            e+=1.0/var;
            var=1.0;
        }
        e=e+1;
        System.out.println(e);

    }



}