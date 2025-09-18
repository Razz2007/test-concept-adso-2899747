package com.SENA.RestaurantManagementSystem.OrdersKitchen.Service;

import com.SENA.RestaurantManagementSystem.OrdersKitchen.Entity.Order;
import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.Customer;
import com.SENA.RestaurantManagementSystem.CustomersReservations.Entity.TableEntity;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IBaseRepositoryOrdersKitchen;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IRepository.IOrderRepository;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.IService.IOrderService;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.ICustomerService;
import com.SENA.RestaurantManagementSystem.CustomersReservations.IService.ITableService;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.OrderReqDto;
import com.SENA.RestaurantManagementSystem.OrdersKitchen.DTO.OrderResDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ABaseServiceOrdersKitchen<Order, OrderReqDto, OrderResDto> implements IOrderService {
    @Override
    protected IBaseRepositoryOrdersKitchen<Order, String> getRepository() {
        return repository;
    }

    @Autowired
    private IOrderRepository repository;

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private ITableService tableService;

    @Override
    public OrderResDto mapToResDto(Order entity) {
        return OrderResDto.builder()
                .id(entity.getId())
                .code(entity.getCode())
                .name(entity.getName())
                .description(entity.getDescription())
                .status(entity.getStatus())
                .customerId(entity.getCustomer() != null ? entity.getCustomer().getId() : null)
                .customerName(entity.getCustomer() != null ? entity.getCustomer().getFirstName() + " " + entity.getCustomer().getLastName() : null)
                .tableId(entity.getTable() != null ? entity.getTable().getId() : null)
                .tableName(entity.getTable() != null ? entity.getTable().getName() : null)
                .orderDate(entity.getOrderDate())
                .orderStatus(entity.getOrderStatus())
                .total(entity.getTotal())
                .build();
    }

    @Override
    public Order mapToEntity(OrderReqDto dto) {
        Order order = new Order();
        order.setCode(dto.getCode());
        order.setName(dto.getName());
        order.setDescription(dto.getDescription());
        order.setStatus(dto.getStatus());
        order.setOrderDate(dto.getOrderDate());
        order.setOrderStatus(dto.getOrderStatus());
        order.setTotal(dto.getTotal());

        if (dto.getCustomerId() != null) {
            Customer customer = customerService.findById(dto.getCustomerId()).orElse(null);
            if (customer == null) {
                throw new IllegalArgumentException("Customer with ID " + dto.getCustomerId() + " not found");
            }
            order.setCustomer(customer);
        } else {
            throw new IllegalArgumentException("Customer ID is required for creating an order");
        }

        if (dto.getTableId() != null) {
            TableEntity table = tableService.findById(dto.getTableId()).orElse(null);
            if (table == null) {
                throw new IllegalArgumentException("Table with ID " + dto.getTableId() + " not found");
            }
            order.setTable(table);
        } else {
            throw new IllegalArgumentException("Table ID is required for creating an order");
        }

        return order;
    }
}
