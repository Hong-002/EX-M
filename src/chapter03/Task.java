package chapter03;

	
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import com.alibaba.fastjson.JSON;
	import com.alibaba.fastjson.JSONArray;
	import com.alibaba.fastjson.JSONObject;
	import java.io.*;
	public class Task {
		
		/**
		 * ʹ��fastjson��������
		 * @param hotelResult	�Ѿ�Ϊ�����������json����
		 * @return
		 */
		public List<Hotel> getHotle(String hotelResult){
			List<Hotel> hotels=new ArrayList<Hotel>();
	       JSONObject hotelResultObj=JSONObject.parseObject(hotelResult);
	        List<Hotel> pageHotels = JSON.parseArray(hotelResultObj.getString("hotelPositionJSON"),Hotel.class);
	        JSONArray hotelsPrice=hotelResultObj.getJSONArray("htllist");
	        if(hotelsPrice !=null && !hotelsPrice.isEmpty()){
	        	for(int j=0;j<pageHotels.size();j++){
	            	JSONObject priceObj=hotelsPrice.getJSONObject(j);
	                if(priceObj !=null&& !priceObj.isEmpty()){
	                	Hotel hotel = pageHotels.get(j);
	                    String hotelId = priceObj.getString("hotelid");
	                    double price = priceObj.getDoubleValue("amount");
	                    if(hotel.getId().equals(hotelId)){
	                    	hotel.setPrice(price);
	                    }
	                }
	            }
	        }
		
	  		hotels.addAll(pageHotels);
	        return hotels;

		}



		/**
		 * ����Я����վ�������£�Ϊ�˲�Ӱ����ԣ�����ֱ�Ӷ�ȡ�����ļ���
		 * @return
		 */
		public  String getHotelListString(String cityId,String url){
			String hotelResult="";
	    	try {
	        	InputStream is = new FileInputStream(new File("D:\\Users\\ASUS\\eclipse-workspace\\������Ӧ�ÿ���\\data\\hotelResult.txt"));
	        	byte[] b=new byte[1024];
	        	int len=0;
	        	try {
	            	while((len=is.read(b))!=-1){
	                	String str=new String(b,0,len);
	                	hotelResult+=str;
	            	}
	        	} catch (IOException e) {
	            	e.printStackTrace();
	        	}
	    	} catch (FileNotFoundException e) {
	        	e.printStackTrace();
	    	}
	        
	    	return hotelResult;
		}

	}

