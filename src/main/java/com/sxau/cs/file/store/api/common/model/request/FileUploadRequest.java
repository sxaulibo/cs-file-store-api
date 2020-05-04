package com.sxau.cs.file.store.api.common.model.request;

import java.io.Serializable;

public class FileUploadRequest implements Serializable {
    private Byte[] fileByteArray;

    public Byte[] getFileByteArray() {
        return fileByteArray;
    }

    public void setFileByteArray(Byte[] fileByteArray) {
        this.fileByteArray = fileByteArray;
    }
}
