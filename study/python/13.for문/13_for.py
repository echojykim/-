#for문
#for 변수 in 나열가능한 자료: 실행할 문장

for i in range(1, 10+1):
    print(i)
#정수 1~10까지가 나옴. i에 값이 할당된 후에 print로 내려가는것. 10까지 할당되고 벗어나게됨

for i in "일이삼사오":
    print(i)
#일/이/삼/사/오

#1~30까지의 수 중에서 3의배수들의 합을 구하시오
#3의 배수는 어떻게 구하면될까요?
#짝수%2==0
#/2==2의 배수와 같다

sum = 0

for i in range(1, 30+1):
    if(i % 3) == 0:
        print("{} + {} ".format(sum, i), end = "")
        sum += i
print(sum)

#range를 통해 1~30까지의 정수를 만들었고 그게 i로 값이 할당됨
#3으로 나눴을때 0인것들만 print구문으로 가게됨 -> 이후 나온 값들이 더하게됨
#따라서 총 값은 165 

for i in range(3, 30+1, 3):
        print("{} + {} ".format(sum, i), end = "")
        sum += i
print(sum)
#step을 이용한 방법. 3부터 시작해서 3개씩 뛰어주세요. 하면 if문을 쓰지 않고도 동일한 결과가 나오게됨

coffee = {"아메리카노" : 2500, "라떼":3000, "자바":2500}
for i in coffee.values():
    print(i)
#딕션너리 방식으로 사용해서 for문 적용해본것. 

#enumerate 함수
fruits = ["사과", "딸기", "바나나"]
for i in enumerate(fruits):
    print(f"{i[0]+1}번째 과일은 {i[1]}입니다.")

#변수 2개로 사용하는 방법
fruits = ["사과", "딸기", "바나나"]
for i, j in enumerate(fruits):
    print(f"{i[0]+1}번째 과일은 {j}입니다.")

#2차원 리스트
#중첩 for문

list_2nd = [[1, 2, 3],["a", "b", "c"]]

for i in list_2nd:#첫번째 리스트, 두번째 리스트안의 요소가 순서대로 들어감 
    for j in i:#j는 i안의 요소를 출력. 첫번째 리스트안을 돌때는 첫번째 리스트의 요소를 하나씩 출력, 두번째 리스트로 갔을땐 두번째 리스트 안의 요소 하나씩 출력 
        print(j)
#123abc라는 답이 차례대로 나옴 

for i in range(1, 3): #1~2번까지
    for j in range(1, 3): #1~2번까지
        print("첫번째 for문의 반복 {}번, 두번째 for문의 반복 {}번".format(i, j))


#구구단
#2x1=2 2x2=4 2x3=6....
#2단부터 9단까지 = 8번 반복
#1부터 9까지 =9번반복

print("2단부터 9단까지 구구단 출력")
for i in range(2, 9+1):
    for j in range(1, 9+1):
        print("{} x {} = {i*j}", end = "\t")
    print()
#이러면 구구단이 나옴. end로 세로정렬이 아닌 가로정렬을 하게 하고 개행을 해서 나온 구구단 값들을 떨어뜨림

#3중 for문
list_3rd = [[[1,2,3],[4,5,6],[11,12,13],[14,15,16]]]

cnt1=0
cnt2=0
cnt3=0

for i in list_3rd:
    cnt2 += 1
    print("i의 {}번째 반복입니다.".format(cnt1))
    print(i)
    for j in i:
        cnt2 += 1
        print("j의 {}번째 반복입니다.".format(cnt2))
        print(j)
        for k in j:
            cnt3 += 1
            print("k의 {}번째 반복입니다.".format(cnt3))
            print(k)
print('i는 {}번 반복, j는 {}번 반복, k는 {}번 반복'.format(cnt1, cnt2, cnt3))
#i는 2번 반복, j는 4번 반복, k는 12번 반복





