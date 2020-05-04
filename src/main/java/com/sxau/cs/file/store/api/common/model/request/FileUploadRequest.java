package com.sxau.cs.file.store.api.common.model.request;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class FileUploadRequest implements Serializable {

    private MultipartFile file;

    private byte[] fileByteArray;

    public byte[] getFileByteArray() {
        return fileByteArray;
    }

    public void setFileByteArray(byte[] fileByteArray) {
        this.fileByteArray = fileByteArray;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
