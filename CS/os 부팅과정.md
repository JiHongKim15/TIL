### **Booting**

컴퓨터를 처음 동작시킬 때 수행되는 일련의 과정

> **바이오스(BIOS, Basic Input Output System)**
> 운영 체제 중 가장 기본적인 소프트웨어, 컴퓨터의 입출력을 처리하는 *펌웨어*
> \- 컴퓨터에 접속되어 있는 기기를 제어하는 프로그램
> \- 기동 순서 설정
> \- 메모리와 CPU 레지스터 초기화
> \- 디스크로부터 부트 로더를 불러옴

####  

https://neos518.tistory.com/113

#### **부팅 과정**

1. 컴퓨터 전원 ON

2. ROM BIOS 동작

\- 프로그램 전원이 꺼져도 기억하는 ROM 메모리에 기억

\- POST(Power On Self Test): RAM, 키보드, 하드디스크 등 체크하는 테스트 실행
▶ 컴퓨터가 동작하기 위해 필수적인 주변 장치들이 문제 없는 지 확인하는 단계
▶ 매우 짧은 시간

3. 부팅로더 읽기/기동

\- 드라이브(기본 검색: A 드라이브)에 부트 파일이 존재하는 지 확인

\- BIOS가 해당 드라이브의 첫 번째 섹터에 있는 정보를 찾아 메모리에 로드하기 위해 복사 👉 **마스터 부트 레코드**(MBR, Master Boot Record)

\- 부트 레코드를 메모리 특정 위치(16진수 7C00 번지)로 복사

\- 부트 레코드가 BIOS가 다른 곳으로 분기하거나 컴퓨터의 부트 레코드에게 통제를 넘겨주기 위한 프로그램을 가짐

\- 부트 레코드가 초기 시스템 파일을 디스켓이나 하드디스크로부터 읽어 메모리에 로드

4. 초기파일 로드

\- 초기파일 ▶ 운영체계의 나머지 부분 메모리 로드

\- 시스템 구성파일(특정 시스템 파일들에 대한 정보) 로드

\- 특정 응용 프로그램이나 사용자가 부트 과정 중 실행되길 원하는 명령어 파일 등 필요한 특수 파일 로드

5. OS 기동

\- 운영체계와 관련된 모든 파일 로드 후, 컴퓨터의 통제권이 운영체계로 전달

\- 요구된 초기 명령어 수행 후 사용자 명령 대기