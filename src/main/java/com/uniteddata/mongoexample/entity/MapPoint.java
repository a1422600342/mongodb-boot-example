package com.uniteddata.mongoexample.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName MapPoint
 * @Description TODO
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/9/5
 * @Version 1.0.0
 **/
@Data
@Document
public class MapPoint implements Serializable {
    @Id
    private Long id;

    @Field("map_name")
    private String mapName;

    @Field("map_message")
    private List<MapMessage> mapMessages;
}
