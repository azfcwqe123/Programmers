# [level 0] 특정 문자 제거하기 - 120826 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120826) 

### 성능 요약

메모리: 83.6 MB, 시간: 0.11 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 21일 14:24:38

### 문제 설명

<p>문자열 <code>my_string</code>과 문자 <code>letter</code>이 매개변수로 주어집니다. <code>my_string</code>에서 <code>letter</code>를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>my_string</code>의 길이 ≤ 100</li>
<li><code>letter</code>은 길이가 1인 영문자입니다.</li>
<li><code>my_string</code>과 <code>letter</code>은 알파벳 대소문자로 이루어져 있습니다.</li>
<li>대문자와 소문자를 구분합니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>letter</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"abcdef"</td>
<td>"f"</td>
<td>"abcde"</td>
</tr>
<tr>
<td>"BCBdbe"</td>
<td>"B"</td>
<td>"Cdbe"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"abcdef" 에서 "f"를 제거한 "abcde"를 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>"BCBdbe" 에서 "B"를 모두 제거한 "Cdbe"를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>
---

첫번째 풀이, replaceAll()

```java
class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
    }
}
```
replace(letter,"");로 해도 무관하다.

---

두번째 풀이, 직접 구현

```java
class Solution {
    public String solution(String my_string, String letter) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++) {
            
            if(my_string.charAt(i) != letter.charAt(0)) sb.append(String.valueOf(my_string.charAt(i)));
                
        }
        
        return sb.toString();
        
    }
}
```
