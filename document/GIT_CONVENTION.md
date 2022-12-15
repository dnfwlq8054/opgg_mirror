# 깃 컨벤션 정리

[깃 커밋 메시지 컨벤션 링크](https://velog.io/@archivvonjang/Git-Commit-Message-Convention)

[깃 브랜치 컨벤션 링크](https://velog.io/@kim-jaemin420/Git-branch-naming)


## 깃 브랜치
master, develop, feature, release, hotfix 등이 있다.

* master    : 일반적인 마스터 브랜치
* develop   : 제품 개발 브랜치 (공유될 브랜치)
* feature   : 기능 개발 브랜치
* release   : 제품 릴리즈 준비 브랜치
* hotfix    : 버그 수정 브랜치

가 있지만 우리는 귀찮으니까 그냥 **feature**, **hotfix** 정도 사용

## 깃 커밋 메세지

깃 커밋 메세지는 다음과 같은 형식으로 서술.

(tag): (comment)

* tag

  1. add
    파일 추가?
  2. fix
    버그 수정
  3. modify
    코드 수정? --> 요거는 refactor가 나을지도..?
  4. update
    3번과 무슨 차이??
  5. wip
    work in process --> 개발하다가 다른 문제가 생겼을 경우 git stash로 임시저장하지만 귀찮으니까 버그가 안나는 선에서 그냥 commit 한다.
  
  여기까지 경환이가 알려준 내용..

> 내용 덧붙혀 주면 감사합니다.

  추가로, 

  6. style
    코드포맷 변경, 세미콜론 누락, 코드 수정이 없는 경우
  7. design
    css등 사용자 ui변경 --> (front 쪽 비즈니스로직 변경에는 사용하지 않기.)
  8. comment
    코드 수정없이 필요한 주석 추가 및 변경
  9. docs
    문서 수정
  10. test
    테스트코드 추가 등 테스트에 관련된 내용 (실제 비즈니스로직 수정에는 관여 x)
  11. rename
    파일 혹은 폴더명을 변경하거나 파일을 옮기는 작업
  12. remove
    파일 삭제



