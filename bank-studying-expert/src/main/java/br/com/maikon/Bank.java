package br.com.maikon;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.UUID;

public class Bank {
    private BigDecimal saldo;
    private BigDecimal dividendo;
    private UUID conta;
    private int agencia;

    private static int agenciaCounter = 0;

    // receber Builder
    private Bank(BankBuilder builder) {
        this.saldo = builder.saldo != null ? builder.saldo : BigDecimal.ZERO;
        this.dividendo = builder.dividendo != null ? builder.dividendo : BigDecimal.ZERO;
        this.conta = builder.conta;

        this.agencia = 000001 + agenciaCounter;
        agenciaCounter++;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,###.00");
        return "-----------------\n" +
                "Bank\n" +
                "Saldo: " + df.format(saldo) + "\n" +
                "Dividendo: " + df.format(dividendo) + "\n" +
                "Conta: " + conta + "\n" +
                "Agência: " + formatAgencia(agencia) + "\n" +
                "-----------------";
    }

    private String formatAgencia(int agencia) {
        String agenciaStr = String.format("%06d", agencia);
        return agenciaStr.substring(0, 5) + "-" + agenciaStr.charAt(5);
    }

    // Caso precise acessar o valor da agência
    public int getAgencia() {
        return agencia;
    }

    //Builder
    public static class BankBuilder {
        private BigDecimal saldo;
        private BigDecimal dividendo;
        private UUID conta;

        // Métodos do Builder para definir os campos
        public BankBuilder saldo(BigDecimal saldo) {
            this.saldo = saldo;
            return this;
        }

        public BankBuilder dividendo(BigDecimal dividendo) {
            this.dividendo = dividendo;
            return this;
        }

        public BankBuilder conta(UUID conta) {
            this.conta = conta;
            return this;
        }


        public Bank build() {
            return new Bank(this);  // Passa o próprio Builder para o construtor de Bank
        }
    }


    public static void main(String[] args) {
        UUID conta = UUID.randomUUID();
        Bank bank = new Bank.BankBuilder()
                .saldo(BigDecimal.valueOf(1000.00))
                .dividendo(BigDecimal.valueOf(500.00))
                .conta(conta)
                .build();

        System.out.println(bank);
    }
}
