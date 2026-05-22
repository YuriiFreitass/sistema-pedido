package pagamento;

public class PagamentoBoleto implements Pagavel {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto de R$" + valor +  "gerado!");
    }
}
