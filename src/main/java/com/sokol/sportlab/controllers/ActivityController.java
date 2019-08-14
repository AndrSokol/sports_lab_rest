package com.sokol.sportlab.controllers;

import com.sokol.sportlab.entities.ActivitiesEntity;
import com.sokol.sportlab.repositories.ActivityRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Api(value="Activity Controller")
@RestController
public class ActivityController {

    @Autowired
    ActivityRepository activityRepository;

//    @ApiOperation(value = "Get All activities")
    @RequestMapping("/activities")
    public List<ActivitiesEntity> getAll() {
        return activityRepository.findAll();
    }

//    @ApiOperation(value = "Get activity by id")
    @RequestMapping("/activities/{id}")
    public ActivitiesEntity getById(@PathVariable int id) {
        return activityRepository.findById(id).get();
    }

//    @ApiOperation(value = "Add activity")
    @PostMapping("/activities")
    public ActivitiesEntity createActivity(@RequestBody ActivitiesEntity activitiesEntity){
        return activityRepository.save(activitiesEntity);
    }

//    @ApiOperation(value = "Delete activity")
    @DeleteMapping("/activities/{id}")
    public void updateActivity(@PathVariable Integer id){
        ActivitiesEntity activitiesEntity = activityRepository.findById(id).get();
        activityRepository.delete(activitiesEntity);
    }


}