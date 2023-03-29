package com.coshmex.store.service;

import com.coshmex.store.mappper.ShopifyMappingStrategy;
import com.coshmex.store.model.ProductoShopify;
import com.opencsv.bean.MappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ProductoShopifyLayoutWriterServiceImpl implements ProductoShopifyLayoutWriterService {
  private static final int PAGE_SIZE = 50;
  static private Logger logger = LogManager.getLogger(ProductoShopifyLayoutWriterServiceImpl.class);

  private static final String OBJECT_LIST_SAMPLE = "/home/vladd/archivos/products_export.csv";
  
  public int writeCSV(List<ProductoShopify> lShop) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
    try {
      logger.info("eSCRIBIEDIO csv DE TAMAÑO {}" , lShop.size());
      Writer writer = Files.newBufferedWriter(Paths.get("/home/vladd/archivos/products_export.csv", new String[0]), new java.nio.file.OpenOption[0]);
      ShopifyMappingStrategy<ProductoShopify> mappingStrategy = new ShopifyMappingStrategy();
      mappingStrategy.setType(ProductoShopify.class);
      StatefulBeanToCsv<ProductoShopify> beanToCsv = (new StatefulBeanToCsvBuilder(writer)).withMappingStrategy((MappingStrategy)mappingStrategy).build();
      beanToCsv.write(lShop);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    } 
    return 0;
  }
}
