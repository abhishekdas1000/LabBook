package com.cg.iter.service;

import com.cg.iter.dao.AuthorDAOImpl;
import com.cg.iter.entity.AuthorEntity;

//Service Class

public class AuthorServiceImpl implements AuthorService{

	AuthorDAOImpl dao = new AuthorDAOImpl();

		//adding author using dao object
		
	@Override
	public boolean addAuthor(AuthorEntity author) {
		return dao.addAuthor(author);
	}

	//updating author using dao object
	@Override
	public AuthorEntity updateAuthor(AuthorEntity author) {
		return dao.updateAuthor(author);
	}

	//deleting author using dao object
	
	@Override
	public boolean deleteAuthor(Integer id) {
		return dao.deleteAuthor(dao.findAuthor(id));
	}
	
	////finding author using dao object
	public AuthorEntity findAuthor(Integer id) {
		return dao.findAuthor(id); 
	}

}
