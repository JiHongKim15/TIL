---
typora-root-url: ..\..\AWS\image
---

## VPC

> https://www.slideshare.net/awskorea/games-on-aws-2019-aws-aws-aws-182173060

사용자가 정의한 가상의 네트워크 환경(논리적 격리)

- 자체 IP 주소 범위
- Subnet
- Routing Tables
- Security
- Gateway

#### VPC 생성

1. Region, IP 대역 설정

2. 가용영역(AZ)에 Subnet 생성

   ###### CIDR(Classless Inter-Domain Roluting)

   - 172.31.0.0/16

     = 172.31.0.0 ~ 172.31.255.255 (2^16개)

     ![image-20201207153758766](..\image\image-20201207153758766.png)

   - Network 범위 /16 ~ /25까지 가능

   - 표준 IP

     - 10.0.0.0/8
     - 172.16.0.0/12
     - 192.168.0.0/16

3. Routing 설정

4. Traffic 통제



### Internet Gateway

- VPC 인스턴스와 인터넷 간의 통신
- 1:1 Nat
- Public IP or Elastic IP (공개됨)

###### Nate Gateway

- AWS에서 관리

###### Elastic IP

- 변경되지 않는 IP

###### VPC peering

- 2개의 VPC간 Network 연결
- 다른 리전간 연결
- Direct Connect를 이용하여 직접 on-primise 환경에 접근

### VPC 관리

- Elasticsearch + Kibana
- Flow Logs
- Firehose + Athena + QuickSight

### ELB

- 리전 내 Load Balancing
- 다수의 가용영역 AZ의 Target에 Traffic 분배

### Route 53

- DNS 서비스