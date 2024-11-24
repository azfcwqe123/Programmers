# [level 0] 배열 회전시키기 - 120844 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120844) 

### 성능 요약

메모리: 75.6 MB, 시간: 0.02 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 24일 12:54:56

### 문제 설명

<p>정수가 담긴 배열 <code>numbers</code>와 문자열&nbsp;<code>direction</code>가 매개변수로 주어집니다. 배열 <code>numbers</code>의 원소를 <code>direction</code>방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>3 ≤ <code>numbers</code>의 길이 ≤ 20</li>
<li><code>direction</code>은 "left" 와 "right" 둘 중 하나입니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>numbers</th>
<th>direction</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>[1, 2, 3]</td>
<td>"right"</td>
<td>[3, 1, 2]</td>
</tr>
<tr>
<td>[4, 455, 6, 4, -1, 45, 6]</td>
<td>"left"</td>
<td>[455, 6, 4, -1, 45, 6, 4]</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li><code>numbers</code> 가 [1, 2, 3]이고 <code>direction</code>이 "right" 이므로 오른쪽으로 한 칸씩 회전시킨 [3, 1, 2]를 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li><code>numbers</code> 가 [4, 455, 6, 4, -1, 45, 6]이고 <code>direction</code>이 "left" 이므로 왼쪽으로 한 칸씩 회전시킨 [455, 6, 4, -1, 45, 6, 4]를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>
---

내 풀이, 직접 구현

```java
class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        if(direction.equals("left")) {
            
            int tmp = numbers[0]; // 첫번째 배열의 원소를 임시로 저장한다.
            
            for(int i=1; i<numbers.length; i++) {                
                numbers[i-1] = numbers[i];
            } // 한 칸씩 다 왼쪽으로 밀어버린다.
            
            numbers[numbers.length - 1] = tmp; // 마지막 배열의 원소에 tmp을 대입한다.
            
        } else if(direction.equals("right")) {
            
            int tmp = numbers[numbers.length - 1]; // 마지막 배열의 원소를 임시로 저장한다.
            
            for(int i=numbers.length-2; i>=0; i--) { // 한 칸씩 다 오른쪽으로 밀어버린다.
                numbers[i+1] = numbers[i];
            }
            
            numbers[0] = tmp; // 첫번쨰 배열의 원소에 tmp을 대입한다.
        }
        
        return numbers;
    }
}
```

Arrays.copy()을 사용하는것도 생각해봤지만, 배열 복사는 특정 범위만큼 복사하기에 할 엄두가 안 났다. 자바에서 배열의 크기는 임의로 늘릴 수 없기 때문이다.
