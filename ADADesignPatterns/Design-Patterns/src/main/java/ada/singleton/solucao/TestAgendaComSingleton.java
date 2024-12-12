package ada.singleton.solucao;




public class TestAgendaComSingleton {
    public static void main(String[] args) {
        //O PROBLEMA AQUI É QUE NÃO PODEMOS AGENDAR NA MESMA SEMANA POIS
        //ESTÁ GERANDO UMA NOVA INSTANCIA SEMPRE
        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sábado");

    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
