# [level 0] 제곱수 판별하기 - 120909 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120909) 

### 성능 요약

메모리: 77.2 MB, 시간: 0.06 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 19일 22:43:11

### 문제 설명

<p>어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 <code>n</code>이 매개변수로 주어질 때, <code>n</code>이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>n</code> ≤ 1,000,000</li>
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
<td>144</td>
<td>1</td>
</tr>
<tr>
<td>976</td>
<td>2</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>144는 12의 제곱이므로 제곱수입니다. 따라서 1을 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>976은 제곱수가 아닙니다. 따라서 2를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>
---

```java

class Solution {
    public int solution(int n) {
        
        return (Math.sqrt(n) % 1) == 0 ? 1 : 2; 
    }
}
```

정수 판별법
- 숫자를 1로 나눴을때, 나머지가 0이면 정수, 아니라면 소수.

ex) 2 % 1 = 0

ex) 2.123 % 1 = 0.123
