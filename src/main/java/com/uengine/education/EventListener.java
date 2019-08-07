package com.uengine.education;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EventListener {

    @Autowired
    MailLogRepository mailLogRepository;

//    @StreamListener(Streams.INPUT)
//    @JsonDeserialize(as = Enrolled.class)
//    public void handleEnrolled(@Payload Enrolled enrolled) {
//
//        String title = "제목: " + enrolled.getCustomerName() +" 님의 강의 수강이 신청되었습니다.";
//        String contents = "수강신청과목명: " + enrolled.getCourseTitle();
//
//        MailLog mailLog = new MailLog();
//        mailLog.setTo(enrolled.getCustomerId());
//        mailLog.setContents(contents);
//        mailLog.setTitle(title);
//
//        mailLogRepository.save(mailLog);
//
//        System.out.println("<이메일 발송>");
//        System.out.println(title);
//        System.out.println(contents);
//
//    }

    @StreamListener(Streams.INPUT)
    @JsonDeserialize(as = ClazzDayRegistered.class)
    public void handleClazzDay(@Payload ClazzDayRegistered clazzDayRegistered) {


        System.out.println("제목 : [마감임박] "+ clazzDayRegistered.getTitle() + " 강의가 개설되었습니다");
        System.out.println("내용 : 일시: "+ clazzDayRegistered.getDate());
        System.out.println("*** 기념품 증정 ***: ");
    }


}
