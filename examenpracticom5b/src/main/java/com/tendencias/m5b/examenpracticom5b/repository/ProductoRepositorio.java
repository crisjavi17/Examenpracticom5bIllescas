/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.examenpracticom5b.repository;

import com.tendencias.m5b.examenpracticom5b.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LENOVO
 */
public interface ProductoRepositorio extends JpaRepository<Producto,Integer>{
    
}
