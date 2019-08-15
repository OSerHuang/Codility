// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

function solution(A) {
    // write your code in JavaScript (Node.js 8.9.4)
    var values = new Set();
    for (var i = 0; i < A.length; i++) {
        var value = A[i];
        if (values.has(value)) {
            values.delete(value);
        } else {
            values.add(value);
        }
    }
    var iterator = values.keys();
    return iterator.next().value;
}