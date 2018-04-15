package com.prs.business.purchaserequest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.prs.business.user.User;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PurchaseRequestRepository extends CrudRepository<PurchaseRequest, Integer> {
	
	//List <PurchaseRequestLineItem> findAllByPurchaseRequestId (int purchaseRequestId);
	
	List <PurchaseRequest> findAllByUserNot (User user);
	
}