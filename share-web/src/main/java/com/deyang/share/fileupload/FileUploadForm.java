package com.deyang.share.fileupload;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: yudeyang
 * Date: 13-10-26
 * Time: 下午10:53
 * To change this template use File | Settings | File Templates.
 */
public class FileUploadForm {

    private List<MultipartFile> files;

    public List<MultipartFile> getFiles() {
        return files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }
}
