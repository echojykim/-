#break 반복문 중단 continue 반복문 계속.

#i = 0
#while True:
#    print("{}번째 반복입니다.".format(i))
#    i += 1
#무한히 쭉 증가하게 됨. 

i = 0
while True:
    print("{}번째 반복입니다.".format(i))
    i += 1
    if i > 10:
        break;
#break가 있으면 코드가 종료되게 됨 (i가 10 넘을 경우)

sum_ = 0

while sum_ < 100:
    num = int(input("정수를 입력해주세요 (0 입력시 종료)>"))
    #if num == 0: 
    #    break
    sum_ += num
    print("현재 정수의 합은 {}입니다.".format(sum_))
else:
    print("반복문이 종료되었습니다.")

numbers = [10. 200. 30. 400. 50] 
for i in numbers:
    if i < 200:
        continue
    print("{}은 200이상의 숫자입니다".format(i))

menu = {"아이스아메리카노" : 3000, "아메리카노" : 3000, "아이스 라떼" : 4000, "라떼" : 3500, "아이스크림" : 8000}
ice_menu = {}
hot_menu = {}

for i, j in menu.items(): 
    if i[0:3] == "아이스": #0번 1번 2번지까지(아~스까지)
        ice_menu[i] = j
    else:
        hot_menu[i] = j

print("차가운 메뉴")
for i, j in ice_menu.items():
    print("제품명: {}, 가격: {}".format(i, j))
print("뜨거운 메뉴")
for i, j in hot_menu.items():
    print("제품명: {}, 가격: {}".format(i, j))