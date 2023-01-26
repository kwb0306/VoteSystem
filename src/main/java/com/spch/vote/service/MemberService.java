package com.spch.vote.service;

import com.spch.vote.entity.Member;
import com.spch.vote.repository.FirstRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {

    @Autowired
    private final FirstRepository firstRepository;

    public Member createMember(Member member) {
        Member savedMember = firstRepository.save(member);
        return savedMember;
    }

}
