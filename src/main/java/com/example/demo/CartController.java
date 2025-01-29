
package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

	  @Autowired
	    private CartService cartService;

	    @GetMapping
	    public List<Cart> getCartItems() {
	        return cartService.getCartItems();
	    }

	    @PostMapping
	    public ResponseEntity<Cart> addToCart(@RequestBody Cart cartItem) {
	        return ResponseEntity.ok(cartService.addToCart(cartItem));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteCartItem(@PathVariable int id) {
	        cartService.deleteCartItem(id);
	        return ResponseEntity.noContent().build();
	    }
}