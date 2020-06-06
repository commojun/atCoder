package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
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

type works []struct {
	a int
	b int
}

func (w works) Len() int {
	return len(w)
}

func (w works) Less(i, j int) bool {
	return w[i].b < w[j].b
}

func (w works) Swap(i, j int) {
	w[i], w[j] = w[j], w[i]
}

func main() {
	sc.Split(bufio.ScanWords)
	n := nextInt()

	w := make(works, n)
	for i := 0; i < n; i++ {
		w[i] = struct {
			a int
			b int
		}{
			a: nextInt(),
			b: nextInt(),
		}
	}

	sort.Sort(w)

	time := 0
	ans := "Yes"
	for i := 0; i < n; i++ {
		time += w[i].a
		if time > w[i].b {
			ans = "No"
			break
		}
	}
	fmt.Println(ans)
}
