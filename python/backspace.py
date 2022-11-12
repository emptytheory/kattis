data = input()
stack = []
for c in data:
	if c == '<':
		stack.pop()
	else:
		stack.append(c)
print("".join(stack))