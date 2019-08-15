// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(A, K) {
    // write your code in JavaScript (Node.js 8.9.4)
    K = K % A.length;
    return A.slice(A.length - K).concat(A.slice(0, A.length - K));
}