package com.sxau.cs.file.store.api.common.model.response;

import java.io.Serializable;

public class FileDownloadResponse implements Serializable {
    private byte[] fileByteArray;

    public byte[] getFileByteArray() {
        return fileByteArray;
    }

    public void setFileByteArray(byte[] fileByteArray) {
        this.fileByteArray = fileByteArray;
    }
}
