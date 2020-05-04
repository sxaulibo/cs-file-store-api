package com.sxau.cs.file.store.api.common.model.request;

import java.io.Serializable;

public class FileDownloadRequest implements Serializable {
    private String fileCode;

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }
}
