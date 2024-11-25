# [level 0] 모스부호 (1) - 120838 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/120838) 

### 성능 요약

메모리: 76.2 MB, 시간: 0.21 ms

### 구분

코딩테스트 연습 > 코딩테스트 입문

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 11월 25일 12:36:02

### 문제 설명

<p>머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 <code>letter</code>가 매개변수로 주어질 때, <code>letter</code>를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.<br>
모스부호는 다음과 같습니다.</p>
<div class="highlight"><pre class="codehilite"><code>morse = { 
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
}
</code></pre></div>
<hr>

<h5>제한사항</h5>

<ul>
<li>1 ≤ <code>letter</code>의 길이 ≤ 1,000</li>
<li>return값은 소문자입니다.</li>
<li><code>letter</code>의 모스부호는 공백으로 나누어져 있습니다.</li>
<li><code>letter</code>에 공백은 연속으로 두 개 이상 존재하지 않습니다.</li>
<li>해독할 수 없는 편지는 주어지지 않습니다.</li>
<li>편지의 시작과 끝에는 공백이 없습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>letter</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>".... . .-.. .-.. ---"</td>
<td>"hello"</td>
</tr>
<tr>
<td>".--. -.-- - .... --- -."</td>
<td>"python"</td>
</tr>
</tbody>
      </table>
<hr>

<h5>입출력 예 설명</h5>

<p>입출력 예 #1</p>

<ul>
<li>.... = h</li>
<li>. = e</li>
<li>.-.. = l</li>
<li>.-.. = l</li>
<li>--- = o</li>
<li>따라서 "hello"를 return 합니다.</li>
</ul>

<p>입출력 예 #2</p>

<ul>
<li>.--. = p</li>
<li>-.-- = y</li>
<li>- = t</li>
<li>.... = h</li>
<li>--- = o</li>
<li>-. = n</li>
<li>따라서 "python"을 return 합니다.</li>
</ul>

<hr>

<ul>
<li>a ~ z에 해당하는 모스부호가 순서대로 담긴 배열입니다.</li>
<li><code>{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}</code></li>
</ul>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
>
---

첫번째 풀이, 해시맵 0.2ms ~ 0.4ms

```java
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        
        StringBuilder sb = new StringBuilder();
        
        HashMap<String, Character> map = new HashMap<>();
        
        map.put(".-", 'a');
        map.put("-...", 'b');
        map.put("-.-.", 'c');
        map.put("-..", 'd');
        map.put(".", 'e');
        map.put("..-.", 'f');
        map.put("--.", 'g');
        map.put("....", 'h');
        map.put("..", 'i');
        map.put(".---", 'j');
        map.put("-.-", 'k');
        map.put(".-..", 'l');
        map.put("--", 'm');
        map.put("-.", 'n');
        map.put("---", 'o');
        map.put(".--.", 'p');
        map.put("--.-", 'q');
        map.put(".-.", 'r');
        map.put("...", 's');
        map.put("-", 't');
        map.put("..-", 'u');
        map.put("...-", 'v');
        map.put(".--", 'w');
        map.put("-..-", 'x');
        map.put("-.--", 'y');
        map.put("--..", 'z');
            
        String[] arr = letter.split(" ");
        
        for(String x : arr) {
            
            sb.append(map.get(x));
        }
        
        return sb.toString();
    }
}
```

---

두번째 풀이, 해시맵 수정, 0.2ms ~ 0.4ms

```java
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        
        StringBuilder sb = new StringBuilder();
        
        HashMap<String, Character> map = new HashMap<>() {
            {
            put(".-", 'a');
            put("-...", 'b');
            put("-.-.", 'c');
            put("-..", 'd');
            put(".", 'e');
            put("..-.", 'f');
            put("--.", 'g');
            put("....", 'h');
            put("..", 'i');
            put(".---", 'j');
            put("-.-", 'k');
            put(".-..", 'l');
            put("--", 'm');
            put("-.", 'n');
            put("---", 'o');
            put(".--.", 'p');
            put("--.-", 'q');
            put(".-.", 'r');
            put("...", 's');
            put("-", 't');
            put("..-", 'u');
            put("...-", 'v');
            put(".--", 'w');
            put("-..-", 'x');
            put("-.--", 'y');
            put("--..", 'z');
            }
            
        };
        
            
        String[] arr = letter.split(" ");
        
        for(String x : arr) {
            
            sb.append(map.get(x));
        }
        
        return sb.toString();
    }
}
```

---

세번째 풀이, 배열, 0.1ms ~ 0.2ms

```java
class Solution {
    public String solution(String letter) {
        
        String[] arr = {".-", "-...", "-.-.", "-..", ".", "..-.",
                       "--.", "....", "..", ".---", "-.-", ".-..", 
                       "--", "-.", "---", ".--.", "--.-", ".-.",
                       "...", "-", "..-", "...-", ".--", "-..-",
                       "-.--", "--.."};
        
        String[] mos = letter.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<mos.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(mos[i].equals(arr[j])) sb.append((char) (j + 'a'));
            }    
        }
        
        return sb.toString();
        
    }
}
```

---

# 정리

> 두 개로 짝 지어진 케이스가 있을 경우, 해시맵을 생각하면 좋다. 배열도 아스키코드값을 이용하여 짝지을 수도 있긴 하다.
