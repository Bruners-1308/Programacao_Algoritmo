
package vetormes;
import java.util.*;
public class VetorMes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String [] MES;
        int NUMES;
        MES = new String [12];
        MES[0]="Janeiro";
        MES[1]="Fevereiro";        
        MES[2]="Março";        
        MES[3]="Abril";       
        MES[4]="Maio";        
        MES[5]="Junho";      
        MES[6]="Julho";        
        MES[7]="Agosto";       
        MES[8]="Setembro";       
        MES[9]="Outubro";       
        MES[10]="Novembro";        
        MES[11]="Dezembro";

        System.out.printf("Digite o número do mês: ");
        NUMES = entrada.nextInt();
        System.out.printf(MES[NUMES-1]+"\n");
    }
    
}
