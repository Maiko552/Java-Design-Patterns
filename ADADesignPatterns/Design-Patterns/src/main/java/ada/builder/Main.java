package ada.builder;

import ada.builder.Exemplo.Pessoa;
import ada.builder.Exemplo.PessoaComBuilder;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        //instancia sem Builder
        Pessoa pessoa = new Pessoa("Maikon", "nascimento", LocalDate.of(2001, 01, 06), 23);
        System.out.println(pessoa);

        //Instancia com Builder
        Pessoa pessoa1 = new PessoaComBuilder()
                .Nome("Maikon")
                .Sobrenome("Nascimento")
                .Nascimento(LocalDate.of(2001, 01, 06))
                .Idade(23)
                .build();
        System.out.println(pessoa1);
    }
}