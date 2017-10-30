/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dao.repository;

import com.dao.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IPromotionRepository extends JpaRepository<Promotion, Long> {

}
