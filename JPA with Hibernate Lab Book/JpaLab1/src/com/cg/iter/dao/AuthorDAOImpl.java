package com.cg.iter.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.iter.databaseutil.DBUtil;
import com.cg.iter.entity.AuthorEntity;

public class AuthorDAOImpl implements AuthorDAO{

	//EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	//EntityManager manager = factory.createEntityManager();
	DBUtil con;
	EntityManager manager;
	
	public AuthorDAOImpl() {
		con= new DBUtil();
		manager=con.getManager();
	}
	//method for adding an author
	@Override
	public boolean addAuthor(AuthorEntity author) {
		try {
			manager.getTransaction().begin();
			manager.persist(author);
			manager.getTransaction().commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
     //method for deleting an author
	@Override
	public boolean deleteAuthor(AuthorEntity author) {
		try {
			manager.remove(author);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	//method for updating an author
	
	@Override
	public AuthorEntity updateAuthor(AuthorEntity author) {
		try {
			AuthorEntity temp = findAuthor(author.getAuthorId());
			temp.setFirstName(author.getFirstName());
			temp.setLastName(author.getLastName());
			temp.setMiddleName(author.getMiddleName());
			temp.setPhoneNo(author.getPhoneNo());
			return temp;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	//method for finding an author
	
	@Override
	public AuthorEntity findAuthor(Integer id) {
		return manager.find(AuthorEntity.class, id);
	}

}
