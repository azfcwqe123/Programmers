# [level 0] A로 B 만들기 - 120886 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120886) 

### 성능 요약

메모리: 72.2 MB, 시간: 1.03 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 25일 18:48:28

### 문제 설명

<p>문자열 <code>before</code>와 <code>after</code>가 매개변수로 주어질 때, <code>before</code>의 순서를 바꾸어 <code>after</code>를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>0 &lt; <code>before</code>의 길이 == <code>after</code>의 길이 &lt; 1,000</li>
<li><code>before</code>와 <code>after</code>는 모두 소문자로 이루어져 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>before</th>
<th>after</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"olleh"</td>
<td>"hello"</td>
<td>1</td>
</tr>
<tr>
<td>"allpe"</td>
<td>"apple"</td>
<td>0</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>"allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>

---

첫번째 풀이

```java
import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(char x : before.toCharArray()) {
            arr1[x - 'a']++;
        }
        
        for(char x : after.toCharArray()) {
            arr2[x - 'a']++;
        }
        
        return Arrays.equals(arr1,arr2) ? 1 : 0;
    }
}
```

---

두번째 풀이 (참고)

```java
import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        return Arrays.equals(arr1,arr2) ? 1 : 0;
    }
}
```
