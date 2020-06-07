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

	a := make([]int, n)
	b := make([]int, n)
	c := make([]int, n)

	for i := 0; i < n; i++ {
		a[i] = nextInt()
		b[i] = nextInt()
		c[i] = nextInt()
	}

	dp := make([][]int, n)
	for i := 0; i < n; i++ {
		dp[i] = make([]int, 3)
		dp[i][0] = -1
		dp[i][1] = -1
		dp[i][2] = -1
	}

	// 1日目の幸福度を初期値として入れる
	dp[0][0] = a[0]
	dp[0][1] = b[0]
	dp[0][2] = c[0]

	for i := 1; i < n; i++ {
		// 行動Aを選ぶ場合
		dp[i][0] = int(math.Max(float64(dp[i-1][1]), float64(dp[i-1][2]))) + a[i]
		// 行動Bを選ぶ場合
		dp[i][1] = int(math.Max(float64(dp[i-1][0]), float64(dp[i-1][2]))) + b[i]
		// 行動Cを選ぶ場合
		dp[i][2] = int(math.Max(float64(dp[i-1][0]), float64(dp[i-1][1]))) + c[i]
	}

	ans := int(math.Max(float64(dp[n-1][0]), float64(dp[n-1][1])))
	ans = int(math.Max(float64(ans), float64(dp[n-1][2])))
	fmt.Println(ans)
}
