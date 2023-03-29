package com.coshmex.store.mappper;


	import com.opencsv.bean.ColumnPositionMappingStrategy;

public class FacebookMappingStrategy<T> extends ColumnPositionMappingStrategy<T> {
  private static final String[] HEADER = new String[] {
      "id","title","link","image_link","product_type","condition","availability","description",
      "price","brand","mpn2","shipping","google_product_category" };

  public String[] generateHeader() {
    return HEADER;
  }

}