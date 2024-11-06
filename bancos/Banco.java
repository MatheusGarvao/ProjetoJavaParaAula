package bancos;

import contas.Conta;
import contas.PF;
import contas.PJ;


import java.util.ArrayList;

public class Banco {

    private int numeroDoBanco;
    private String nomeDoBanco;
    private Float saldo;
    private ArrayList<Conta> contas = new ArrayList();

    public Banco(int numeroDoBanco, String nomeDoBanco) {
        this.numeroDoBanco = numeroDoBanco;
        this.nomeDoBanco = nomeDoBanco;
        this.saldo = 0f;
    }


    public Banco(int numeroDoBanco, String nomeDoBanco, Float saldo) {
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

    public void criarConta(String CPF, String tipoConta) {

        if (localizarConta(CPF, tipoConta) == null) {
            Conta conta = null;
            if (traduzirTipo(tipoConta) == TiposDeContaDisponivel.PF) {
                conta = new PF(CPF, this.contas.size(), 0f);
            } else {
                conta = new PJ(CPF, this.contas.size(), 0f);
            }
            this.contas.add(conta);
        }

    }

    public Conta localizarConta(String CPF, String tipoConta) {
        for (int i = 0; i < this.contas.size(); i++) {
            if (this.contas.get(i).getCPFTitular().equals(CPF) &&
                    this.contas.get(i).getTipoConta() == traduzirTipo(tipoConta)) {
                return this.contas.get(i);
            }
        }
        return null;
    }


    public Enum<TiposDeContaDisponivel> traduzirTipo(String tipoConta) {
        return TiposDeContaDisponivel.valueOf(tipoConta);
    }

}
