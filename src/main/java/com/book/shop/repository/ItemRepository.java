package com.book.shop.repository;

import com.book.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * author : ms.Lee
 * date   : 2024-04-01
 */
public interface ItemRepository extends JpaRepository<Item, Long> {

  List<Item> findByItemNm(String itemNm);

  List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

  List<Item> findByPriceLessThan(Integer price);

  List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);
}
