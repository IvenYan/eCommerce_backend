package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.ProductSimple;
import com.management.backend.api.mybatis.model.ProductWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("ProductSimpleMapper")
public interface ProductSimpleMapper {
//    列出最近一天的产品id
    List<Integer> listRecentlyProducts(@Param("curDateStr") String curDateStr);

    List<ProductSimple> getSimpleProduct();
    int countProduct();

    //搜索
    List<ProductSimple> selectByCondition(@Param("valuecascader") String valuecascader, @Param("marrayBefore") String marrayBefore,
         @Param("marrayAfter") String marrayAfter, @Param("valued") String valued,
         @Param("inputbh") String inputbh, @Param("inputOther") String inputOther,
         @Param("audit_status") int audit_status, @Param("onsale") int onsale, @Param("level") int level);

    //搜索
    int countSelectByCondition(@Param("valuecascader") String valuecascader, @Param("marrayBefore") String marrayBefore,
                                          @Param("marrayAfter") String marrayAfter, @Param("valued") String valued,
                                          @Param("inputbh") String inputbh, @Param("inputOther") String inputOther,
                                          @Param("audit_status") int audit_status, @Param("onsale") int onsale, @Param("level") int level);

    int searchCountByAuditStatus(@Param("audit_status") int audit_status );
    int searchCountByLevel(@Param("level") int level );
    int searchCountByOnsale( @Param("onsale") int onsale );
}
