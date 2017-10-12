/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.repository;

import com.dao.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface IClientRepository extends JpaRepository<Client, Long> {
    
    @Query("select c from Client c WHERE c.email = :x")
    public Client findByEmail(@Param("x") String email);
}
