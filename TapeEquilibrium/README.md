# O(N<sup>2</sup>) time, O(1) Space

For each `P` obtain the sum of the integers by iterating over numbers in both ranges (A<sub>i</sub> < P, and A<sub>i</sub> >= P).

# O(N) time, O(1) Space

We can enhance the above solution by starting with initial values for both of the sums (pre and post `P`), then adjusting them while iterating over the input array `A` just once.
That is:

```
prePSum = A[0];
postPSum = sum(A) - prePSum;

for p in range(1, A.length) {
  /*do difference logic*/
  prePSum += A[p];
  postPSum -= A[p];
}
```