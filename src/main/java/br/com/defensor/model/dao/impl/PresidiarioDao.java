package br.com.defensor.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.defensor.model.bean.Presidiario;
import br.com.defensor.model.dao.IPresidiarioDao;

/**
 * classe que implementa os metodos do presidiario
 * 
 * @author fernando
 *
 */
@Repository
public class PresidiarioDao implements IPresidiarioDao{

	@PersistenceContext
	private EntityManager manager;

	@Transactional
	public void save(Presidiario entity) {
		this.manager.persist(entity);
		this.manager.flush();
	}

	@Transactional
	public void update(Presidiario entity) {
		this.manager.merge(entity);
		this.manager.flush();
	}

	public Presidiario find(int id) {
		return this.manager.find(Presidiario.class, id);
	}

	public List<Presidiario> findAll() {
		TypedQuery<Presidiario> query = this.manager.createQuery("from Presidiario", Presidiario.class);
		return query.getResultList();
	}

	@Transactional
	public void delete(Presidiario entity) {
		this.manager.remove(this.manager.contains(entity) ? entity : this.manager.merge(entity));
		this.manager.flush();
	}
	
}
