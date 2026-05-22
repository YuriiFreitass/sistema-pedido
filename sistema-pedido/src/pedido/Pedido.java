package pedido;
import enums.StatusPedido;
import model.Cliente;
import model.ItemPedido;
import pagamento.Pagavel;
public class Pedido {
    private Cliente cliente;
    private ItemPedido[] itens;
    private int totalItens;
    private StatusPedido status;

    public Pedido(Cliente cliente, int capacidade) {
        this.cliente = cliente;
        this.itens = new ItemPedido[capacidade];
        this.totalItens = 0;
        this.status = StatusPedido.ABERTO;
    }
    public void adicionarItem(ItemPedido item) {
        if (totalItens >= itens.length) {
            System.out.println("Pedido cheio!");
            return;
        }
        itens[totalItens] = item;
        totalItens++;
    }
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < totalItens; i++) {
            total += itens[i].calcularSubTotal();
        }
        return total;
    }
    public void processarPagamento (Pagavel pagamento) {
        double total = calcularTotal();
        pagamento.processarPagamento(total);
        this.status = StatusPedido.FECHADO;
    }
    public void exibirResumo() {
        System.out.println("=== RESUMO DO PEDIDO ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Status: " + status.getDescricaoStatus());
        System.out.println("Itens:");
        for (int i = 0; i < totalItens; i++) {
            System.out.println("- " + itens[i].getProduto().getNome() + " x" + itens[i].getQuantidade() + " = R$" + itens[i].calcularSubTotal());
        }
    }
}
