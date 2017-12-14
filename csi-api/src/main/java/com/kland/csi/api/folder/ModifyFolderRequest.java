package com.kland.csi.api.folder;

/**
 * Created by njzhu on 2015/10/12.
 */
public class ModifyFolderRequest {

    private String folderId;
    private String newTitle;



    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle;
    }
}
