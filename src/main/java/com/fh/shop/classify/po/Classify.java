package com.fh.shop.classify.po;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_classify")
public class Classify implements Serializable {

    private static final long serialVersionUID = 1658315525608427044L;

    private Integer id;

    private String name;

    private Integer pid;
}
