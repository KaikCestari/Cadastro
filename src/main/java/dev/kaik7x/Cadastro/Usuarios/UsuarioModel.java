package dev.kaik7x.Cadastro.Usuarios;


import dev.kaik7x.Cadastro.MissaoFilme.MissoesModel;
import jakarta.persistence.*;
import org.hibernate.mapping.List;

@Entity
@Table(name = "tb_cadastro")
public class UsuarioModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String nome;
    private String email;
    private int idade;
    // UM Ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "Missoes_id")
    private  MissoesModel missoes;

    public UsuarioModel() {
    }

    public UsuarioModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
}
