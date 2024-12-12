package ada.factorymethod;

import java.math.BigDecimal;

public class Produto {

    private String descrição;
    private BigDecimal preco;
    private Boolean possuiDimensoesFisicas;

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean getPossuiDimensoesFisicas() {
        return possuiDimensoesFisicas;
    }

    public void setPossuiDimensoesFisicas(Boolean possuiDimensoesFisicas) {
        this.possuiDimensoesFisicas = possuiDimensoesFisicas;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descrição='" + descrição + '\'' +
                ", preco=" + preco +
                ", possuiDimensoesFisicas=" + possuiDimensoesFisicas +
                '}';
    }
}
