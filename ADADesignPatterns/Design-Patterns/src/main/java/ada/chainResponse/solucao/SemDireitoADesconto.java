package ada.chainResponse.solucao;

import ada.chainResponse.Carro;
import ada.chainResponse.Marca;

import java.math.BigDecimal;

public class SemDireitoADesconto extends DescontoCarro{

    public SemDireitoADesconto(DescontoCarro proximoDesconto){
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(Carro carro) {
      return BigDecimal.ZERO;
    }
}
