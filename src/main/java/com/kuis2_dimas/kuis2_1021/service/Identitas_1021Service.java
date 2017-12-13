/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2_dimas.kuis2_1021.service;

import com.kuis2_dimas.kuis2_1021.entity.Identitas_1021;
import com.kuis2_dimas.kuis2_1021.repo.Identitas_1021Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("identitas_1021Service")
@Transactional
public class Identitas_1021Service {

    @Autowired
    private Identitas_1021Repo repo;

    public Identitas_1021 insert(Identitas_1021 identitas_1021) {
        return repo.save(identitas_1021);
    }
    
    public Identitas_1021 update(Identitas_1021 identitas_1021) {
        return repo.save(identitas_1021);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Identitas_1021 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Identitas_1021> getAll(){
        return repo.findAllIdentitas_1021();
    }
}
