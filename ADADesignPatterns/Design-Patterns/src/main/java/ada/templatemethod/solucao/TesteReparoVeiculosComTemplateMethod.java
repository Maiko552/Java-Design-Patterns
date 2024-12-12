package ada.templatemethod.solucao;

import ada.templatemethod.VeiculoParaReparo;
import ada.templatemethod.problema.RepararVeiculoComumService;
import ada.templatemethod.problema.RepararVeiculoLuxoService;

public class TesteReparoVeiculosComTemplateMethod {

    public static void main(String[] args) {
        System.out.println("----------------LUXO-------------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(48);

        ReparoVeiculoService rpl = new ReparoVeiculoLuxoServiceComTemplateMethod(veiculoDeLuxo);

        rpl.concertandoVeiculo();

        System.out.println("---------------COMUM--------------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);
        ReparoVeiculoService rpc = new ReparoVeiculoComumServiceComTemplateMethod(veiculoComum);

         rpc.concertandoVeiculo();

    }
}
