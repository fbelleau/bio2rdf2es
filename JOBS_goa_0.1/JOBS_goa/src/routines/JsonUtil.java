package routines;


public class JsonUtil {

	
    public static String jsonIds(String jsonArray, String namespace) {
    	if (jsonArray != null) {
    		jsonArray = jsonArray.replace("[", "").replace("]", "");
    		String[] rows = jsonArray.split(",");
    		String tmp = "[";
    		for (int i = 0; i < rows.length; i++) {
    		   tmp = tmp + "{\"@id\":\"" + namespace + ":"+ rows[i].replace("\"", "") + "\"}"+(i != rows.length - 1 ? ",":"]");
    		}
    		return(tmp);    		
    	} else return(null); 
    }  

    public static String jsonId(String json, String namespace) {
    	if (json != null) {
    		return("{\"@id\":\""+namespace+":"+json+"\"}" );    		
    	} else return(null); 
    }  

}
