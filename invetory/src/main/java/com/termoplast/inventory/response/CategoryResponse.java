package com.termoplast.inventory.response;

import java.util.List;

import com.termoplast.inventory.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
	
	private List<Category> category;

}
