package com.uniteddata.mongoexample.service;

import com.uniteddata.mongoexample.entity.MapContainer;
import com.uniteddata.mongoexample.entity.MapPoint;
import com.uniteddata.mongoexample.repository.MapContainerRepository;
import com.uniteddata.mongoexample.repository.MapRepository;
import com.uniteddata.mongoexample.util.IdGenetatorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MapService
 * @Description TODO
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/9/5
 * @Version 1.0.0
 **/
@Service
public class MapService {
    private final MapRepository mr;
    private final MapContainerRepository mcr;

    @Autowired
    public MapService(MapRepository mr,MapContainerRepository mcr){
        this.mr = mr;
        this.mcr = mcr;
    }

    public MapPoint getMapPoint(long id){
        return mr.findByIdIs(id);
    }

    public List<MapPoint> getAllMapPoint(){
        return mr.findAll();
    }

    public void saveMapPoint(MapPoint mapPoint){
        mr.insert(mapPoint);
    }

    public void deleteMapPoint(long id){
        mr.deleteById(id);
    }

    public MapPoint updateMapPoint(MapPoint mapPoint){
        MapPoint save = mr.save(mapPoint);
        return save;
    }

    public MapContainer saveMapContainer(MapContainer mapContainer){
        long id = IdGenetatorUtil.getSnowFlakeId();
        mapContainer.setId(id);
        return mcr.insert(mapContainer);
    }
}
