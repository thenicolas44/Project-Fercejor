package com.fercejor.repuestofercejor.controller;

import java.util.List;

import org.hibernate.validator.constraints.pl.REGON;
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

    @RequestMapping("/guardarCategoria")
    public String guardarCate(CategoriaEntity categoria){
        List<CategoriaEntity> listCate = categoriaService.listarCategoria();
        if(listCate.size() == 0){
            String id_cate = "CATE0001";
            categoria.setIdCategoria(id_cate);
        }
        else{
            CategoriaEntity ultimaCategoria = listCate.get(listCate.size()-1);
            String ultimoID = ultimaCategoria.getIdCategoria();
            int numero = Integer.parseInt(ultimoID.substring(4));
            numero++;
            String nuevoID = String.format("CATE%04d", numero);
            categoria.setIdCategoria(nuevoID);
        }

        categoriaService.guardarCategoria(categoria);
        return "redirect:/productos/";
    }

    @RequestMapping("/guardarProducto")
    public String guardarProd(ProductoEntity producto){
        List<ProductoEntity> listProd = productoService.listaProductos();
        if(listProd.size() == 0){
            String id_prod = "PROD0001";
            producto.setIdProducto(id_prod);
        }
        else{
            ProductoEntity ultimoProducto = listProd.get(listProd.size()-1);
            String ultimoID = ultimoProducto.getIdProducto();
            int numero = Integer.parseInt(ultimoID.substring(4));
            numero++;
            String nuevoID = String.format("PROD%04d", numero);
            producto.setIdProducto(nuevoID);
        }

        productoService.guardarProducto(producto);
        return "redirect:/productos/";
    }
}
