package com.ecom.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.api.entity.Cart;
import com.ecom.api.exception.CartItemNotExistException;
import com.ecom.api.repository.CartRepo;

@Service
public class CartService {
@Autowired
CartRepo cartRepo;
public List<Cart> details() {
	return cartRepo.findAll();
}

public Cart saveAllProduct(Cart cart) {
	cartRepo.save(cart);
	return cart;
}

public String deleteCart(Integer id) throws CartItemNotExistException {
	if (!cartRepo.existsById(id))
		throw new CartItemNotExistException("Cart Item Not Found :" + id);
	cartRepo.deleteById(id);
	return "Cart Item Deleted";
}


}
