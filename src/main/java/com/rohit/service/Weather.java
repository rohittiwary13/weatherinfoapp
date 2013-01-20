
package com.rohit.service;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@JsonIgnoreProperties(ignoreUnknown=true)
@Service
public class Weather{
   	private Current_observation current_observation;
   	private Response response;
   	/*public class Error 
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
   	  
   	}*/
	public Current_observation getCurrent_observation(){
		return this.current_observation;
	}
	public void setCurrent_observation(Current_observation current_observation){
		this.current_observation = current_observation;
	}
 	public Response getResponse(){
		return this.response;
	}
	public void setResponse(Response response){
		this.response = response;
	}
}
