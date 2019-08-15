// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(N) {
    // write your code in JavaScript (Node.js 8.9.4)
    var result = 0;
    var counter = 0;
    var isStarted = false;
    while (N != 0) {
        var bit = N % 2;
        N = N >> 1;
        if (bit) {
            if (isStarted) {
                if (result < counter) {
                    result = counter;
                }
                counter = 0;
            } else {
                isStarted = true;
            }
        } else if (isStarted) {
            counter++;
        }
    }
    return result;
}