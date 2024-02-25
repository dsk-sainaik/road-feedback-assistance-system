package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Add_Vechile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String vechileNo;
	private String roadCondition;
	private String location;
	private String traffic;
	private String speed;
	private String date;
	private String status;
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTraffic() {
		return traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	public String getVechileNo() {
		return vechileNo;
	}
	public void setVechileNo(String vechileNo) {
		this.vechileNo = vechileNo;
	}
	public String getRoadCondition() {
		return roadCondition;
	}
	public void setRoadCondition(String roadCondition) {
		this.roadCondition = roadCondition;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Add_Vechile [id=" + id + ", vechileNo=" + vechileNo + ", roadCondition=" + roadCondition + ", location="
				+ location + ", traffic=" + traffic + ", speed=" + speed + ", date=" + date + ", status=" + status
				+ "]";
	}
	
	
	

}
