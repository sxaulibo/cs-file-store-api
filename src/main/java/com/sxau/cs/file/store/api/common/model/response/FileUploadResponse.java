package com.sxau.cs.file.store.api.common.model.response;

import java.io.Serializable;

public class FileUploadResponse implements Serializable {
    private String fileCode;

    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }
}
