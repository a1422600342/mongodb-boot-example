package com.uniteddata.mongoexample.repository;

import com.uniteddata.mongoexample.entity.MapPoint;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName MapRepository
 * @Description TODO
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/9/5
 * @Version 1.0.0
 **/
@Repository
public interface MapRepository extends MongoRepository<MapPoint,Long> {
    MapPoint findByIdIs(Long id);
}
