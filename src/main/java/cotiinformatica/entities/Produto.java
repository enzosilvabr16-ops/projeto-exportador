package cotiinformatica.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
public class Produto {

    private UUID id;
    private String nome;
    private Double preco;
    private Integer quantidade;
    private Date dataHoraCadastro;
}
