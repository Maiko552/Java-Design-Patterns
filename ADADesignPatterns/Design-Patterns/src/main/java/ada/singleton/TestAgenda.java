package ada.singleton;

public class TestAgenda {
    public static void main(String[] args) {
        //O PROBLEMA AQUI É QUE NÃO PODEMOS AGENDAR NA MESMA SEMANA POIS
        //ESTÁ GERANDO UMA NOVA INSTANCIA SEMPRE
        reservaDia("Sexta");
        reservaDia("Sábado");

    }

    public static void reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
