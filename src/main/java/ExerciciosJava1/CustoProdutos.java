package ExerciciosJava1;
/* Entrada: Preço de custo e preço de venda de um produto.
   Processamento: Comparar a venda com o custo, pegar a quantidade de produtos
   e calcular a média.
   Saída: Mostra se houve lucro, prejuízo ou empate e se 
   for mais de um produto a média de custo e de venda.
*/
import java.util.Scanner;
public class CustoProdutos {
    
    public static void main(String[] args) {
        
        float somaCusto = 0.0f;
        float somaVenda = 0.0f;
        int quantProdutos = 0;
        float mediaCusto = 0.0f;
        float mediaVenda = 0.0f; 
        String ctn = "sim";
        
        
        Scanner ent = new Scanner(System.in);
        
        while(ctn.equalsIgnoreCase("sim")){
        System.out.println("Nome produto: ");
        String nome = ent.next();
        System.out.println("Preço de Custo: ");
        float precoCusto = ent.nextFloat();
        System.out.println("Preço de Venda: ");
        float precoVenda = ent.nextFloat();
        
        float dif = 0.0f;
        dif = precoVenda - precoCusto;
        if(precoVenda > precoCusto){
            System.out.println(nome + " tem LUCRO de R$" + dif);            
        }else if (precoVenda < precoCusto){
            System.out.println(nome + " tem PREJUÍZO de R$" + dif);
        }else if (precoVenda == precoCusto){
            System.out.println(nome + " tem EMPATE\nValorize seu produto.");
        }
        
        System.out.println("Deseja continuar? (sim/não)");
        ctn = ent.next().toLowerCase();
              
        
        somaCusto += precoCusto;
        somaVenda += precoVenda;
        quantProdutos += 1;
        }
        ent.close(); //Para fechar o Scanner
        if(quantProdutos > 0){
            mediaCusto = somaCusto / quantProdutos;
            mediaVenda = somaVenda / quantProdutos;
        }else{
            System.out.println("Não temos como cálcular a média.");
        }     
        System.out.println("Sua média de preços de custo é R$" + mediaCusto);
        System.out.println("Sua média de preços de vendas é R$" + mediaVenda);
    }
    
}
