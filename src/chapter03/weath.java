package chapter03;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class weath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="{\"employees\":[{\"firstName\":\"Bill\",\"lastName\":\"Gates\"},"
				+ "{\"firstName\":\"George\",\"lastName\",\"Bush\"},"
				+ "{\"firstName\":\"Thomas\",\"lastName\",\"Cater\"}]}";
		JSONObject json2=new JSONObject().parseObject(str1);
		System.out.println(str1);
		JSONArray array2=json2.getJSONArray("employees");
		System.out.println(array2);
		JSONObject json3=array2.getJSONObject(2);
		System.out.println(json3);
		String resl=json3.getString("firstName");
		System.out.println(resl);
	

	}
	
}
