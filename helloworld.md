
# 我来教你写 "Hello World"

<br>

| 排行 | 语言 | 占比 | 编译类型 | 解释类型 |
|---:|---|---:|:---:|:---:|---|
| 1 | JavaSript | 70% || √ |
| 2 | Python | 55% || √ |
| 3 | Java | 54% || √ |
| 4 | TypeScript | 28% || √ |
| 5 | C++ | 27% | √ ||
| 6 | PHP | 27% || √ |
| 7 | C | 23% | √ ||
| 8 | C# | 22% || √ |
| 9 | Go | 19% | √ ||
| 10 | Kotlin | 17% | √ | √ |
| 11 | Dart | 9% |||
| 12 | Swift | 9% |||
| 13 | Ruby | 8% || √ |
| 14 | Rust | 7% | √ ||
| 15 | Matlab | 5% |||
| 16 | R | 5% ||| null |
| 17 | Scala | 5% || √ |
| 18 | VisualBasic | 5% |||
| 19 | Groovy | 4% || √ |
| 20 | Objective-C | 4% | √ ||

<br>

## JavaSript

```js
// 解释执行: node main.js

function Hello(s) {
    return `Hello ${s}`
}

function __main_() {
    let str = Hello("World")
    console.log(str)
}

__main_()
```

## Python

```python
# 解释执行: python main.py

def Hello(s):
    return "Hello " + s

if __name__ == "__main__":
    str = Hello("World")
    print(str)
```

## Java

```java
// 解释执行: java main.java

public class Main
{
    public static String Hello(String s) {
        return "Hello " + s;
    }

    public static void main(String[] args) {
        String str = Hello("World");
        System.out.printf("%s\n", str);
    }
}
```

## TypeScript

```ts
// 解释执行: tsc main.ts

function Hello(s: string) {
    return `Hello ${s}`
}

function __main_() {
    let str: string = Hello("World")
    console.log(str)
}

__main_()
```

## C++

```cpp
// 编译: g++ main.cpp -o main

#include <iostream>

std::string Hello(std::string s) {
    return "Hello " + s;
}

int main() {
    std::string str = Hello("World");
    std::cout << str << "\n";
    return 0;
}
```

## PHP

```php
// 解释执行: php main.php

<?php
function Hello($s) {
    return "Hello " . $s;
}

function __main_() {
    $str = Hello("World");
    echo $str;
    echo "\n";
}

__main_();
```

## C

```c
// 编译:
```

## C#

```
```

## Go

```go
// 编译: go build -o main

package main

import "fmt"

func Hello(s string) string {
    return "Hello " + s
}

func main() {
    str := Hello("World")
    fmt.Printf("%s\n", str)
}
```

## Kotlin

```kotlin
fun Hello(s: String): String {
    return "Hello $s"
}

fun main() {
    val str = Hello("World")
    println(str)
}
```
