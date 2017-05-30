package multichainResult;

import org.json.JSONObject;

public class MultichainSplitJsonStringResult {

	public static JSONObject[] SPLIT_JSON_STRING_INTO_JSON_OBJECT_ARRAY(String jsonResultString){
		
		String[] JsonResultArrayTemp = jsonResultString.split("\\}");
		
		//The last cell of JsonResultArrayTemp is an empty line so the final resutl array contain one cell less than JSonResultArrayTemp
		JSONObject[] JsonObjectArray = new JSONObject[JsonResultArrayTemp.length-1];
		
		
		for (int i=0; i< JsonObjectArray.length;i++) {
			JsonObjectArray[i] = new JSONObject(JsonResultArrayTemp[i].concat("}").toString());
		}
		
		
		return JsonObjectArray;
		
	}
}
