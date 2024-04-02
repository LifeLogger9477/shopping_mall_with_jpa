package com.book.shop.repository;

import com.book.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * author : ms.Lee
 * date   : 2024-04-01
 */
public interface ItemRepository extends JpaRepository<Item, Long>, 
    QuerydslPredicateExecutor<Item> {

  List<Item> findByItemNm(String itemNm);

  List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);

  List<Item> findByPriceLessThan(Integer price);

  List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

  @Query("" +
      "select i " +
      "from Item i " +
      "where i.itemDetail like %:itemDetail% " +
      "order by i.price desc"
  )
  List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);

  @Query(value = "" +
      "select * " +
      "from item T " +
      "where T.item_detail like %:itemDetail% " +
      "order by T.price desc",
      nativeQuery = true
  )
  List<Item> findByItemDetailNative(@Param("itemDetail") String itemDetail);
}
