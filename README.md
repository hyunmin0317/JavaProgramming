## Github에서 Repository에 파일 올리기

1. 저장공간 초기화

   $ git init

2. Github 저장소와 연결

   $ git remote add origin http://저장소 주소.git

3. 파일 추가

   $ git add .

4. commit의 수정사항 설명 작성

   $ git commit -m "수정사항 설명"

5. Github 저장소로 보냄

   $ git push origin master

- 현재 저장소 상태 확인

  $ git status

- Github 저장소와 연결 상태 확인

  $ git remote -v

  

----

## Github에서 Fork 한 Repository 업데이트 하기

1. 현재 저장소에 포크 저장소를 Clone

   $ git clone http://포크저장소 주소.git

2. 원본 저장소 주소 upstream 등록

   $ git remote add upsteam http://원본저장소 주소

3. upstream 데이터로 update

   $ git fetch upstream

4. upstream으로 받아온 데이터 merge

   $ git merge upstream/master

5. 포크 저장소로 push

   $ git push origin master

- git pull = git fetch + git merge

  $ git pull upstream master

  

---

## branch 만들기(가지 생성)

1. branch 생성
$ git checkout -b <branch이름>
2. branch 이동
$ git checkout <branch이름>
3. branch를 push 할때
$ git push origin <branch이름>

- branch를 만들지 않았을때 맨 처음 branch의 이름은 master이다.



---

## git clone VS git pull

- git clone (프로젝트 처음에 사용)

  - Github의 모든 파일들을 가져오는 역할

  - 저장소를 통째로 가져올때 사용

    ex) 처음 프로젝트에 투입되거나, 제공하는 예제 소스를 가져올때, 중간에 git이 꼬였을때

- git pull (프로젝트를 진행하며 사용)

  - Github의 파일 중 프로젝트의 최신 코드를 local로 가져오는 역할 

  - local repository와 비교하여 병합(merge)을 하고, local repository에 저장(add)까지 수행

- - git pull = git fetch + git merge

- - - git fetch : local에 연결된 remote repository의 브랜치 목록과 그 파일 내용을 최신으로 업데이트 하는 명령어 (local과 remote의 싱크를 맞추는 새로고침 역할)

- - - git merge : 두 개의 branch를 병합하는 명령어