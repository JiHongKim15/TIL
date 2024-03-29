**MyBatis**

 

스프링부트에서 sql 쿼리문을 쉽게 작성하기 위한 프레임워크

xml 파일을 이용해서 일반적인 sql 작성

 

 

**사용방법**

 

\1. application.properties

```
//mapper하위 디렉토리에 모든 xml을 다 사용함
mybatis.mapper-locations:classpath:mybatis/mapper/**/**.xml
```

 

 

\2. Mapper XML

```
<mapper namesapce = "com.example.springboot.jdbc.LoginDao">
    <select id = "list" resultType = "com.example.springboot.LoginDto">
        select id, pw from Login where id=#{_id}
    </select>
</mapper>
```

\- where문 뒤에는 변수명으로 _id가 파라미터명이 됨

\- resultType은 해당하는 패키지 밑에 있는 DTO가 됨

 

\3. DAO

```
//xml에서 같은 이름 실행
@Mapper
public interface LoginDao{
    List<DTO> list(@Param("_id") String id);
}
```

\- Mapper xml의 id가 list인 sql 실행

\- _id 파라미터랑 매핑

 

 

**logback**

- Spring에서 지원하는 log 프레임워크
- SpringBoot에서 자동 지원, 기본: info 레벨
- logback-spring.xml로 설정

```
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
```