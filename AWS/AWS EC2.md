
### EC2

:globe_with_meridians: Elastic Compute Cloud

> 클라우드에서 컴퓨팅 파워의 규모를 자유자재로 변경할 수 있는 웹 서비스

#### 일반

##### 개요

###### 작업

- 클라우드에서 **컴퓨팅** 수행
- 컴퓨팅 리소스에 대한 포괄적인 제어권 제공
- 컴퓨팅 인프라에서 실행
- 새로운 서버 인스턴스 획득 및 부팅 :point_right: 시간 단축 :point_right: 요구 사항의 변화에 따라 신속하게 용량 확장/축소
- 실제 사용한 만큼만 요금 지불

###### 개발자가 가능한 작업

:office: Legacy

- 대용량 컴퓨팅 리소스 구입 자본 :x: :point_right: 예기치 않은 로드 스파이크 처리 용량 확보 :x:

:cloud: 클라우드

- 초기 투자 :x:

- 성능 저하 :x:

- 저렴한 비용

- Elastic

  > 개발자들이 트래픽의 스파이크 or 수요에 맞춰 즉시 용량 조정
  >
  > 개발자들이 언제든지 리소스 사용량 관리

###### 루트 디바이스에 EBS 사용

> EC2 인스턴스 실행 시 루트 디바이스 데이터를 EBS or 로컬 인스턴스 스토리지에 저장

:globe_with_meridians: EBS: Elastic Block Store

:office: 로컬 인스턴스 스토리지

- 인스턴스 수명 기간 동안만 유지
- 루트 디바이스에 저장되어 있지 않은 인스턴스를 저렴한 비용으로 실행

:cloud: EBS

- 루트 디바이스 데이터가 인스턴스 수명과 무관하게 유지 
- 인스턴스 중지 후 다시 시작 가능

###### EC2로 시스템 로드 후 저장

EC2 사용

> 운영 체제, App 등 인스턴스에 대한 모든 사항 설정, 구성

:globe_with_meridians: AMI: Amazon Machine Image

>  인스턴스를 설치하고 부팅하는 데 필요한 모든 비트를 포함하는 패키지화된 환경
>
>  배포 단위
>
>  시스템은 여러 빌딩 블록의 AMI를 포함할 수 있음

- AMI 만드는 법

  > 사용자 지정 AMI를 만든 후 번들링
  >
  > 이미지를 EBS에서 지원하는 루트 디바이스와 번들링 :point_right: Management Console에서 번들 명령 사용 가능
  >
  > 이미지와 인스턴스 스토리지의 부팅 파티션 번들링 :point_right: AMI 도구로 S3에 업로드

- 전역 AMI 사용 가능

###### 시스템 엑세스

:globe_with_meridians: Runlnstances: 애플리케이션 스택 실행 시작

- Runlnstances 호출 :point_right: 부팅할 각 시스템의 DNS 이름 세트 반환
- 사용자가 자체 데이터 센터에 있는 시스템에 액세스하는 것처럼 시스템에 액세스
- 사용자의 운영 체제 스택이 시스템에서 실행되는 동안 사용자가 시스템 소유

###### EC2와 S3 함께 사용

- 제공된 도구로 S3에 AMI 로드
- S3와 EC2간에 AMI 이동

###### EC2에서 실행 가능한 인스턴스 개수

- 리전당 vCPU 기반 온디맨드 인스턴스 제한에 따라 온디맨드 인스턴스 실행

- 20개의 예약 인스턴스 구매
- 동적 스팟 제한

###### 지원되는 운영 체제 환경

Amazon Linux, Ubuntu, Windows Server, Red Hat Enterprise Linux, SUSE Linux Enterprise Server, openSUSE Leap, Fedora, Fedora CoreOS, Debian, CentOS, Gentoo Linux, Oracle Linux 및 FreeBSD

###### EC2에서 ECC 메모리 사용

- 서버 인프라에는 ECC 메모리 필요
- EC2의 모든 하드웨어는 ECC 메모리 사용

