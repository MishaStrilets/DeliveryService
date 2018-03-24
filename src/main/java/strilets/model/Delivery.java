/** 
 * @author Mykhailo Strilets
 */

package strilets.model;

public class Delivery {

	public Delivery() {
	}

	public Delivery(long rate, String f, String source, String age, String avail, String truck, String truck_o,
			long dh_o, String f_p, String origin, long trip, String destination, String dh_d, String truck_d,
			String length, String weight, String company, String phone) {
		this.f = f;
		this.rate = rate;
		this.source = source;
		this.age = age;
		this.avail = avail;
		this.truck = truck;
		this.truck_o = truck_o;
		this.dh_o = dh_o;
		this.f_p = f_p;
		this.origin = origin;
		this.trip = trip;
		this.destination = destination;
		this.dh_d = dh_d;
		this.truck_d = truck_d;
		this.length = length;
		this.weight = weight;
		this.company = company;
		this.phone = phone;
	}

	private long rate;
	private String f;
	private String source;
	private String age;
	private String avail;
	private String truck;
	private String truck_o;
	private long dh_o;
	private String f_p;
	private String origin;
	private long trip;
	private String destination;
	private String dh_d;
	private String truck_d;
	private String length;
	private String weight;
	private String company;
	private String phone;

	public long getRate() {
		return rate;
	}

	public void setRate(long rate) {
		this.rate = rate;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAvail() {
		return avail;
	}

	public void setAvail(String avail) {
		this.avail = avail;
	}

	public String getTruck() {
		return truck;
	}

	public void setTruck(String truck) {
		this.truck = truck;
	}

	public String getTruck_o() {
		return truck_o;
	}

	public void setTruck_o(String truck_o) {
		this.truck_o = truck_o;
	}

	public long getDh_o() {
		return dh_o;
	}

	public void setDh_o(long dh_o) {
		this.dh_o = dh_o;
	}

	public String getF_p() {
		return f_p;
	}

	public void setF_p(String f_p) {
		this.f_p = f_p;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public long getTrip() {
		return trip;
	}

	public void setTrip(long trip) {
		this.trip = trip;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDh_d() {
		return dh_d;
	}

	public void setDh_d(String dh_d) {
		this.dh_d = dh_d;
	}

	public String getTruck_d() {
		return truck_d;
	}

	public void setTruck_d(String truck_d) {
		this.truck_d = truck_d;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
