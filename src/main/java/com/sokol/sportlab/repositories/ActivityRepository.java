package com.sokol.sportlab.repositories;

import com.sokol.sportlab.entities.ActivitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<ActivitiesEntity, Integer> {

}
