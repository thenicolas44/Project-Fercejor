package com.fercejor.repuestofercejor.componentes;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.fercejor.repuestofercejor.model.entity.CbzVentaEntity;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("/ventas/vista/lista")
public class ListarVentasPdf extends AbstractPdfView{

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
                List<CbzVentaEntity> listarVentas = (List<CbzVentaEntity>) model.get("listadoVenta");
                PdfPTable tablaVentas = new PdfPTable(8);
                listarVentas.forEach(ventas -> {
                    tablaVentas.addCell(ventas.getIdCbzVenta());
                    tablaVentas.addCell(ventas.getFechaCbzVenta().toString());
                    tablaVentas.addCell(ventas.getClienteCbzVenta().getNombreCliente());
                    tablaVentas.addCell(ventas.getEmpleadoCbzVenta().getPrimerNombreEmpleado());
                    tablaVentas.addCell(ventas.getProductoCbzVenta().getNombreProducto());
                    tablaVentas.addCell(ventas.getCantidadCbzVenta().toString());
                    tablaVentas.addCell(ventas.getPrecioCbzVenta().toString());
                    tablaVentas.addCell(ventas.getTotalCbzVenta().toString());
                });
            document.add(tablaVentas);
    }
    
}
