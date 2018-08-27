package com.study.pojo.test;

import java.io.Serializable;

public class ApprovalOrganization implements Serializable{
	
	private static final long serialVersionUID = 3495751754215675046L;

	private String aoid;

    private String aoPmId;

    private String aoApprovalMechanism;

    private String aoApprovalMechanismCode;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    public String getAoid() {
        return aoid;
    }

    public void setAoid(String aoid) {
        this.aoid = aoid == null ? null : aoid.trim();
    }

    public String getAoPmId() {
        return aoPmId;
    }

    public void setAoPmId(String aoPmId) {
        this.aoPmId = aoPmId == null ? null : aoPmId.trim();
    }

    public String getAoApprovalMechanism() {
        return aoApprovalMechanism;
    }

    public void setAoApprovalMechanism(String aoApprovalMechanism) {
        this.aoApprovalMechanism = aoApprovalMechanism == null ? null : aoApprovalMechanism.trim();
    }

    public String getAoApprovalMechanismCode() {
        return aoApprovalMechanismCode;
    }

    public void setAoApprovalMechanismCode(String aoApprovalMechanismCode) {
        this.aoApprovalMechanismCode = aoApprovalMechanismCode == null ? null : aoApprovalMechanismCode.trim();
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }
}