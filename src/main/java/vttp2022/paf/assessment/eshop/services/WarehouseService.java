package vttp2022.paf.assessment.eshop.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp2022.paf.assessment.eshop.models.Order;
import vttp2022.paf.assessment.eshop.models.OrderStatus;
import vttp2022.paf.assessment.eshop.respositories.OrderRepository;

@Service
public class WarehouseService {
	
	@Autowired
	private OrderRepository oRepo;

	@Autowired
	private CustomerRepository cRepo;


	// You cannot change the method's signature
	// You may add one or more checked exceptions
	public OrderStatus dispatch(Order order) {
	// TODO: Task 4

		String orderID = UUID.randomUUID().toString().substring(0, 8);
		System.out.println(">>>> OrderId: %s\n", orderId);

		os.setOrderId(orderId);

		



	}
}
