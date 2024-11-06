package contas;

import bancos.TiposDeContaDisponivel;

public class PF extends Conta implements IForceTipoConta {

    private Enum<TiposDeContaDisponivel> tipoConta = TiposDeContaDisponivel.PF;

    public PF(String CPFTitular, int numeroDaConta) {
        super(CPFTitular, numeroDaConta);
    }

    public PF(String CPFTitular, int numeroDaConta, float saldo) {
        super(CPFTitular, numeroDaConta, saldo);
    }

    @Override
    public Enum<TiposDeContaDisponivel> getTipoConta() {
        return tipoConta;
    }
}
