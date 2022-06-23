text = input("")
print(text)
#콘솔창에 입력이 정상적으로 되나요? 하면 그대로 담아져서 뜨는걸 확인가능.
text = input("")
text2 = input("")
print(text + text2)
#처음에 김, 두번째로 개똥을 치면 둘이 합쳐진 김개똥이 출력됨.

text = input("성을 입력해주세요 > ")
text2 = input("이름을 입력해주세요> ")
print(text + text2)
#위의 문장을 보기 좋게 가공한것임.

number = input("")
number2 = input("")
#기본적으로 input함수는 String형임.
#때문에 위에 숫자 3 두번째로 50을 적으면 합쳐져서 350이 나올것.
#정말 숫자끼리의 더하기가 나오지 않음. 자료형변환 필요
# print(type(number + number2))
print(int(number)+int(number2))
#이러면 자료형변환이 되어 나옴. 

# if문
if True:
    print("실행할 문장입니다.") #무조건 공백 4개 필요.아니면 인식x
   #if조긴식: 조건식이 참일때 실행할 문장

weather = "비"
if weather == "비":
    print("우산을 챙겨주세요")

study_time = int(input("오늘의 공부시간을 입력해주세요>"))

#만약에 오늘 공부할 시간이 3시간 이상이라면 파이썬 공부
if study_time >= 3:
    print("오늘은 파이썬 공부를 합시다!")

#만약 오늘 공부할 시간이 3시간 미만. 그러면 오늘은 놀자!
if study_time < 3:
    print("오늘은 시간이 별로 없으니까 놀자!")

if study_time >= 3 and 6 >=study_time:
    print("오늘은 파이썬 공부를 해봅시다!")
#만약 오늘 공부할 시간이 3시간 미만. 그러면 오늘은 놀자!
if study_time < 3:
    print("오늘은 시간이 별로 없으니까 놀자!")
#위 조건에 아무것도 맞지 않는 숫자를 넣게 되면 그대로 종료

#if study_time >= 3 and 6 >=study_time:
#위와 똑같은 문장을 적어보면
if 6 >= study_time >= 3:
    print("오늘은 파이썬 공부를 합시다!")

#else문
#if 조건식: 조건식이 참일때 실행
#else: 조건식이 거짓일때 실행

odd = input("정수를 입력해주세요 > ")
#홀수, 짝수
#1, 3, 5, 7, 98
#2, 4, 6, 8

print(odd[-1] == "1")

#if odd[-1] == "1" 만약 적은 숫자의 제일 끝이 odd 제일 뒤의 숫자가 1인 경우 

if odd%2 == 1:
    print("입력하신 정수는 홀수입니다.")
else:
    print("입력하신 정수는 짝수입니다.")

number = input("주민번호를 입력해주세요 > ")
odd = number[7]

if odd % 2 == 0: #짝수라면
    print("여성입니다.")
else: #짝수가 아니라면 == 홀수라면
    print("남성입니다.")