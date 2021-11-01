package com.hatanaka.ecommerce.checkout.service;

import com.hatanaka.ecommerce.checkout.resource.CheckoutRequest;
import com.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import java.util.Optional;


public interface CheckoutService {
	
	Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

}
