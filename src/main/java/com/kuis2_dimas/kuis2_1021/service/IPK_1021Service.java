/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2_dimas.kuis2_1021.service;

import com.kuis2_dimas.kuis2_1021.entity.IPK_1021;
import com.kuis2_dimas.kuis2_1021.repo.IPK_1021Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hendro Steven
 */
@Service("ipk_1021Service")
@Transactional
public class IPK_1021Service {

    @Autowired
    private IPK_1021Repo repo;

    public IPK_1021 insert(IPK_1021 ipk_1021) {
        return repo.save(ipk_1021);
    }
    
    public IPK_1021 update(IPK_1021 ipk_1021) {
        return repo.save(ipk_1021);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public IPK_1021 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<IPK_1021> getAll(){
        return repo.findAllIPK_1021();
    }
}
