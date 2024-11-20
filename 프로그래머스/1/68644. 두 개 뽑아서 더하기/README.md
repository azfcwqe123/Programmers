# [level 1] 두 개 뽑아서 더하기 - 68644 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/68644) 

### 성능 요약

메모리: 76.8 MB, 시간: 3.59 ms

### 구분

코딩테스트 연습 > 월간 코드 챌린지 시즌1

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 20일 20:50:44

### 문제 설명

<p>정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.</p>

<hr>

<h5>제한사항</h5>

<ul>
<li>numbers의 길이는 2 이상 100 이하입니다.

<ul>
<li>numbers의 모든 수는 0 이상 100 이하입니다.</li>
</ul></li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>numbers</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td><code>[2,1,3,4,1]</code></td>
<td><code>[2,3,4,5,6,7]</code></td>
</tr>
<tr>
<td><code>[5,0,2,7]</code></td>
<td><code>[2,5,7,9,12]</code></td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)</li>
<li>3 = 2 + 1 입니다.</li>
<li>4 = 1 + 3 입니다.</li>
<li>5 = 1 + 4 = 2 + 3 입니다.</li>
<li>6 = 2 + 4 입니다.</li>
<li>7 = 3 + 4 입니다.</li>
<li>따라서 <code>[2,3,4,5,6,7]</code> 을 return 해야 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>2 = 0 + 2 입니다.</li>
<li>5 = 5 + 0 입니다.</li>
<li>7 = 0 + 7 = 5 + 2 입니다.</li>
<li>9 = 2 + 7 입니다.</li>
<li>12 = 5 + 7 입니다.</li>
<li>따라서 <code>[2,5,7,9,12]</code> 를 return 해야 합니다.</li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>
---

첫번쨰 풀이 HashSet + 배열

```java
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>(); // 중복 제거를 해주는 해시셋을 이용한다.
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                set.add(arr[i] + arr[j]);
            }    
        }
        
        int[] arr2 = new int[set.size()];
        
        Iterator<Integer> iter = set.iterator(); // Iterator을 이용해 해시셋에 있는 요소들을 반환할 준비를 한다.
        
        int i = 0;
        while(iter.hasNext()) {
            arr2[i] = iter.next();
            i++;
        }
        
        Arrays.sort(arr2); // 마지막엔 문제의 조건에 맞게 오름차순 정렬을 해준다.
        
        return arr2;
        
    }
}
```

---

두번째 풀이, 해시셋 + 배열리스트
```java
import java.util.*;

class Solution {
    public ArrayList solution(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                set.add(arr[i] + arr[j]);
            }    
        }
        
        Iterator<Integer> iter = set.iterator();
        
        while(iter.hasNext()) {
            list.add(iter.next());
        }
        
        Collections.sort(list);
        
        return list;
        
    }
}
```

---

세번째 풀이, 트리셋 + 배열리스트

```java
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] arr) {
        
        Set<Integer> set = new TreeSet<>(); // 중복 제거와 정렬을 해주는 트리셋을 이용한다.
        ArrayList<Integer> list = new ArrayList<>(); 
        
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                set.add(arr[i] + arr[j]);
            }    
        }
        
        Iterator<Integer> iter = set.iterator();
        
        while(iter.hasNext()) {
            list.add(iter.next());
        }
        
        return list;
        
    }
}
```

---

네번째 풀이, 트리셋 + 스트림

```java
import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int[] solution(int[] arr) {
        
        Set<Integer> set = new TreeSet<>();
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                set.add(arr[i] + arr[j]);
            }    
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray(); // 트리셋도 스트림을 이용해 배열로 변환할 수 있다.
        
    }
}
```
