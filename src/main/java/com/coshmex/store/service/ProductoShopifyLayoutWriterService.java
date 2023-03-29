package com.coshmex.store.service;

 
import java.io.IOException;
import java.util.List;

import com.coshmex.store.model.ProductoShopify;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public interface ProductoShopifyLayoutWriterService {
  int writeCSV(List<ProductoShopify> paramList) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException;
}
