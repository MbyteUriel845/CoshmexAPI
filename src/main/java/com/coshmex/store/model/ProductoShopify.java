package com.coshmex.store.model;


import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

public class ProductoShopify {
  @CsvBindByPosition(position = 0)
  @CsvBindByName(column = "handle")
  public String handle = "";

  @CsvBindByPosition(position = 1)
  @CsvBindByName(column = "title")
  public String title = "";

  @CsvBindByPosition(position = 2)
  @CsvBindByName(column = "body_html")
  public String body_html = "";

  @CsvBindByPosition(position = 3)
  @CsvBindByName(column = "vendor")
  public String vendor = "";

  @CsvBindByPosition(position = 4)
  @CsvBindByName(column = "type")
  public String type = "";

  @CsvBindByPosition(position = 5)
  @CsvBindByName(column = "tags")
  public String tags = "";

  @CsvBindByPosition(position = 6)
  @CsvBindByName(column = "published")
  public String published = "";

  @CsvBindByPosition(position = 7)
  @CsvBindByName(column = "option1_name")
  public String option1_name = "";

  @CsvBindByPosition(position = 8)
  @CsvBindByName(column = "option1_value")
  public String option1_value = "";

  @CsvBindByPosition(position = 9)
  @CsvBindByName(column = "option2_name")
  public String option2_name = "";

  @CsvBindByPosition(position = 10)
  @CsvBindByName(column = "option2_value")
  public String option2_value = "";

  @CsvBindByPosition(position = 11)
  @CsvBindByName(column = "option3_name")
  public String option3_name = "";

  @CsvBindByPosition(position = 12)
  @CsvBindByName(column = "option3_value")
  public String option3_value = "";

  @CsvBindByPosition(position = 13)
  @CsvBindByName(column = "variant_SKU")
  public String variant_SKU = "";

  @CsvBindByPosition(position = 14)
  @CsvBindByName(column = "variant_grams")
  public String variant_grams = "";

  @CsvBindByPosition(position = 15)
  @CsvBindByName(column = "variant_inventory_tracker")
  public String variant_inventory_tracker = "";

  @CsvBindByPosition(position = 16)
  @CsvBindByName(column = "variant_inventory_qty")
  public String variant_inventory_qty = "";

  @CsvBindByPosition(position = 17)
  @CsvBindByName(column = "variant_inventory_policy")
  public String variant_inventory_policy = "";

  @CsvBindByPosition(position = 18)
  @CsvBindByName(column = "variant_fulfillment_Service")
  public String variant_fulfillment_Service = "";

  @CsvBindByPosition(position = 19)
  @CsvBindByName(column = "variant_price")
  public String variant_price = "";

  @CsvBindByPosition(position = 20)
  @CsvBindByName(column = "variant_compare_at_price")
  public String variant_compare_at_price = "";

  @CsvBindByPosition(position = 21)
  @CsvBindByName(column = "variant_requires_shipping")
  public String variant_requires_shipping = "";

  @CsvBindByPosition(position = 22)
  @CsvBindByName(column = "variant_taxable")
  public String variant_taxable = "";

  @CsvBindByPosition(position = 23)
  @CsvBindByName(column = "variant_barcode")
  public String variant_barcode = "";

  @CsvBindByPosition(position = 24)
  @CsvBindByName(column = "image_src")
  public String image_src = "";

  @CsvBindByPosition(position = 25)
  @CsvBindByName(column = "image_pposition")
  public String image_pposition = "";

  @CsvBindByPosition(position = 26)
  @CsvBindByName(column = "image_alt_text")
  public String image_alt_text = "";

  @CsvBindByPosition(position = 27)
  @CsvBindByName(column = "gift_card")
  public String gift_card = "";

  @CsvBindByPosition(position = 28)
  @CsvBindByName(column = "seo_title")
  public String seo_title = "";

  @CsvBindByPosition(position = 29)
  @CsvBindByName(column = "seo_description")
  public String seo_description = "";

  @CsvBindByPosition(position = 30)
  @CsvBindByName(column = "google_Shopping_google_product_category")
  public String google_Shopping_google_product_category = "";

  @CsvBindByPosition(position = 31)
  @CsvBindByName(column = "google_shopping_gender")
  public String google_shopping_gender = "";

  @CsvBindByPosition(position = 32)
  @CsvBindByName(column = "google_shopping_age_group")
  public String google_shopping_age_group = "";

  @CsvBindByPosition(position = 33)
  @CsvBindByName(column = "google_shopping_mpn")
  public String google_shopping_mpn = "";

  @CsvBindByPosition(position = 34)
  @CsvBindByName(column = "google_shopping_adwords_grouping")
  public String google_shopping_adwords_grouping = "";

