# [level 0] 짝수는 싫어요 - 120813 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120813) 

### 성능 요약

메모리: 75.7 MB, 시간: 0.09 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 20일 19:27:35

### 문제 설명

<p>정수 <code>n</code>이 매개변수로 주어질 때, <code>n</code> 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>n</code> ≤ 100</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>10</td>
<td>[1, 3, 5, 7, 9]</td>
</tr>
<tr>
<td>15</td>
<td>[1, 3, 5, 7, 9, 11, 13, 15]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 #1</p>

<ul>
<li>10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.</li>
</ul>

<p>입출력 #1</p>

<ul>
<li>15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>
---

첫번째 풀이

```java
class Solution {
    public int[] solution(int n) {
        
        int k = 0;
        
        if(n % 2 == 0) k = (n/2);
        else k = (n/2) + 1;
        
        int[] arr = new int[k];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = 2*i+1;
        }
        
        return arr;
        
    }
}
```

---

두번째 풀이, 삼항 연산자

```java
class Solution {
    public int[] solution(int n) {
                
        int[] arr = new int[n % 2 == 0 ? (n/2) : (n/2) + 1];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = 2*i+1;
        }
        
        return arr;
        
    }
}
```

---

세번째 풀이, 배열리스트 활용

```java
import java.util.ArrayList;

class Solution {
    public ArrayList solution(int n) {
                
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            if(i % 2 != 0) list.add(i);
        }
        
        return list;
        
    }
}
```

