package ada.factorymethod.solucao;

import ada.factorymethod.Produto;
import ada.factorymethod.ProdutoDigital;
import ada.factorymethod.ProdutoFisico;
import ada.factorymethod.TipoProdutoEnum;

public class ProdutoFactory {
    public static Produto getInstance (TipoProdutoEnum tipoProdutoEnum){

        switch (tipoProdutoEnum){
            //se for fisico instancie um produto e retorne como true as dimensoes e retorne o objeto
            case FISICO: ProdutoFisico produtoFisico = new ProdutoFisico();
            produtoFisico.setPossuiDimensoesFisicas(true);
            return produtoFisico;
            //se for digitalinstancie um produto e retorne como false as dimensoes e retorne o objeto
            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default: throw new IllegalArgumentException("Tipo de produto não disponível");
        }
    }
}
