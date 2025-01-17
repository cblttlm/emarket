package com.emarket.emarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emarket.emarket.entity.PurchaseHistoryEntity;
import com.emarket.emarket.service.PurchaseHistoryService;

@RestController
@RequestMapping("/purchasehistory")
public class PurchaseHistoryController {
	@Autowired
	private PurchaseHistoryService purchaseHistoryService;
	 /**
     * @Title: getPurchaseHistoryList
     * <p>Description: get purchase history list by buyid
     * </p>
     * @param
     * @return purchase history list
     * @author: chenbl
     * @version 1.0
     */
	@GetMapping
	public List<PurchaseHistoryEntity> getPurchaseHistoryList(@RequestParam("buyid") String buyid){
		return purchaseHistoryService.getPurchaseHistoryEntityList(Integer.parseInt(buyid));
	}

	 /**
     * @Title: update
     * <p>Description: save purchase history information
     * </p>
     * @param purchasehistory
     * @return  purchase history information
     * @author: chenbl
     * @version 1.0
     */
	@PutMapping
	public ResponseEntity<PurchaseHistoryEntity> update(PurchaseHistoryEntity purchasehistory){
		PurchaseHistoryEntity purchaseHistoryEntity = purchaseHistoryService.update(purchasehistory);
		return ResponseEntity.ok(purchaseHistoryEntity);
	}

}
