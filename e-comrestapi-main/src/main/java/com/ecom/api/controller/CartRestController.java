package com.ecom.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.api.entity.Cart;
import com.ecom.api.service.CartService;

@RestController
@CrossOrigin(origins = "*")
public class CartRestController {

	@Autowired
	CartService cartService;
	
	@GetMapping("/cart")
	public List<Cart> bill() {
		return cartService.details();
	}

	@PostMapping("/cart")
	public Cart saveCart(@RequestBody Cart cart) {
		return cartService.saveAllProduct(cart);
	}

	@DeleteMapping("/cart/{id}")
	public String deleteCartById(@PathVariable("id") Integer id, Cart cart) {
		return cartService.deleteCart(id);
	}
}
