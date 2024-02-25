package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Vechile;

public class VechileDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sai");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	public Vechile registerVechile(Vechile vechile)
	{
		entityTransaction.begin();
		entityManager.persist(vechile);
		entityTransaction.commit();
		return vechile;
		
	}
	public Vechile fetechByUserName(String vno,String pass)
	{
		Query query=entityManager.createQuery("select s from Vechile s where s.vechileNo=?1 and s.password=?2");
		query.setParameter(1, vno);
		query.setParameter(2, pass);
		Vechile vechile=(Vechile) query.getSingleResult();
		return vechile;
	}
	
	

}
