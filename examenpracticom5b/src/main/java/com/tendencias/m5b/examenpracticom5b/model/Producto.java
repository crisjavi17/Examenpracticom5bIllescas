/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.examenpracticom5b.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import lombok.Data;

/**
 *
 * @author Lenovo
 */
@Data
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int idproducto;

    @Column(name = "descripcion_producto")
    private String descripcionpro;

    @Column(name = "precio_producto")
    private Double precio_pro;

    @Column(name = "cantidad_producto")
    private String cantidad_pro;

    @Column(name = "subtotal_producto")
    private Double subtotal_pro;

    @Column(name = "descuento_producto")
    private String descuento_pro;

    @Column(name = "iva_producto")
    private String iva_pro;

    @Column(name = "pvp_producto")
    private String pvp_pro;

}
