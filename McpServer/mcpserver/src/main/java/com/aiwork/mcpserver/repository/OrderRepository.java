package com.aiwork.mcpserver.repository;

import com.aiwork.mcpserver.domain.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {

    Optional<CustomerOrder> findByOrderNumber(String orderNumber);

    List<CustomerOrder> findByCustomerEmailIgnoreCaseOrderByOrderDateDesc(String email);
}
