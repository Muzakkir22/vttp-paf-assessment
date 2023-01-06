package vttp2022.paf.assessment.eshop.respositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vttp2022.paf.assessment.eshop.models.OrderStatus;

import vttp2022.paf.assessment.eshop.respositories.Queries.*;

@Repository
public class OrderRepository {
	// TODO: Task 3

	private static final String SQL_INSERT_ORDER_STATUS = null;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean insertOrderStatus(OrderStatus os) {
		return JdbcTemplate.update(SQL_INSERT_ORDER_STATUS,
		os.getOrderId(), os.getDeliveryId(), os.getStatus()) > 0;
	}
}
