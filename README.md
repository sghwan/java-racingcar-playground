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
4. 요구사항
- [ ] 자동차 이름을 입력한다. (InputView)
  - [x] 자동차의 이름은 5자 이하이다.
  - [x] 자동차의 이름은 , 로 구분한다.
- [ ] 게임의 횟수를 입력한다. (InputView)
- [ ] 각 턴마다 '-'으로 각 자동차가 어느 정도 전진한지 출력한다. (ResultView)
- [x] 자동차는 랜덤한 값이 주어질 때 그 값에 따라 전진을한다.(Car) -> 테스트 가능한 코드로 만들 것 
  - [x] 4 이상이면 전진한다. 
  - [x] 3 이하면 그 턴은 제자리에 있는다.
- [ ] 게임 종료후 승자를 출력한다. (ResultView)
  - [ ] 승자는 여러명 존재할 수 있다. 