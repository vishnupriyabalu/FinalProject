package com.finproj.Finprojbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity
public class Supplier {
@Id
@GeneratedValue
int supid;
String supname,supaddrs;
public int getSupid() {
	return supid;
}
public void setSupid(int supid) {
	this.supid = supid;
}
public String getSupname() {
	return supname;
}
public void setSupname(String supname) {
	this.supname = supname;
}
public String getSupaddrs() {
	return supaddrs;
}
public void setSupaddrs(String supaddrs) {
	this.supaddrs = supaddrs;
}

}
