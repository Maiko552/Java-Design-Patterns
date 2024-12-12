package ada.templatemethod.solucao;

import ada.templatemethod.VeiculoParaReparo;

public class ReparoVeiculoComumServiceComTemplateMethod extends ReparoVeiculoService{

    private VeiculoParaReparo veiculoParaReparo;

    public ReparoVeiculoComumServiceComTemplateMethod(VeiculoParaReparo veiculoParaReparo){
        this.veiculoParaReparo = veiculoParaReparo;
    }


    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }
}
