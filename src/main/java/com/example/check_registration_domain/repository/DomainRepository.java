package com.example.check_registration_domain.repository;

import com.example.check_registration_domain.entity.StatusDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainRepository extends JpaRepository<StatusDomain, String> {
    StatusDomain findAllByNameDomain(String nameDomain);

    @Override
    <S extends StatusDomain> S saveAndFlush(S entity);

    @Override
    <S extends StatusDomain> S save(S entity);
}
