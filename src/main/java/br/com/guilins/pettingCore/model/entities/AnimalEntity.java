package br.com.guilins.pettingCore.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class AnimalEntity implements Serializable {

    private Double id;

    private String nome;

    private String raca;

}
