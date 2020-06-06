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

func main() {
	sc.Split(bufio.ScanWords)

	n := nextInt()
	y := nextInt()

	// a: 10000円札
	for a := 0; a <= n; a++ {
		// b: 5000円札
		for b := 0; b <= n-a; b++ {
			// c: 1000円札
			c := n - (a + b)
			money := 10000*a + 5000*b + 1000*c
			if money == y {
				fmt.Printf("%d %d %d\n", a, b, c)
				return
			}
		}
	}
	fmt.Println("-1 -1 -1")
}
