package com.deyang.share.domain;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.*;

@Table
@Entity
public class Article implements Comparable {
	@Id
	@GeneratedValue
	private Long id;
	@Column(length=100)
	private String title;
	@Lob
	@Column
	private String content;
	@Column
	private Timestamp publishTime;
	@Column
	private Timestamp lastUpdateTime;
	@Column
	private int viewCount;
	@Column
	private int status;
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
    @OneToMany(mappedBy="article",cascade = CascadeType.REMOVE)
    private Set<Comment> comments;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinColumn(name = "category_id")
    private Category category;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}
	public Timestamp getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

    @Override
    public int compareTo(Object article) {
        return this.id.compareTo(((Article)article).getId());
    }
}
