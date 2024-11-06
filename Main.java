import contas.Conta;
import contas.PF;

public class Main {
    public static void main(String[] args) {

        bancos.Banco[] bancos = new bancos.Banco[2];

        bancos[0] = new bancos.Banco(0, "Itau");
        bancos[1] = new bancos.Banco(1, "bancos.Banco do Brasil");

        bancos[1].criarConta("123.456.789-01","PF");
        Conta conta1 = bancos[1].localizarConta("123.456.789-01", "PF");

        bancos[0].criarConta(conta1.getCPFTitular(), "PJ");

        System.out.println(bancos[0].localizarConta("123.456.789-01","PJ").getTipoConta());





    }
}
