package com.fercejor.repuestofercejor.componentes;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.fercejor.repuestofercejor.model.entity.CbzCompraEntity;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("/compras/vista/lista")
public class ListarClientesPdf extends AbstractPdfView{

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
                List<CbzCompraEntity> listarCompras = (List<CbzCompraEntity>) model.get("listadoCompras");
                PdfPTable tablaCompras = new PdfPTable(7);
                listarCompras.forEach(compras -> {
                    tablaCompras.addCell(compras.getIdCbzCompra());
                    tablaCompras.addCell(compras.getFechaCbzCompra().toString());
                    tablaCompras.addCell(compras.getProveedorCbzCompra().getNombreProveedor());
                    tablaCompras.addCell(compras.getProductoCbzCompra().getNombreProducto());
                    tablaCompras.addCell(compras.getCantidadCbzCompra().toString());
                    tablaCompras.addCell(compras.getPrecioCbzCompra().toString());
                    tablaCompras.addCell(compras.getTotalCbzCompra().toString());
                    
                });

            document.add(tablaCompras);
    }
    
}
