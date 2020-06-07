package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
)

var n int
var a, b, c []int
var dp [][]int

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

	n = nextInt()

	a = make([]int, n)
	b = make([]int, n)
	c = make([]int, n)

	for i := 0; i < n; i++ {
		a[i] = nextInt()
		b[i] = nextInt()
		c[i] = nextInt()
	}

	dp = make([][]int, n)
	for i := 0; i < n; i++ {
		dp[i] = make([]int, 3)
		dp[i][0] = -1
		dp[i][1] = -1
		dp[i][2] = -1
	}

	ans := int(math.Max(float64(dfs(0, 0)), float64(dfs(0, 1))))
	fmt.Println(ans)
}

func dfs(day int, preChoice int) int {
	// 最終日であればそれ以上幸福度は得られないので0
	if day == n {
		return 0
	}
	// 計算済みであればそれを返す
	if dp[day][preChoice] != -1 {
		return dp[day][preChoice]
	}
	chooseA := -9999999
	chooseB := -9999999
	chooseC := -9999999
	if preChoice != 0 {
		chooseA = a[day] + dfs(day+1, 0)
	}
	if preChoice != 1 {
		chooseB = b[day] + dfs(day+1, 1)
	}
	if preChoice != 2 {
		chooseC = c[day] + dfs(day+1, 2)
	}
	// 最も幸福度が高かったものをdpに保存
	maxValue := int(math.Max(float64(chooseA), float64(chooseB)))
	maxValue = int(math.Max(float64(maxValue), float64(chooseC)))
	dp[day][preChoice] = maxValue
	return maxValue
}
