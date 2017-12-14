package com.kland.csi.service;

import com.kland.csi.api.research.DocumentEntity;
import com.kland.csi.api.research.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by xiangli.
 */
@Controller
@Path("/documents")
public class CSIDocumentService {
    private DocumentService documentService;

    @Autowired
    public CSIDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public DocumentEntity getDocument(@PathParam("id") String id) {
        return documentService.getDocument(id);
    }
}
