package com.ordk.fitapp.dao;

import com.ordk.fitapp.model.ProgressInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProgressInfoDao extends CrudRepository<ProgressInfo, Long> {
    List<ProgressInfo> findAll();
    List<ProgressInfo> findAllByPerson_Id(Long id);

    /*
    * INSERT INTO `progress_info` (`id`, `body_fat_level`, `body_musce_level`, `body_water_level`, `body_weight`, `circum_chest`, `circum_hips`, `circum_left_biceps`, `circum_left_calf`, `circum_left_thigh`, `circum_neck`, `circum_right_biceps`, `circum_right_calf`, `circum_right_thigh`, `circum_waist`, `current_date_time`, `moodlevel`, `person_id`) VALUES ('1', '0.2530', '0.5130', '0.392', '99.1', '109', '109', '37', '44', '67', '0', '37', '44', '67', '99', '2020-02-27 21:00:00', '5', '1');
    *
    *
    *
    * */

}
