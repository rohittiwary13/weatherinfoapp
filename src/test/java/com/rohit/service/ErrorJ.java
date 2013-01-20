package com.rohit.service;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonTypeName;

@JsonTypeName("error")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ErrorJ 
{
  private String type;
  private String description;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
  
}
