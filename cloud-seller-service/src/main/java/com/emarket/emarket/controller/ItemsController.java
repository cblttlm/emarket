package com.emarket.emarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.ItemsEntity;
import com.emarket.emarket.service.ItemsService;

@RestController
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	 /**
     * @Title: getItemsList
     * <p>Description: get item information list by categoryId,subCategoryId
     * </p>
     * @param  categoryId
     * @param  subCategoryId
     * @return item information list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping
	public List<ItemsEntity> getItemsList(@RequestParam("categoryId") String categoryId,@RequestParam("subCategoryId") String subCategoryId){
		return itemsService.getItemsList(Integer.parseInt(categoryId),Integer.parseInt(subCategoryId));
	}

	 /**
     * @Title: saveItems
     * <p>Description: save item information
     * </p>
     * @param itemsEntity
     * @return item information
     * @author: chenbl
     * @version 1.0
     */
	@PostMapping
	public ResponseEntity<ItemsEntity> saveItems(ItemsEntity itemsEntity){
		ItemsEntity sellerEntity = itemsService.saveItems(itemsEntity);
		return ResponseEntity.status(HttpStatus.CREATED).body(sellerEntity);
	}

}
