package br.com.aceleradev.reserva.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = Cama.TABLE_NAME)
public class Cama {


    public static final String TABLE_NAME="reserva";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @NotBlank
    private String tipo;



}
