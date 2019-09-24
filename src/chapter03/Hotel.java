package chapter03;

public class Hotel {

			private String id;
			private String name;
			/**
			 * 最低价格信息
			 */
			private double price;
			private double lat;
			private double lon;
			private String url;
			private String img;
			private String address;
			private double score;
			/**
			 * 点评分数
			 */
			private int dpscore;
			/**
			 * 点评数量
			 */
			private int dpcount;
			private String star;
			private String stardesc;
			private String shortName;
			private boolean isSingleRec;
			
			public String getId() {
				return id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public double getLat() {
				return lat;
			}

			public void setLat(double lat) {
				this.lat = lat;
			}

			public double getLon() {
				return lon;
			}

			public void setLon(double lon) {
				this.lon = lon;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getImg() {
				return img;
			}

			public void setImg(String img) {
				this.img = img;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public double getScore() {
				return score;
			}

			public void setScore(double score) {
				this.score = score;
			}

			public int getDpscore() {
				return dpscore;
			}

			public void setDpscore(int dpscore) {
				this.dpscore = dpscore;
			}

			public int getDpcount() {
				return dpcount;
			}

			public void setDpcount(int dpcount) {
				this.dpcount = dpcount;
			}

			public String getStar() {
				return star;
			}

			public void setStar(String star) {
				this.star = star;
			}

			public String getStardesc() {
				return stardesc;
			}

			public void setStardesc(String stardesc) {
				this.stardesc = stardesc;
			}

			public String getShortName() {
				return shortName;
			}

			public void setShortName(String shortName) {
				this.shortName = shortName;
			}

			public boolean getIsSingleRec() {
				return isSingleRec;
			}

			public void setIsSingleRec(boolean isSingleRec) {
				this.isSingleRec = isSingleRec;
			}

			public double getPrice() {
				return price;
			}

			public void setPrice(double price) {
				this.price = price;
			}

			@Override
			public String toString() {
				return "Hotel [id=" + id + ", name=" + name + ", price=" + price
						+ ", lat=" + lat + ", lon=" + lon + ", url=" + url + ", img="
						+ img + ", address=" + address + ", score=" + score
						+ ", dpscore=" + dpscore + ", dpcount=" + dpcount + ", star="
						+ star + ", stardesc=" + stardesc + ", shortName=" + shortName
						+ ", isSingleRec=" + isSingleRec + "]";
			
	}

}
