DEPS := scanner.c compiler.c memory.c object.c value.c table.c chunk.c vm.c debug.c

main: main.c
	gcc -std=c99 -Wall main.c $(DEPS) -o main

main-dbg: main.c
	gcc -g -std=c99 -Wall main.c $(DEPS) -o main

clean-exec:
	rm -f main
