package cn.xdb.gendb.model.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/** 表信息
 * Created by lch on 2016/7/5.
 */
@Data
public class TableInfo implements Serializable{
    /** 原表名 */
    private String origTable;
    /** 原类的名 */
    private String origClazzName;
    /** 新表的名称 */
    private String newTable;
    /** 新类名（要用驼峰规则命名） */
    private String newClazzName;
    /** 新类的模块名 */
    private String newClazzModule;
    /** 新类的包路径 */
    private String newClazzPackage;
    /** 字段 */
    private List<ColumnInfo> columnInfos;

}
