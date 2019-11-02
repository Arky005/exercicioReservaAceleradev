package br.com.aceleradev.reserva.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = Telefone.TABLE_NAME)
public class Telefone {

    public static final String TABLE_NAME="telefone";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotBlank
    private String ddd;

    @NotNull
    @NotBlank
    private String numero;

    @NotNull
    @ManyToOne
    private Pessoa pessoa;

    public static String getTableName() {
        return TABLE_NAME;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }



    @Override
    public String toString() {
        return "Telefone{" +
                "id=" + id +
                ", ddd='" + ddd + '\'' +
                ", numero='" + numero + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
