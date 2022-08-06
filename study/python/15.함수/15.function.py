#기능이나 속성을 가진 코드에다가 이름을 붙여놓고 하는것
#파이썬의 내장함수
#print() 문자열로 출력
#input() 입력을 문자열로 변환 

#사용자정의 함수. 
#def 함수이름(): 수행할 코드 

def menu():
    print("오늘의 메뉴")
    print("오늘 점심메뉴는 제육볶음입니다.")
    print("내일의 메뉴")
    print("내일의 점심 메뉴는 돈까스입니다.")

def add(num1, num2):
    print(num1+num2)
add(1, 2)
#결과값 3

def add(text1, text2):
    '''문자열 두개(성, 이름)을 입력받아서 합쳐서 출력
    args
        test1 : 성을 받는 문자열
        test2 : 이름을 받는 문자열
    '''
    print(text1 + text2)
print(add("길동", "홍"))
#홍길동 -> 첫번째 print문
#none 이렇게 두가지 결과값이 나옴. none은 두번쨰 print문에서 나옴

#차표
#표창장
#장독대
#마스크
#이렇게 끝말잇기시 말이 되지 않는게 나오면 멈춰야함

def game(text):
    while True:
        print(text)
        keyword = input("끝말을 이어주세요.")
        if text[-1] == keyword[0]:
            text = keyword
        else:
            print("끝말이 이어지지 않았습니다.") 
#game("함수호출")
