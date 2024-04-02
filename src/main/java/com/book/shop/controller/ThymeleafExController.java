package com.book.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author : ms.Lee
 * date   : 2024-04-02
 */
@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {

  @GetMapping(value = "/ex01")
  public String thymeleafExample01(Model model) {

    model.addAttribute(
        "data", 
        "타임리프 예제입니다."
    );

    return "thymeleafEx/thymeleafEx01";
  }
}
