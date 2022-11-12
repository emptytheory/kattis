numerals = input().split(" ")
factors = [int(n) for n in numerals]
product = 1
for i in factors:
    product *= i
print(product)