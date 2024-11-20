# [level 0] 문자열안에 문자열 - 120908 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120908) 

### 성능 요약

메모리: 79.2 MB, 시간: 0.05 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 20일 17:55:52

### 문제 설명

<p>문자열 <code>str1</code>, <code>str2</code>가 매개변수로 주어집니다. <code>str1</code> 안에 <code>str2</code>가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>str1</code>의 길이 ≤ 100</li>
<li>1 ≤ <code>str2</code>의 길이 ≤ 100</li>
<li>문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>str1</th>
<th>str2</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"ab6CDE443fgh22iJKlmn1o"</td>
<td>"6CD"</td>
<td>1</td>
</tr>
<tr>
<td>"ppprrrogrammers"</td>
<td>"pppp"</td>
<td>2</td>
</tr>
<tr>
<td>"AbcAbcA"</td>
<td>"AAA"</td>
<td>2</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>"ab<code>6CD</code>E443fgh22iJKlmn1o" <code>str1</code>에 <code>str2</code>가 존재하므로 1을 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>"ppprrrogrammers" <code>str1</code>에 <code>str2</code>가 없으므로 2를 return합니다.</li>
</ul>

<p>입출력 예 #3</p>

<ul>
<li>"AbcAbcA" <code>str1</code>에 <code>str2</code>가 없으므로 2를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>

---

첫번째 풀이, contains 메서드 이용

```java
class Solution {
    public int solution(String str1, String str2) {

        return str1.contains(str2) ? 1 : 2;
    }
}
```

--

두번째 풀이, 직접 구현

```java
class Solution {
    public int solution(String str1, String str2) {
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();                
        
        for(int i=0; i<=str1.length() - str2.length(); i++) { // 반복을 돌아야하는 횟수 
            boolean TF = true; 
            for(int j=0; j<str2.length(); j++) { 
                if(arr2[j] != arr1[j+i]) { // 핵심 코드
                    TF = false; // 중간에 str2의 문자열이 연속하지 않는다면, false 반환 후 반복문 탈출
                    break;
                }                                                
            }   
            if(TF) return 1; 
        }
        
        return 2; // 순회를 다 돌았는데도 1로 리턴되지 않았다면 리턴2
        
    }
}
```

핵심 코드를 살펴보자.


str2에 "ABCD" 문자열을 입력받았다고 했을때,


arr2[j]는 arr[0], arr[1], arr[2], arr[3]의 반복을 돈다.

.

arr1[j+i]는 i 값에 따라 값이 달라진다.


i가 0일 때는, arr[0], arr[1], arr[2], arr[3]
i가 1일 때는, arr[1], arr[2], arr[3], arr[4]
i가 2일 때는, arr[2], arr[3], arr[4], arr[5]


이 모든 arr1[j+1]의 요소들은 arr2[j]의 arr[0], arr[1], arr[2], arr[3] 요소들과 각각 비교한다.


