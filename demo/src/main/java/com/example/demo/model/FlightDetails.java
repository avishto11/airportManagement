package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight")
public class FlightDetails {
	
			  @Id
			  @GeneratedValue
	          private int id;
			  private String flightname;
			  private String fromname;
			  private String toname ;
			  private Date timedep; 
			  private Date timearrive; 
			  private String flightday;
			public FlightDetails(int id, String flightname, String fromname, String toname, Date timedep,
					Date timearrive, String flightday) {
				super();
				this.id = id;
				this.flightname = flightname;
				this.fromname = fromname;
				this.toname = toname;
				this.timedep = timedep;
				this.timearrive = timearrive;
				this.flightday = flightday;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getFlightname() {
				return flightname;
			}
			public void setFlightname(String flightname) {
				this.flightname = flightname;
			}
			public String getFromname() {
				return fromname;
			}
			public void setFromname(String fromname) {
				this.fromname = fromname;
			}
			public String getToname() {
				return toname;
			}
			public void setToname(String toname) {
				this.toname = toname;
			}
			public Date getTimedep() {
				return timedep;
			}
			public void setTimedep(Date timedep) {
				this.timedep = timedep;
			}
			public Date getTimearrive() {
				return timearrive;
			}
			public void setTimearrive(Date timearrive) {
				this.timearrive = timearrive;
			}
			public String getFlightday() {
				return flightday;
			}
			public void setFlightday(String flightday) {
				this.flightday = flightday;
			}
			public FlightDetails() {
				
			}
			  
			

}
