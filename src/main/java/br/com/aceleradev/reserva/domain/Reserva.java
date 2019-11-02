package br.com.aceleradev.reserva.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = Reserva.TABLE_NAME)
public class Reserva {

    public static final String TABLE_NAME="reserva";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @ManyToOne
    private Pessoa pessoa;

    @OneToMany
    private List<Quarto> quartos;

    @NotNull
    private LocalDate data;

    public static String getTableName() {
        return TABLE_NAME;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", quartos=" + quartos +
                ", data=" + data +
                '}';
    }
}
