/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2_dimas.kuis2_1021.controller;

import com.kuis2_dimas.kuis2_1021.entity.IPK_1021;
import com.kuis2_dimas.kuis2_1021.service.IPK_1021Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/ipk_1021")
public class IPK_1021Controller {

    @Autowired
    private IPK_1021Service ipk_1021Service;

    @RequestMapping(method = RequestMethod.POST)
    public IPK_1021 insert(@RequestBody IPK_1021 ipk_1021) {
        return ipk_1021Service.insert(ipk_1021);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public IPK_1021 update(@RequestBody IPK_1021 ipk_1021) {
        return ipk_1021Service.update(ipk_1021);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipk_1021Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public IPK_1021 getById(@PathVariable("id") Long id){
        return ipk_1021Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<IPK_1021> getAll(){
        return ipk_1021Service.getAll();
    }
}
