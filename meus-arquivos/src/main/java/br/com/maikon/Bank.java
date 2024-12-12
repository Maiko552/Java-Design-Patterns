package br.com.maikon;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.UUID;

public abstract class Bank {
    private BigDecimal saldo;
    private BigDecimal dividendo;
    private UUID conta;
    private int agencia;

    private static int agenciaCounter = 0;

    // receber Builder
    protected Bank(BankBuilder builder) {
        this.saldo = builder.saldo != null ? builder.saldo : BigDecimal.ZERO;
        this.dividendo = builder.dividendo != null ? builder.dividendo : BigDecimal.ZERO;
        this.conta = builder.conta != null ? builder.conta : UUID.randomUUID();

        this.agencia = 000001 + agenciaCounter;
        agenciaCounter++;
    }

    //métodos
    private String formatAgencia(int agencia) {
        String agenciaStr = String.format("%06d", agencia);
        return agenciaStr.substring(0, 5) + "-" + agenciaStr.charAt(5);
    }

    // Caso precise acessar o valor da agência
    public int getAgencia() {
        return agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getDividendo() {
        return dividendo;
    }

    public void setDividendo(BigDecimal dividendo) {
        this.dividendo = dividendo;
    }

    public UUID getConta() {
        return conta;
    }

    public void setConta(UUID conta) {
        this.conta = conta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public static int getAgenciaCounter() {
        return agenciaCounter;
    }

    public static void setAgenciaCounter(int agenciaCounter) {
        Bank.agenciaCounter = agenciaCounter;
    }

    //Builder
    public static abstract class BankBuilder<T extends  BankBuilder> {
        private BigDecimal saldo;
        private BigDecimal dividendo;
        private UUID conta;

        // Métodos do Builder para definir os campos
        public T saldo(BigDecimal saldo) {
            this.saldo = saldo;
            return (T) this;
        }

        public T dividendo(BigDecimal dividendo) {
            this.dividendo = dividendo;
            return (T) this;
        }

        public T conta(UUID conta) {
            this.conta = conta;
            return (T) this;
        }

        protected abstract Bank build();

    }

}
