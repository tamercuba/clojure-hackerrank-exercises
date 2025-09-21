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
