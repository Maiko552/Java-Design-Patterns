package ada.templatemethod.problema;

import ada.templatemethod.VeiculoParaReparo;

public class TesteReparoVeiculos {

    public static void main(String[] args) {
        System.out.println("----------------LUXO-------------------");
        VeiculoParaReparo veiculoDeLuxo = new VeiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(51);

        RepararVeiculoLuxoService rpl = new RepararVeiculoLuxoService(veiculoDeLuxo);

        rpl.concertandoVeiculo();

        System.out.println("---------------COMUM--------------------");

        VeiculoParaReparo veiculoComum = new VeiculoParaReparo();
        veiculoComum.setPorcentagemDano(69);
         RepararVeiculoComumService rpc = new RepararVeiculoComumService(veiculoComum);

         rpc.concertandoVeiculo();

    }
}
