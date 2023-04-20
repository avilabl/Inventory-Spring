package com.termoplast.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.termoplast.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
