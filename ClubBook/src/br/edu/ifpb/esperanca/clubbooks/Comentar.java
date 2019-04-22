package br.edu.ifpb.esperanca.clubbooks;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Comentar {
	
	@Id
	private int id;
	
	@OneToMany
	private Set<Usuario> usuarios;
	

}
