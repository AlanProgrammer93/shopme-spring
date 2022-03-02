package com.shopme.shoppingcart;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopme.common.entity.Customer;

@RestController
public class ShoppingCartRestController {
	@Autowired private ShoppingCartService cartService;
	
	@PostMapping("/cart/add/{productId}/{quantity}")
	public String addProductToCart(@PathVariable("productId") Integer productId, 
			@PathVariable("quantity") Integer quantity, HttpServletRequest request) {
		
		return "";
	}
	
	private Customer getAuthenticatedCustomer(HttpServletRequest request) {
		
	}
}
