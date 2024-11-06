package contas;
import bancos.TiposDeContaDisponivel;

public interface IForceTipoConta {
    Enum<TiposDeContaDisponivel> tipoConta = null;
    Enum<TiposDeContaDisponivel> getTipoConta();
}
