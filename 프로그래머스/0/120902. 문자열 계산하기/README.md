# [level 0] 문자열 계산하기 - 120902 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120902) 

### 성능 요약

메모리: 82.1 MB, 시간: 0.28 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 26일 16:23:33

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

배열 풀이

```java
class Solution {
    public int solution(String my_string) {
        
        String[] s = my_string.split(" ");
        
        int sum = Integer.parseInt(s[0]);
        
        for(int i=1; i<s.length; i++) {
            
            if(s[i].equals("+")) {
                sum += Integer.parseInt(s[i+1]);
                i++;
            } 
            
            else if(s[i].equals("-")) {
                sum -= Integer.parseInt(s[i+1]);
                i++;
            }       
            
        }
        
        return sum;
        
    }
}
```

---

스택 풀이, 배열로 푸는게 훨 낫다.

```java
import java.util.Stack;

class Solution {
    public int solution(String my_string) {
        
        String[] s = my_string.split(" ");
        
        Stack<String> stack = new Stack<>();
        
        int sum = 0;
        
        stack.push(s[0]);
            
        for(int i=1; i<s.length; i+=2) {
            
            if(s[i].equals("+")) {                
                sum = Integer.parseInt(stack.pop()) + Integer.parseInt(s[i+1]);
                stack.push(String.valueOf(sum));
            }
            
            else if(s[i].equals("-")) {
                sum = Integer.parseInt(stack.pop()) - Integer.parseInt(s[i+1]);
                stack.push(String.valueOf(sum));
            }            
        }
        
        return Integer.parseInt(stack.pop());
        
    }
}
```

---

## 그림 설명

![sadsadsa](https://github.com/user-attachments/assets/b2a70ead-42ca-40af-b327-c3e84cf713bd)
