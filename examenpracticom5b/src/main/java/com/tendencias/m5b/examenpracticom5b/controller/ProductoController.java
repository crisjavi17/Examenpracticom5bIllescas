/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.examenpracticom5b.controller;

import com.tendencias.m5b.examenpracticom5b.model.Producto;
import com.tendencias.m5b.examenpracticom5b.service.ServicioProdcutoImpl;
import io.swagger.v3.oas.annotations.Operation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/producto")
public class ProductoController {


        @Autowired
    ServicioProdcutoImpl proSer;

    @Operation(summary = "Se obtiene la lista de productos")
    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listPro() {

        return new ResponseEntity<>(proSer.findByAll(), HttpStatus.OK);
    }
    
 

    @Operation(summary = "Ingresar los campos productos")
    @PostMapping("/crear")
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto p) {

        return new ResponseEntity<>(proSer.save(p), HttpStatus.CREATED);
    }
 

    @Operation(summary = "Actualizar producto")

    @PutMapping("/actulizar/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Integer id, @RequestBody Producto p) {
        Producto pro = proSer.findById(id);

        if (pro != null) {
            pro.setDescripcionpro(p.getDescripcionpro());
            pro.setPrecio_pro(p.getPrecio_pro());
            pro.setCantidad_pro(p.getCantidad_pro());
            pro.setSubtotal_pro(p.getSubtotal_pro());
            pro.setDescuento_pro(p.getDescuento_pro());
            p.setIva_pro(p.getIva_pro());
            p.setPvp_pro(p.getPvp_pro());
          

            return new ResponseEntity<>(proSer.save(pro), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


    public ResponseEntity<Producto> eliminarProducto(@PathVariable Integer id) {
        proSer.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
