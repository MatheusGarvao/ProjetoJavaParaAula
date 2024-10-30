import java.util.ArrayList;

public class Banco {

    private int numeroDoBanco;
    private String nomeDoBanco;
    private Float saldo;
    private ArrayList<Conta> contas = new ArrayList();

    public Banco(int numeroDoBanco, String nomeDoBanco){
        this.numeroDoBanco = numeroDoBanco;
        this.nomeDoBanco = nomeDoBanco;
        this.saldo = 0f;
    }

    public Banco(int numeroDoBanco, String nomeDoBanco, Float saldo){
        this.numeroDoBanco = numeroDoBanco;
        this.nomeDoBanco = nomeDoBanco;
        this.saldo = saldo;
    }

    public int getNumeroDoBanco() {
        return numeroDoBanco;
    }

    public void setNumeroDoBanco(int numeroDoBanco) {
        this.numeroDoBanco = numeroDoBanco;
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }
    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void criarConta(String CPF){
        for(int i = 0; i < this.contas.size(); i++){
            if(this.contas.get(i).getCPFTitular() == CPF){
                return;
            };
        }
        Conta conta = new Conta(CPF, this.contas.size()+1, 0f);
        this.contas.add(conta);
    }

}
