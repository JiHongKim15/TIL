### **프로비저닝(Provisioning)**

IT 인프라를 설정하는 프로세스

사용자의 요구에 맞게 시스템 자원을 할당, 배치, 배포해 두었다가 필요 시 시스템을 즉시 사용할 수 있는 상태로 미리 준비를 하는 것

 

#### **종류**

📘 서버 자원 프로비저닝

\- 필요한 리소스를 기반으로 네트워크에서 사용될 서버를 설정하는 프로세스

\- 서버의 CPU, Memory 등 자원 할당 또는 적절하게 배치하여 운영이 가능하도록 준비

📘 OS 프로비저닝

\- OS를 서버에 설치하고, 구성작업을 해서 OS가 동작 가능하도록 제공하는 것

📘 소프트웨어 프로비저닝

\- WAS, DBMS 등 소프트웨어를 시스템에 설치 및 배포하고 필요한 구성 셋팅 작업을 통해 실행할 수 있도록 제공하는 것

📘 스토리지 프로비저닝

\- 데이터를 저장하고 관리할 수 있는 스토리지 제공. 클라우드에서 제공하는 Storage의 종류와 용도에 따라 다양한 방식 식으로 제공

📘 네트워크 프로비저닝

\- 필요한 장비와 배선 등 사용자에게 통신 서비스를 제공하는 것, 사용자의 무선환경 서비스 활성화도 포함

📘 계정 프로비저닝

\- 접근 권한을 가진 계정을 제공, 접근 권한 변경 및 필요 계정 생성

📘 서비스 프로비저닝

\- 서비스 설정과 관련된 데이터 관리

\- 고객을 위한 서비스나 클라우드 인프라를 설정할 때 사용

 

#### **프로비저닝 자동화**

\- 가상화와 컨테이너로 프로비저닝 프로세스 속도 향상

\- IaC(Infrastructure as code)로 인프라 자동화 지원 👉 Terraform

> **IaC**
> \- 코드를 통해 인프라를 관리, 프로비저닝
> \- 애플리케이션을 개발하거나 배포할 때, 구성요소들을 수동으로 프로비전이하고 관리할 필요X
> \- 매번 동일한 환경 프로비저닝 보장
> \- 인프라를 모듈식 구성 요소로 분할 ▶ 자동화를 통해 다양한 방식으로 결합

