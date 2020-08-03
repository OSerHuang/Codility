// you can use includes, for example:
// #include <algorithm>

// you can write to stdout for debugging purposes, e.g.
// cout << "this is a debug message" << endl;

int solution(int N) {
    // write your code in C++14 (g++ 6.2.0)
    bool started = false;
    int temp = 0;
    int res = 0;
    while (N) {
        if (N % 2) {
            if (started) {
                if (temp > res) {
                    res = temp;
                }
                temp = 0;
            } else {
                started = true;
            }
        } else {
            if (started) {
                ++temp;
            }
        }
        N >>= 1;
    }
    return res;
}
