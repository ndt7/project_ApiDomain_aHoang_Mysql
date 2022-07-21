package com.example.check_registration_domain.controller;

import com.example.check_registration_domain.entity.StatusDomain;
import com.example.check_registration_domain.services.DomainService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
public class DomainController {
    final DomainService domainService;

    public DomainController(DomainService domainService) {

        this.domainService = domainService;
    }

    @GetMapping("registration/{nameDomain}")
    public String registration(@PathVariable("nameDomain") String nameDomain) {
        log.info("Đã gọi đến hàm registration, name domain: " + nameDomain);
        return domainService.RegistrationDomain(nameDomain); // goi toi ham dk
    }


    // gửi lên bằng phương thức Post với tên miền muốn ĐK(để mở trạng thái Đk)
    @GetMapping("openRegistration/{nameDomain}")
    public String openRegistration(@PathVariable("nameDomain") String nameDomain) {
        return domainService.OpenRegistration(nameDomain);
    }

    @GetMapping("checkDomain/{nameDomain}")
    public String checkDomain(){
        return "";
    }

    @PostMapping("addDomain")
    public String addDomain(@RequestBody StatusDomain statusDomain){
        log.info("Vừa đã thêm thành công domain: " + statusDomain.getNameDomain());
        return domainService.save(statusDomain);
    }
}
