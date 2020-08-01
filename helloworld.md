
# 我来教你写 "Hello World"

<br>

| 排行 | 编成语言 | 使用占比 | 编译类型 | 解释类型 |
|---:|---|---:|:---:|:---:|
| 1 | JavaSript | 70% || √ |
| 2 | Python | 55% || √ |
| 3 | Java | 54% || √ |
| 4 | TypeScript | 28% || √ |
| 5 | C++ | 27% | √ ||
| 6 | PHP | 27% || √ |
| 7 | C | 23% | √ ||
| 8 | C# | 22% | √ ||
| 9 | Go | 19% | √ ||
| 10 | Kotlin | 17% || √ |
| 11 | Dart | 9% || √ |
| 12 | Swift | 9% |||
| 13 | Ruby | 8% || √ |
| 14 | Rust | 7% | √ ||
| 15 | R | 5% || √ |
| 16 | Scala | 5% || √ |
| 17 | VisualBasic | 5% | √ ||
| 18 | Groovy | 4% || √ |
| 19 | Objective-C | 4% |||
| 20 | Lua | 3% || √ |

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
// 编译: gcc main.c -o main

#include <stdio.h>
#include <stdlib.h>

char *Hello(char *s) {
    char *str = (char *) malloc(0);
    sprintf(str, "%s%s", "Hello ", s);
    return str;
}

int main() {
    char *str = Hello("World");
    printf("%s\n", str);
    return 0;
}
```

## C#

```cs
// 编译: dotnet build -o bin

using System;

namespace main
{
    class Program
    {
        static string Hello(string s)
        {
            return "Hello " + s;
        }

        static void Main(string[] args)
        {
            string str = Hello("World");
            Console.WriteLine(str);
        }
    }
}
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
// 编译: kotlinc-native main.kt -o main

fun Hello(s: String): String {
    return "Hello $s"
}

fun main() {
    val str = Hello("World")
    println(str)
}
```

## Dart

```dart
// 解释执行: dart main.dart

String Hello(String s) {
  return "Hello " + s;
}

void main() {
  var str = Hello("World");
  print(str);
}
```

## Swift

## Ruby

```ruby
# 解释执行: ruby main.ru

def Hello(s)
    puts "Hello " + s
end

def __main_()
    str = Hello("World")
    puts str
end

__main_()
```

## Rust

```rust
// 编译: cargo build

fn hello(s: String) -> String {
    return "Hello ".to_string() + &s;
}

fn main() {
    let str = hello("World".to_string());
    println!("{}", str.to_string());
}
```

## R

```r
# 解释执行: Rscript main.r

Hello <- function(s) {
    r = paste("Hello ", s)
    return(r)
}

main <- function() {
    str = Hello("World")
    print(str)
}

main()
```

## Scala

```scala
// 编译: scalac main.scala
// 解释执行: scala main

object main {
  def Hello(s: String): String = {
    "Hello " + s
  }

  def main(args: Array[String]) {
    val str = Hello("World")
    println(str)
  }
}
```

## VisualBasic

```vb
' 编译: dotnet build -o bin

Imports System

Module Program
    Public Function Hello(s As String) As String
        Return "Hello " + s
    End Function

    Sub Main(args As String())
        Dim str = Hello("World")
        Console.WriteLine(str)
    End Sub
End Module
```

## Groovy

```groovy
// 解释执行: groovy main.groovy

String Hello(s) {
    return "Hello " + s
}

def __main_() {
    def str = Hello("World")
    printf "%s\n", str
}

__main_()
```

## Objective-C

## Lua

```lua
-- 解释执行: lua main.lua

function Hello(s)
    return "Hello " .. s
end

function __main_()
    local str = Hello("World")
    print(str)   
end

__main_()
```
