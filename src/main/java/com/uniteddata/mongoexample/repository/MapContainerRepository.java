package com.uniteddata.mongoexample.repository;

import com.uniteddata.mongoexample.entity.MapContainer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName MapContainerRepository
 * @Description TODO
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/9/6
 * @Version 1.0.0
 **/
@Repository
public interface MapContainerRepository extends MongoRepository<MapContainer,String> {
}
