package com.noreal.customer;

import com.noreal.customer.repository.JpaMemberRepository;
import com.noreal.customer.repository.MemberRepository;
import com.noreal.customer.repository.MemoryMemberRepository;
import com.noreal.customer.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    public SpringConfig(EntityManager em) {
        this.em = em;
    }
    private EntityManager em;


    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
    }
}
