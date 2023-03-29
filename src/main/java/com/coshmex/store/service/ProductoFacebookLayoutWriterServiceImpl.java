package com.coshmex.store.service;

import com.coshmex.store.mappper.FacebookMappingStrategy;
import com.coshmex.store.mappper.ShopifyMappingStrategy;
import com.coshmex.store.model.ProductoFacebook;
import com.coshmex.store.model.ProductoShopify;
import com.opencsv.bean.MappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ProductoFacebookLayoutWriterServiceImpl implements ProductoFacebookLayoutWriterService {
  private static final int PAGE_SIZE = 50;
  
  private static final String OBJECT_LIST_SAMPLE = "/home/vladd/archivos/products_facebook_export.csv";
  static private Logger logger = LogManager.getLogger(ProductoFacebookLayoutWriterServiceImpl.class);

  public int writeCSV(List<ProductoFacebook> lShop) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

    try {
      logger.info("ESCRIBIEDIO csv facebook DE TAMAÑO {}" , lShop.size());

      Writer writer = Files.newBufferedWriter(Paths.get("/home/vladd/archivos/products_facebook_export.csv", new String[0]), new java.nio.file.OpenOption[0]);
      FacebookMappingStrategy<ProductoFacebook> mappingStrategy = new FacebookMappingStrategy();
      mappingStrategy.setType(ProductoFacebook.class);
      StatefulBeanToCsv<ProductoFacebook> beanToCsv = (new StatefulBeanToCsvBuilder(writer)).withMappingStrategy((MappingStrategy)mappingStrategy).build();
      beanToCsv.write(lShop);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    } 
    return 0;
  }
}
