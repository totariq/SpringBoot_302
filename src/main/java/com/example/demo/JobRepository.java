package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public class JobRepository {
    public interface JobRepository extends CrudRepository<Job, Long>{

    }
}
