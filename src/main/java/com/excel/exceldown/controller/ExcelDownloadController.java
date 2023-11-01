package com.excel.exceldown.controller;

import com.excel.exceldown.domain.PersonData;
import com.excel.exceldown.service.ExcelDownloadService;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/excelDownload")
@Controller
public class ExcelDownloadController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ExcelDownloadService excelDownloadService;

    @GetMapping
    public List<PersonData> excelDownload(HttpServletResponse response){

        logger.info("■■■■■■■■■■■■■■■■■■■■■■■");
        logger.info("ExcelDownload START");
        logger.info("■■■■■■■■■■■■■■■■■■■■■■■");

        return excelDownloadService.download(response);
    }
}