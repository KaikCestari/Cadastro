package dev.kaik7x.Cadastro.MissaoFilme;
import dev.kaik7x.Cadastro.Usuarios.UsuarioModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeMissao;
    private String dificuldade;
    private UsuarioModel usuarios;

    @OneToMany(mappedBy = "missoes")
    private List<UsuarioModel> ninjas;






    //Construtores
    public MissoesModel() {
    }

    public MissoesModel(int id, String nomeMissao, String dificuldade, UsuarioModel usuarios) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public UsuarioModel getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(UsuarioModel usuarios) {
        this.usuarios = usuarios;
    }
}
