# AWS EFS 연동하기 (Mount)

(EFS 생성 생략)

> https://st-soul.tistory.com/45



1. 연결할 EFS 선택

![image-20210302161147552](.\image\image-20210302161147552.png)



2. 연결 선택

![image-20210302161326509](.\image\image-20210302161326509.png)



3. 연결탭에서 명령어 확인

- DNS

![image-20210302163144344](.\image\image-20210302163144344.png)

같은 VPC에서만 사용 가능



- IP

![image-20210302163043372](.\image\image-20210302163043372.png)



4. EC2 Linux 서버에 접속하여 명령어 실행 (NFS 클라이언트 사용)

5. 이후 Linux Mount 설정

   https://honeywater97.tistory.com/12?category=1179726

   - vi /etc/fstab

   ```
   "EFS IP":/			/디렉토리		nfs4		EFS 설정값
   ```

   

   