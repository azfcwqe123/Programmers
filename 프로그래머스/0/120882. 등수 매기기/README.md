# [level 0] 등수 매기기 - 120882 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120882) 

### 성능 요약

메모리: 80.7 MB, 시간: 0.36 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 29일 19:26:23

### 문제 설명

<p>영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열 <code>score</code>가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>0 ≤ <code>score</code>[0], <code>score</code>[1] ≤ 100</li>
<li>1 ≤ <code>score</code>의 길이 ≤ 10</li>
<li><code>score</code>의 원소 길이는 2입니다.</li>
<li><code>score</code>는 중복된 원소를 갖지 않습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>score</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[[80, 70], [90, 50], [40, 70], [50, 80]]</td>
<td>[1, 2, 4, 3]</td>
</tr>
<tr>
<td>[[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]</td>
<td>[4, 4, 6, 2, 2, 1, 7]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>평균은 각각 75, 70, 55, 65 이므로 등수를 매겨 [1, 2, 4, 3]을 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>평균은 각각 75, 75, 40, 95, 95, 100, 20 이므로 [4, 4, 6, 2, 2, 1, 7] 을 return합니다.</li>
<li>공동 2등이 두 명, 공동 4등이 2명 이므로 3등과 5등은 없습니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>

---

내 풀이

```java
class Solution {
    public int[] solution(int[][] score) {
        
        int[] arr = new int[score.length];
        
        for(int i=0; i<score.length; i++) {
            arr[i] += score[i][0] + score[i][1];
        }
        
        
        int[] res = new int[arr.length];
        
        for(int i=0; i<arr.length; i++) {      
            
            res[i]++;
            
            for(int j=0; j<arr.length; j++) {
                if(arr[i] < arr[j]) res[i]++;
            }
            
        }
        
        return res;
        
    }
}
```

---

참고 풀이, 배열리스트로 내림차순으로 만든뒤, indexOf()을 활용한다.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(int[][] score) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int[] t : score) {
            list.add(t[0] + t[1]);    
        }
        
        //Collections.sort(list, Comparator.reverseOrder());
        list.sort(Comparator.reverseOrder());
        
        int[] ans = new int[score.length];
        
        for(int i=0; i<score.length; i++) {
            ans[i] = list.indexOf(score[i][0] + score[i][1]) + 1;    
        }
        
        return ans;
        
        
    }
}
```

참고: https://school.programmers.co.kr/learn/courses/30/lessons/120882/solution_groups?language=java


