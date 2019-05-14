package com.zh.program.Entrty;

import java.io.Serializable;
import java.util.Date;

public class Human implements Serializable {
    private static final long serialVersionUID = 7370141557278035200L;

    private Integer id;

    private Byte category;

    private String place;

    private String email;

    private String phone;

    private Integer num;

    private String year;

    private String jobsName;

    private String jobsRequire;

    private String jobsDuty;

    private Integer aa;

    private String bb;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getCategory() {
        return category;
    }

    public void setCategory(Byte category) {
        this.category = category;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getJobsName() {
        return jobsName;
    }

    public void setJobsName(String jobsName) {
        this.jobsName = jobsName == null ? null : jobsName.trim();
    }

    public String getJobsRequire() {
        return jobsRequire;
    }

    public void setJobsRequire(String jobsRequire) {
        this.jobsRequire = jobsRequire == null ? null : jobsRequire.trim();
    }

    public String getJobsDuty() {
        return jobsDuty;
    }

    public void setJobsDuty(String jobsDuty) {
        this.jobsDuty = jobsDuty == null ? null : jobsDuty.trim();
    }

    public Integer getAa() {
        return aa;
    }

    public void setAa(Integer aa) {
        this.aa = aa;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb == null ? null : bb.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", category=").append(category);
        sb.append(", place=").append(place);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", num=").append(num);
        sb.append(", year=").append(year);
        sb.append(", jobsName=").append(jobsName);
        sb.append(", jobsRequire=").append(jobsRequire);
        sb.append(", jobsDuty=").append(jobsDuty);
        sb.append(", aa=").append(aa);
        sb.append(", bb=").append(bb);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}