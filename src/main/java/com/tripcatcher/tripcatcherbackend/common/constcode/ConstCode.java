package com.tripcatcher.tripcatcherbackend.common.constcode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConstCode {
    public static String SALT = "";
    public static String FILE_PATH ="";

    @Value("${CONSTCODE.SALT}")
    public void setSalt(String _salt){
        this.SALT = _salt;
    }
    @Value("${CONSTCODE.FILE_PATH}")
    public void setFilePath(String _filePath){
        this.FILE_PATH=_filePath;
    }

}
