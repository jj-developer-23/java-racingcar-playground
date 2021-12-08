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

---
문자열 덧셈 계산기 string calculator
[x] 빈 문자열 또는 null 값일 경우 0 반환
[x] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환
[x] (,) 쉼표 또는 (:) 콜론을 구분자로 분리한 후 각자의 숫자 합을 반환
[x] 구분자를 커스텀 할 수 있다. 커스텀 구분자는 문자열 앞에 "//" 와 "\n" 사이에 위치하는 문자를 사용한다.
[x] 숫자 이와의 값 또는 음수를 전달할 경우 RuntimeException 예외를 throw 한다.


---
레이싱 게임 racing
각 자동차에 이름을 부여할 수 있다 (5자 이하)
전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
자동차 이름은 쉼표(,)를 기준으로 구분한다.
자동차 경주 게임을 완료하나 후 누가 우승했는지 알려준다. (우승자는 한명 이상일 수 있다)
몇 대 자동차로 몇 번 이동하는지 입력할 수 있다.
0에서 9사이에서 랜덤값을 구한 후 랜덤값이 4이상일 경우 전진한다.

- [] 몇 대 자동차로 몇 번 이동할 지 입력받는다.
- [x] 각 자동차에 이름을 입력 받는다.
  - [] 자동차 수 확인
  - [x] 자동차 이름의 경우 쉼표(,) 기준으로 구분
- [x] 0에서 9사이 랜덤값 구하기
- [] 4이상일 경우 전진
- [] 전진여부 자동차 이름과 함께 출력
- [] 가장 많이 전진한 자동차 우승 (한명 이상일 수 있음)
