package com.kland.csi.api.research;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by xiangli.
 */
@XmlRootElement
public class DocumentEntity {
    private String docId;
    private String name;

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
