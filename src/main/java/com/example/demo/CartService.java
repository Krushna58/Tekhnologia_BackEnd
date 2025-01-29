package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	 @Autowired
	    private CartRepo cartItemRepository;

	    public List<Cart> getCartItems() {
	        return cartItemRepository.findAll();
	    }

	    public Cart addToCart(Cart cartItem) {
	        return cartItemRepository.save(cartItem);
	    }

	    public void deleteCartItem(int id) {
	        cartItemRepository.deleteById(id);
	    }
}