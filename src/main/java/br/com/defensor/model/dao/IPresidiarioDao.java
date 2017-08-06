package br.com.defensor.model.dao;

import java.util.List;

import br.com.defensor.model.bean.Presidiario;

/**
 * Interface que define os metodos do presidiario
 * @author fernando
 *
 */
public interface IPresidiarioDao {
	
	/**
	 * metodo para salvar
	 * @param entity
	 */
	public void save(Presidiario entity);
	
	/**
	 * metodo para atualizar
	 * @param entity
	 */
	public void update(Presidiario entity);
	
	/**
	 * metodo que busca uma Presidiario por id
	 * @param id
	 * @return
	 */
	public Presidiario find(int id);
	
	/**
	 * metodo que lista todos os Presidiario
	 * @return
	 */
	public List<Presidiario> findAll();
	
	/**
	 * metodo que apaga um Presidiario
	 * @param entity
	 */
	public void delete(Presidiario entity);

}
