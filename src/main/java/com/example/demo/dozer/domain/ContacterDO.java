package com.example.demo.dozer.domain;

/**
 * @Auther: wishm
 * @Date: 2019/6/18 23:48
 * @Description: 被转换的do
 */
public class ContacterDO extends BaseEntity {

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别（0，女；1，男）
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age ;

    /**
     * 电话
     */
    private  String phone;

    /**
     * 地址
     */
    private String location;

    /**
     * 删除（0，未删除；1，删除）
     */
    private String dflag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDflag() {
        return dflag;
    }

    public void setDflag(String dflag) {
        this.dflag = dflag;
    }

    @Override
    public String toString() {
        return "ContacterDO{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", location='" + location + '\'' +
                ", dflag='" + dflag + '\'' +
                '}';
    }
}
