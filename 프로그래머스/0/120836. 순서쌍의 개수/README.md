# [level 0] 순서쌍의 개수 - 120836 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120836) 

### 성능 요약

메모리: 77 MB, 시간: 4.94 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 20일 17:50:06

### 문제 설명

<p>순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 자연수 <code>n</code>이 매개변수로 주어질 때 두 숫자의 곱이 <code>n</code>인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ n ≤ 1,000,000</li>
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
<td>20</td>
<td>6</td>
</tr>
<tr>
<td>100</td>
<td>9</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li><code>n</code>이 20 이므로 곱이 20인 순서쌍은 (1, 20), (2, 10), (4, 5), (5, 4), (10, 2), (20, 1) 이므로 6을 return합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li><code>n</code>이 100 이므로 곱이 100인 순서쌍은 (1, 100), (2, 50), (4, 25), (5, 20), (10, 10), (20, 5), (25, 4), (50, 2), (100, 1) 이므로 9를 return합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>
---

첫번째 풀이, 지수의 곱을 이용해서 약수의 개수를 구하는 공식

```java
class Solution {
    public int solution(int n) {
        
        int[] check = new int[n+1];
        int sum = 1;
        
        for(int i=2; i<=n; i++) { // 2부터 n까지의 숫자를 모두 약수로 돌려본다.
            
            while(true) {
                 
                if(n % i != 0) break;  // 만약 약수 i로 더이상 나눠지지 않는다면, 다음 약수로 넘어간다.
                
                n /= i;
                
                check[i]++; // 약수의 자리에 몇번 나왔는지 체크한다.
            }
            
            if(check[i] != 0) { // 지수끼리 곱해서 약수의 개수를 구하는 공식을 사용한다.
                sum *= (check[i] + 1);
            }            
        }
   
        return sum;
    }
}
```

---

두번째 풀이, 간단하게 생각하기

```java
class Solution {
    public int solution(int n) {
        
        int ans = 0;
        
        for(int i=1; i<=n; i++) {
            if(n % i == 0) ans++;
        }
        
        return ans;
        
    }
}
```

1부터 n까지 나눠지는 숫자의 개수만 구해도 순서쌍의 개수를 구할 수 있다. 첫번째 풀이는 필요 이상으로 복잡하게 풀었다는 점을 명시하자.
