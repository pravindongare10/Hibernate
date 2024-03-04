package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
		@Id
		private long pinno;
		private String cityname;
		private String areaname;
		public long getPinno() {
			return pinno;
		}
		public void setPinno(long pinno) {
			this.pinno = pinno;
		}
		public String getCityname() {
			return cityname;
		}
		public void setCityname(String cityname) {
			this.cityname = cityname;
		}
		public String getAreaname() {
			return areaname;
		}
		public void setAreaname(String areaname) {
			this.areaname = areaname;
		}
		
}
