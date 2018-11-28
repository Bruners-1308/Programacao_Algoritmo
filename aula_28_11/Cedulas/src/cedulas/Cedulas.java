package cedulas;

import java.util.*;
public class Cedulas {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        float valorPagar=0, valorPago=0, valorTroco;
        int cem, cinquenta, vinte, dez, cinco, dois;
        int cinquentacent, vintecincocent, dezcent, cincocent;
        int troco = 0;
        valorTroco = valorPago - valorPagar;
                
            System.out.printf("Informe o Valor da ser pago: R$ ");
            valorPagar = ler.nextFloat();

            System.out.printf("Informe o Valor efetivamente Pago: R$ ");
            valorPago = ler.nextFloat();
            
           
            
        if (troco >=100){
            cem = troco/100;
            troco = troco%100;
            System.out.println("Quantidade de notas de 100 " + troco);
        }
        
        else if (troco >=50){
            cinquenta = troco/50;
            troco = troco%50;
            System.out.println("Quantidade de notas de 50 " + troco);
        }
        
         else if (troco >=20){
            vinte = troco/20;
            troco = troco%20;
            System.out.println("Quantidade de notas de 20 " + troco);
        }
        else if (troco >=10){
            dez = troco/10;
            troco = troco%10;
            System.out.println("Quantidade de notas de 10 " + troco);
        }
        
        else if (troco >=5){
            cinco = troco/5;
            troco = troco%5;
            System.out.println("Quantidade de notas de 5 " + troco);
        }   
        else {
            dois = troco/2;
            troco = troco%2;
            System.out.println("Quantidade de notas de 2 " + troco);
        }
        
        
}
}
