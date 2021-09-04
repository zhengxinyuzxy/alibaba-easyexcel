package com.mellow.easyexcle;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.mellow.easyexcel.pojo.dto.ExcelStudentDto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExcelWriteTest {

    @Test
    public void excelWrite() {
        // 写法1
        String fileName = "D:/excel/excelstudent.xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, ExcelStudentDto.class).sheet("模板").doWrite(data());

    }

    @Test
    public void simpleWriteXls() {

        String fileName = "D:/excel/simpleWrite.xls";
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, ExcelStudentDto.class).excelType(ExcelTypeEnum.XLS).sheet("模板").doWrite(data());
    }


    private List<ExcelStudentDto> data() {
        List<ExcelStudentDto> list = new ArrayList<ExcelStudentDto>();
        for (int i = 0; i < 65535; i++) {
            ExcelStudentDto data = new ExcelStudentDto();
            data.setName("姓名：" + i);
            data.setBirthday(new Date());
            data.setSalary(8.88);
            list.add(data);
        }
        return list;
    }
}
