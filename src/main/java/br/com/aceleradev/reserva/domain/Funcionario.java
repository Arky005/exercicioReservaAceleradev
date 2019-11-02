package br.com.aceleradev.reserva.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = Funcionario.TABLE_NAME)
public class Funcionario extends Pessoa {

    public static final String TABLE_NAME="funcionario";

    @NotNull
    @NotBlank
    private String setor;

    @OneToMany
    private List<Reserva> reservas;

    @Override
    public String toString() {
        return "Funcionario{" +
                "setor='" + setor + '\'' +
                '}';
    }
}
