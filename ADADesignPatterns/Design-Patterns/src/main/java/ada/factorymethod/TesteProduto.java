package ada.factorymethod;

public class TesteProduto {
    public static void main(String[] args) {

        //ERRADO PODE ACORRENTAR ERROS
        //A PESSOA DEFINIR AS PROPRIEDADES
        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
