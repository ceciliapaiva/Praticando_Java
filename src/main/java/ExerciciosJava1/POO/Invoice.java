package ExerciciosJava1.POO;

public class Invoice {
    // Atributos 
    private int codItem;
    private String descricao;
    private int quantItem;
    private double precoItem;
    private double valorFatura;
    
    // Metódos
    // Metódo construtor 
    public Invoice(int codItem, String descricao, int quantItem, double precoItem) {
        setCodItem(codItem);
        setDescricao(descricao);
        setQuantItem(quantItem);
        setPrecoItem(precoItem);
    }
    // Metódo getInvoiceAmount para calcular o valor da fatura
    public double getInvoiceAmount() {
        valorFatura = precoItem * quantItem;
        return valorFatura;
    }
 
    // Metódos setters e getters 
    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantItem(int quantItem) {
        if (quantItem < 0){
            quantItem = 0;
        } else {
            this.quantItem = quantItem;
        }
    }

    public void setPrecoItem(double precoItem) {
            if (precoItem < 0){
            this.precoItem = 0.0d;
        } else {
            this.precoItem = precoItem;
        }
    }

    public int getCodItem() {
        return codItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantItem() {
        return quantItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }
    
    
   
}
