
a = 1
b = 2
c = 3
d = 4

print(a, b, c, d)

#list [] 안에 , 사용. 
list_a = [1, 2, 3, 4]
list_b = ["a", "b", "c"]
list_c = [True, False]
list_d = [1, "a", True]

print(list_a)
print(list_b)
print(list_c)
print(list_d)

numbers = [0, 1, 2, 3, 4, 5, 6, 7]
print(numbers[0])
print(numbers[3:5]) #답출력은 3, 4. 왜냐면 인덱스 3번에서 5번전까지 알려달라는 의미기 때문.
print(numbers[-3 : -1]) #답은 5,6 뒤에서부터 -1, -2. -3 이런식으로 가는데 
#numbers[-3 : -1]을 읽으면 -3번지에서 -1번지 전까지 숫자를 출력해주세요라는 뜻이기때문

list_lang = ["JAVA", "C", "Python", "Go"] 
print(list_lang[2][2:4]) #세번째 파이썬이란 문자에서 th를 갖고와라. 

list_lang[1] = "C++" #인덱스 첫번째를 C++로 바꿔주세요. 
#답은 JAVA C++ Python Go

list_lang[1:3] = ["C#", "Python3"] 
print(list_lang) #이건 인덱스 첫번째에서 세번째 전까지의 요소를 바꾸겠다란 의미.
#따라서 JAVA C# Python3 Go 

list_lang[1:3] = ["C#", "Python3", "Python4"] #이러면 위와 똑같이 JAVA C# Python3 Go 에서 
#JAVA C# Python3 Python4 Go / Python4가 문장에서 늘어남

list_lang = ["JAVA", "C", "Python", "Go", "Ruby"] 
print(len(list_lang)) #답은 5 안에 있는 요소의 개수를 말하는것 

#append() 리스트 맨 뒤에 제일 마지막 인덱스(-1)에 새로운 인자를 추가하는것.
list_lang.append("Ruby")
print(list_lang) #"JAVA", "C", "Python", "Go" 이 상태에서 제일 뒤에 Ruby가 추가되는것

list_a = [1, 2, 3]
list_lang.append(list_a) #이러면 리스트 안의 리스트가 생김. 
#답은 "JAVA", "C", "Python", "Go", "Ruby", [1, 2, 3]

#만약 리스트가 아닌 요소를 추가하고 싶다면 .extend()를 사용해야함 
# list_a = [4, 5, 6]
# list_lang.extend(list_a) #"JAVA", "C", "Python", "Go", "Ruby", "4", "5", "6"

# list_lang.extend("JavaScript") 
#이러면 문자열 하나하나 요소가 추가됨. J, a, v, a, S, c, r, i, p, t 이런식.

#insert(index, data)
list_lang.insert(0, "R") 
print(list_lang) 
#이러면 0번지에 있던 Java가 R로 변경됨. 

#pop() 요소를 꺼내 반환함. 이후 리스트를 확인해보면 반환된 요소는 존재하지 않음. 
list_lang = ["JAVA", "C", "Python", "Go"] 
print(list_lang.pop(0)) #0번지의 Java가 꺼내와짐 
print(list_lang) #남은 리스트는 이제 C, Python, Go

#remove() 해당요소를 아예 삭제하는 것. 해당 요소를 지정해서 삭제.
list_lang.remove("Python") #이러면 파이썬이 삭제됨
#그래서 남은 리스트 내용은 "JAVA", "C", "Go"

#del()도 안의 리스트를 삭제하는것. 인덱스로 명시.
del list_lang[1] #이러면 c가 삭제되고 남은건 Java, Go가 됨 

#리스트의 정렬 -> 숫자, 알파벳, 한글도 가능
members = [1, 50, 30, 40, 100, 10]
members.sort() #sort() 숫자 정렬
print(members) #1, 10, 30, 40, 50, 100이 출력. 오름차순으로 정렬됨

members.reverse() #그냥 역순으로 숫자를 보여줌. 
#sort 전에 reverse 선언을 했다면 10, 100, 40, 30, 50, 1이 나옴

#만약 내림차순으로 나오게 하려면? 
members.sort(reverse = True) #이러면 내림차순으로 정렬됨 

#아스키테이블을 사용해서 결과값 확인하기
compare_text1 = "apple"
compare_text2 = "banana"

#여기서 apple과 banana의 값크기를 말하게 되면 아스키테이블 바이트 크기 순으로 비교해야함
#이러면 제일 앞자리 숫자인 a, b로 비교하게됨
print(compare_text1 > compare_text2) #text1이 2보다 크니? 하면 답은 False. 소문자 a의 숫자는 97이고 b는 98.
#banana가 크기때문에 false라는 결론
print(compare_text1 < compare_text2) #답은 true

#아스키테이블을 직접 찾아보지 않아도 코드의 내장된 함수로 알아볼수 있음.
#ord, chra
print(ord("A")) #65
print(ord("a")) #97
print(ord("ㄱ")) #12593
print(ord("ㅎ")) #12622

print(chr(66))
print(chr(55))
print(chr(7788))
print(chr(12434))
#B 7 Ṭ を 각각 답은 이렇게 나옴 

#list 내부에서 특정값인지 확인하는 연산자가 있음 
#in연산자와 not in 연산자

list_lang = ["JAVA", "C", "Python", "Go"] 
numbers = [1, 200, 3, 50, 5, 66, 7, 55, 9]

#in연산자와 not in 연산자
print(50 in numbers)
print("C" in list_lang)
#둘다 존재하기 때문에 true로 반환 

#not in연산자는 정반대임. 
print(50 not in numbers) #numbers 변수 안에 50이란 숫자가 없나요? 있기 때문에 False
print("C" not in list_lang) #list_lang도 마찬가지임. C가 존재하기 때문에 False

td_number = [[10, 20, 30], [1, 2, 3]] 
print(td_number[0]) #답은 [10, 20, 30]
#첫번째 리스트는 첫번째 행에 들어가고 두번째 리스트는 두번째 행에 들어감. 
#만약 리스트 안의 요소인 10을 꺼내서 보고싶다면?
print(td_number[0][0]) #이렇게 세부적으로 지정해서 보여줘야함 

#만약 10, 20의 숫자를 보고싶다고 한다면? 
print(td_number[0][0:2]) #10, 20은 0번지 행에 존재하기 때문에 첫번째 배열은 0. 
#두번째는 어디서부터 어디까지의 숫자를 반환해주세요~기 때문에 0번지에서 2번지 전까지의 숫자를 반환해주세요 
# = 10, 20을 반환해주세요가 됨.



