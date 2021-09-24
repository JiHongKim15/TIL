// HttpServletRequest
@RequestMapping("/FormData1")
public String FormData1(HttpServletRequest httpServletRequest, Model model){

    // httpServletRequest를 이용하여 id와 pw를 가져옴
    String id = httpServletRequest.getParameter("id");
    String pw = httpServletRequest.getParameter("pw");

    // 출력 확인
    System.out.println("id: " + id + " pw: " + pw);

    // model에 담으면 JSP에서 attribute 인식
    model.addAttribute("id", id);
    model.addAttribute("pw", pw);

    return "FormData1";
}


// RequestParam
@RequestMapping("/FormData2")
public String FormData2(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model){

    // 바로 사용 가능
    System.out.println("id: " + id + " pw: " + pw);

    model.addAttribute("id", id);
    model.addAttribute("pw", pw);

    return "FormData2";
}

class Login{
    String id;
    String pw;

    //getter setter
}

// Bean
// 파라미터와 일치하는 빈을 만들어서 사용
@RequestMapping("/FormData3")
public String FormData3(Login login){

    System.out.println("id: " + login.id + " pw: " + login.pw);

    return "FormData3";
}

// 패스에 자체 변수 넣기
@RequestMapping("/FormData4/{id}/{pw}")
public String Login(@PathVariable String id, @PathVariable String pw, Model model){

    model.addAttribute("id", id);
    model.addAttribute("pw", pw);

    return "FormData4";
}

아이디: ${id}
패스워드: ${pw}

아이디: ${login.id}
패스워드: ${login.pw}


// 롬복 Lombok

https://projectlombok.org/download

// command창 
java -jar lombok.jar

// Validator
validator.validate(contentDto, result);

ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "writer is empty");

//validator 의존 주입

ContentValidator validator = new ContentValidator();

@initBinder
protected void initBinder(WebDataBinder binder){
    binder.setValidator(new ContentValidadtor());
}

// 어노테이션
@NotNull(message = "error null")
@NotEmpty(message = "error emtpy")
@Size(min=3, max=10, essage="error size")
@Controller //front담당
@Repoistiory //backend 담당
@Autowired //자동 주입
JdbcTemplate;

//mapper하위 디렉토리에 모든 xml을 다 사용함
mybatis.mapper-locations:classpath:mybatis/mapper/**/**.xml

//xml에서 같은 이름 실행
@Mapper
public interface Dao{
    List<DTO> list();
}

<mapper namesapce = "com.example.springboot.jdbc.Dao">
    <select id = "list" resultType = "com.example.springboot.jdbc.DTO">
        select id, pw from Login
    </select>
</mapper>

<configuration>
    <appender name="consoel" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            //패턴 지정
            <Pattern>[%d{yyyy-MM-dd HH:mm:ss}:%]...
            </Pattern>
        </encoder>
    </appender>

    // 로그레벨 지정
    <logger name = "com.example.springboot" level = "info" />

    // 루트에서 기본 로그 레벨을 off
    <root level = "off">
        <appender-ref ref="console"/>
    </root>
</configuration>


controller -> 프론트
service -> 비즈니스 로직