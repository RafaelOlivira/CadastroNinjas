package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;

    @OneToMany(mappedBy = "missoesModel")
    private List<NinjaModel> ninja;

    public MissoesModel(){

    }
    public MissoesModel(String nomeMissao,String dificuldade){
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
    }

    public void setNomeMissao(String nomeMissao){
        this.nomeMissao =  nomeMissao;
    }
    public String getNomeMissao(){
        return this.nomeMissao;
    }
    public void setDificuldade(String dificuldade){
        this.dificuldade = dificuldade;
    }
    public String getDificuldade(){
        return this.dificuldade;
    }
}
