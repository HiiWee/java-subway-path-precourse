## ✅기능 목록

### [지하철 노선도 경로 조회 시작시]

- **[기능 목록]**
    - [ ] 게임이 시작되면 역, 노선, 구간 정보를 초기 설정한다.
        - [ ] 지하철 역은 교대역, 강남역, 역삼역, 남부터미널역, 양재역, 양재시민의숲역, 매봉역이
          등록되어 있다.
        - [ ] 지하철 노선으로 2호선, 3호선, 신분당선이 등록되어 있고, 구간 정보는 아래와 같다.
            - [ ] 2호선: 교대역 - (2km / 3분) - 강남역 - (2km / 3분) - 역삼역
            - [ ] 3호선: 교대역 - (3km / 2분) - 남부터미널역 - (6km / 5분) - 양재역 - (1km / 1분) - 매봉역
            - [ ] 신분당선: 강남역 - (2km / 8분) - 양재역 - (10km / 3분) - 양재시민의숲역
- **[예외 목록]**



### [사용자의 메인화면 입력을 받음]

- **[기능 목록]**
    - [ ] 사용자에게 경로 조회 또는 종료에 대한 입력을 받는다.

- **[예외 목록]**
    - [ ] `1` 또는 `Q`가 아닌 입력은 에러를 출력한다.



### [경로 기준의 입력을 받음]

- **[기능 목록]**
    - [ ] (1)최단 거리, (2)최소 시간을 기준으로 역에 대한 입력을 받는다.
    - [ ] B를 입력하면 이전 메인 화면 입력으로 돌아간다.

- **[예외 목록]**
    - [ ] 1, 2, B가 아닌 입력은 에러를 출력한다.



### [사용자의 출발역과 도착역의 입력을 받음]

- **[기능 목록]**
    - [ ] 사용자에게 출발역과 도착역을 순서대로 입력받는다.

- **[예외 목록]**
    - [ ] 출발역과 도착역이 연결되어 있지 않으면 에러를 출력
        - [ ] 존재하지 않는 역을 입력은 에러 출력
    - [ ] 동일한 역을 입력하면 에러 출력


### [조회결과: 역을 입력받고 프로그램의 실행]
- **[기능 목록]**
  - [ ] 최단 거리, 최소 시간을 선택받은것 기준으로 계산을 해야 한다.
    - [ ] 최단 거리로 입력받으면 최단 거리를 기준으로 역을 탐색한다.
    - [ ] 최소 시간으로 입력받으면 최소 시간 기준으로 역을 탐색한다.
  - [ ] 하나의 역을 방문할때마다 역의 이름에 대한 정보를 저장해야 한다. 
  - [ ] 모든 출력은 `[INFO]`를 붙여준다.
  - [ ] 모든 [INFO]가 출력되면 다시 메인화면을 보여주며 시작한다.