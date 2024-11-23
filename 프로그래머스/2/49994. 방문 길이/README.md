# [level 2] 방문 길이 - 49994 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/49994) 

### 성능 요약

메모리: 80.7 MB, 시간: 20.58 ms

### 구분

코딩테스트 연습 > Summer／Winter Coding（～2018）

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 23일 22:21:08

### 문제 설명

<p>게임 캐릭터를 4가지 명령어를 통해 움직이려 합니다. 명령어는 다음과 같습니다.</p>

<ul>
<li><p>U: 위쪽으로 한 칸 가기</p></li>
<li><p>D: 아래쪽으로 한 칸 가기</p></li>
<li><p>R: 오른쪽으로 한 칸 가기</p></li>
<li><p>L: 왼쪽으로 한 칸 가기</p></li>
</ul>

<p>캐릭터는 좌표평면의 (0, 0) 위치에서 시작합니다. 좌표평면의 경계는 왼쪽 위(-5, 5), 왼쪽 아래(-5, -5), 오른쪽 위(5, 5), 오른쪽 아래(5, -5)로 이루어져 있습니다.</p>

<p><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/ace0e7bc-9092-4b95-9bfb-3a55a2aa780e/%E1%84%87%E1%85%A1%E1%86%BC%E1%84%86%E1%85%AE%E1%86%AB%E1%84%80%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B51_qpp9l3.png" title="" alt="방문길이1_qpp9l3.png"></p>

<p>예를 들어, "ULURRDLLU"로 명령했다면</p>

<p><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/668c7458-e184-472d-9d32-f5d2acca759a/%E1%84%87%E1%85%A1%E1%86%BC%E1%84%86%E1%85%AE%E1%86%AB%E1%84%80%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B52_lezmdo.png" title="" alt="방문길이2_lezmdo.png"></p>

<ul>
<li>1번 명령어부터 7번 명령어까지 다음과 같이 움직입니다.</li>
</ul>

<p><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/08558e36-d667-4160-bfec-b754c78a7d85/%E1%84%87%E1%85%A1%E1%86%BC%E1%84%86%E1%85%AE%E1%86%AB%E1%84%80%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B53_sootjd.png" title="" alt="방문길이3_sootjd.png"></p>

<ul>
<li>8번 명령어부터 9번 명령어까지 다음과 같이 움직입니다.</li>
</ul>

<p><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/a52af28e-5835-438b-9f40-5467ebf9bf03/%E1%84%87%E1%85%A1%E1%86%BC%E1%84%86%E1%85%AE%E1%86%AB%E1%84%80%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B54_hlpiej.png" title="" alt="방문길이4_hlpiej.png"></p>

<p>이때, 우리는 게임 캐릭터가 지나간 길 중 <strong>캐릭터가 처음 걸어본 길의 길이</strong>를 구하려고 합니다. 예를 들어 위의 예시에서 게임 캐릭터가 움직인 길이는 9이지만, 캐릭터가 처음 걸어본 길의 길이는 7이 됩니다. (8, 9번 명령어에서 움직인 길은 2, 3번 명령어에서 이미 거쳐 간 길입니다)</p>

<p>단, 좌표평면의 경계를 넘어가는 명령어는 무시합니다.</p>

<p>예를 들어, "LULLLLLLU"로 명령했다면</p>

<p><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/f631f005-f8de-4392-a76c-a9ef64b6de08/%E1%84%87%E1%85%A1%E1%86%BC%E1%84%86%E1%85%AE%E1%86%AB%E1%84%80%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B55_nitjwj.png" title="" alt="방문길이5_nitjwj.png"></p>

<ul>
<li>1번 명령어부터 6번 명령어대로 움직인 후, 7, 8번 명령어는 무시합니다. 다시 9번 명령어대로 움직입니다.</li>
</ul>

<p><img src="https://grepp-programmers.s3.ap-northeast-2.amazonaws.com/files/production/35e62f0a-43c6-4142-bec6-6d28fbc57216/%E1%84%87%E1%85%A1%E1%86%BC%E1%84%86%E1%85%AE%E1%86%AB%E1%84%80%E1%85%B5%E1%86%AF%E1%84%8B%E1%85%B56_nzhumd.png" title="" alt="방문길이6_nzhumd.png"></p>

<p>이때 캐릭터가 처음 걸어본 길의 길이는 7이 됩니다.</p>

<p>명령어가 매개변수 dirs로 주어질 때, 게임 캐릭터가 처음 걸어본 길의 길이를 구하여 return 하는 solution 함수를 완성해 주세요.</p>

<h5>제한사항</h5>

<ul>
<li>dirs는 string형으로 주어지며, 'U', 'D', 'R', 'L' 이외에 문자는 주어지지 않습니다.</li>
<li>dirs의 길이는 500 이하의 자연수입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>dirs</th>
<th>answer</th>
</tr>
</thead>
        <tbody><tr>
<td>"ULURRDLLU"</td>
<td>7</td>
</tr>
<tr>
<td>"LULLLLLLU"</td>
<td>7</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1<br>
문제의 예시와 같습니다.</p>

<p>입출력 예 #2<br>
문제의 예시와 같습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges

문제 : https://school.programmers.co.kr/learn/courses/30/lessons/49994

---

내 풀이(오답) / 1시간 도전

```java
class Solution {
    public int solution(String dirs) {
         
        int[][] check = new int[11][11];
        
        int y = 5, x = 5;
        
        check[5][5] = 1;
        
        int cnt = 1;
        
        boolean TF = false;
        
        for(char ch : dirs.toCharArray()) {
            
            if(ch == 'U' && y > 0) {
                check[y-1][x]++;
                cnt++;              
                
                if(check[y-1][x] > 1) {
                    cnt--;
                    TF = true;
                }
                y--;
            }
            else if(ch == 'D' && y < 10) { 
                check[y+1][x]++;
                cnt++;        
                
                if(check[y+1][x] > 1) {
                    cnt--;
                    TF = true;
                }
                y++;
            }
            else if(ch == 'R' && x < 10) {
                check[y][x+1]++;
                cnt++;
                
                if(check[y][x+1] > 1) {
                    cnt--;              
                    TF = true;
                }
                x++;
            }
            else if(ch == 'L' && x > 0) {
                check[y][x-1]++;
                cnt++;
                
                if(check[y][x-1] > 1) {
                    cnt--;                 
                    TF = true;
                }
                x--;
            }
            
        }
        
        if(!(TF)) cnt--;
        
        return cnt;
        
    }
}
```

---

참고 풀이

```java
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    
    private static boolean isValidMove(int nx, int ny) { // 범위 체크
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }
        
    private static final HashMap<Character, int[]> location = new HashMap<>(); // 해시맵. 중요포인트
        
    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }
    
    public int solution(String dirs) {
        initLocation();    
        
        int x = 5, y = 5;
        
        HashSet<String> answer = new HashSet<>(); // 중복을 제거하기 위한 해시셋
        
        for(char ch : dirs.toCharArray()) {
            int[] offset = location.get(ch);
            
            int nx = x + offset[0];
            int ny = y + offset[1];
            
            if(!isValidMove(nx,ny)) continue;

            // A -> B와 B -> A의 경로는 같다.
            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);
            
            x = nx;
            y = ny;
        } 
        
        return answer.size() / 2; // 해시셋의 사이즈 반환
        
        
    }
}
```

중복을 포함하지 않는다는 문장이 나오면 해시셋을 생각하는게 좋다.
&nbsp;

좌표 관점인 원점을 (0,0)에서 배열 관점인 (5,5)로 바꾸는게 좋다.