  @CsvBindByPosition(position = 35)
  @CsvBindByName(column = "google_shopping_adwords_labels")
  public String google_shopping_adwords_labels = "";

  @CsvBindByPosition(position = 36)
  @CsvBindByName(column = "google_shopping_condition")
  public String google_shopping_condition = "";

  @CsvBindByPosition(position = 37)
  @CsvBindByName(column = "google_shopping_custom_product")
  public String google_shopping_custom_product = "";

  @CsvBindByPosition(position = 38)
  @CsvBindByName(column = "google_shopping_custom_label_0")
  public String google_shopping_custom_label_0 = "";

  @CsvBindByPosition(position = 39)
  @CsvBindByName(column = "google_shopping_custom_label_1")
  public String google_shopping_custom_label_1 = "";

  @CsvBindByPosition(position = 40)
  @CsvBindByName(column = "google_shopping_custom_label_2")
  public String google_shopping_custom_label_2 = "";

  @CsvBindByPosition(position = 41)
  @CsvBindByName(column = "google_shopping_custom_label_3")
  public String google_shopping_custom_label_3 = "";

  @CsvBindByPosition(position = 42)
  @CsvBindByName(column = "google_shopping_cCustom_label_4")
  public String google_shopping_cCustom_label_4 = "";

  @CsvBindByPosition(position = 43)
  @CsvBindByName(column = "variant_image")
  public String variant_image = "";

  @CsvBindByPosition(position = 44)
  @CsvBindByName(column = "variant_weight_unit")
  public String variant_weight_unit = "";

  @CsvBindByPosition(position = 45)
  @CsvBindByName(column = "variant_tax_code")
  public String variant_tax_code = "";

  @CsvBindByPosition(position = 46)
  @CsvBindByName(column = "cost_per_item")
  public String cost_per_item = "";

  public ProductoShopify(String handle, String title, String body_html, String vendor, String type, String tags, String published, String option1_name, String option1_value, String option2_name, String option2_value, String option3_name, String option3_value, String variant_SKU, String variant_grams, String variant_inventory_tracker, String variant_inventory_qty, String variant_inventory_policy, String variant_fulfillment_Service, String variant_price, String variant_compare_at_price, String variant_requires_shipping, String variant_taxable, String variant_barcode, String image_src, String image_pposition, String image_alt_text, String gift_card, String seo_title, String seo_description, String google_Shopping_google_product_category, String google_shopping_gender, String google_shopping_age_group, String google_shopping_mpn, String google_shopping_adwords_grouping, String google_shopping_adwords_labels, String google_shopping_condition, String google_shopping_custom_product, String google_shopping_custom_label_0, String google_shopping_custom_label_1, String google_shopping_custom_label_2, String google_shopping_custom_label_3, String google_shopping_cCustom_label_4, String variant_image, String variant_weight_unit, String variant_tax_code, String cost_per_item) {
    this.handle = handle;
    this.title = title;
    this.body_html = body_html;
    this.vendor = vendor;
    this.type = type;
    this.tags = tags;
    this.published = published;
    this.option1_name = option1_name;
    this.option1_value = option1_value;
    this.option2_name = option2_name;
    this.option2_value = option2_value;
    this.option3_name = option3_name;
    this.option3_value = option3_value;
    this.variant_SKU = variant_SKU;
    this.variant_grams = variant_grams;
    this.variant_inventory_tracker = variant_inventory_tracker;
    this.variant_inventory_qty = variant_inventory_qty;
    this.variant_inventory_policy = variant_inventory_policy;
    this.variant_fulfillment_Service = variant_fulfillment_Service;
    this.variant_price = variant_price;
    this.variant_compare_at_price = variant_compare_at_price;
    this.variant_requires_shipping = variant_requires_shipping;
    this.variant_taxable = variant_taxable;
    this.variant_barcode = variant_barcode;
    this.image_src = image_src;
    this.image_pposition = image_pposition;
    this.image_alt_text = image_alt_text;
    this.gift_card = gift_card;
    this.seo_title = seo_title;
    this.seo_description = seo_description;
    this.google_Shopping_google_product_category = google_Shopping_google_product_category;
    this.google_shopping_gender = google_shopping_gender;
    this.google_shopping_age_group = google_shopping_age_group;
    this.google_shopping_mpn = google_shopping_mpn;
    this.google_shopping_adwords_grouping = google_shopping_adwords_grouping;
    this.google_shopping_adwords_labels = google_shopping_adwords_labels;
    this.google_shopping_condition = google_shopping_condition;
    this.google_shopping_custom_product = google_shopping_custom_product;
    this.google_shopping_custom_label_0 = google_shopping_custom_label_0;
    this.google_shopping_custom_label_1 = google_shopping_custom_label_1;
    this.google_shopping_custom_label_2 = google_shopping_custom_label_2;
    this.google_shopping_custom_label_3 = google_shopping_custom_label_3;
    this.google_shopping_cCustom_label_4 = google_shopping_cCustom_label_4;
    this.variant_image = variant_image;
    this.variant_weight_unit = variant_weight_unit;
    this.variant_tax_code = variant_tax_code;
    this.cost_per_item = cost_per_item;
  }

