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

	h := make([]int, n)
	for i := 0; i < n; i++ {
		h[i] = nextInt()
	}

	//dp[i] = iマス目にたどりつくための最小コスト
	dp := make([]int, n)

	// 1マス目は0
	dp[0] = 0
	// 2マス目はh[1]-h[0]
	dp[1] = int(math.Abs(float64(h[1] - h[0])))

	for i := 2; i < n; i++ {
		// 1マス前から移動したときの最小コスト
		step1 := dp[i-1] + int(math.Abs(float64(h[i]-h[i-1])))
		// 2マス前から移動したときの最小コスト
		step2 := dp[i-2] + int(math.Abs(float64(h[i]-h[i-2])))
		// 小さい方をdp[i]として採用する
		dp[i] = int(math.Min(float64(step1), float64(step2)))
	}

	fmt.Println(dp[n-1])
}
