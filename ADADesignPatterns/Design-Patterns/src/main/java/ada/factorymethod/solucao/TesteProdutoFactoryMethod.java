package ada.factorymethod.solucao;

import ada.factorymethod.Produto;
import ada.factorymethod.TipoProdutoEnum;

public class TesteProdutoFactoryMethod {

    public static void main(String[] args) {

        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital);
        System.out.println(produtoFisico);

    }
}
