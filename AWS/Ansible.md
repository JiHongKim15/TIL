# Ansible

반복적인 작업을 끝내고 DevOps 보다 전략적인 작업을 수행할 수 있도록 하는 간단한 IT 자동화 제공

▶ 전체 서버 작업 및 관리가 간단

- yml 형태로 간단하게 작성 가능
- 읽기 쉬운 문법
- 규모 확장 기능
- PUSH 기반
- Agent-less
- 내장 모듈
- 추상적인 레이어

### Workflow

user -> **Playbook** -> Ansible Server -> SSH key -> 서버

멱등성O

> task 안에서는 순서대로 작업



### 장점

- 짧게 작성 가능
- role로 작성 시 어디서든 가능

