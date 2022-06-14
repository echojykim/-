#산술연산자
#기본연산자 +=*/
# 목을 구하는 연산자 //
# 나머지를 구하는 연산자 %
# 제곱을 구하는 연산자 **
print(10+2)
print(10-2)
print(10*2)
print(10/2)
#정수형의 나눗셈 결과는 무조건 실수형

print(10/10)
print(type(10/10)) #실수형

#정수형으로 나옴 
print(10//2)
print(10%2)

# int() 정수형
# 실수형, 논리형, 문자열 
print(int(123.92))
print(int(123.9123122))
print(int(123.0))

#true, false를 정수값으로 변환할수있음
print(int(True)) #1
print(int(False)) #0

print(type("284242")) #문자열 String
print(type(int("284242"))) #문자열이 int형으로 변환됨
#문자열에 정수 이외에 다른 문자, 실수 등이 들어가면 변환x

 # float() 실수형
 # 정수형, 논리형, 문자열

print(float(200)) #200.0
print(float(3)) #3.0

print(float(True)) #1.0
print(float(False)) #0.0

print(float("23.23823")) #23.23823
print(float("2323")) #2323.0

#str()
#모든 자료형
print(str(12312)) #12312
print(str(3434.233)) #3434.233
print(str(True)) #true
print(str(False)) #false 
#type으로 붙여서 형변환이 되었는지 확인해보면 다 클래스 str임을 확인 가능

#bool()
#모든 자료형

#false
print(bool(0))
print(bool(0.0))
print(bool(""))

#true
print(bool(1))
print(bool(1.0))
print(bool("str"))
print(bool("1231"))

#비교연산자 - 값들의 키를 비교해서 true 또는 false로 반환
#a<b : b가 a보다 크면 true
#a>b : a가 b보다 크면 true
#a<=b : b가 a보다 크거나 같으면 true
#a>=b : a가 b보다 크거나 같으면 true
#a==b : a와 b가 같으면 true
#a!=b : a와 b가 같지 않으면 true

a = 10
b = 20
#=(Equal sign) a == b
print(a < b) #10 < 20 true
print(a <= b) #10 <= 20 true
print(a > b) #10 > 20 false
print(a >= b) #10 >= 20 false
print(a == b) #10 == 20 false
print(a != b) #10 != 20 true 

#논리형 자료
is_true = True
is_false = False

print(is_true > is_false) #True
print(is_true < is_false) #False

#문자형 자료
print("Python" > "python") #소문자>대문자라 이건 false
print("12345" > "12344") #12345 > 12344인지라 이건 true
print("12.12" < "13.12") #true

#산술연산자와 대입연산자를 합쳐서 사용 
today = 1230
today = today + 1 #today += 1
print(today) #1231

#and
print(True and True) #true
print(True and False) #false
print(10>3 and 3<5) #true
print(10==1 and 1==5) #false

#or
print(True or False) #true
print(False or True) #true
print(False or False) #false

#and
print("a" and 0 and True and False)

#연산자 우서ㅓㄴ순위
# **제곱
# + - 양수 음수
# */%/ 곱하기 나누기 나머지 몫
# += 덧셈 뺄셈 
# 비교 <= < > >=
# 평등 == !=
# 대입 = %= /= //= += *= **=
