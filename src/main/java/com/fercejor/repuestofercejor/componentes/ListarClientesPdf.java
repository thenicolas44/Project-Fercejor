package com.fercejor.repuestofercejor.componentes;

import java.util.List;
import java.util.Map;

import java.awt.Color;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.fercejor.repuestofercejor.model.entity.CbzCompraEntity;
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

@Component("/compras/vista/lista")
public class ListarClientesPdf extends AbstractPdfView{

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
                List<CbzCompraEntity> listarCompras = (List<CbzCompraEntity>) model.get("listadoCompras");
                //fuentes y tamaños 
                Font fuenteTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD,20,Color.GREEN);
                Font fuenteTituloColumnas = FontFactory.getFont(FontFactory.HELVETICA_BOLD,12,Color.GREEN);
                Font fuenteDataCeldas = FontFactory.getFont(FontFactory.COURIER,10,Color.BLACK);

                document.setPageSize(PageSize.LETTER.rotate());
                document.setMargins(-20, -20, 30, 20);
                document.open();

                PdfPCell celda = null;

                //tabla para el titulo del pdf
                PdfPTable tablaTitulo = new PdfPTable(1);

                celda = new PdfPCell(new Phrase("LISTADO GENERAL DE COMPRAS", fuenteTitulo));
                celda.setBorder(0);
                celda.setBackgroundColor(new Color(255,247,0));
                celda.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
                celda.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
                celda.setPadding(30);

                tablaTitulo.addCell(celda);
                tablaTitulo.setSpacingAfter(30);
                //tabla para el listado de compras
                PdfPTable tablaCompras = new PdfPTable(7);
                
                tablaCompras.setWidths(new float[] {0.8f, 2f, 2f, 3.5f, 1.5f,1.5f,1.5f});

                celda = new PdfPCell(new Phrase("ID", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaCompras.addCell(celda);

                celda = new PdfPCell(new Phrase("FECHA", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaCompras.addCell(celda);


                celda = new PdfPCell(new Phrase("PROVEEDOR", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaCompras.addCell(celda);

                celda = new PdfPCell(new Phrase("PRODUCTO", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaCompras.addCell(celda);

                celda = new PdfPCell(new Phrase("CANTIDAD", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaCompras.addCell(celda);

                celda = new PdfPCell(new Phrase("PRECIO", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaCompras.addCell(celda);

                celda = new PdfPCell(new Phrase("TOTAL", fuenteTituloColumnas));
                celda.setBackgroundColor(Color.lightGray);
                celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                celda.setVerticalAlignment(Element.ALIGN_CENTER);
                celda.setPadding(10);
                tablaCompras.addCell(celda); 

    
                listarCompras.forEach(compras -> {
                    tablaCompras.addCell(compras.getIdCbzCompra());
                    tablaCompras.addCell(compras.getFechaCbzCompra().toString());
                    tablaCompras.addCell(compras.getProveedorCbzCompra().getNombreProveedor());
                    tablaCompras.addCell(compras.getProductoCbzCompra().getNombreProducto());
                    tablaCompras.addCell(compras.getCantidadCbzCompra().toString());
                    tablaCompras.addCell(compras.getPrecioCbzCompra().toString());
                    tablaCompras.addCell(compras.getTotalCbzCompra().toString());
                    
                });
            document.add(tablaTitulo);
            document.add(tablaCompras);
    }
    
}
