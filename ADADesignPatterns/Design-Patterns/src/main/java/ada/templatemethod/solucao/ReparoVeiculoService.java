package ada.templatemethod.solucao;

public abstract class ReparoVeiculoService {

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

    //Unico método Abstract pois precimos mudar os valores dele conforme o carro
    protected abstract boolean veiculoParaReparo();

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
