package com.fercejor.repuestofercejor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fercejor.repuestofercejor.model.entity.CategoriaEntity;
import com.fercejor.repuestofercejor.model.entity.ProductoEntity;
import com.fercejor.repuestofercejor.model.service.inteface.ICategoriaService;
import com.fercejor.repuestofercejor.model.service.inteface.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private IProductoService productoService;
    
    @Autowired
    private ICategoriaService categoriaService;

    @RequestMapping("/")
    public String inicio(Model modelo){
        ProductoEntity producto = new ProductoEntity();
        CategoriaEntity categoria = new CategoriaEntity();

        modelo.addAttribute("categoria", categoria);
        modelo.addAttribute("producto", producto);

        modelo.addAttribute("listaCategoria", categoriaService.listarCategoria());
        modelo.addAttribute("listaProducto", productoService.listaProductos());
        return "administrador/productos";
    }
}
