package com.spch.vote.controller;

import com.spch.vote.entity.Member;
import com.spch.vote.repository.FirstRepository;
import com.spch.vote.service.MemberService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class MainController {

    @Autowired
    private final MemberService memberService;

    @PostMapping("/create")
    public ResponseEntity<Member> createMember() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse("2011-12-03");
        Member member = Member.builder()
                .text("kwb")
                .build();
        Member savedMember = memberService.createMember(member);
        return  new ResponseEntity<>(savedMember, HttpStatus.OK);
    }



}
