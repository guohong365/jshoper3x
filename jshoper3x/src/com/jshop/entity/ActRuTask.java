package com.jshop.entity;

// Generated 2013-9-30 22:17:05 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ActRuTask generated by hbm2java
 */
@Entity
@Table(name = "act_ru_task", catalog = "jshoper3")
public class ActRuTask implements java.io.Serializable {

	private String id;
	private ActRuExecution actRuExecutionByExecutionId;
	private ActReProcdef actReProcdef;
	private ActRuExecution actRuExecutionByProcInstId;
	private Integer rev;
	private String name;
	private String parentTaskId;
	private String description;
	private String taskDefKey;
	private String owner;
	private String assignee;
	private String delegation;
	private Integer priority;
	private Date createTime;
	private Date dueDate;
	private Integer suspensionState;
	private Set<ActRuIdentitylink> actRuIdentitylinks = new HashSet<ActRuIdentitylink>(
			0);

	public ActRuTask() {
	}

	public ActRuTask(String id, Date createTime) {
		this.id = id;
		this.createTime = createTime;
	}

	public ActRuTask(String id, ActRuExecution actRuExecutionByExecutionId,
			ActReProcdef actReProcdef,
			ActRuExecution actRuExecutionByProcInstId, Integer rev,
			String name, String parentTaskId, String description,
			String taskDefKey, String owner, String assignee,
			String delegation, Integer priority, Date createTime, Date dueDate,
			Integer suspensionState, Set<ActRuIdentitylink> actRuIdentitylinks) {
		this.id = id;
		this.actRuExecutionByExecutionId = actRuExecutionByExecutionId;
		this.actReProcdef = actReProcdef;
		this.actRuExecutionByProcInstId = actRuExecutionByProcInstId;
		this.rev = rev;
		this.name = name;
		this.parentTaskId = parentTaskId;
		this.description = description;
		this.taskDefKey = taskDefKey;
		this.owner = owner;
		this.assignee = assignee;
		this.delegation = delegation;
		this.priority = priority;
		this.createTime = createTime;
		this.dueDate = dueDate;
		this.suspensionState = suspensionState;
		this.actRuIdentitylinks = actRuIdentitylinks;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXECUTION_ID_")
	public ActRuExecution getActRuExecutionByExecutionId() {
		return this.actRuExecutionByExecutionId;
	}

	public void setActRuExecutionByExecutionId(
			ActRuExecution actRuExecutionByExecutionId) {
		this.actRuExecutionByExecutionId = actRuExecutionByExecutionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROC_DEF_ID_")
	public ActReProcdef getActReProcdef() {
		return this.actReProcdef;
	}

	public void setActReProcdef(ActReProcdef actReProcdef) {
		this.actReProcdef = actReProcdef;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROC_INST_ID_")
	public ActRuExecution getActRuExecutionByProcInstId() {
		return this.actRuExecutionByProcInstId;
	}

	public void setActRuExecutionByProcInstId(
			ActRuExecution actRuExecutionByProcInstId) {
		this.actRuExecutionByProcInstId = actRuExecutionByProcInstId;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "NAME_")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PARENT_TASK_ID_", length = 64)
	public String getParentTaskId() {
		return this.parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
	}

	@Column(name = "DESCRIPTION_", length = 4000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "TASK_DEF_KEY_")
	public String getTaskDefKey() {
		return this.taskDefKey;
	}

	public void setTaskDefKey(String taskDefKey) {
		this.taskDefKey = taskDefKey;
	}

	@Column(name = "OWNER_")
	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Column(name = "ASSIGNEE_")
	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	@Column(name = "DELEGATION_", length = 64)
	public String getDelegation() {
		return this.delegation;
	}

	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}

	@Column(name = "PRIORITY_")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME_", nullable = false, length = 0)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DUE_DATE_", length = 0)
	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Column(name = "SUSPENSION_STATE_")
	public Integer getSuspensionState() {
		return this.suspensionState;
	}

	public void setSuspensionState(Integer suspensionState) {
		this.suspensionState = suspensionState;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "actRuTask")
	public Set<ActRuIdentitylink> getActRuIdentitylinks() {
		return this.actRuIdentitylinks;
	}

	public void setActRuIdentitylinks(Set<ActRuIdentitylink> actRuIdentitylinks) {
		this.actRuIdentitylinks = actRuIdentitylinks;
	}

}
