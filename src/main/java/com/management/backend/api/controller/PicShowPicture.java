package com.management.backend.api.controller;

import com.management.backend.api.mybatis.mapper.ProductPictureMapper;
import com.management.backend.api.mybatis.model.ProductPicture;
import com.management.backend.api.mybatis.model.ProductPictureExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

@RestController
@Api(value = "show productPicture",tags = {"show productPicture service"})
public class PicShowPicture {
    @Autowired
    private ProductPictureMapper productPictureMapper;
    @RequestMapping(value="/pic/{uuid}/{picName}")
    public void getProductPicture(@PathVariable("uuid") String uuid,@PathVariable("picName") String picName, final HttpServletResponse response) throws IOException {
        ProductPictureExample ue = new ProductPictureExample();
        ue.createCriteria().andPictureLocationEqualTo("pic"+"/"+uuid+"/"+picName);
        List<ProductPicture> pic = productPictureMapper.selectByExampleWithBLOBs(ue);
        if(pic.size()<1){
            response.getOutputStream();
        }else {
            OutputStream outputSream =    response.getOutputStream();
            outputSream.write(pic.get(0).getPicture());
            outputSream.flush();

        }
    }
}
