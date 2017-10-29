/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.web.models.beans;

import java.util.List;
import org.springframework.stereotype.Component;



@Component
public class MemoCourse {
    private String choixAeroport;
    private String choixVille;
    private String choixGare;
    private String choixService;
    
    private List<String> listAeroport;
    private List<String> listGares;
    private List<String> listVilles;
    private List<String> listServices;

    public MemoCourse() {
    }

    public MemoCourse(String choixAeroport, String choixVille, String choixGare, String choixService, List<String> listAeroport, List<String> listGares, List<String> listVilles, List<String> listServices) {
        this.choixAeroport = choixAeroport;
        this.choixVille = choixVille;
        this.choixGare = choixGare;
        this.choixService = choixService;
        this.listAeroport = listAeroport;
        this.listGares = listGares;
        this.listVilles = listVilles;
        this.listServices = listServices;
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

    public List<String> getListAeroport() {
        return listAeroport;
    }

    public void setListAeroport(List<String> listAeroport) {
        this.listAeroport = listAeroport;
    }

    public List<String> getListGares() {
        return listGares;
    }

    public void setListGares(List<String> listGares) {
        this.listGares = listGares;
    }

    public List<String> getListVilles() {
        return listVilles;
    }

    public void setListVilles(List<String> listVilles) {
        this.listVilles = listVilles;
    }

    public List<String> getListServices() {
        return listServices;
    }

    public void setListServices(List<String> listServices) {
        this.listServices = listServices;
    }

    @Override
    public String toString() {
        return "MemoCourse{" + "choixAeroport=" + choixAeroport + ", choixVille=" + choixVille + ", choixGare=" + choixGare + ", choixService=" + choixService + ", listAeroport=" + listAeroport + ", listGares=" + listGares + ", listVilles=" + listVilles + ", listServices=" + listServices + '}';
    }
    
    
    
}
