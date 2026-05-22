package pagamento;

public class PagamentoCartao implements Pagavel{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Cartão de R$" + valor + " processado!");
    }
}
