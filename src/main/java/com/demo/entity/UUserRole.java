package com.demo.entity;

public class UUserRole {
    private Long uid;

    private Long rid;

    public UUserRole(Long uid, Long rid) {
        this.uid = uid;
        this.rid = rid;
    }

    public UUserRole() {
        super();
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }
}