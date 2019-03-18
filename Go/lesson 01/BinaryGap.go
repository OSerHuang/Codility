package solution

// you can also use imports, for example:
// import "fmt"
// import "os"

// you can write to stdout for debugging purposes, e.g.
// fmt.Println("this is a debug message")

func Solution(N int) int {
    // write your code in Go 1.4
    res := 0
    isStarted := false
    temp := 0
    for ; N != 0; N >>= 1 {
        if !isStarted {
            if N % 2 == 1 {
                isStarted = true
            }
        } else {
            if N % 2 == 1 {
                if temp > res {
                    res = temp
                }
                temp = 0
            } else {
                temp++
            }
        }
    }
    return res
}