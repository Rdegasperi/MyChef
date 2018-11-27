package mychef;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingrediente {

	@Id
	Integer id;
	String categoria;
	String nome;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
