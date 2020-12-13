package com.example.ClearPrimServer;

import com.example.ClearPrimServer.model.Point;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("main")
public class PointsController {


    private List<Point> points;

    public PointsController(){
        points = new ArrayList<>();
    }


    @GetMapping("points")
    List<Point> getAll(){
        return points;
    }

    @PostMapping("points")
    void putPoint(@RequestBody Point point){
        points.add(point);
    }
}
