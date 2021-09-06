package com.example.demo.bean;

/**
 * Created by RABBIT on 2021/9/2.
 */
public class InteractBean {
    private  int id;
    private  String name;
    private  String tel;
    private  String addr;
    private  String company;
    private  String problem;
    private  String add_time;

    public int getId() {
        return id;
    }

    public void  setId(int id)
    {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }
}
