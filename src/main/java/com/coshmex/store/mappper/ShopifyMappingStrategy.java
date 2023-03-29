package com.coshmex.store.mappper;


	import com.opencsv.bean.ColumnPositionMappingStrategy;

	public class ShopifyMappingStrategy<T> extends ColumnPositionMappingStrategy<T> {
	  private static final String[] HEADER = new String[] { 
	      "Handle", "Title", "Body (HTML)", "Vendor", "Type", "Tags", "Published", "Option1 Name", "Option1 Value", "Option2 Name", 
	      "Option2 Value", "Option3 Name", "Option3 Value", "Variant SKU", "Variant Grams", "Variant Inventory Tracker", "Variant Inventory Qty", "Variant Inventory Policy", "Variant Fulfillment Service", "Variant Price", 
	      "Variant Compare At Price", "Variant Requires Shipping", "Variant Taxable", "Variant Barcode", "Image Src", "Image Position", "Image Alt Text", "Gift Card", "Seo Title", "Seo Description", 
	      "Google Shopping / Google Product Category", "Google Shopping / Gender", "Google Shopping / Age Group", "Google Shopping / MPN", "Google Shopping / AdWords Grouping", "Google Shopping / AdWords Labels", "Google Shopping / Custom Product", "Google Shopping / Condition", "Google Shopping / Custom Label 0", "Google Shopping / Custom Label 1", 
	      "Google Shopping / Custom Label 2", "Google Shopping / Custom Label 3", "Google Shopping / Custom Label 4", "Variant Image", "Variant Weight Unit", "Variant Tax Code", "Cost per item" };
	  
	  public String[] generateHeader() {
	    return HEADER;
	  }
	
}