package ada.singleton.solucao;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {

    //Variavel statica (terá apenas uma na memória) com o nome da classe que será nossa instancia
    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    public AgendaSingletonEAGER(){
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    //método getInstance
    public static AgendaSingletonEAGER getInstance(){
        return INSTANCE;
    }

    public Map<String, Boolean> getDias(){return diasDisponiveis;}
    public void ocupa(String dia){diasDisponiveis.replace(dia, Boolean.FALSE);}
}

