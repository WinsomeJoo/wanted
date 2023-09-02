package com.clone.wanted.employment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploymentRepository extends JpaRepository<Employment,Long> {


    @Query(value = "select e.hashtag_name from employment_hashtag e where e.employment_id=:employment_id",nativeQuery = true)
    List<String> findHashtagName(@Param("employment_id") Long employmentId);
}
