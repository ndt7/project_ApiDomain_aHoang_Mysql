package com.example.check_registration_domain.services.impl;

import com.example.check_registration_domain.entity.StatusDomain;
import com.example.check_registration_domain.repository.DomainRepository;
import com.example.check_registration_domain.services.DomainService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DomainServiceImpl implements DomainService {
    final DomainRepository domainRepository;

    public DomainServiceImpl(DomainRepository domainRepository) {
        this.domainRepository = domainRepository;
    }

    @Override
    public String RegistrationDomain(@PathVariable("nameDomain") String nameDomain) {
        StatusDomain statusDomain= domainRepository.findAllByNameDomain(nameDomain);
        if (statusDomain != null){
            return statusDomain.status;
        }else {
            return "Đang Đóng ~ chưa được ĐK";
        }
    }

    @Override
    public String OpenRegistration(@PathVariable("nameDomain")  String nameDomain) {
        StatusDomain statusDomain = domainRepository.findAllByNameDomain(nameDomain);
        if (statusDomain != null){
            if (statusDomain.getStatus().equals("đang đóng")){
                statusDomain.setStatus("Open - sẵn sàng ĐK mới");
                return statusDomain.getStatus();
            }
        }
        return "Tên miền chưa có ai ĐK";
    }

    // thuc thi goi API den RegistrationDomain
    @Override
    public String Whois(@PathVariable("nameDomain") String nameDomain) {

        return null;
    }

    @Override
    public String save(@RequestBody StatusDomain entity) {
        domainRepository.saveAndFlush(entity);
        return "thêm domain thành công";
    }
}
