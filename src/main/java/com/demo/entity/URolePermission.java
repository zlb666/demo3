package com.demo.entity;

public class URolePermission {
    private Long rid;

    private Long pid;

    public URolePermission(Long rid, Long pid) {
        this.rid = rid;
        this.pid = pid;
    }

    public URolePermission() {
        super();
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}