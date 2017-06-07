package com.app.repo;

import com.app.model.order.OrderInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderInfoRepo extends JpaRepository<OrderInfo, Long> {

    List<OrderInfo> findAll();

    Page<OrderInfo> findAll(Pageable p);

}

