# Just some clojure hacker rank solves

> My solutions are probably terrible, please dont look at it im just studying

## [Prepare > Functional Programming > Introduction > Compute the Perimeter of a Polygon](src/perimeter.clj)

You are given the cartesian coordinates of a set of points in a `2D` plane. When traversed sequentially, these points form a Polygon, `P` , which is not self-intersecting in nature. Can you compute the perimeter of polygon `P`?

#### Input Format

The first line contains an integer, `N`, denoting the number of points.
The `N` subsequent lines each contain `2` space-separated integers denoting the respective `x` and `y` coordinates of a point.

#### Constraints

- No `2` points are coincident, and polygon `P` is obtained by traversing the points in a clockwise direction.
- `3 <= N <= 1000`
- `0 <= x,y <= 1000`

#### Output Format

For each test case, print the perimeter of `P` (correct to a scale of one decimal place).
**Note**: Do not add any leading/trailing spaces or units.

#### Sample Input
```
4
0 0
0 1  
1 1  
1 0
```

#### Sample Output
```
4
```

#### Explanation

The given polygon is a square, and each of its sides are 1 unit in length. 
`perimeter(P) = 1 + 1 + 1 + 1 = 4`, so we print on a new line.

## [Prepare > Functional Programming > Introduction > Functions or Not?](src/is_function.clj)

### Objective
In this problem, we touch upon a basic concept that is fundamental to Functional Programming: identifying a relation which represents a valid function.

### Task
You are given a set of unique `(x,y)` ordered pairs constituting a relation. The `x`-values form the domain, and the `x`-values form the range to which they map. For each of these relations, identify whether they may possibly represent a valid function or not.

**Note**: You do not have to find the actual function, you just need to determine that the relation may be representative of some valid function.

### Input Format

The first line contains an integer, `T`, denoting the number of test cases. The subsequent lines describe `T` test cases, and the input for each test case is as follows:

1. The first line contains an integer, `N`, the number of `(x,y)` pairs in the test case.
2. The `N` subsequent lines each contain two space-separated integers describing the respective `x` and `y` values for each ordered pair.

### Constraints
- `1 <= T <= 5`
- `2 <= N <= 100`
- `0 <= x,y <= 500`
- `x` and `y` are both integers.

### Output Format

On a new line for each test case, print `YES` if the set of ordered pairs represent a valid function, or `NO` if they do not.

### Sample Input 

```
2  
3  
1 1  
2 2  
3 3  
4
1 2
2 4
3 6  
4 8  
```

### Sample Output

```
YES  
YES
```

### Explanation

Test Case 0:
`N = 3`, Ordered Pairs: `(1,1),(2,2),(3,3)` The set of ordered pairs represents a relation, which could represent a function such as `f: N -> N`, `f(x)=x`. Thus, we print `YES` on a new line.

Test Case 1:
`N = 4`, Ordered Pairs: `(1,2),(2,4),(3,6),(4,8)` The set of ordered pairs represents a relation, which could represent a function such as `f: N -> N`, `f(x)=2x`. Thus, we print `YES` on a new line.

