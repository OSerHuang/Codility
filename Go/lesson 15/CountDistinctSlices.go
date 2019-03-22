package solution

// you can also use imports, for example:
// import "fmt"
// import "os"

// you can write to stdout for debugging purposes, e.g.
// fmt.Println("this is a debug message")

func Solution(M int, A []int) int {
    // write your code in Go 1.4
    res := 0
    set := make([]int, M + 1)
    for i, j := 0, 0; i < len(A); i++ {
        for j < len(A) && set[A[j]] == 0 {
            set[A[j]] = 1
            j++
        }
        res += j - i
        if res > 1000000000 {return 1000000000}
        set[A[i]] = 0
    }
    return res
}