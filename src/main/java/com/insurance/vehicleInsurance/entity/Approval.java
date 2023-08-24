package com.insurance.vehicleInsurance.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Approval {

	@Id
	Integer approvalId;
	String approvalType;
	String approvalStatus;
	
	public Approval() {
		super();
	}
	
	public Approval(Integer approvalId, String approvalType, String approvalStatus) {
		super();
		this.approvalId = approvalId;
		this.approvalType = approvalType;
		this.approvalStatus = approvalStatus;
	}

	public Integer getApprovalId() {
		return approvalId;
	}

	public void setApprovalId(Integer approvalId) {
		this.approvalId = approvalId;
	}

	public String getApprovalType() {
		return approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	
}
