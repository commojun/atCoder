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
	k := nextInt()

	fmt.Println(dfs(n, k, 1))
}

func dfs(remain int, k int, now int) int {
	if remain == 0 {
		return now
	}

	return int(math.Min(float64(dfs(remain-1, k, now*2)), float64(dfs(remain-1, k, now+k))))
}
