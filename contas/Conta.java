package contas;

import bancos.TiposDeContaDisponivel;

public abstract class Conta implements IForceTipoConta {
    private Float saldo;
    private String CPFTitular;
    private int numeroDaConta;

    public Conta(String CPFTitular, int numeroDaConta) {
        this.CPFTitular = CPFTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0f;
    }

    public Conta(String CPFTitular, int numeroDaConta, float saldo) {
        this.CPFTitular = CPFTitular;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        if (this.saldo == null) {
            this.saldo = saldo;
            return;
        }
        System.out.println("É proibido modificar o saldo da conta.");
    }

    public String getCPFTitular() {
        return CPFTitular;
    }

    public void setCPFTitular(String CPFTitular) {
        this.CPFTitular = CPFTitular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    @Override
    public abstract Enum<TiposDeContaDisponivel> getTipoConta();
}
