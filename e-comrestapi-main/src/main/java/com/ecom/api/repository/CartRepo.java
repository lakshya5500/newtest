package com.ecom.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.api.entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
