package com.deyang.share.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.deyang.share.fileupload.FileUploadForm;

/**
 * Created with IntelliJ IDEA.
 * User: yudeyang
 * Date: 13-10-26
 * Time: 下午9:53
 * To change this template use File | Settings | File Templates.
 */
@RequestMapping("fileupload")
public class FileuploadController {

    @RequestMapping(method = RequestMethod.GET)
    public void uploadForm(){

    }

    @RequestMapping(method = RequestMethod.POST)
    public void processUpload(@ModelAttribute("files") FileUploadForm uploadForm, ModelMap map){


        List<MultipartFile> files = uploadForm.getFiles();

        List<String> fileNames = new ArrayList<String>();

        if(null != files && files.size() > 0) {
            for (MultipartFile multipartFile : files) {

                String fileName = multipartFile.getOriginalFilename();
                fileNames.add(fileName);
                //Handle file content - multipartFile.getInputStream()

            }
        }

        map.addAttribute("files", fileNames);
    }
}
