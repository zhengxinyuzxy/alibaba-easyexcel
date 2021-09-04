package com.mellow.easyexcle;


import com.alibaba.excel.EasyExcel;
import com.mellow.easyexcel.listener.ExcelStudentDTOListener;
import com.mellow.easyexcel.pojo.dto.ExcelStudentDto;
import org.junit.Test;

public class ExcelReadTest {
    @Test
    public void excelRead() {
        // 有个很重要的点 DemoDataListener 不能被spring管理，要每次读取excel都要new,然后里面用到spring可以构造方法传进去
        // 写法1：
        String fileName = "D:/excel/excelstudent.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, ExcelStudentDto.class, new ExcelStudentDTOListener()).sheet().doRead();
    }

}
