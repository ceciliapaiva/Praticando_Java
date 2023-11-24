package ExerciciosJava1;
/*
A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral.
 */
import java.util.Scanner;
public class ConcessionariaVeiculos {
    public static void main(String[] args) {
        int anoVeiculo = 0;
        float valorVeiculo = 0.0f;
        char ctn = 'S';
        float desconto = 0.0f;
        int carrosAntigos = 0;
        int totalCarros = 0;
        float valorcomDesconto = 0.0f;
        float taxa = 0.0f;
    
        Scanner leitor = new Scanner(System.in);
        
        while(ctn == 'S' || ctn == 's'){
            // Entrada 
            System.out.print("Ano do véiculo: ");
            anoVeiculo = leitor.nextInt();
            System.out.print("Valor do veículo: ");
            valorVeiculo = leitor.nextFloat();
            // Processamento
            if(anoVeiculo <= 2000){
                taxa = 0.12f;   
                carrosAntigos ++;
            }else {
                taxa = 0.07f;
                totalCarros ++;
            }
            desconto = valorVeiculo * taxa;
            valorcomDesconto = valorVeiculo - desconto;
            
            // Saída
            System.out.println("Valor com desconto: R$" + valorcomDesconto);
            System.out.println("Desconto concebido para o veículo ano " + anoVeiculo + ": R$" + desconto);          

            System.out.println("Deseja continuar?(S/N)");
            ctn = leitor.next().charAt(0);
        }
        System.out.println("Total de veículos antigos na loja: " + carrosAntigos);
        System.out.println("Total de veículos na loja: " + totalCarros);  
    }
    
}
