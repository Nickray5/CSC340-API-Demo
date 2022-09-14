/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.csc340.RestAPI;

/**
 *
 * @author nickray
 */
public class Country {
    String commonName;
    String officialName;
    String capital;
    int population;
    
    Country(String commonName, String officialName, String capital, int population){
        this.commonName=commonName;
        this.officialName=officialName;
        this.capital=capital;
        this.population=population;
    }
}
