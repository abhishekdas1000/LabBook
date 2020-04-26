package com.cg.iter.dao;

import com.cg.iter.entity.AuthorEntity;

public interface AuthorDAO {
	public boolean addAuthor(AuthorEntity author);
	public boolean deleteAuthor(AuthorEntity author);
	public AuthorEntity updateAuthor(AuthorEntity author);
	public AuthorEntity findAuthor(Integer id);
}
