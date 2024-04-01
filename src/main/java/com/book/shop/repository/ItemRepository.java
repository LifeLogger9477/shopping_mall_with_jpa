package com.book.shop.repository;

import com.book.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author : ms.Lee
 * date   : 2024-04-01
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}
