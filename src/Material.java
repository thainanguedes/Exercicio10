
public class Material {
    
    private String nome;
    private double quantidade;

    public Material(String n, double qntd) throws QuantidadeInvalidaException{
        this.setNome(n);
        this.setQuantidade(qntd);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double qntd)throws QuantidadeInvalidaException {
        
        if(qntd < 0){
            throw new QuantidadeInvalidaException("Quantidade de celular menor que zero");
        }
        this.quantidade = qntd;
    }
    
    
}
