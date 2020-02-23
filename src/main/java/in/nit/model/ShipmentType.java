package in.nit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shiptab")
public class ShipmentType {
	@Id
	private Integer shipId;
	private String Shipmode;
	private String Shipcode;
	private String enbShip;
	private String shipGrade;
	private String shipDesc;
	public ShipmentType() {
		super();
	}
	public Integer getShipId() {
		return shipId;
	}
	public void setShipId(Integer shipId) {
		this.shipId = shipId;
	}
	public String getShipmode() {
		return Shipmode;
	}
	public void setShipmode(String shipmode) {
		Shipmode = shipmode;
	}
	public String getShipcode() {
		return Shipcode;
	}
	public void setShipcode(String shipcode) {
		Shipcode = shipcode;
	}
	public String getEnbShip() {
		return enbShip;
	}
	public void setEnbShip(String enbShip) {
		this.enbShip = enbShip;
	}
	public String getShipGrade() {
		return shipGrade;
	}
	public void setShipGrade(String shipGrade) {
		this.shipGrade = shipGrade;
	}
	public String getShipDesc() {
		return shipDesc;
	}
	public void setShipDesc(String shipDesc) {
		this.shipDesc = shipDesc;
	}
	@Override
	public String toString() {
		return "ShipmentType [shipId=" + shipId + ", Shipmode=" + Shipmode + ", Shipcode=" + Shipcode + ", enbShip="
				+ enbShip + ", shipGrade=" + shipGrade + ", shipDesc=" + shipDesc + "]";
	} 
	
	

}