  public String getHandle() {
    return this.handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody_html() {
    return this.body_html;
  }

  public void setBody_html(String body_html) {
    this.body_html = body_html;
  }

  public String getVendor() {
    return this.vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTags() {
    return this.tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public String getPublished() {
    return this.published;
  }

  public void setPublished(String published) {
    this.published = published;
  }

  public String getOption1_name() {
    return this.option1_name;
  }

  public void setOption1_name(String option1_name) {
    this.option1_name = option1_name;
  }

  public String getOption1_value() {
    return this.option1_value;
  }

  public void setOption1_value(String option1_value) {
    this.option1_value = option1_value;
  }

  public String getOption2_name() {
    return this.option2_name;
  }

  public void setOption2_name(String option2_name) {
    this.option2_name = option2_name;
  }

  public String getOption2_value() {
    return this.option2_value;
  }

  public void setOption2_value(String option2_value) {
    this.option2_value = option2_value;
  }

  public String getOption3_name() {
    return this.option3_name;
  }

  public void setOption3_name(String option3_name) {
    this.option3_name = option3_name;
  }

  public String getOption3_value() {
    return this.option3_value;
  }

  public void setOption3_value(String option3_value) {
    this.option3_value = option3_value;
  }

  public String getVariant_SKU() {
    return this.variant_SKU;
  }

  public void setVariant_SKU(String variant_SKU) {
    this.variant_SKU = variant_SKU;
  }

  public String getVariant_grams() {
    return this.variant_grams;
  }

  public void setVariant_grams(String variant_grams) {
    this.variant_grams = variant_grams;
  }

  public String getVariant_inventory_tracker() {
    return this.variant_inventory_tracker;
  }

  public void setVariant_inventory_tracker(String variant_inventory_tracker) {
    this.variant_inventory_tracker = variant_inventory_tracker;
  }

  public String getVariant_inventory_qty() {
    return this.variant_inventory_qty;
  }

  public void setVariant_inventory_qty(String variant_inventory_qty) {
    this.variant_inventory_qty = variant_inventory_qty;
  }

  public String getVariant_inventory_policy() {
    return this.variant_inventory_policy;
  }

  public void setVariant_inventory_policy(String variant_inventory_policy) {
    this.variant_inventory_policy = variant_inventory_policy;
  }

  public String getVariant_fulfillment_Service() {
    return this.variant_fulfillment_Service;
  }

  public void setVariant_fulfillment_Service(String variant_fulfillment_Service) {
    this.variant_fulfillment_Service = variant_fulfillment_Service;
  }

  public String getVariant_price() {
    return this.variant_price;
  }

  public void setVariant_price(String variant_price) {
    this.variant_price = variant_price;
  }

  public String getVariant_compare_at_price() {
    return this.variant_compare_at_price;
  }

  public void setVariant_compare_at_price(String variant_compare_at_price) {
    this.variant_compare_at_price = variant_compare_at_price;
  }

  public String getVariant_requires_shipping() {
    return this.variant_requires_shipping;
  }

  public void setVariant_requires_shipping(String variant_requires_shipping) {
    this.variant_requires_shipping = variant_requires_shipping;
  }

  public String getVariant_taxable() {
    return this.variant_taxable;
  }

  public void setVariant_taxable(String variant_taxable) {
    this.variant_taxable = variant_taxable;
  }

  public String getVariant_barcode() {
    return this.variant_barcode;
  }

  public void setVariant_barcode(String variant_barcode) {
    this.variant_barcode = variant_barcode;
  }

  public String getImage_src() {
    return this.image_src;
  }

  public void setImage_src(String image_src) {
    this.image_src = image_src;
  }

  public String getImage_pposition() {
    return this.image_pposition;
  }

  public void setImage_pposition(String image_pposition) {
    this.image_pposition = image_pposition;
  }

  public String getImage_alt_text() {
    return this.image_alt_text;
  }

  public void setImage_alt_text(String image_alt_text) {
    this.image_alt_text = image_alt_text;
  }

  public String getGift_card() {
    return this.gift_card;
  }

  public void setGift_card(String gift_card) {
    this.gift_card = gift_card;
  }

  public String getSeo_title() {
    return this.seo_title;
  }

  public void setSeo_title(String seo_title) {
    this.seo_title = seo_title;
  }

  public String getSeo_description() {
    return this.seo_description;
  }

  public void setSeo_description(String seo_description) {
    this.seo_description = seo_description;
  }

  public String getGoogle_Shopping_google_product_category() {
    return this.google_Shopping_google_product_category;
  }

  public void setGoogle_Shopping_google_product_category(String google_Shopping_google_product_category) {
    this.google_Shopping_google_product_category = google_Shopping_google_product_category;
  }

  public String getGoogle_shopping_gender() {
    return this.google_shopping_gender;
  }

  public void setGoogle_shopping_gender(String google_shopping_gender) {
    this.google_shopping_gender = google_shopping_gender;
  }

  public String getGoogle_shopping_age_group() {
    return this.google_shopping_age_group;
  }

  public void setGoogle_shopping_age_group(String google_shopping_age_group) {
    this.google_shopping_age_group = google_shopping_age_group;
  }

  public String getGoogle_shopping_mpn() {
    return this.google_shopping_mpn;
  }

  public void setGoogle_shopping_mpn(String google_shopping_mpn) {
    this.google_shopping_mpn = google_shopping_mpn;
  }

  public String getGoogle_shopping_adwords_grouping() {
    return this.google_shopping_adwords_grouping;
  }

  public void setGoogle_shopping_adwords_grouping(String google_shopping_adwords_grouping) {
    this.google_shopping_adwords_grouping = google_shopping_adwords_grouping;
  }

  public String getGoogle_shopping_adwords_labels() {
    return this.google_shopping_adwords_labels;
  }

  public void setGoogle_shopping_adwords_labels(String google_shopping_adwords_labels) {
    this.google_shopping_adwords_labels = google_shopping_adwords_labels;
  }

  public String getGoogle_shopping_condition() {
    return this.google_shopping_condition;
  }

  public void setGoogle_shopping_condition(String google_shopping_condition) {
    this.google_shopping_condition = google_shopping_condition;
  }

  public String getGoogle_shopping_custom_product() {
    return this.google_shopping_custom_product;
  }

  public void setGoogle_shopping_custom_product(String google_shopping_custom_product) {
    this.google_shopping_custom_product = google_shopping_custom_product;
  }

  public String getGoogle_shopping_custom_label_0() {
    return this.google_shopping_custom_label_0;
  }

  public void setGoogle_shopping_custom_label_0(String google_shopping_custom_label_0) {
    this.google_shopping_custom_label_0 = google_shopping_custom_label_0;
  }

  public String getGoogle_shopping_custom_label_1() {
    return this.google_shopping_custom_label_1;
  }

  public void setGoogle_shopping_custom_label_1(String google_shopping_custom_label_1) {
    this.google_shopping_custom_label_1 = google_shopping_custom_label_1;
  }

  public String getGoogle_shopping_custom_label_2() {
    return this.google_shopping_custom_label_2;
  }

  public void setGoogle_shopping_custom_label_2(String google_shopping_custom_label_2) {
    this.google_shopping_custom_label_2 = google_shopping_custom_label_2;
  }

  public String getGoogle_shopping_custom_label_3() {
    return this.google_shopping_custom_label_3;
  }

  public void setGoogle_shopping_custom_label_3(String google_shopping_custom_label_3) {
    this.google_shopping_custom_label_3 = google_shopping_custom_label_3;
  }

  public String getGoogle_shopping_cCustom_label_4() {
    return this.google_shopping_cCustom_label_4;
  }

  public void setGoogle_shopping_cCustom_label_4(String google_shopping_cCustom_label_4) {
    this.google_shopping_cCustom_label_4 = google_shopping_cCustom_label_4;
  }

  public String getVariant_image() {
    return this.variant_image;
  }

  public void setVariant_image(String variant_image) {
    this.variant_image = variant_image;
  }

  public String getVariant_weight_unit() {
    return this.variant_weight_unit;
  }

  public void setVariant_weight_unit(String variant_weight_unit) {
    this.variant_weight_unit = variant_weight_unit;
  }

  public String getVariant_tax_code() {
    return this.variant_tax_code;
  }

  public void setVariant_tax_code(String variant_tax_code) {
    this.variant_tax_code = variant_tax_code;
  }

  public String getCost_per_item() {
    return this.cost_per_item;
  }

  public void setCost_per_item(String cost_per_item) {
    this.cost_per_item = cost_per_item;
  }
}
