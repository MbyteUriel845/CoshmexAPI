package com.coshmex.store.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
@Table(name = "files")
public class FileDB {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  private String name;

  private String type;

  private Date creation_date;

  @Lob
  private byte[] data;

  public FileDB() {
  }

  public FileDB(String name, String type, byte[] data) {
    this.name = name;
    this.type = type;
    this.data = data;
    this.creation_date  = new  Date();
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

  public Date getCreation_date() {
    return creation_date;
  }

  public void setCreation_date(Date creation_date) {
    this.creation_date = creation_date;
  }
}
