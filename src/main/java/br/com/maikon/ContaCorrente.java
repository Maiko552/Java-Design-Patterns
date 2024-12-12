package br.com.maikon;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ContaCorrente extends Bank {
    private BigDecimal tarifaAoUso;

    protected ContaCorrente(ContaCorrenteBuilder builder) {
        super(builder);
        this.tarifaAoUso = builder.tarifaAoUso != null ? builder.tarifaAoUso : BigDecimal.ZERO;
    }

    //métodos
    public void pagar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor a pagar deve ser positivo.");
        }

        if (getSaldo().compareTo(valor) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o pagamento.");
        }

        setSaldo(getSaldo().subtract(valor)); // Subtrai o valor do saldo
        incrementarTarifa(); // Incrementa a tarifa
        System.out.println("Pagamento de " + valor + " realizado. Saldo atual: " + getSaldo());
    }


    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor a depositar deve ser positivo.");
        }

        setSaldo(getSaldo().add(valor)); // Adiciona o valor ao saldo
        incrementarTarifa(); // Incrementa a tarifa
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + getSaldo());
    }


    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor a sacar deve ser positivo.");
        }

        if (getSaldo().compareTo(valor) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }

        //subtriar sauldo
        setSaldo(getSaldo().subtract(valor));
        incrementarTarifa();
        System.out.println("Saque de " + valor + " realizado. Saldo atual: " + getSaldo());
    }

    // Incrementa tarifa
    private void incrementarTarifa() {
        tarifaAoUso = tarifaAoUso.add(BigDecimal.ONE);
    }


    public BigDecimal getTarifaAoUso() {
        return tarifaAoUso;
    }


    //ToString
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        return "Conta Corrente\n" +
                "Saldo: " + df.format(getSaldo()) + "\n" +
                "Dividendo: " + df.format(getDividendo()) + "\n" +
                "Conta: " + getConta() + "\n" +
                "Agência: " + getAgencia() + "\n" +
                "Tarifa ao Uso: " + df.format(tarifaAoUso) + "\n" ;
    }


    //Builder
    public static class ContaCorrenteBuilder extends BankBuilder<ContaCorrenteBuilder>{
        private BigDecimal tarifaAoUso;

        public ContaCorrenteBuilder tarifaAoUso(BigDecimal tarifaAoUso){
            this.tarifaAoUso = tarifaAoUso;
            return this;
        }

        @Override
        protected ContaCorrente build() {
            return new ContaCorrente(this);
        }
    }

    public static void main(String[] args) {
        ContaCorrente bank = new ContaCorrenteBuilder()
                .saldo(BigDecimal.valueOf(500.00))
                .tarifaAoUso(BigDecimal.valueOf(2.00))
                .build();

        System.err.println("Conta criada!");
        System.out.println(bank);

        bank.depositar(BigDecimal.valueOf(100.00));
        bank.getSaldo();

        System.out.println("");
        System.err.println("Após o depósito!");
        System.out.println(bank);
    }
}
