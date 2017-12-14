package com.kland.csi.service;

import com.kland.csi.api.tree.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by LiWei on 2015/10/12.
 */
@Controller
@Path("/tree")
public class CSITreeService {
    private TreeService treeService;

    @Autowired
    public CSITreeService(TreeService treeService) {
        this.treeService = treeService;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<TreeEntity> GetBrowseTree(){
        return treeService.GetBrowseTree();
    }

    @POST
    @Path("/tree2")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TreeEntity> getAvailableBrowseTrees(){
        return treeService.GetAvailableBrowseTrees();
    }

    @POST
    @Path("/pid")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TreeEntity> GetBrowseTreeByParentNodeId(TreeRequest request){
        return treeService.GetBrowseTreeByParentNodeId(request);
    }

    @POST
    @Path("0")
    @Produces(MediaType.APPLICATION_JSON)
    public List<TreeEntity> GetBrowseTreeRoot(@PathParam("0") String rootId){
        return treeService.GetBrowseTreeRoot(rootId);
    }

    @POST
    @Path("/filter")
    @Produces(MediaType.APPLICATION_JSON)
    public List<FilterTreeEntity> GetFilterTreeChildren(FilterTreeRequest request){
        return treeService.GetFilterTreeChildren(request);
    }
}
