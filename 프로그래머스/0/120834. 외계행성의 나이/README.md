# [level 0] 외계행성의 나이 - 120834 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120834) 

### 성능 요약

메모리: 73.1 MB, 시간: 0.05 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 24일 14:30:20

### 문제 설명

<p>우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 <code>age</code>가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li><code>age</code>는 자연수입니다.</li>
<li><code>age</code> ≤ 1,000</li>
<li>PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>age</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>23</td>
<td>"cd"</td>
</tr>
<tr>
<td>51</td>
<td>"fb"</td>
</tr>
<tr>
<td>100</td>
<td>"baa"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li><code>age</code>가 23이므로 "cd"를 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li><code>age</code>가 51이므로 "fb"를 return합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li><code>age</code>가 100이므로 "baa"를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>
---

첫번째 풀이, 스택

```java
import java.util.Stack;

class Solution {
    public String solution(int age) {
        
        StringBuilder sb = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();
        
        while(age > 0) { // age > 0으로 잡는것 또한 핵심 
            char ch = (char) (age % 10 + 'a');
            
            stack.push(ch);
            
            age /= 10;
        }
        
        while(!(stack.isEmpty())) {
            
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }
}
```

---

두번째 풀이

```java
import java.util.Stack;

class Solution {
    public String solution(int age) {
        
        StringBuilder sb = new StringBuilder();
        
        while(age > 0) {
            
            char ch = (char) (age % 10 + 'a');
            
            age /= 10;
            
            sb.append(ch);
        }
        
        return sb.reverse().toString();

    }
}
```

---

세번째 풀이(참고), 배열 위치 이용

```java
import java.util.Stack;

class Solution {
    public String solution(int age) {
        
        StringBuilder sb = new StringBuilder();
        
        char[] arr = {'a','b','c','d','e','f','g','h','i','j'};
        
        while(age > 0) {
            
            sb.append(arr[age % 10]);
            
            age /= 10;
        }
        
        return sb.reverse().toString();

    }
}
```
