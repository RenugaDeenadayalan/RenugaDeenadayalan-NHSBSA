package data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {
	public List<HashMap<String, String>> getjsontoMap(String JsonFile) throws IOException {
		String jsonstring = FileUtils.readFileToString(new File(System.getProperty("user.dir")+JsonFile),StandardCharsets.UTF_8);
		
		//jsonstring to hashmap
		
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String,String>> data =mapper.readValue(jsonstring, new TypeReference<List<HashMap<String,String>>>(){});
		return data;
		
	}
}
