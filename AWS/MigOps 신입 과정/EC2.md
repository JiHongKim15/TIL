# EC2

클라우드에서 탄력적인 가상 서버

- 최저 비용 EC2 인스턴스 (t2.nano 기준 시간당 $0.008)

- 수명 주기

  - 실행중

  - 정지됨

    > 과금X

  - 종료됨

    > 제거

- Key Pair

  > 인스턴스에 접근하기 위한 인증방식
  >
  > 사용자가 내부에서 직접 안전하게 저장

### AMI

> 인스턴스 시작에 필요한 OS 및 앱 구성된 이미지

### 부트스트래핑

> 인스턴스 생성 시 운영체제 환경 및 소프트웨어를 자동 구성하는 도구

- User data

  > 사용자가 입력한 스크립트를 실행하는 기능

- 형상관리 시스템으로부터 코드를 가져오는 작업





### 유지관리

###### Run Command

> 일반적인 관리 작업을 원격에서 대규모로 수행

- IAM 통합 SSM Policy 통해 세분화된 권한 적용



State Manager

> 운영체제 및 애플리케이션의 일관된 구성 정의 및 유지관리

- JSON 기반 문서를 사용하여 새 정책 정의



###### Cloud watch를 통한 EC2 자동 복구

###### 오토 스케일링을 통한 수명 주기