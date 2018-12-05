package com.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="student2")
public class Student {
	
	@Id
	@GeneratedValue
	private Integer sid;
	
	private String sname;
	
	private String clg;
	
	

	@OneToOne(cascade = CascadeType.ALL, mappedBy="stu")
	@JoinColumn(name ="stu_id")
	private Passport pp;
	
	

	public Passport getPp() {
		return pp;
	}

	public void setPp(Passport pp) {
		this.pp = pp;
	}

	/*@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_COURSE",
	joinColumns = { @JoinColumn(name = "STUDENT_ID") },
	inverseJoinColumns = { @JoinColumn(name = "COURSE_ID") })
	private List<Course> courseList = new ArrayList<Course>();
	
	
	
	
	
	
	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
*/
	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}
	
	
	

}
