/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2_dimas.kuis2_1021.controller;

import com.kuis2_dimas.kuis2_1021.entity.Identitas_1021;
import com.kuis2_dimas.kuis2_1021.service.Identitas_1021Service;
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
@RequestMapping("/identitas_1021")
public class Identitas_1021Controller {

    @Autowired
    private Identitas_1021Service identitas_1021Service;

    @RequestMapping(method = RequestMethod.POST)
    public Identitas_1021 insert(@RequestBody Identitas_1021 identitas_1021) {
        return identitas_1021Service.insert(identitas_1021);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Identitas_1021 update(@RequestBody Identitas_1021 identitas_1021) {
        return identitas_1021Service.update(identitas_1021);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas_1021Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Identitas_1021 getById(@PathVariable("id") Long id){
        return identitas_1021Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Identitas_1021> getAll(){
        return identitas_1021Service.getAll();
    }
}
