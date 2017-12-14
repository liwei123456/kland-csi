package com.kland.csi.api.folder;


/**
 * Created by njzhu on 2015/10/12.
 */
public interface FolderService {

    /**
     * 创建文件夹
     * @param request
     * @return
     */
    Folder createFolder(Folder request);

    /**
     * 删除文件夹
     * @param folderId 文件夹ID
     * @return
     */
    FlagResponse deleteFolder(String folderId);


    /**
     * 修改文件夹
     * @param request 由folderId和newTitle封装的对象
     * @return
     */
    FlagResponse modifyFolder(ModifyFolderRequest request);


    /**
     * 添加文件夹项
     * @param request
     * @return
     */
    AddItemsToFolderResponse addItemsToFolder(ItemsToFolderRequest request);


    /**
     * 删除文件夹项
     * @param request
     * @return
     */
    FlagResponse removeItemsFromFolder(ItemsToFolderRequest request);


    /**
     * 设置文件夹项备注
     * @param request
     * @return
     */
    FlagResponse setFolderItemAnnotation(SetFolderItemAnnotationRequest request);


    /**
     * 根据 ID 获取文件夹
     * @param folderId
     * @return
     */
    Folder getFolderById(String folderId);



}
