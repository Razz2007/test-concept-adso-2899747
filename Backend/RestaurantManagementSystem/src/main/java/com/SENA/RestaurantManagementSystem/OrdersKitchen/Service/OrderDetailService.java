package com.SENA.RestaurantManagementSystem.OrdersKitchen.Service;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Order;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.OrderDetail;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Dish;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IBaseRepositoryOrdersKitchen;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IOrderDetailRepository;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IOrderDetailService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IOrderService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IDishService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.OrderDetailReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.OrderDetailResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService extends ABaseServiceOrdersKitchen<OrderDetail, OrderDetailReqDto, OrderDetailResDto> implements IOrderDetailService {
    @Override
    protected IBaseRepositoryOrdersKitchen<OrderDetail, String> getRepository() {
        return repository;
    }

    @Autowired
    private IOrderDetailRepository repository;

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IDishService dishService;

    @Override
    public OrderDetailResDto mapToResDto(OrderDetail entity) {
        return OrderDetailResDto.builder()
                .id(entity.getId())
                .status(entity.getStatus())
                .orderId(entity.getOrder() != null ? entity.getOrder().getId() : null)
                .orderName(entity.getOrder() != null ? entity.getOrder().getName() : null)
                .dishId(entity.getDish() != null ? entity.getDish().getId() : null)
                .dishName(entity.getDish() != null ? entity.getDish().getName() : null)
                .quantity(entity.getQuantity())
                .price(entity.getPrice())
                .build();
    }

    @Override
    public OrderDetail mapToEntity(OrderDetailReqDto dto) {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setStatus(dto.getStatus());
        orderDetail.setQuantity(dto.getQuantity());
        orderDetail.setPrice(dto.getPrice());

        if (dto.getOrderId() != null) {
            try {
                Order order = orderService.findById(dto.getOrderId()).orElse(null);
                if (order == null) {
                    throw new IllegalArgumentException("Order with ID " + dto.getOrderId() + " not found");
                }
                orderDetail.setOrder(order);
            } catch (Exception e) {
                throw new IllegalArgumentException("Order with ID " + dto.getOrderId() + " not found: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("Order ID is required for creating an order detail");
        }

        if (dto.getDishId() != null) {
            try {
                Dish dish = dishService.findById(dto.getDishId()).orElse(null);
                if (dish == null) {
                    throw new IllegalArgumentException("Dish with ID " + dto.getDishId() + " not found");
                }
                orderDetail.setDish(dish);
            } catch (Exception e) {
                throw new IllegalArgumentException("Dish with ID " + dto.getDishId() + " not found: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("Dish ID is required for creating an order detail");
        }

        return orderDetail;
    }
}
