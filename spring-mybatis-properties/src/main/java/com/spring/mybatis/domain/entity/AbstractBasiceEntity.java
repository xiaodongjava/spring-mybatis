package com.spring.mybatis.domain.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractBasiceEntity implements Serializable {
	private static final long serialVersionUID = -7539239131298130786L;

	private Long id;
	private String createdBy;// 创建人
	private Date createdDate = new Date(); // 创建时间
	private String lastModifiedBy;// 最后修改人
	private Date lastModifiedDate = new Date();// 最后修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
