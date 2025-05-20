package dev.kaik7x.Cadastro.MissaoFilme;

import dev.kaik7x.Cadastro.Usuarios.UsuarioModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeMissao;
    private String dificuldade;
    private UsuarioModel usuarios;
    //Construtores
    public MissoesModel() {
    }

    public MissoesModel(int id, String nomeMissao, String dificuldade, UsuarioModel usuarios) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
        this.usuarios = usuarios;
    }



}
