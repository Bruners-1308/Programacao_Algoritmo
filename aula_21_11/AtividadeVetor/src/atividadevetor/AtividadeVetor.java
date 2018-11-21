package atividadevetor;
import java.util.*;

public class AtividadeVetor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [] num;
        int I=0;
        int contador=0;
        num = new int [5];
        for (I=0;I<=4;I++){
            System.out.printf("numeros do 1º vetor: ");
            num[I]=entrada.nextInt();
        }
        
        Scanner novaentrada = new Scanner (System.in);
        int [] num2;
        int A=0;
        num2 = new int [5];
        for (A=0;A<=4;A++){
            System.out.printf("numeros do 2º vetor: ");
            num2[A]=entrada.nextInt();
        
    }
        Scanner sc = new Scanner (System.in);
        int[] exibe;
        exibe = num;
        
        System.out.printf("Exibe dois vetores"+ contador);
        
    }
}
