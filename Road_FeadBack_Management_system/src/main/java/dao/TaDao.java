package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Ta;

public class TaDao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sai");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void insertTa(Ta ta) {
		entityTransaction.begin();
		entityManager.persist(ta);
		entityTransaction.commit();
		
	}
	
	public Ta fetchByuserName(String user,String pass)
	{
		Query query=entityManager.createQuery("select s from Ta s where s.userNameTa=?1 and s.passWordTa=?2");
		query.setParameter(1, user);
		query.setParameter(2, pass);
		Ta ta=(Ta)query.getSingleResult();
		return ta;
		
		
	}
}
