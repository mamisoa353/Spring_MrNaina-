/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author karen
 */
@Controller
public class ItemController {

    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String getHome() {
        // ...      
        return "index";
    }
}
