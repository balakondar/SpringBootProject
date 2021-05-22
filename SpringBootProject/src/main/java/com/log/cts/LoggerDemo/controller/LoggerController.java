/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.log.cts.LoggerDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 91996
 */
@RestController
public class LoggerController {
    
  @GetMapping("/Logger")
   public String getLooger(){
        return"Logger";
    }
    
    
}
