package ada.chainResponse.solucao;

import ada.chainResponse.Carro;
import ada.chainResponse.Marca;

import java.math.BigDecimal;

public class DescontoCarroFord extends DescontoCarro{

    public DescontoCarroFord(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if(Marca.FORD.equals(carro.getMarca())){
            return valorVenda.subtract(new BigDecimal(2000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
