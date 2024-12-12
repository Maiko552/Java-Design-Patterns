package ada.templatemethod.problema;

import ada.templatemethod.VeiculoParaReparo;

public class RepararVeiculoLuxoService {

    private VeiculoParaReparo veiculoParaReparo;

    public RepararVeiculoLuxoService(VeiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void concertandoVeiculo(){
        entradaOficina();
        analisarDanos();
        if (veiculoParaReparo()){
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    private boolean veiculoParaReparo(){
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }

    private void notificarPerdaTotalParaSeguradora(){
        System.out.println("Notificando perda total para a seguradora.");
    }
    private void notificarReparoParaSeguradora(){
        System.out.println("Notificando reparo para a seguradora.");
    }

    private void repararVeiculo(){
        System.out.println("Reparando veiculo...");
    }

    private void analisarDanos(){
        System.out.println("Analisando Danos...");
    }

    private void entradaOficina(){
        System.out.println("Veiculo entrando Oficina...");
    }
}
