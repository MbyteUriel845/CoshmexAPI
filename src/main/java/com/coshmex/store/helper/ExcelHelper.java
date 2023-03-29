package com.coshmex.store.helper;

import com.coshmex.store.model.ProductoSyscom;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

 import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelHelper {

    static private Logger logger = LogManager.getLogger(ExcelHelper.class);

    public static String TYPE = "application/vnd.ms-excel";//""application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    static String[] HEADERs = { "Modelo", "Marca", "Título", "Existencia" ,"En Camino","Precio de Lista(USD)","Precio Especial","URL Imagen","Link SYSCOM","Link Privado","Descripcion Fiscal","Código Fiscal" };
      static String SHEET = "Worksheet";

    public static boolean hasExcelFormat(MultipartFile file) {
        logger.info("  Content Type: {} " , file.getContentType());
        if (!TYPE.equals(file.getContentType())) {
            logger.info("Validando Formato  false");

            return false;
        }
        logger.info("Validando Formato  true");
        return true;
    }

    public static List<ProductoSyscom> excelToProducts(InputStream is) {
        try {
            Workbook workbook = new XSSFWorkbook(is);
            ObjectMapper mapperObj = new ObjectMapper();

            Sheet sheet = workbook.getSheet(SHEET);
            Iterator<Row> rows = sheet.iterator();

            List<ProductoSyscom> tutorials = new ArrayList<ProductoSyscom>();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cellsInRow = currentRow.iterator();

                ProductoSyscom producto = new ProductoSyscom();

                int cellIdx = 0;
                while (cellsInRow.hasNext()) {
                    Cell currentCell = cellsInRow.next();

                     switch (cellIdx) {
                        case 0:
                            if( currentCell.getCellType() !=0  )
                            producto.setModelo( currentCell.getStringCellValue());
                            break;

                        case 1:
                            producto.setMarca( currentCell.getStringCellValue() );
                            break;

                        case 2:
                            producto.setTitulo( currentCell.getStringCellValue());
                            break;

                        case 3:

                            if( currentCell.getCellType() !=0  ) {
                                producto.setExistencia(currentCell.getStringCellValue());
                            }

                            break;
                        case  4:


                            if( currentCell.getCellType() ==0) {
                                producto.setEn_camino(String.valueOf(currentCell.getNumericCellValue()));
                            }

                            break;
                        case 5:
                            producto.setPrecio_listaUSD( currentCell.getNumericCellValue() );
                            break;
                        case 6:

                            if( currentCell.getCellType() !=0  && currentCell.getCellType() !=1  )
                            producto.setPrecio_especial( currentCell.getNumericCellValue() );
                            break;
                        case 7:
                            producto.setUrl_imagen( currentCell.getStringCellValue());
                            break;
                        case 8:
                            producto.setLink__syscom( currentCell.getStringCellValue());
                            break;
                        case 9:
                            producto.setLink_privado( currentCell.getStringCellValue());
                            break;
                        case 10:
                            logger.info(" tipo: {}",currentCell.getCellType());
                            if( currentCell.getCellType() != 0 )
                            producto.setDescripcion_fiscal( currentCell.getStringCellValue());
                            break;
                        case 11:
                            if( currentCell.getCellType() == 3 )
                            producto.setCodigo_fiscal( String.valueOf( currentCell.getNumericCellValue() ) )  ;
                            break;
                         default:
                            break;
                    }
                    cellIdx++;
                }
                logger.info(" Producto: {} " , mapperObj.writeValueAsString(producto.toString()));

                tutorials.add(producto);
            }


            return tutorials;
        } catch (IOException    e) {
            throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
        }
    }
}
