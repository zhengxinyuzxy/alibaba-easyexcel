package com.mellow.easyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.mellow.easyexcel.pojo.dto.ExcelStudentDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelStudentDTOListener extends AnalysisEventListener<ExcelStudentDto> {
    @Override
    public void invoke(ExcelStudentDto excelStudentDto, AnalysisContext analysisContext) {
        log.info("解析到一条数据:{}", excelStudentDto);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("所有数据解析完成！");
    }
}
