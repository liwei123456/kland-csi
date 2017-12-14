package com.kland.csi.api.folder;

import java.util.List;

/**
 * Created by njzhu on 2015/10/13.
 */
public class AddItemsToFolderResponse {

    private List<FolderItem> items;

    public List<FolderItem> getItems() {
        return items;
    }

    public void setItems(List<FolderItem> items) {
        this.items = items;
    }
}
