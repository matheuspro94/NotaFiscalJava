import java.text.ParseException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Projeto {

    public static void main(String args[]) throws ParseException {

        /*
        Criando os produtos
         */
        Produto produtoA = new Produto("camiseta sports", "camiseta esportiva", 45.50);
        Produto produtoB = new Produto("Short feminino rosa", "short feminino", 68.00);
        Produto produtoC = new Produto("Colar pingente de coração", "jóias", 123.45);
        Produto produtoD = new Produto("Perfume frances", "perfume", 99.99);
        Produto produtoE = new Produto("Tênis Nike", "tênis", 149.90);

        /*
        Criando as Notas Fiscais
         */
        NotaFiscal nfA = new NotaFiscal("11/11/2021");
        nfA.adicionaProdutoEQuantidade(produtoA, 1);
        nfA.adicionaProdutoEQuantidade(produtoC, 2);

        NotaFiscal nfB = new NotaFiscal("07/03/2020");
        nfB.adicionaProdutoEQuantidade(produtoB, 1);
        nfB.adicionaProdutoEQuantidade(produtoE, 2);

        NotaFiscal nfC = new NotaFiscal("27/02/2020");
        nfC.adicionaProdutoEQuantidade(produtoA, 1);
        nfC.adicionaProdutoEQuantidade(produtoB, 1);
        nfC.adicionaProdutoEQuantidade(produtoC, 3);


        /*
        Criando uma lista de Notas Fiscais e adicionando as notas já criadas nela
         */
        List<NotaFiscal> notasFiscais = new LinkedList<NotaFiscal>();
        notasFiscais.add(nfA);
        notasFiscais.add(nfB);
        notasFiscais.add(nfC);

        /*
        Imprimindo as informações das Notas Fiscais de um determinado mês.
        No caso, fevereiro
         */
        notasDeUmDeterminaodMes(2, notasFiscais);
    }

    public static void notasDeUmDeterminaodMes(int mes, List<NotaFiscal> notas) {
        for(NotaFiscal nf : notas) {
            if(nf.getData().getMonth() == (mes - 1)) {
                System.out.println(nf.toString());
            };
        };
    };
}
