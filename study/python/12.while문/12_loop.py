from re import M


i = 0
num = 10

#print("while문")
#while i <num:
#   i = i+1
#   print(i)
#while문은 조건식이 만족할때까지 계속 실행

#print("if문")
#if i<num:/
#    i = i+1
#    print(i)
#한번만 실행 

#while문(반복문)
#1부터 5까지 생성
num = 0
while num < 5:
    num += 1
    print(num)

num = 0
while num < 5:
    num += 1
    print(num)
else:
    print("값이 {}이상이므로 종료합니다.".foramt(num))
#5이상이면 else로 내려가서 구문출력하고 종료

#중복글자 삭제하기 
fruits = ["사과", "키위", "바나나", "사과", "바나나", "망고"]
print(fruits)

fruit = input("빼낼과일을 입력해주세요 > ")
while fruit in fruits:
    fruits.remove(fruit)

print(fruits)
print("{}를 모두 제거했습니다".format(fruit))

#최소값 최대값 입력
min_num =M
max_num = int(input("최대값 입력 > "))

#홀수, 짝수 리스트 생성
odd_list = []
even_list = []

#제어변수에 최소값 할당
num = min_num

#최소값이 최대값보다 작을경우 실행
if min_num < max_num:
    while num < max_num: #제어변수가 최댓값이 될때까지 반복실행 
        if num % 2 == 0: #짝수판별
            even_list.append(num) #짝수를 짝수리스트에 요소로 추가
        else: #홀수판별
            odd_list.append(num) #홀수를 홀수리스트에 요소로 추가
        num += 1
    print("{}부터 {}까지의 짝수는 {}입니다.".format(min_num, max_num, even_list))
    print("{}부터 {}까지의 짝수는 {}입니다.".format(min_num, max_num, odd_list))
else: #최소값이 최대값보다 크거나 같을 경우
    print("최대값 {}이 최솟값 {}보다 크지 않습니다.".format(max_num, min_num))

#Range함수
#range(n, m)

numbers = list(range(-10, 0, 2)) #-10부터 2칸씩 띄어서 0까지 출력 
print(numbers)

numbers = list(range(-10, 10/2)) #무조건 정수가 나와야하기 때문에 10/2로하면 안됨. 나눗셈이 아닌 몫을 얻는 쪽으로 하면 됨. 
#혹은 int로 형변환 필요 