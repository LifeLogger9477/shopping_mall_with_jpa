package com.book.shop.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * author : ms.Lee
 * date   : 2024-04-03
 */
@Getter
@Setter
public class ItemDto {
  
  private Long id;
  private String itemNm;
  private Integer price;
  private String itemDetail;
  private String sellStateCode;
  private LocalDateTime regTime;
  private LocalDateTime updateTime;
}
