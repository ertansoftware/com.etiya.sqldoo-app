package com.etiya.sqldoo.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class SqlDooUtil {

	/**
	 * json formatinda gelen degeri verilen json tipine gore olusturulan pojo ya ceviriyoruz.
	 * 
	 * @param json
	 * @param valueType
	 * @return
	 */
	public static <T> T convertJsonToObject(String json, Class<T> valueType){
		if(json == null || json.equals("{}"))
			return null;
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			return mapper.readValue(json, valueType);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	

	
}
