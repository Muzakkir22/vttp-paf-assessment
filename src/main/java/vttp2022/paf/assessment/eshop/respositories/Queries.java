package vttp2022.paf.assessment.eshop.respositories;

public class Queries {
    public static String SQL_INSERT_ORDER_STATUS = "insert into order_status(order_id, delivery_id, status) values (?, ?, ?)";
    public static String SQL_INSERT_LINE_ITEM = "insert into line_item(description, quantity, order_id) values (?, ?, ?)";
}
