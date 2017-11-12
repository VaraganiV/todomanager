package com.venkatworks.hibernate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="todo")
public class ToDo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="tags")
	private String tags;
	
	@Column(name="assignedto")
	private String assignedto;
	
	@Column(name="createon")
	private Date createon;
	
	@Column(name="dueon")
	private Date dueon;
	
	@Column(name="completedon")
	private Date completedon;
	
	@Column(name="status")
	private int status;
	
	@Column(name="isdeleted")
	private int isdeleted;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getAssignedto() {
		return assignedto;
	}

	public void setAssignedto(String assignedto) {
		this.assignedto = assignedto;
	}

	public Date getCreateon() {
		return createon;
	}

	public void setCreateon(Date createon) {
		this.createon = createon;
	}

	public Date getDueon() {
		return dueon;
	}

	public void setDueon(Date dueon) {
		this.dueon = dueon;
	}

	public Date getCompletedon() {
		return completedon;
	}

	public void setCompletedon(Date completedon) {
		this.completedon = completedon;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getIsdeleted() {
		return isdeleted;
	}

	public void setIsdeleted(int isdeleted) {
		this.isdeleted = isdeleted;
	}

	public ToDo() {
		
	}
	
	public ToDo(int id, String description, String tags, String assignedto, Date createon, Date dueon, Date completedon,
			int status, int isdeleted) {
		super();
		this.id = id;
		this.description = description;
		this.tags = tags;
		this.assignedto = assignedto;
		this.createon = createon;
		this.dueon = dueon;
		this.completedon = completedon;
		this.status = status;
		this.isdeleted = isdeleted;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", description=" + description + ", tags=" + tags + ", assignedto=" + assignedto
				+ ", createon=" + createon + ", dueon=" + dueon + ", completedon=" + completedon + ", status=" + status
				+ ", isdeleted=" + isdeleted + "]";
	}

	
	
}
