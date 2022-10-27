DEPS := value.c chunk.c memory.c debug.c

main: main.c
	gcc -std=c99 -Wall main.c $(DEPS) -o main

main-dbg: main.c
	gcc -g -std=c99 -Wall main.c $(DEPS) -o main

clean-exec:
	rm -f main
