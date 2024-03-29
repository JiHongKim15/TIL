# Storage

### Block

- raw Storage

- **EBS**

  > EC2 인스턴스를 위한 Persistent Block Level 스토리지

  - 인스턴스 Stop/Start 시 하드웨어가 바뀌면 사라짐

### File

- **EFS**

  > EC2 인스턴스를 위한 완전 관리형 네트워크 파일 시스템

  - 운영체제 표준 API 지원
  - 인스턴스간 파일 시스템 공유

### Object

- **S3**

  - S3 Standard

    주 사용 데이터

  - S3 - IA

    파일 동기화 및 공유 서비스

    아카이브 또는 백업

  - Glacier

    장기 보존용 아카이브

#### AWS Transfer for SFTP

> S3 완전 관리형 서비스

- 기존 Active Directory  및 LDAP과 연동 -> 데이터 이관 후 바로 S3 에서 아카이브나 처리 용도로 이용