package solution

// you can also use imports, for example:
// import "fmt"
// import "os"

// you can write to stdout for debugging purposes, e.g.
// fmt.Println("this is a debug message")

func Solution(A []int) int {
    // write your code in Go 1.4
    for i := 0; i < len(A); i++ {
        if A[i] < 0 {
            A[i] *= -1
        }
    }
    res := 0
    i, j := 0, len(A) - 1
    pre := -1
    for i <= j {
        if A[i] <= A[j] {
            if A[j] != pre {
                pre = A[j]
                res++
            }
            j--
        } else {
            if A[i] != pre {
                pre = A[i]
                res++
            }
            i++
        }
    }
    return res
}