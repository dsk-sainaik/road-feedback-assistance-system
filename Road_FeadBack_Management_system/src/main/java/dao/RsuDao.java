package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Add_Vechile;
import dto.Rsu;
import dto.Vechile;

public class RsuDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sai");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertRsu(Rsu rsu) {
		entityTransaction.begin();
		entityManager.persist(rsu);
		entityTransaction.commit();
		
	}
	
	public Rsu fetechByUserName(String userName,String pass)
	{
		Query query=entityManager.createQuery("select s from Rsu s where s.userNameRsu=?1 and s.passWordRsu=?2");
		query.setParameter(1, userName);
		query.setParameter(2, pass);
		Rsu rsu=(Rsu) query.getSingleResult();
		return rsu;
	}
	
	public List<Add_Vechile> selectAll()
	{
		Query query=entityManager.createQuery("select s from Add_Vechile s where s.status=null");
		
		List<Add_Vechile> list=query.getResultList();
		return list;
	}
	public List<Add_Vechile> selectAllTaData()
	{
		Query query=entityManager.createQuery("select s from Add_Vechile s where s.status<>null");
		
		List<Add_Vechile> list=query.getResultList();
		return list;
	}
	

}
