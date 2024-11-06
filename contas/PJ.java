package contas;

import bancos.TiposDeContaDisponivel;

public class PJ extends Conta implements IForceTipoConta{

    private Enum<TiposDeContaDisponivel> tipoConta = TiposDeContaDisponivel.PJ;

    public PJ(String CPFTitular, int numeroDaConta) {
        super(CPFTitular, numeroDaConta);
    }

    public PJ(String CPFTitular, int numeroDaConta, float saldo) {
        super(CPFTitular, numeroDaConta, saldo);
    }

    @Override
    public Enum<TiposDeContaDisponivel> getTipoConta() {
        return tipoConta;
    }

}
