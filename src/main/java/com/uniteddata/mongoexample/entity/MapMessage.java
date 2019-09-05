package com.uniteddata.mongoexample.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @ClassName MapMessage
 * @Description TODO
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/9/5
 * @Version 1.0.0
 **/
@Data
@Document
public class MapMessage implements Serializable {
    @Id
    private Long id;
    @Field("map_key")
    private String mapKey;
    @Field("map_value")
    private String mapValue;
}
