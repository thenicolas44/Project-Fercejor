package com.fercejor.repuestofercejor.componentes;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.fercejor.repuestofercejor.model.entity.CbzVentaEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("/ventas/vista/lista.xlsx")
public class ListarVentasExcel extends AbstractXlsxView{

    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
                response.setHeader("Content-Disposition", "attachment; filename= \"listado_ventas.xlsx\"");
                Sheet hoja = workbook.createSheet("Ventas");

                Row filaTitulo = hoja.createRow(0);
                Cell celda = filaTitulo.createCell(0);
                celda.setCellValue("LISTADO GENERAL DE VENTAS");

                Row filaData = hoja.createRow(2);
                String [] columnas = {"ID","CLIENTE","EMPLEADO","PRODUCTO","PRECIO DE VENTA","CANTIDAD","TOTAL"};

                for(int i=0; i< columnas.length ; i++){
                    celda = filaData.createCell(i);
                    celda.setCellValue(columnas[i]);
                }

                List<CbzVentaEntity> listaV = (List<CbzVentaEntity>) model.get("listadoVenta");
                int numeroFila= 3 ;
                for (CbzVentaEntity venta : listaV) {
                    filaData = hoja.createRow(numeroFila);

                    filaData.createCell(0).setCellValue(venta.getIdCbzVenta());
                    filaData.createCell(1).setCellValue(venta.getFechaCbzVenta());
                    filaData.createCell(2).setCellValue(venta.getClienteCbzVenta().getNombreCliente());
                    filaData.createCell(3).setCellValue(venta.getEmpleadoCbzVenta().getPrimerNombreEmpleado());
                    filaData.createCell(4).setCellValue(venta.getProductoCbzVenta().getNombreProducto());
                    filaData.createCell(6).setCellValue(venta.getCantidadCbzVenta());
                    filaData.createCell(7).setCellValue(venta.getPrecioCbzVenta());
                    filaData.createCell(8).setCellValue(venta.getTotalCbzVenta());
                    numeroFila++;
                }
    }
    
}
