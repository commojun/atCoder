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
	n := nextInt()
	var b = make([]int, n+1)

	for i := 1; i <= n; i++ {
		a := nextInt()
		b[a]++
	}

	same := -1
	no := -1
	for i := 1; i <= n; i++ {
		if b[i] == 0 {
			no = i
		}
		if b[i] == 2 {
			same = i
		}
	}

	if same == -1 {
		fmt.Println("Correct")
	} else {
		fmt.Printf("%d %d\n", same, no)
	}

}
