#if 조건식 A: 조건식 A가 참일때 실행할 문장
#elif 조건식 B: 조건식 B가 참일때 실행할 문장
#elif 조건식 C: 조건식 C가 참일때 실행할 문장
#else : 모든 조건식이 거짓일때 실행할 문장

#-> if문 조건이 참이 아닐 경우 다음 elif 조건식을 사용

lunch = input("점심메뉴를 골라주세요(제육덮밥, 돈까스, 김밥) > ")
if lunch == "제육덮밥" : 
    print("제육덮밥을 먹는다.")
elif lunch == "돈까스" : 
    print("돈까스를 먹는다.")
elif lunch == "김밥" : 
    print("김밥을 먹는다.")
else:
    print("점심을 굶는다.")
#if문이 거짓일 경우 elif쪽으로 내려간거임. elif는 if문이 없으면 사용할수없음 

number = 85

if number > 50 : 
    print("80보다는 작고 50보다는 큰 수입니다.")
elif number > 80 : 
    print("90보다는 작고 80보다는 큰 수 입니다.")
elif number > 90 : 
    print("90보다는 큰수입니다.")
else:
    print("50보다는 작은수입니다.")

#and #or
#if문으로 여러조건을 동시에 판별
#3의 배수하면서 짝수인 수를 판별해주는 조건식

number = int(input("정수를 입력해주세요 > "))
if number %3 == 0 :
    print("3의 배수입니다.")
else:
    print("3의 배수가 아닙니다.")

number = int(input("정수를 입력해주세요 > "))
if number %3 == 0 or number%2 == 0 :
    if number % 3 == 0:
        print("3의 배수입니다.")
else:
    print("3의 배수가 아닙니다.")

number = int(input("정수를 입력해주세요 > "))
if number %3 == 0 and number%2 != 0 :
    if number % 3 == 0:
        print("3의 배수입니다.")
else:
    print("짝수입니다.")

number = int(input("정수를 입력해주세요 > "))
if number % 3 == 0 or number % 2 == 0 :
    if number % 3 == 0 and number % 2 != 0 :
        print("3의 배수입니다.")
    elif number % 3 == 0 and number % 2 ==0:
        print("3의 배수이면서 짝수입니다.")
    else:
        print("짝수입니다.")
else:
    print("3의 배수도 짝수도 아닙니다.")

#if문 quiz
domain = input("웹 사이트 주소를 입력해주세요 > ")
nation = domain.split(".")

#kr = 한국, uk = 영국, com = 기업, org = 기관, 알수없음
#가장 뒤쪽의 요소를 [-1]

if nation[-1] == "kr" : 
    print("한국")
elif nation[-1] == "uk" : 
    print("영국")
elif nation [-1] == "com" : 
    print("기업")
elif nation[-1] == "org": 
    print("기관")
else:
    print("알수없음.")
