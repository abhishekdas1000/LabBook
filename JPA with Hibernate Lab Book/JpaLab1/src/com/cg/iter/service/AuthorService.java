package com.cg.iter.service;

import com.cg.iter.entity.AuthorEntity;

public interface AuthorService {
	public boolean addAuthor(AuthorEntity author);
	public AuthorEntity updateAuthor(AuthorEntity author);
	public boolean deleteAuthor(Integer id);
}
