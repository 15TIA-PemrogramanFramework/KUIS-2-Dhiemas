/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuis2_dimas.kuis2_1021.repo;

import com.kuis2_dimas.kuis2_1021.entity.Identitas_1021;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Identitas_1021Repo extends CrudRepository<Identitas_1021, Long> {

    @Query("select c from Identitas_1021 c")
    public List<Identitas_1021> findAllIdentitas_1021();
}
