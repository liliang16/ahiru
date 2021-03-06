package com.webservice.ahiru.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 编写实体类（依据数据库表），创建私有变量，Set/Get方法的实现
 * </p>
 *
 * @author xuxianlong
 * @since 2019-12-31
 */
//视图名：V_EMP_LIST
@TableName("V_EMP_LIST")
public class VEmpList implements Serializable {

    //用来表明类的不同版本间的兼容性
    private static final long serialVersionUID = 1L;

    //员工编号
    private String id;

    //员工姓名
    private String name;

    //职称
    private String job;

    //级别
    private String level;

    //入职日期
    private String inDate;

    //部门分类
    private String depRole;

    //技术类别
    private String tech;

    //入部门时间
    private String indepDate;

    //离职时间
    private String outDate;

    //离职原因
    private String outRsn;



    //工作地
    private String  workPlace;

    //部门
    private List<String> deptList;

    //
    private String BPFlg;

    //部门名称
    private String depRoleName;

    //技术名称
    private String techName;

    //
    private String a1;

    //
    private String a2;

    //
    private String a3;

    //
    private String a4;

    //
    private String a5;

    //
    private String a6;

    //
    private String a7;

    //
    private String a8;

    //
    private String a9;

    //
    private String a10;

    //
    private String a11;

    //
    private String a12;

    //
    private String a;

    //PM名称
    private String pmName;

    //颜色分类
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBPFlg() {
        return BPFlg;
    }

    public void setBPFlg(String BPFlg) {
        this.BPFlg = BPFlg;
    }

    public String getDepRoleName() {
        return depRoleName;
    }

    public void setDepRoleName(String depRoleName) {
        this.depRoleName = depRoleName;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getDepRole() {
        return depRole;
    }

    public void setDepRole(String depRole) {
        this.depRole = depRole;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getIndepDate() {
        return indepDate;
    }

    public void setIndepDate(String indepDate) {
        this.indepDate = indepDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public String getOutRsn() {
        return outRsn;
    }

    public void setOutRsn(String outRsn) {
        this.outRsn = outRsn;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public List<String> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<String> deptList) {
        this.deptList = deptList;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public String getA7() {
        return a7;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public String getA8() {
        return a8;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public String getA9() {
        return a9;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public String getA12() {
        return a12;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getPmName() {
        return pmName;
    }

    public void setPmName(String pmName) {
        this.pmName = pmName;
    }

    //编译器可以给你验证@Override下面的方法名是否是你父类中所有的，如果没有则报错。
    @Override
    //返回参数名称和值
    public String toString() {
        return "VEmpList{" +
                "    id=" + id +
                ",     name=" + name +
                ",     job=" + job +
                ",     level=" + level +
                ",     inDate=" + inDate +
                ",     depRole=" + depRole +
                ",     tech=" + tech +
                ",     outDate=" + outDate +
                ",     outRsn=" + outRsn +
                ",     BPFlg=" + BPFlg +
                ",     depRoleName=" + depRoleName +
                ",     techName=" + techName +
                ",     a1=" + a1 +
                ",     a2=" + a2 +
                ",     a3=" + a3 +
                ",     a4=" + a4 +
                ",     a5=" + a5 +
                ",     a6=" + a6 +
                ",     a7=" + a7 +
                ",     a8=" + a8 +
                ",     a9=" + a9 +
                ",     a10=" + a10 +
                ",     a11=" + a11 +
                ",     a12=" + a12 +
                ",     a=" + a +
                ",     pmName=" + pmName +
                '}';
    }
}
