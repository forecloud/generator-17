package cn.xdb.gendb.model.model;

import lombok.Data;

import java.io.Serializable;

/** 字段
 * Created by lch on 2016/7/5.
 */
@Data
public class ColumnInfo implements Serializable {
    /** 原字段名 */
    private String origColumnName;
    /** 新字段名 */
    private String newColunmName;

}
