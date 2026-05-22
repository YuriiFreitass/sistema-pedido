import enums.CategoriaProduto;
import model.Cliente;
import model.ItemPedido;
import model.Produto;
import pagamento.PagamentoBoleto;
import pagamento.PagamentoCartao;
import pagamento.PagamentoPix;
import pedido.Pedido;
public class Main {
    static void main(String[] args) {

        Cliente cliente = new Cliente ("Carlos Silva", "carlos@email.com");

        Produto celular = new Produto("Celular", 1200.0, CategoriaProduto.ELETRONICO);
        Produto camiseta = new Produto("Camiseta", 80, CategoriaProduto.ROUPA);
        Produto arroz = new Produto("Arroz", 12, CategoriaProduto.ALIMENTO);

        ItemPedido item1 = new ItemPedido(celular, 1);
        ItemPedido item2 = new ItemPedido(camiseta, 3);
        ItemPedido item3 = new ItemPedido(arroz, 5);

        Pedido pedido = new Pedido(cliente, 5);
        pedido.adicionarItem((item1));
        pedido.adicionarItem((item2));
        pedido.adicionarItem((item3));

        pedido.exibirResumo();

        System.out.println();

        pedido.processarPagamento(new PagamentoPix());

        System.out.println();

        pedido.exibirResumo();

    }
}
