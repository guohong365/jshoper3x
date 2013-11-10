package com.jshop.entity;

// Generated 2013-11-10 22:13:34 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ActHiAttachment generated by hbm2java
 */
@Entity
@Table(name = "act_hi_attachment", catalog = "jshoper3")
public class ActHiAttachment implements java.io.Serializable {

	private String id;
	private Integer rev;
	private String userId;
	private String name;
	private String description;
	private String type;
	private String taskId;
	private String procInstId;
	private String url;
	private String contentId;

	public ActHiAttachment() {
	}

	public ActHiAttachment(String id) {
		this.id = id;
	}

	public ActHiAttachment(String id, Integer rev, String userId, String name,
			String description, String type, String taskId, String procInstId,
			String url, String contentId) {
		this.id = id;
		this.rev = rev;
		this.userId = userId;
		this.name = name;
		this.description = description;
		this.type = type;
		this.taskId = taskId;
		this.procInstId = procInstId;
		this.url = url;
		this.contentId = contentId;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "USER_ID_")
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "NAME_")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION_", length = 4000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "TYPE_")
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "TASK_ID_", length = 64)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Column(name = "PROC_INST_ID_", length = 64)
	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	@Column(name = "URL_", length = 4000)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "CONTENT_ID_", length = 64)
	public String getContentId() {
		return this.contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

}
