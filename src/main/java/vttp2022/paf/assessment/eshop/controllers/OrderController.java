package vttp2022.paf.assessment.eshop.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vttp2022.paf.assessment.eshop.models.Order;

@RestController
@RequestMapping(path = "http://paf/chuklee.com/dispatch/{OrderStatus}")
public class OrderController {

	//TODO: Task 3

	@GetMapping(path="/Order")
	public ResponseEntity<String> getAllOrders() {
		List<Order> orders = repo.getAllOrders();
		JsonArrayBuilder builderArr = Json.CreateArrayBuilder();
		JsonObjectBuilder builder = Json.createObjectBuilder();
		int count = 0;
		for (Order order : orders) {
			System.out.println(order.toString());
			builder.add("orderId", order.getOrderId())
			.add("name", order.getName())
			.add("address", order.getAddress())
			.add("email", order.getEmail())
			.add("lineItems", order.getLineItem());
			JsonObject addToArray = builder.build();
			builderArr.add(count, addToArray);
			count++;

		}

		JsonArray out = builderArr.build();

		return ResponseEntity.ok(out.toString());

	}

}
