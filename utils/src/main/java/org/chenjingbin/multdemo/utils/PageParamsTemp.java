package org.chenjingbin.multdemo.utils;

import java.io.Serializable;
import java.util.Map;

/**
 * 前端传入的分页参数转化成对象使用
 * @author chenjb
 * @email 764024742@qq.com
 * @date 2019/6/21 11:31
 */
public class PageParamsTemp implements Serializable {
    private int pageNumber = 1;
    private int limitNumber = 10;
    public PageParamsTemp(Map<String,Object> params){
        try {
            params = MapUtils.resetMap(params);
            if(MapUtils.isNull(params,"page")){
                this.pageNumber = Integer.parseInt(params.get("page").toString());
            }
            if (MapUtils.isNull(params,"limit")) {
                this.limitNumber = Integer.parseInt(params.get("limit").toString());
            }
        } catch (NumberFormatException e) {
        }
    }

    public int getLimitNumber() {
        return limitNumber;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setLimitNumber(int limitNumber) {
        this.limitNumber = limitNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
