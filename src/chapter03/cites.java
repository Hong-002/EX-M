package chapter03;

import com.alibaba.fastjson.JSONObject;

public class cites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //����json�ַ���
	    String jsonStr = "{\"id\": 2," + 
	               " \"title\": \"json title\", " + 
	                "\"config\": {" +
	                   "\"width\": 34," +
	                   "\"height\": 35," +
	                "}, \"data\": [" +
	                    "\"JAVA\", \"JavaScript\", \"PHP\"" +
	                "]}";
	    JSONObject jsonObj=new JSONObject().parseObject(jsonStr);
		System.out.println(jsonObj);
		
		//����JSONObject����
				JSONObject json1=new JSONObject();
		//��json1���������
				json1.put("username", "wanglihong");
				json1.put("height", 12.5);
				json1.put("age", 24);
				System.out.println(json1);




	}
	
}
