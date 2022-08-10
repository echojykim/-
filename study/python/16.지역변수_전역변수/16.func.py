#지역변수 & 전역변수
#만약 감자가 있으면 이게 여러지역에 있을것. 하지만 제주도에선 감자=고구마라면?
#그럼 다른 지역의 감자와 제주도의 감자는 다른 것일것임. 

#지역변수
def jeju_potato():
    potato = "고구마"
    print(potato)
    #함수 안에서 선언된 변수는 지역변수

jeju_potato() 
#제주 포테이토라는 함수가 만들어지고 실행되면 이 변수는 함수 안에서만 살아있음(지역변수 내에서만)
#제주 포테이토라는 함수(제일 아래쪽)이 실행되면 사라지는 것임. 사용x 
#매개변수를 만들어주면 매개변수도 지역변수가 됨. 

#전역변수
potato = "감자"

def jeju_potato():
    print(potato)

jeju_potato() 
print(potato) #potato가 나옴 

#전역변수는 어디에서든 사용이 가능. 
#포테이토라는 변수를 출력하게 되면 아래쪽 print문도 출력 가능

potato = "감자"

def jeju_potato():
    global potato
    print(potato)
    potato = "고구마"
    print(potato)

jeju_potato() 

#언바운드로컬에러가 나옴. 
#파이썬은 지역심볼 테이블에서 찾아보다가 없으면 전역심볼테이블에서 값을 찾음
#이 경우 global potato를 붙이면됨 

#가변 매개변수
def add(num1, num2 = 20):
    return num1 + num2

print(add(10))

#이 경우 num2는 이미 값이 20이 들어가있으므로 num1에 10값이 들어가서 총 30이 됨
#일반 매개변수가 아니면 일반 매개변수 뒤쪽에 붙어야함. 
# 기본변수값을 붙여주는 경우 일반매개변수 뒤쪽에 넣어야 정상출력 가능

def add(num1, num2 = 20, num3 = 30):
    return num1 + num2 + num3

print(add(num1 = 10, num3 = 2))

#이 경우 답은 42. 아래쪽 num3의 2가 대입되면서 num1은 10, num2는 20. num3은 2로 42가 나온다

def add(*args):
    sum=0
    for i in args:
        sum += i
    print(sum)

add(10, 20, 30, 40)

#i를 args만큼 돌려라. 그리고 합산한 값을 출력해라 
#답은 100
#가변매개변수도 일반 매개변수 앞에 올 수 없음. 
#온다면 이렇게 와야함

def add(num, *args):
    sum=num
    for i in args:
        sum += i
    print(sum)

add(10, 20, 30, 40)

#키워드 매개변수
#키워드 = 특정값 형태로(키워드:특정값)

def star_player(**kwargs):
    for i in kwargs:
        print(i)

star_player(축구="손홍민", 야구="박용택", 농구="허재")
#kwargs는 dictionary형태임
#따라서 수정하려면 이렇게 해야함(값이 나오려면)
def star_player(**kwargs):
    for i in kwargs.items:
        print(i)

star_player(축구="손홍민", 야구="박용택", 농구="허재")


def star_player(**kwargs):
    for i, j in kwargs.items:
        if "서장훈" in kwargs.values():
            print("저는 lg팬이라 서장훈을 좋아했어요.")
        else:
            print("{}는 역시 {}지".format(i, j))

star_player(농구 = "허재")

#아래쪽 값대입에 서장훈을 입력하면 if문이 나오고. 그게 아니면 그냥 허재가 나옴(농구는 역시 허재지)

#최대, 최소값을 구하는 문제
def max_min_search(*number):
    max_num = number[0]
    min_num = number[0]
    for num in number:
        if num > max_num:
            max_num = num
        elif num < min_num:
            min_num = num
    return max_num, min_num

print(max_min_search(15, 30, 4, 60, 7, 80, 32))

#이러면 80, 4가 나옴 
#아래쪽 값을 처음에 입력받아서 각각 처음값이 입력되고
#for문을 통해 돌려서 작다면 작은 값이 할당. 크다면 큰 값이 할당. 
#처음은 둘다 15란 값으로 시작할것.


