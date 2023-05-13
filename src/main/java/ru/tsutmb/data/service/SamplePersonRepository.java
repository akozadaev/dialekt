package ru.tsutmb.data.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.tsutmb.data.entity.SamplePerson;

public interface SamplePersonRepository
        extends
            JpaRepository<SamplePerson, Long>,
            JpaSpecificationExecutor<SamplePerson> {

}
