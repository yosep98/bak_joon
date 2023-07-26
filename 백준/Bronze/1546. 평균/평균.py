high = 0
sum = 0
new_scores = []
num = int(input())

scores = input().split()
scores = [int(score) for score in scores]

for score in scores:
    if score > high:
        high = score

for score in scores:
    new_score = score / high * 100
    new_scores.append(new_score)
    sum += new_score

average = sum / num
formatted_average = "{:.2f}".format(average)

print(formatted_average)