package com.jshop.entity;

// Generated 2013-11-10 22:13:34 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SaleGoodsrecordT generated by hbm2java
 */
@Entity
@Table(name = "sale_goodsrecord_t", catalog = "jshoper3")
public class SaleGoodsrecordT implements java.io.Serializable {

	private String salerecordid;
	private String username;
	private String realname;
	private String salegoodsnumber;
	private String salegoodsname;
	private Double salestartingprice;
	private Date saletradetime;
	private Double saleprice;
	private String salepeople;
	private String telno;
	private String mobile;
	private String sex;
	private String email;
	private String points;
	private Double hiprice;
	private Integer joinnumber;
	private Double marketprice;
	private String salegoodsid;
	private String salegoodspictureurl;
	private String salegoodsinformation;
	private Date begingtime;
	private Date endingtime;
	private String salegoodsmessage;
	private Double lowprice;
	private String place;
	private String manufacturer;
	private String htmlpath;

	public SaleGoodsrecordT() {
	}

	public SaleGoodsrecordT(String salerecordid, String salegoodsnumber,
			Date saletradetime) {
		this.salerecordid = salerecordid;
		this.salegoodsnumber = salegoodsnumber;
		this.saletradetime = saletradetime;
	}

	public SaleGoodsrecordT(String salerecordid, String username,
			String realname, String salegoodsnumber, String salegoodsname,
			Double salestartingprice, Date saletradetime, Double saleprice,
			String salepeople, String telno, String mobile, String sex,
			String email, String points, Double hiprice, Integer joinnumber,
			Double marketprice, String salegoodsid, String salegoodspictureurl,
			String salegoodsinformation, Date begingtime, Date endingtime,
			String salegoodsmessage, Double lowprice, String place,
			String manufacturer, String htmlpath) {
		this.salerecordid = salerecordid;
		this.username = username;
		this.realname = realname;
		this.salegoodsnumber = salegoodsnumber;
		this.salegoodsname = salegoodsname;
		this.salestartingprice = salestartingprice;
		this.saletradetime = saletradetime;
		this.saleprice = saleprice;
		this.salepeople = salepeople;
		this.telno = telno;
		this.mobile = mobile;
		this.sex = sex;
		this.email = email;
		this.points = points;
		this.hiprice = hiprice;
		this.joinnumber = joinnumber;
		this.marketprice = marketprice;
		this.salegoodsid = salegoodsid;
		this.salegoodspictureurl = salegoodspictureurl;
		this.salegoodsinformation = salegoodsinformation;
		this.begingtime = begingtime;
		this.endingtime = endingtime;
		this.salegoodsmessage = salegoodsmessage;
		this.lowprice = lowprice;
		this.place = place;
		this.manufacturer = manufacturer;
		this.htmlpath = htmlpath;
	}

	@Id
	@Column(name = "SALERECORDID", unique = true, nullable = false, length = 200)
	public String getSalerecordid() {
		return this.salerecordid;
	}

	public void setSalerecordid(String salerecordid) {
		this.salerecordid = salerecordid;
	}

	@Column(name = "USERNAME", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "REALNAME", length = 20)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Column(name = "SALEGOODSNUMBER", nullable = false, length = 50)
	public String getSalegoodsnumber() {
		return this.salegoodsnumber;
	}

	public void setSalegoodsnumber(String salegoodsnumber) {
		this.salegoodsnumber = salegoodsnumber;
	}

	@Column(name = "SALEGOODSNAME", length = 45)
	public String getSalegoodsname() {
		return this.salegoodsname;
	}

	public void setSalegoodsname(String salegoodsname) {
		this.salegoodsname = salegoodsname;
	}

	@Column(name = "SALESTARTINGPRICE", precision = 22, scale = 0)
	public Double getSalestartingprice() {
		return this.salestartingprice;
	}

	public void setSalestartingprice(Double salestartingprice) {
		this.salestartingprice = salestartingprice;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SALETRADETIME", nullable = false, length = 0)
	public Date getSaletradetime() {
		return this.saletradetime;
	}

	public void setSaletradetime(Date saletradetime) {
		this.saletradetime = saletradetime;
	}

	@Column(name = "SALEPRICE", precision = 10)
	public Double getSaleprice() {
		return this.saleprice;
	}

	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}

	@Column(name = "SALEPEOPLE", length = 20)
	public String getSalepeople() {
		return this.salepeople;
	}

	public void setSalepeople(String salepeople) {
		this.salepeople = salepeople;
	}

	@Column(name = "TELNO", length = 30)
	public String getTelno() {
		return this.telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	@Column(name = "MOBILE", length = 30)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "SEX", length = 1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "EMAIL", length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "POINTS", length = 200)
	public String getPoints() {
		return this.points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	@Column(name = "HIPRICE", precision = 10)
	public Double getHiprice() {
		return this.hiprice;
	}

	public void setHiprice(Double hiprice) {
		this.hiprice = hiprice;
	}

	@Column(name = "JOINNUMBER")
	public Integer getJoinnumber() {
		return this.joinnumber;
	}

	public void setJoinnumber(Integer joinnumber) {
		this.joinnumber = joinnumber;
	}

	@Column(name = "MARKETPRICE", precision = 22, scale = 0)
	public Double getMarketprice() {
		return this.marketprice;
	}

	public void setMarketprice(Double marketprice) {
		this.marketprice = marketprice;
	}

	@Column(name = "SALEGOODSID", length = 20)
	public String getSalegoodsid() {
		return this.salegoodsid;
	}

	public void setSalegoodsid(String salegoodsid) {
		this.salegoodsid = salegoodsid;
	}

	@Column(name = "SALEGOODSPICTUREURL", length = 225)
	public String getSalegoodspictureurl() {
		return this.salegoodspictureurl;
	}

	public void setSalegoodspictureurl(String salegoodspictureurl) {
		this.salegoodspictureurl = salegoodspictureurl;
	}

	@Column(name = "SALEGOODSINFORMATION", length = 200)
	public String getSalegoodsinformation() {
		return this.salegoodsinformation;
	}

	public void setSalegoodsinformation(String salegoodsinformation) {
		this.salegoodsinformation = salegoodsinformation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BEGINGTIME", length = 0)
	public Date getBegingtime() {
		return this.begingtime;
	}

	public void setBegingtime(Date begingtime) {
		this.begingtime = begingtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDINGTIME", length = 0)
	public Date getEndingtime() {
		return this.endingtime;
	}

	public void setEndingtime(Date endingtime) {
		this.endingtime = endingtime;
	}

	@Column(name = "SALEGOODSMESSAGE", length = 50)
	public String getSalegoodsmessage() {
		return this.salegoodsmessage;
	}

	public void setSalegoodsmessage(String salegoodsmessage) {
		this.salegoodsmessage = salegoodsmessage;
	}

	@Column(name = "LOWPRICE", precision = 22, scale = 0)
	public Double getLowprice() {
		return this.lowprice;
	}

	public void setLowprice(Double lowprice) {
		this.lowprice = lowprice;
	}

	@Column(name = "PLACE", length = 30)
	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Column(name = "MANUFACTURER", length = 30)
	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Column(name = "HTMLPATH", length = 50)
	public String getHtmlpath() {
		return this.htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

}
