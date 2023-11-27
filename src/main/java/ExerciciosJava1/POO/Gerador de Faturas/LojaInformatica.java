package ExerciciosJava1.POO;
/*DESAFIO:
   Crie uma classe chamada Invoice que possa ser utilizado por uma loja de informática para 
   representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações 
   como atributos:
   a. o número do item faturado,
   b. a descrição do item,
   c. a quantidade comprada do item e
   d. o preço unitário do item.
   Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela 
   deve ser configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0. 
   Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método 
   chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por 
   item) e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as 
   capacidades da classe Invoice.
 */
    import java.util.Scanner;
public class LojaInformatica {  
    public static void main(String[] args) {
        int codigo = 0; 
        String descricao = "";
        int quant = 0;
        double preco = 0.0d;
        double somaFaturas = 0.0d;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Quantos diferentes tipos de itens foram vendido? ");
        int quantLoops = leitor.nextInt();
        
        for (int i = 1; i <= quantLoops; i++){
            System.out.println("ITEM " + i);
            System.out.println("Código: ");
            codigo = leitor.nextInt();
            System.out.println("Descrição: ");
            descricao = leitor.nextLine();
            System.out.println("Quantidade vendida: ");
            quant = leitor.nextInt();
            System.out.println("Preço unitário do item: ");
            preco = leitor.nextDouble();
            // A classe Invoice será instaciada novamente a cada loop
            Invoice faturaAtual = new Invoice(codigo, descricao, quant, preco);
            
            System.out.println("Fatura do item " + descricao + ": R$ " + faturaAtual.getInvoiceAmount());
            
            somaFaturas += faturaAtual.getInvoiceAmount();
        }
        
        System.out.print("VALOR TOTAL DESTE PEDIDO/PACOTE: R$ " + somaFaturas);
       
    }
    
}
