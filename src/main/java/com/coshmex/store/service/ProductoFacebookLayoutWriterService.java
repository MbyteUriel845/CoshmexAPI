package com.coshmex.store.service;


import com.coshmex.store.model.ProductoFacebook;
import com.coshmex.store.model.ProductoShopify;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.List;

public interface ProductoFacebookLayoutWriterService {
  int writeCSV(List<ProductoFacebook> paramList) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException;
}
