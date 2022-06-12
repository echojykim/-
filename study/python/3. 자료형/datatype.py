#int(정수형)

a = 5
b = -5
c = 0

print(type(a), type(b), type(c))

#float(실수형)
d = 5.5
e = -5.5
f = 0.0

print(type(d), type(e), type(f))

#과학적 표기법
1.234567 * 10^5
#이것과 동일한걸 한다면 1.234567e5
#위의 결과물은 123456.7 

#complex 자료형 
#복소수와 복소수 연산들이 필요할때 사용하는 자료형
#일반수학에서의 복소수 a+bi / 파이썬에서의 복소수 a+bj

#string형 
text = "String Data Type"
print(text)

#문자열 안에 또 문자열을 넣으면 오류가 남 

#탈출문자
#\', #\", \\, \n, \r, \t

text = "Python \'is\" Easy"
print(text) #결과 Python 'is" Easy 

#문자열 연산
text = "Python is Easy"
text2 = "and Powerful"
print(text + text2)
#Python is Easyand Powerful 

#print 함수
a = 10
b = 20
print(a, b, sep='!') #10!20
print(a, b, sep='곱하기 2는') #10곱하기 2는20

print(a, b, end='')
print('3번째 라인')
#10 20   3번째 라인 

print(a, b, end='개행 문자 대신 사용합니다.')
print('3번째 라인')
#10 20개행 문자 대신 사용합니다.3번째 라인

#내장함수와 메서드
#print(): 내장함수 #어떠한 기능을 가진 코드
#str.upper():메서드

is_true = True
is_false = False

print(is_true) #이 결과값은 무조건 참과 거짓으로 나옴 

#false
# - False
# - 0에 해당하는 값
# - 빈문자
# - [], (), {}
# - Null