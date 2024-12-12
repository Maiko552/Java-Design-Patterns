package ada.chainResponse.solucao;

import ada.chainResponse.Carro;
import ada.chainResponse.Marca;

import java.math.BigDecimal;

public class VendaCarroServiceComChainOfResponsibility {

    public BigDecimal calculaValorVenda(Carro carro){
        DescontoCarro desconto =
                new DescontoCarroFiat(
                     new DescontoCarroFord(
                        new DescontoCarroValorMaiorQueCemMil(
                                new SemDireitoADesconto(null)
                        )));

        return desconto.aplicaDesconto(carro);
    }
}
