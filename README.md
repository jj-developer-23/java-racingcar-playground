## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```




- 레이싱 게임 racing 각 자동차에 이름을 부여할 수 있다 (5자 이하) 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다. 자동차 경주 게임을 완료하나 후 누가 우승했는지 알려준다. (우승자는 한명 이상일 수 있다)
- 몇 대 자동차로 몇 번 이동하는지 입력할 수 있다.
- 0에서 9사이에서 랜덤값을 구한 후 랜덤값이 4이상일 경우 전진한다.

---

- TODO List
- [] 입력값
  - [] 자동차 개수 Cars
  - [] 이동횟수 Racing
  - [X] 자동차 이름 Cars (, 으로 구분 입)
- [X] 이름 길이 5자 이하 Car
- [] 랜덤값 구함 (0~9 사이) RandomUtils
  - [X] 4이상일 경우 전진 Racing
- [] 우승자 구함 Winners
  - [] 여러명일 수 있음
- [] 출력
  - [] 전진 여부 Racing
  - [] 이름 출력 Racing
  - [] 우승자 Winners