number_of_lines = int(input())
odd_words = []

for i in range(number_of_lines):
    if i % 2 == 0:
        odd_words.append(input())
    else:
        input()
        
for word in odd_words:
    print(word)