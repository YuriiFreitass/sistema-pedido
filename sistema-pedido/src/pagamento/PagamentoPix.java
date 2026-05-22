package pagamento;

public class PagamentoPix implements Pagavel{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix de R$" + valor + "processado!");
    }
}
