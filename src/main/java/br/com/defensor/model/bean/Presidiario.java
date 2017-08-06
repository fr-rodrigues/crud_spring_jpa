package br.com.defensor.model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe em referencia a tabela presidiario
 * @author fernando
 *
 */
@Entity
@Table(name="presidiario")
public class Presidiario implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/**
	 * variveis referentes aos atributos
	 */
	
	@Id
	@GeneratedValue
	@Column(name="pre_id")
	private int id;
	
	@Column(name="pre_nome")
	private String nome;
	
	@Column(name="pre_rg")
	private String rg;
	
	@Column(name="pre_cpf")
	private String cpf;

	/**
	 * gets and sets 
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
