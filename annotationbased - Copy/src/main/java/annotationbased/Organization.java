package annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("org")
public class Organization {
	int orgid;
	String orgname;
	@Autowired
	Address address;
	public  Organization() {
		orgid=45;
		orgname="cts";
	}
	public Organization(int orgid, String orgname, Address address) {
		super();
		this.orgid = orgid;
		this.orgname = orgname;
		this.address = address;
	}
	public int getOrgid() {
		return orgid;
	}
	public void setOrgid(int orgid) {
		this.orgid = orgid;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Organization [orgid=" + orgid + ", orgname=" + orgname + ", address=" + address + "]";
	}
	

}
