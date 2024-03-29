### **절차형 SQL**

일반 개발 언어처럼 SQL에서 제공하는 절차 지형적인 프로그램 언어

\- SQL문의 연속적인 실행이나 조건에 따른 분기처리를 이용해 특정기능을 수행하는 저장 모듈 생성

 

**특징**

\- 변수, 상수 선언

\- IF, LOOP등의 절차형 언어 사용

\- 사용자 정의 에러 사용

\- 조건문, 반복문 등 단일 SQL문장으로 실행하기 어려운 연속적인 작업 처리 가능

\- 응용프로그램의 성능 향상 및 서버 통신량 감소 효과

 

**종류**

\- Procedure: 트랜잭션 언어로 미리 저장해놓은 SQL 작업 수행 (Output X)

\- User Defined Function: 프로시저와 비슷, SQL로 작업 처리하여 종료 시 RETURN으로 단일값 반환



\- Trigger: 데이터 입력, 갱신, 삭제 등 이벤트 발생시 원하는 작업을 자동으로 수행

 

***\*구조\****

```
DECLARE
--선언부
  V_TEST_ID VARCHAR(10); --변수 선언
  V_TEST_NUM NUMBER := 100; --상수 선언

BEGIN
-- 실행부
  SELECT V_TEST_NUM +1
  INTO V_TEST_ID --변수에 SELECDT 값 정의
  FROM DUAL;
  
  DBMS_OUTPUT.PUT_LINE(V_TEST_ID); --출력
  
  -- IF-THEN 조건
  IF V_TEST_ID = '10' THEN DBMS_OUTPUT.PUT_LINE('10을 출력합니다');
  ELSIF V_TEST_ID = '11' THEN DBMS_OUTPUT.PUT_LINE('11을 출력합니다');
  ELSE ...;
  END IF;
  
  -- CASE 조건
  CASE
  WHEN V_TEST_NUM = 10 THEN ...;
  WHEN V_TEST_NUM = 11 THEN ...;
  ELSE ...;
  END CASE;

-- EXCEPTION (선택)
-- 예외처리부
END;
```

 

**User Defined Function**

특정 기능들을 모듈화, 재사용하는 사용자 정의 함수, SQL 연산에 대한 결과 값을 RETURN

```
-- 기존 함수가 없으면 생성하고, 있으면 바꿈
CREATE OR REPLACE FUNCTION UF_TEST_MONTH( --함수명
	P_CALDATE DATE --입력 받을 변수타입
)
	RETURN VARCHAR2 --출력 할 변수의 데이터 타입
    
IS

	V_MON VARCHAR2(10); --선언부에서 사용 할 변수 (RETURN 변수)
    
BEGIN
-- SQL 수행
	SELECT TO_CHAR(P_CALDATE, 'MON')
    INTO V_MON
    FROM DUAL;
    
    RETURN(V_MON); -- 리턴 결과, **필수**

END UF_TEST_MONTH1;
```