###### 일반 호스팅 서비스와 다른점

:office: 일반 호스팅 서비스

- 사전에 구성된 리소스를 정해진 시간 동안 미리 정해진 비용으로 제공
- 일반적으로 정해진 시간 동안 고정된 수의 리소스 제공
- 대응에 제한
- 권한 제공 :x:
- 일정 비용 선납

:cloud: EC2

- 유연성, 제어 및 상당한 비용 절감
- 개인 데이터 센터처럼 활용할 수 있도록 지원
- 컴퓨팅 요구사항 즉각적 대응
- 리소스 사용량 관리
- 인스턴스 시작/종료 자유로움
- 인스턴스 구성 > 사용자 지정
- 저렴한 비용

##### EC2 온디맨드 인스턴스 한도

###### 변경 사항

- vCPU 기반으로 한 한도로 변경

  :globe_with_meridians: vCPU 기반 한도

  > 하나의 AWS 계정에 하나 또는 그 이상의 온디맨드 인스턴스만 실행하도록 제한
  >
  > EC2는 AWS 계정에서 실행 중인 온디맨드 인스턴스에 할당된 총 vCPU 수를 기준으로 각 한도에 대한 사용량 측정

  - EC2가 온디맨드 인스턴스 한도를 기존의 개수를 기반으로 한 한도에서 AWS 고객의 한도 관리 경험을 단순화

- vCPU 기반 한도에 대한 사용량은 애플리케이션 요구사항을 충족하는 인스턴스 유형 실행을 위한 vCPU 수로 측정

###### EC2에서 실행할 수 있는 온디맨드 인스턴스

- 개수

- vCPU 기반 인스턴스 한도: 5개

- 리전별 설정

- 시간이 지나면 바뀜

- 한도 증가 요청

  > 사용량을 바탕으로 자동으로 증가
  >
  > 필요한 경우 한도 페이지에서 한도 증가 요청 가능

###### vCPU

  - 한도계산

      - 인스턴스 유형에 대한 vCPU 매핑
      - vCPU 계산기

- vCPU 기반 한도는 실행 중인 온디맨드 인스턴스에만 적용(예약 인스턴스 :x:, spot :x:)

- vCPU 기반 한도 옵트인 하는 것은 실행 중인 인스턴스에 영향을 미치지 않음

- vCPU 기반 인스턴스 한도가 적용되어도 이전 개수 기반으로 한 인스턴스 한도와 동일한 인스턴스 실행 가능

- 인스턴스 사용량 확인

  > Amazon CloudWatch 메트릭을 통해 Service Quotas 콘솔에서 한도에 대한 EC2 사용량 확인
  >
  > Service Quotas을 통해 CloudWatch에서 경보를 구성하여 한도에 도달할 때 고객에게 경고
  >
  > Trusted Advisor 및 Limit Monitor에서 인스턴스 사용량을 계속 추적하고 검사

- AWS 중국 리전을 제외한 모든 사용 AWS 리전에서 사용 가능

###### DescribeAccountAttributes API 사용

- vCPU 한도로 인해 사용량을 관리하는 총 인스턴스 한도가 사라짐 :point_right: DescribeAccountAttributes API는 최대 인스턴스 값 반환:x:
- Service Quotas API를 사용하여 EC2한도에 대한 정보 수신

##### EC2 SMTP 엔드포인트 정책 변경 사항

> 포트 25를 통한 이메일 트래픽을 기본적으로 제한하는 변경 사항 적용
>
> 포트 25는 SMTP 포트를 사용하여 이메일 전송 (이전에는 제한:x:)

###### 포트 25 제한 제거

- 이메일 전송 제한 제거 요청 제출
- SES(Simple Email Service)와 같은 기존에 인증된 이메일 릴레이 서비스 사용

##### SLA(서비스 수준 계약)

- EC2 서비스 수준 계약에서 보장하는 내용

  > SLA는 리전 내 EC2 및 EBS에 최소 99.99%의 월간 가동률 보장

