package br.com.aceleradev.reserva.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = Quarto.TABLE_NAME)
public class Quarto {

    public static final String TABLE_NAME="quarto";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Reserva reserva;

    private boolean ocupado;

    @NotBlank
    @NotNull
    private String tipo;

    @OneToMany
    @NotNull
    private List<Cama> camas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Cama> getCamas() {
        return camas;
    }

    public void setCamas(List<Cama> camas) {
        this.camas = camas;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "id=" + id +
                ", reserva=" + reserva +
                ", ocupado=" + ocupado +
                ", tipo='" + tipo + '\'' +
                ", camas=" + camas +
                '}';
    }
}
