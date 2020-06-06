package main

import (
	"bufio"
	"fmt"
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

type work struct {
	a int
	b int
}

func main() {
	sc.Split(bufio.ScanWords)
	n := nextInt()

	w := make([]work, n)
	for i := 0; i < n; i++ {
		w[i] = work{
			a: nextInt(),
			b: nextInt(),
		}
	}

	used := make([]bool, n)
	ans := "No"
	if dfs(0, n, w, used, 0) {
		ans = "Yes"
	}
	fmt.Println(ans)
}

func dfs(depth int, n int, w []work, used []bool, time int) bool {
	if depth == n {
		return true
	}
	for i := 0; i < n; i++ {
		if used[i] {
			continue
		}
		nextTime := time + w[i].a
		if nextTime > w[i].b {
			return false
		}
		used[i] = true
		if dfs(depth+1, n, w, used, nextTime) {
			return true
		}
		used[i] = false
	}
	return false
}
