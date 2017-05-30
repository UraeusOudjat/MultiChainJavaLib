package multichainResult;

import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class MultichainResultDefaultAttribute {

	protected String method;
	protected String[] params;
	protected int id;
	protected String chainName;
	
	public MultichainResultDefaultAttribute(JSONObject[] JsonObjectsArray) {		
		
		JSONObject JsonMethodResult = JsonObjectsArray[JsonObjectsArray.length-1];
		
		method = JsonMethodResult.getString("method");
		
		JSONArray jsonArray = JsonMethodResult.getJSONArray("params");
		String paramsString[] = new String[jsonArray.length()];
		
		for (int i=0; i< paramsString.length;i++){
			paramsString[i] = jsonArray.getString(i).toString();
		}
		
		id = JsonMethodResult.getInt("id");
		chainName = JsonMethodResult.getString("chain_name");
	}
	
	
	
	public MultichainResultDefaultAttribute(String m, String[] p, int i, String c) {
		method = m;
		params = p;
		id = i;
		chainName = c;
	}

	public String getMethod() {
		return method;
	}

	public String[] getParams() {
		return params;
	}

	public int getId() {
		return id;
	}

	public String getChainName() {
		return chainName;
	}

	@Override
	public String toString() {
		return "MultichainResultDefaultAttribute [\n\tmethod=" + method + ",\n\tparams=" + Arrays.toString(params) + ",\n\tid="
				+ id + ",\n\tchainName=" + chainName + "\n]";
	}
	
	
}
