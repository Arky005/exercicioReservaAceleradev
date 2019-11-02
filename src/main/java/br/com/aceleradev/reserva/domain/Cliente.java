package br.com.aceleradev.reserva.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
@Table(name = Cliente.TABLE_NAME)
public class Cliente extends Pessoa {

    public static final String TABLE_NAME="cliente";

    @Min(0)
    private int quantidadeOcupacoes;

    @OneToMany
    private List<Reserva> reservas;

    public int calcularOcupacoes(List<Reserva> reservas){
        return reservas.size();
    }



}
