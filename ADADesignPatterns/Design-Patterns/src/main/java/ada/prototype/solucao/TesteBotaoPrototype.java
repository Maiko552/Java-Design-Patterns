package ada.prototype.solucao;

import ada.prototype.Botao;
import ada.prototype.TipoBordaEnum;

public class TesteBotaoPrototype {
    public static void main(String[] args) {

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");

        System.out.println(botaoAmarelo);

        //Criando outro botao
        String chave  = "BOTAO_PRETO";
        Botao botaoPreto = new Botao();
        botaoPreto.setCor("Preto");
        botaoPreto.setAltura(52);
        botaoPreto.setLargura(310);
        botaoPreto.setTipoBorda(TipoBordaEnum.FINA);

        //Método Novo
        BotaoRegistry.addRegistry(chave, botaoPreto);

        Botao botaoPretoClone = BotaoRegistry.getBotao("BOTAO_PRETO");
        System.out.println(botaoPretoClone);
    }
}
