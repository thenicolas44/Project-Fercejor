package com.fercejor.repuestofercejor.componentes;

import java.util.List;
import java.util.Map;

import java.awt.Color;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.fercejor.repuestofercejor.model.entity.CbzVentaEntity;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Phrase;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPCell;
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

                //Fuentes y tamaños
                Font fuenteTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD,20,Color.BLUE);
                Font fuenteTituloColumnas = FontFactory.getFont(FontFactory.HELVETICA_BOLD,12,Color.BLUE);
                Font fuenteDataCeldas = FontFactory.getFont(FontFactory.COURIER,10,Color.BLACK);

                document.setPageSize(PageSize.LETTER.rotate());
                document.setMargins(-20, -20, 30, 20);
                document.open();

                PdfPCell celda = null;

                //tabla para el titulo pdf
                PdfPTable tablaTitulo = new PdfPTable(1);

                celda = new PdfPCell(new Phrase("LISTADO GENERAL DE VENTAS", fuenteTitulo));
                celda.setBorder(0);
                celda.setBackgroundColor(new Color(158,72,217));
                celda.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                celda.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
                celda.setPadding(30);

                tablaTitulo.addCell(celda);
                tablaTitulo.setSpacingAfter(30);
                //tabla para el listado de ventas

                PdfPTable tablaVentas = new PdfPTable(8);
                
                tablaVentas.setWidths(new float[] {0.8f, 2f, 2f, 1.5f, 3.5f, 2f,1.5f,1.5f});

                celda = new PdfPCell(new Phrase("ID", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaVentas.addCell(celda);

                celda = new PdfPCell(new Phrase("FECHA", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaVentas.addCell(celda);


                celda = new PdfPCell(new Phrase("CLIENTE", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaVentas.addCell(celda);

                celda = new PdfPCell(new Phrase("EMPLEADO", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaVentas.addCell(celda);

                celda = new PdfPCell(new Phrase("PRODUCTO", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaVentas.addCell(celda);

                celda = new PdfPCell(new Phrase("CANTIDAD", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaVentas.addCell(celda);

                celda = new PdfPCell(new Phrase("PRECIO", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaVentas.addCell(celda);

                celda = new PdfPCell(new Phrase("TOTAL", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaVentas.addCell(celda); 
                
                for (CbzVentaEntity ventas : listarVentas) {
                    celda = new PdfPCell(new Phrase(ventas.getIdCbzVenta(),fuenteDataCeldas));
                    celda.setPadding(5);
                    tablaVentas.addCell(celda);

                    celda = new PdfPCell(new Phrase(ventas.getFechaCbzVenta().toString()));
                    celda.setPadding(5);
                    tablaVentas.addCell(celda);

                    celda = new PdfPCell(new Phrase(ventas.getClienteCbzVenta().getNombreCliente()));
                    celda.setPadding(5);
                    tablaVentas.addCell(celda);

                    celda = new PdfPCell(new Phrase(ventas.getEmpleadoCbzVenta().getPrimerNombreEmpleado()));
                    celda.setPadding(5);
                    tablaVentas.addCell(celda);

                    celda = new PdfPCell(new Phrase(ventas.getProductoCbzVenta().getNombreProducto()));
                    celda.setPadding(5);
                    tablaVentas.addCell(celda);

                    celda = new PdfPCell(new Phrase(ventas.getCantidadCbzVenta().toString()));
                    celda.setPadding(5);
                    tablaVentas.addCell(celda);

                    celda = new PdfPCell(new Phrase(ventas.getPrecioCbzVenta().toString()));
                    celda.setPadding(5);
                    tablaVentas.addCell(celda);

                    celda = new PdfPCell(new Phrase(ventas.getTotalCbzVenta().toString()));
                    celda.setPadding(5);
                    tablaVentas.addCell(celda);

                }


                /* 
                

                
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
                */
                /* */
            document.add(tablaTitulo);
            document.add(tablaVentas);
    }
    
}
