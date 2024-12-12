package ada.builder.Exemplo;

import java.time.LocalDate;

public class PessoaComBuilder {
    private String nome;
    private String sobrenome;
    private LocalDate nascimento;
    private int idade;

    //BUILDER EXEMPLO
    public PessoaComBuilder Nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaComBuilder Sobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public PessoaComBuilder Nascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
        return this;
    }

    public PessoaComBuilder Idade(int idade) {
        this.idade = idade;
        return this;
    }

    //Método
    public Pessoa build(){
       return new Pessoa(nome, sobrenome, nascimento, idade);
    }
}
