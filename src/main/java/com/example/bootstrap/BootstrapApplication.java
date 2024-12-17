package com.example.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//JPA에 감사(auditing)을 활성화합니다.
//엔티티(Entity)에 생성 및 수정이 발생하면 자동으로 날짜를 기록하는 기능
@EnableJpaAuditing
public class BootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootstrapApplication.class, args);
    }

}

//이름 지정방법
//스네이크법 : 첫글자를 대문자로, 일반적으로 클래스명 지정시 사용
//           Sum {  }
//소문자 작성 : 함수명()과 변수명
//카멜법 : 두 단어를 사용할 때, 두번째 단어의 첫글자를 대문자로(함수와 변수명에 주로 사용)
//        kokSum()
//더블카멜 : 세 단어를 사용할 때 두번째, 세번째 단어의 첫 글자를 대문자로(함수와 변수에 주로 사용)
//          summerKorSum()
//헝거리식 : 단어와 단어사이에 _ 연결, 모든단어 소문자
//          kok_sum ==> C언어

//이름을 설정할 때는 동사는 사용을 자제, 가능하면 명사를 사용

//남의 클래스 사용시 : [패키지명].클래스명.함수()
//                  [패키지명].클래스명.변수
//자바는 변수명에 한글 사용 가능

//1. Config : 스프링부트의 환결설정 프로그램
//            보안, 로그인, 권한부여, MVC모델 설정, Application 설정, 파일업로드
//2. Controller : 맵핑작업
//                브라우저와 Service에서 요청 및 응답에 대한 이동
//3. Service : 작업처리(테이블과 관련 작업)
//             삽입, 수정, 삭제, 조회별 처리
//4. Repository : 데이터베이스 처리
//                JPA(SQL)를 통해서 데이터베이스에 데이터를 저장, 수정, 삭제, 조회
//5. Entity : 테이블의 필드 정보와 JPA에 전달할 값을 관리
//            테이블당 1개의 Entity만 존재(테이블 40개 > entity 40개)
//6. DTO : HTML과 Service간에 데이터를 전달
//         테이블당 여러개의 DTO로 구성(작업별로)
//7. Util : 스프링부트 외의 기능들(날짜, 페이지처리, 웹하드, 파일 업로드, AI 연동)

//                        Entity --------: Modelmapper
//데이터베이스 <-> Repository <-> Service   DTO
//                                       <-> Controller
//                               HTML

//@ : 어노테이션
//    사용자가 작성할 프로그램을 간소화(자동작성)