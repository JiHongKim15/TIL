dependencies{
    ...
    implementation('org.springframework.cloud:spring-cloud-starter-netflix-hystrix')
    ...
}

@EnableCircuitBreaker
public class ExampleApplication{
    public static void main(String[] args){
        SpringApplication.run(ExampleApplication.class, args);
    }
}

@HystrixCommand(commandKey = "commandKeyExample", fallbackMethod = "fallbackMethodExample")
public String hystirxExample(){
    ...
}

public String fallbackMethodExample(){
    return "hystrixExample Error"
}

hystirx:
    command:
        commandKeyExample:
            execution:
                isolation:
                    thread:
                        timeoutlnMilliseconds: 10000




//Ribbon
dependencies{
    implementation('org.springframework.cloud:spring-cloud-starter-ribbon')
}

example:
    ribbon:
        listOfServer:
            - localhost:8081
            - localhost:8082

@LoadBalanced
public RestTemplate RestTemplate(){
    return new RestTemplate;
}

String url = "http://example/exampelapi";


//eureka
dependencies{
    complie('org.springframework.cloud:spring-cloud-starter-netflix-eureka-server')
    complie('org.springframework.cloud:spring-cloud-starter-netflix-eureka-client')   
}

@EnableEurekaServer


server:
    port: 8761

spring:
    application:
        name: eureka-server
eureka:
    server:
        response-cache-update-interval-ms: 10000
        enableSelfPreservation: false

    client:
        register-with-eureka: false
        fetch-registry: false
        service-url:
            defaultZone: http://localhost:8761/eureka
    instance:
        prefer-ip-address: true


spring:
    application:
        name: example-client
eureka:
    instance:
        prefer-ip-address: true
    client:
        service-url:
            defaultZone: http://127.0.0.0.1:8761/eureka
    

//apigatewya

dependencies{
    implementation('org.springframework.cloud:spring-cloud-starter-gateway')
    //eureka 추가
}



spring:
    application:
        name: example-gateway
    cloud:
        gateway:
            #cors 설정
            globalcors:
                cors-configurations:
                '[/**]':
                    allow-credentials: true
            # Gateway 공통 필터
            default-filters:
                - name: GlobalFilter
                  args:
                       baseMessage: Spring Cloud Gateway GlobalFilter
                       preLogger: true
                       postLogger: true
            # MSA 라우팅 정의
            # ID, 목적지(uri), 조건(Predicate), 필터로 구성된다.
            routes:
                - id: user-service
                uri: http://localhost:8081 #목적지
                predicates:
                - Path=/example/**
            
