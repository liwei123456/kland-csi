package com.kland.csi.api.research.impl;

import com.kland.csi.api.research.DocumentEntity;
import com.kland.csi.api.research.DocumentService;

/**
 * Created by xiangli.
 */
public class DocumentServiceImpl implements DocumentService {

    @Override
    public DocumentEntity getDocument(String id) {
        //just test
        DocumentEntity doc = new DocumentEntity();
        doc.setDocId(id);
        doc.setName("Hadoop In Action");
        return doc;
    }
}
