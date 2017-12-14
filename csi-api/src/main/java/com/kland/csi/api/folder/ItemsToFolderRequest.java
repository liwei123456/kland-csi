package com.kland.csi.api.folder;


import java.util.List;

/**
 * Created by njzhu on 2015/10/13.
 */
public class ItemsToFolderRequest {



   private String folderId;

   private List<FolderItem> items;

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public List<FolderItem> getItems() {
        return items;
    }

    public void setItems(List<FolderItem> items) {
        this.items = items;
    }
}
