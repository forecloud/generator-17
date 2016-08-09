package cn.xdb.gendb.model.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lch on 2016/7/5.
 */
@Data
public class TableInfos implements Serializable{
    private List<TableInfo> tableInfos;
}
