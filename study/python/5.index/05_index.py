#index
#01234
#음수는 -1부터 시작함

print("index"[0])
print("index"[1])
print("index"[2])
print("index"[3])
print("index"[4])

print("index"[-5])
print("index"[-4])
print("index"[-3])
print("index"[-2])
print("index"[-1])

#문자열의 인덱스
#String index 라고 하면 s부터 0번지 시작.(공백도 인덱스 추가)
#이걸 음수로 하면 index의 x부터 -1시작. 제일 첫글자 s는 -12가 된다.

#String index
str_ = "String index"

print("index"[0])
print("index"[1])
print("index"[2])
print("index"[3])
print("index"[4])
print("index"[5])
print("index"[6])
print("index"[7])
print("index"[8])
print("index"[9])
print("index"[10])
print("index"[11])
print("index"[12]) #인덱스 12번지의 경우 아무것도 담겨있지 않기 때문에 에러가 뜸

print(str_[0])

str_slice = "0123456789"
print(str_slice[0:7]) #0번부터 7번지 전까지 알려주세요(0123456)
print(str_slice[0:]) #0번부터 끝까지 알려주세요
print(str_slice[:10]) #앞에서 10번 인덱스까지 다 알려주세요 

#-음수가 붙으면 거꾸로. 
#print("0123456789"[-8:-1(n)]) 
#제일 끝 9부터 앞의 2까지. 하지만 여기서 뒷자리 n번지는 포함되지 않기 때문에
#답은 2345678이 됨

str_slice = "Python is easy"
            #012345 6 78 9 10 11121314
print(str_slice[-14:]) #Python is easy 
#범위를 넘어선 인덱스 숫자 (ex:20)을 넣어도 정상적으로 출력됨

#Step 사용
#print(str_slice[n:m:step])
print(str_slice[0:10:2]) #0번부터 10번지까지(문자열 내용 전체 다)에서 2가 추가되면 
#답은 02468 (step: 몇개씩 끊어서 갖고올거야?)
print(str_slice[::-3]) #제일 뒤에서 3개씩 끊어주세요. 라는 의미.
#따라서 9630이 나옴
#위와 똑같은 9630이 나올수 있는 수식
print(str_slice[9::-3])
print(str_slice[-1::-3])

print(str_slice[0:]+str_slice[::-1]) #pythonnohtyp 







