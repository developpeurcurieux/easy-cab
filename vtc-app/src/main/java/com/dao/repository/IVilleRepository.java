/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.repository;

import com.dao.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IVilleRepository extends JpaRepository<Ville, String>{

}