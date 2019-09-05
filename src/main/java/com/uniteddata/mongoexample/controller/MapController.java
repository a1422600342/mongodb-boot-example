package com.uniteddata.mongoexample.controller;

import com.uniteddata.mongoexample.bean.ResponseResult;
import com.uniteddata.mongoexample.entity.MapPoint;
import com.uniteddata.mongoexample.service.MapService;
import com.uniteddata.mongoexample.util.ResultGeneratorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName MapController
 * @Description TODO
 * @Author dong <feng.db@uniteddata.com>
 * @Date 2019/9/5
 * @Version 1.0.0
 **/
@RestController
public class MapController {

    private final MapService ms;

    @Autowired
    public MapController(MapService ms){
        this.ms = ms;
    }

    @GetMapping("/getByMapId/{id}")
    public ResponseResult getByMapId(@PathVariable long id){
        MapPoint mapPoint = ms.getMapPoint(id);
        return ResultGeneratorUtil.getResultSuccessWithData(mapPoint);
    }

    @GetMapping("/getAll")
    public ResponseResult getAll(){
        List<MapPoint> allMapPoint = ms.getAllMapPoint();
        return ResultGeneratorUtil.getResultSuccessWithData(allMapPoint);
    }

    @PostMapping("/insert")
    public ResponseResult insert(@RequestBody MapPoint mapPoint){
        System.out.println(mapPoint);
        ms.saveMapPoint(mapPoint);
        return ResultGeneratorUtil.getResultSuccessWithData("添加成功！");
    }

    @DeleteMapping("/deleteByMapId/{id}")
    public ResponseResult deleteByMapId(@PathVariable long id){
        ms.deleteMapPoint(id);
        return ResultGeneratorUtil.getResultSuccessWithData("删除成功！");
    }

    @PutMapping("/update")
    public ResponseResult update(@RequestBody MapPoint mapPoint){
        MapPoint save = ms.updateMapPoint(mapPoint);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("msg","修改成功！");
        hashMap.put("obj",save);
        return ResultGeneratorUtil.getResultSuccessWithData(hashMap);
    }
}
