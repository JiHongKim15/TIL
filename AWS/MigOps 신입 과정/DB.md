# Database Service

### RDS

- 관계형 데이터베이스
- Amazon Aurora
  - MySQL, PostgreSQL 호환되는 RDS
  - 서능과 가용성 우수
  - 간단하고 쌈
  - scale-out

### ElastiCache

- In-Memory Cache
  - 폰, 태블릿, 차 등 연결
  - 실제 시간과 가까운 performance
  - Load 예측 불가능
- Elastic and reliable
- Memcached or Redis
- Managed Service

### DynamoDB

- NoSQL
- Scale out
- No Table Size

### Redshift

- Relational data warehouse
- 페타바이트 scale
- fast
- simple



### AWS Schema Conversion Tool (AWS SCT)

- Database 스키마와 코드를 자동으로 migration 하는 것을 도와주는 툴





# AWS Aurora

- 스택을 레이어별로 분리

  > 필요한 레이어만 확장이 가능하기 때문에

- 관계형 데이터베이스

  > 오픈소스 호환 (MySQL)

- 완전 관리형 서비스

  > 로깅 및 스토리지를 멀티-테넌트

- 빠르고 손쉬운 확장

  > Scale Out

- 빠르고 예측 가능한 성능

- 비용절감, 사용량만큼 지불

- 3개의 가용영역에 걸쳐있음

###### 성능

- 읽기, 쓰기 모두 인스턴스 크기에 따라 확장 가능
- 로그에만 쓰기 수행
- 6개 중 4개가 ACK로 사용

> 6배 더 쓰지만 9배 더 좋은 성능

- 레플리카?

- **네트워크 I/O**를 요청하기 대문에 버퍼 반복 -> DB 내구성

- 적응형 스레드 풀

  > 리눅스 epoll() 사용
  >
  > latch-free 큐에 삽입

- 락 관리

  > Lock 체인 동시 접근 허용
  >
  > 여러가지 명령어가 병렬적 처리

- 캐시/비캐시 읽기 성능

  > 읽기 레이턴시 감소
  >
  > 스마트 셀렉터

- 삽입 성능

  > 커서 위치 캐싱하여 기본 키로 정렬된 배치 삽입 가속화

- 빠른 인덱스 구축

  > 연속 블록 read ahead 필요
  >
  > bottom-up

- **비동기 처리**

:last_quarter_moon: MySQL보다 적은 작업으로 더 효율적으로 사용 가능

###### 효율

- 스토리지 내구성이 좋음

- 최대 15개의 리드 레플리카를 가질 수 있음

- 실패한 데이터베이스 노드 자동 교체

- 자동적으로 S3로 스트리밍

- 복원 스냅샷 백업

- 신속한 크래시 복구

- 살아남는 캐시

  > 데이터베이스 프로세스와 캐시 분리
  >
  > 버퍼 캐시 원상 처리

- 빠른 장애 조치 :o:

- 스토리지 관리 단순화



# DynamoDB

- NoSQL
- Key-Value