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
	k := nextInt()

	now := 1
	for i := 0; i < int(n); i++ {
		if now*2 > now+k {
			now += k
		} else {
			now = now * 2
		}
	}
	fmt.Println(now)
}
