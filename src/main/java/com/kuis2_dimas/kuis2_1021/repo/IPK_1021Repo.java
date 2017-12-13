/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2_dimas.kuis2_1021.repo;

import com.kuis2_dimas.kuis2_1021.entity.IPK_1021;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface IPK_1021Repo extends CrudRepository<IPK_1021, Long> {

    @Query("select c from IPK_1021 c")
    public List<IPK_1021> findAllIPK_1021();
}
