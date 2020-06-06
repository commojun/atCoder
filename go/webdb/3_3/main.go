package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
)

var sc = bufio.NewScanner(os.Stdin)

func nextInt() int {
	sc.Scan()
	i, e := strconv.Atoi(sc.Text())
	if e != nil {
		panic(e)
	}
	return i
}

func main() {
	sc.Split(bufio.ScanWords)

	n := nextInt()
	// 2次元スライスに情報をつめる
	a := make([][]int, n)
	for i := 0; i < n; i++ {
		a[i] = make([]int, n)
		for j := i + 1; j < n; j++ {
			a[i][j] = nextInt()
		}
	}

	fmt.Println(dfs(1, make([]int, n), n, a))
}

// d人目までが所属するグループが決まっている場合、達成可能な最大数を返す
func dfs(d int, group []int, n int, a [][]int) int {
	if d == n {
		// Nパターン全部決まったら点数を計算する
		point := 0
		for i := 0; i < n; i++ {
			for j := i + 1; j < n; j++ {
				// i, jの全ペアを列挙し、一致したらポイントを加算する
				if group[i] == group[j] {
					point += a[i][j]
				}
			}
		}
		return point
	} else {
		// d番目の人のグループを決める
		ans := math.MinInt32
		for i := 0; i < 3; i++ {
			group[d] = i
			ans = int(math.Max(float64(ans), float64(dfs(d+1, group, n, a))))
		}
		return ans
	}
}
