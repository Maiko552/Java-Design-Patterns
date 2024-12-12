package ada.chainResponse.solucao;

import ada.chainResponse.Carro;
import ada.chainResponse.Marca;

import java.math.BigDecimal;

public class DescontoCarroFiat extends DescontoCarro{

    public DescontoCarroFiat(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(Marca.FIAT.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(1000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
