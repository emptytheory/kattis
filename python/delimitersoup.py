delimMap = {"(": ")", "[": "]", "{": "}"}
openParens = ["(", "[", "{"]
stack = []
def parenChecker(program):
	for i, c in enumerate(program):
		if c != " ":
			if c in openParens:
				stack.append(c)
			else:
				if len(stack) == 0:
					return "".join([c, " ", str(i)])
				elif c == delimMap[stack[-1]]:
						stack.pop()
				else:
					return "".join([c, " ", str(i)])
	return "ok so far"

input()
program = input()
print(parenChecker(program))