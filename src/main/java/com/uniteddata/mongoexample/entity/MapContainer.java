package com.uniteddata.mongoexample.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MapContainer
 * @Description TODO
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/9/6
 * @Version 1.0.0
 **/
@Data
@Document
public class MapContainer implements Serializable {
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    private String mapName;
    private List<Map<Object,Object>> mapMessages;
}
