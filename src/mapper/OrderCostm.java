package mapper;

import java.util.List;

import entity.Order;

public interface OrderCostm {
 public List<OrderCostm> findUserById() throws Exception;
 public List<Order> findUserorderById() throws Exception;
}
