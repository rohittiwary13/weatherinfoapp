package com.rohit.controllers;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.validation.BindingResult;

import com.rohit.form.EnterZipForm;
import com.rohit.service.Current_observation;
import com.rohit.service.Weather;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;

@SuppressWarnings("unused")
@Controller
public class ZipCodeController 
{
	
	@Autowired
	Weather weather;
	
	
	 @RequestMapping("/enterzip")
	   public String getTemp(@Valid EnterZipForm enterZipForm, BindingResult result,
				Map<String, Object> model)
	   {
			if (result.hasErrors()) {
				return "enterzip";
			}
			enterZipForm = (EnterZipForm) model.get("enterZipForm");
			String zipcode = enterZipForm.getZipcode();
			
			 RestTemplate restTemplate = new RestTemplate();
			 weather = restTemplate.getForObject("http://api.wunderground.com/api/ed044d75b91fb500/conditions/q/{zipcode}.json",Weather.class,zipcode);
		        
			    model.put("city",weather.getCurrent_observation().getDisplay_location().getCity());
			    model.put("state",weather.getCurrent_observation().getDisplay_location().getState_name());
			    model.put("temperature",weather.getCurrent_observation().getTemp_f()); 
			    model.put("enterZipForm", enterZipForm);
			    
			    return "enterzip";
	   }
}
