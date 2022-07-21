package com.example.check_registration_domain.repository;

import com.example.check_registration_domain.entity.StatusDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DomainRepository extends JpaRepository<StatusDomain, String> {
    StatusDomain findAllByNameDomain(String nameDomain);

    @Override
    <S extends StatusDomain> S saveAndFlush(S entity);

    @Override
    <S extends StatusDomain> S save(S entity);

    @Override
    List<StatusDomain> findAll();
}
