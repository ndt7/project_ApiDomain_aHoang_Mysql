package com.example.check_registration_domain.services;

import com.example.check_registration_domain.entity.StatusDomain;
import okhttp3.Response;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;


public interface DomainService {
    String RegistrationDomain(@PathVariable("nameDomain") String nameDomain);

    String OpenRegistration(@PathVariable("nameDomain") String nameDomain);

    String Whois(@PathVariable("nameDomain") String nameDomain) throws IOException;
    String save(@RequestBody StatusDomain statusDomain);
}
