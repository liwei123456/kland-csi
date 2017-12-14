package com.kland.csi.api.folder;

import java.util.Date;
import java.util.List;

/**
 * Created by njzhu on 2015/10/12.
 */
public class Folder {

    private String id;
    private String title;
    private String userId;
    private String parentId;
    private Date createdDate;
    private List<FolderItem> items;

    public List<FolderItem> getItems() {
        return items;
    }

    public void setItems(List<FolderItem> items) {
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
