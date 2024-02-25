package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Add_Vechile;



public class AddVechileDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sai");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Add_Vechile addVechileData(Add_Vechile current_details)
	{
		entityTransaction.begin();
		entityManager.persist(current_details);
		entityTransaction.commit();
		return current_details;
		
	}
	public List<Add_Vechile> selectAll(String vechileNo)
	{
		Query query=entityManager.createQuery("select s from Add_Vechile s where s.vechileNo=?1");
		query.setParameter(1, vechileNo);
		List<Add_Vechile> list=query.getResultList();
		return list;
	}
	public List<Add_Vechile> selectAllNotEqual(String vechileNo)
	{
		Query query=entityManager.createQuery("select s from Add_Vechile s where s.vechileNo<>?1");
		query.setParameter(1, vechileNo);
		List<Add_Vechile> list=query.getResultList();
		return list;
	}
	public Add_Vechile deleteById(int id)
	{
		Add_Vechile  add_Vechile=entityManager.find(Add_Vechile.class, id);
		entityTransaction.begin();
		entityManager.remove(add_Vechile);
		entityTransaction.commit();
		return add_Vechile;
	}
	
	public Add_Vechile update(int id,Add_Vechile current_details)
	{
		current_details.setId(id);
		entityTransaction.begin();
		entityManager.merge(current_details);
		entityTransaction.commit();
		return current_details;
		
	}
	
	public Add_Vechile findById(int id)
	{
		Add_Vechile add_Vechile=entityManager.find(Add_Vechile.class, id);
		
		
		return add_Vechile;
		
	}

}
