/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.web.models.beans;

import com.dao.entities.Aeroport;
import com.dao.entities.Gare;
import com.dao.entities.Service;
import com.dao.entities.Ville;
import java.util.List;
import org.springframework.stereotype.Component;



@Component
public class MemoCourse {
    private String choixAeroport;
    private String choixVille;
    private String choixGare;
    private String choixService;
    
    private List<Aeroport> listAeroports;
    private List<Gare> listGares;
    private List<Ville> listVilles;
    private List<Service> listServices;

    public MemoCourse() {
    }

    public String getChoixAeroport() {
        return choixAeroport;
    }

    public void setChoixAeroport(String choixAeroport) {
        this.choixAeroport = choixAeroport;
    }

    public String getChoixVille() {
        return choixVille;
    }

    public void setChoixVille(String choixVille) {
        this.choixVille = choixVille;
    }

    public String getChoixGare() {
        return choixGare;
    }

    public void setChoixGare(String choixGare) {
        this.choixGare = choixGare;
    }

    public String getChoixService() {
        return choixService;
    }

    public void setChoixService(String choixService) {
        this.choixService = choixService;
    }

    public List<Aeroport> getListAeroports() {
        return listAeroports;
    }

    public void setListAeroports(List<Aeroport> listAeroports) {
        this.listAeroports = listAeroports;
    }

    public List<Gare> getListGares() {
        return listGares;
    }

    public void setListGares(List<Gare> listGares) {
        this.listGares = listGares;
    }

    public List<Ville> getListVilles() {
        return listVilles;
    }

    public void setListVilles(List<Ville> listVilles) {
        this.listVilles = listVilles;
    }

    public List<Service> getListServices() {
        return listServices;
    }

    public void setListServices(List<Service> listServices) {
        this.listServices = listServices;
    }

    @Override
    public String toString() {
        return "MemoCourse{" + "choixAeroport=" + choixAeroport + ", choixVille=" + choixVille + ", choixGare=" + choixGare + ", choixService=" + choixService + ", listAeroports=" + listAeroports + ", listGares=" + listGares + ", listVilles=" + listVilles + ", listServices=" + listServices + '}';
    }
    
    
    
}
