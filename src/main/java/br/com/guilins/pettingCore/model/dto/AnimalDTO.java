package br.com.guilins.pettingCore.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AnimalDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Double id;

    @NotEmpty(message = "")
    private String nome;

    @NotEmpty(message = "")
    private String raca;

}
