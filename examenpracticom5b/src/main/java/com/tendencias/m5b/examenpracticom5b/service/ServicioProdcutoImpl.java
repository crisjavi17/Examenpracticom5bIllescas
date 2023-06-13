/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.examenpracticom5b.service;

import com.tendencias.m5b.examenpracticom5b.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.tendencias.m5b.examenpracticom5b.repository.ProductoRepositorio;

/**
 *
 * @author LENOVO
 */
@Service
public class ServicioProdcutoImpl extends ServicioGenericoImpl<Producto, Integer> implements ServicioGenerico<Producto, Integer> {

    @Autowired
    ProductoRepositorio productoRepo;

    @Override
    public CrudRepository<Producto, Integer> getDao() {

        return productoRepo;
    }

}
