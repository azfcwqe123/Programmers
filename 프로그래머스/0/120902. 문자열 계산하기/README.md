# [level 0] 문자열 계산하기 - 120902 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120902) 

### 성능 요약

메모리: 76 MB, 시간: 0.14 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 26일 16:08:48

### 문제 설명

<p><code>my_string</code>은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 <code>my_string</code>이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>연산자는 +, -만 존재합니다.</li>
<li>문자열의 시작과 끝에는 공백이 없습니다.</li>
<li>0으로 시작하는 숫자는 주어지지 않습니다.</li>
<li>잘못된 수식은 주어지지 않습니다.</li>
<li>5 ≤ <code>my_string</code>의 길이 ≤ 100</li>
<li><code>my_string</code>을&nbsp;계산한 결과값은 1 이상 100,000 이하입니다.

<ul>
<li><code>my_string</code>의 중간 계산 값은 -100,000 이상 100,000 이하입니다.</li>
<li>계산에 사용하는 숫자는 1 이상 20,000 이하인 자연수입니다.</li>
<li><code>my_string</code>에는 연산자가 적어도 하나 포함되어 있습니다.</li>
</ul></li>
<li>return type 은 정수형입니다.</li>
<li><code>my_string</code>의 숫자와 연산자는 공백 하나로 구분되어 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>my_string</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>"3 + 4"</td>
<td>7</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>3 + 4 = 7을 return 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>

---

split() 사용

```java
class Solution {
    public int solution(String my_string) {
        
        String[] s = my_string.split(" ");
        
        int sum = Integer.parseInt(s[0]);
        
        for(int i=1; i<s.length; i+=2) {
            
            if(s[i].equals("+")) {
                sum += Integer.parseInt(s[i+1]);
            } 
            
            else if(s[i].equals("-")) {
                sum -= Integer.parseInt(s[i+1]);
            }       
            
        }
        
        return sum;
        
    }
}
```

예를 들어,

"3 + 47 - 20 + 300" 이런 식으로 문자열이 주어졌다고 했을 때, split(" ") 메서드를 사용하면
&nbsp;

|3|+|47|-|20|+|300|
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|0|1|2|3|4|5|6|

이런 배열이 생성될 것이다.

그 후, 맨 앞에는 '+'나 '-'가 나올 수 없고 숫자만 나올테니, sum 총합에 첫번째 요소를 먼저 넣어놓는다.
&nbsp;

그 다음, 인덱스가 홀수 규칙으로 순회를 할텐데, 배열 인덱스에 해당하는 요소가 '+'인지 '-'인지 판단한 후, 앞에 있는 요소를 계산한다.

