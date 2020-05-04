package com.sxau.cs.file.store.api.remote;

import com.sxau.cs.file.store.api.common.model.request.FileDownloadRequest;
import com.sxau.cs.file.store.api.common.model.request.FileUploadRequest;
import com.sxau.cs.file.store.api.common.model.response.FileDownloadResponse;
import com.sxau.cs.file.store.api.common.model.response.FileUploadResponse;

/**
 * 文件存储上传下载服务
 */
public interface FileStoreRemote {
    /**
     * 文件上传
     *
     * @param fileUploadRequest 上传请求
     * @return fileCode
     */
    FileUploadResponse upload(FileUploadRequest fileUploadRequest);

    /**
     * 文件下载
     *
     * @param fileDownloadRequest 下载请求
     * @return fileByteArray
     */
    FileDownloadResponse download(FileDownloadRequest fileDownloadRequest);
}
