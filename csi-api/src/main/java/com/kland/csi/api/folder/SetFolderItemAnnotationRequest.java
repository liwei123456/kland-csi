package com.kland.csi.api.folder;

/**
 * Created by njzhu on 2015/10/13.
 */
public class SetFolderItemAnnotationRequest {

    FolderItem folderItem;

    String note;

    public FolderItem getFolderItem() {
        return folderItem;
    }

    public void setFolderItem(FolderItem folderItem) {
        this.folderItem = folderItem;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
