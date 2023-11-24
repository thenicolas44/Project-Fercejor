package com.fercejor.repuestofercejor.componentes;

import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.fercejor.repuestofercejor.model.entity.CbzCompraEntity;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("/compras/vista/lista.xlsx")
public class ListarClientesExcel extends AbstractXlsxView{

    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
                response.setHeader("Content-Disposition", "attachment; filemane=\"listado-compras.xlsx");
                Sheet hoja = workbook.createSheet("Compras");

                Row filaTitulo = hoja.createRow(0);
                Cell celda = filaTitulo.createCell(0);
                celda.setCellValue("LISTADO GENERAL DE COMPRAS");

                
                
                
                Row filaData = hoja.createRow(2);
                
                String [] columnas = {"ID","PROVEEDOR","PRODUCTO","PRECIO DE COMPRA","CANTIDAD","TOTAL"};

                for(int i = 0 ; i < columnas.length; i++){
                    Cell celdaDatos = filaData.createCell(i);
                    filaData.getCell(i);
                    celdaDatos.setCellValue(columnas[i]);      
                }
                
                List<CbzCompraEntity> listaCompras = (List<CbzCompraEntity>) model.get("listadoCompras");
                
                int numFila = 3;
                for (CbzCompraEntity cbzCompraEntity : listaCompras) {
                    
                    Row filaCompra = hoja.createRow(numFila);
                    Cell celdaid = filaCompra.createCell(0);
                    Cell celdaprov = filaCompra.createCell(1);
                    Cell celdaprod = filaCompra.createCell(2);
                    Cell celdaprec = filaCompra.createCell(3);
                    Cell celdacant = filaCompra.createCell(4);
                    Cell celdatot = filaCompra.createCell(5);

                    celdaid.setCellValue(cbzCompraEntity.getIdCbzCompra());
                    celdaprov.setCellValue(cbzCompraEntity.getProveedorCbzCompra().getNombreProveedor());
                    celdaprod.setCellValue(cbzCompraEntity.getProductoCbzCompra().getNombreProducto());
                    celdaprec.setCellValue(cbzCompraEntity.getPrecioCbzCompra());
                    celdacant.setCellValue(cbzCompraEntity.getCantidadCbzCompra());
                    celdatot.setCellValue(cbzCompraEntity.getTotalCbzCompra());

                    numFila ++;
                }
                /*
                 */
            }
    
}
