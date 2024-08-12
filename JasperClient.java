package com.jasper.report.client;

import com.jasper.report.constants.PrintType;
import com.jasper.report.entity.HtmlRenderData;
import com.jasper.report.entity.HtmlRenderDataSource;
import com.jasper.report.resource.Jasper;
import com.jasper.report.resource.RenderData;
import com.jasper.report.resource.SubTemplate;
import com.jasper.report.resource.TemplateName;
import org.springframework.core.io.buffer.DataBuffer;

public interface JasperClient {

//    @Jasper(type = PrintType.PDF, mode = HtmlRenderDataSource.COLLECTION_MAP)
//    DataBuffer test(@TemplateName String templateName, @RenderData(type = HtmlRenderData.class) HtmlRenderData data, @SubTemplate String... templates);

    @Jasper(type = PrintType.PDF, mode = HtmlRenderDataSource.JSON)
    DataBuffer printPDFByJson(@TemplateName String templateName, @RenderData String jsonData);
}
