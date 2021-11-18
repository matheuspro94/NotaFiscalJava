import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class NotaFiscal {

    NotaFiscal(String data) throws ParseException {
        this.produtos = new LinkedList<Produto>();
        this.quantidade = new LinkedList<Integer>();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.data = formato.parse(data);;
        setValorTotal(0);
    }

    private List<Produto> produtos;
    private List<Integer> quantidade;
    private Date data;
    private double valorTotal;

    private void calculaValorTotal(Produto produto, int qtd) {
        setValorTotal(getValorTotal() + (produto.getValor() * qtd));
    }

    public void adicionaProdutoEQuantidade(Produto produto, int qtd) {
        this.produtos.add(produto);
        this.quantidade.add(qtd);

        this.calculaValorTotal(produto, qtd);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "NotaFiscal {" +
                "produtos = " + produtos +
                ", quantidade = " + quantidade +
                ", data = " + data +
                ", valorTotal = " + valorTotal +
                '}';
    }
}
