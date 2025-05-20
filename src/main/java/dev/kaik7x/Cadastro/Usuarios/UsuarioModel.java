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
    private int senha;

    public UsuarioModel() {
    }

    public UsuarioModel(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public UsuarioModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
