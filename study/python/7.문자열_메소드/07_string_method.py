#문자열 메서드
#내장함수 : print()
#-괄호 안에 인자를 넣어서 사용
#메서드 : .upper()
# - .(참조연산자)를 이용해서 특정한 데이터를 참조해서 사용

text = "www.google.com"
print(len(text))
#여기의 len은 length의 줄임말
#따라서 문자열의 개수를 반환함. 답은 총 14 (점까지 개수로 포함해서 반환함)

#만약에 .capitalize()라는 참조연산자에 담으면 첫글자를 대문자로 변환함

txt_capitalize = text.capitalize()
print(txt_capitalize)
#결과는 Www.google.com 첫글자를 대문자로 변환함
#문장전체를 대문자로 변경하는 메소드 : .upper() -> 답은 WWW.GOOGLE.COM
#문자전체를 소문자로 변경하는 메소드 : .lower() -> 답은 www.google.com 

# count, find, index 
t_cnt = text.count('g')
print(t_cnt) #답은 2. www.google.com안에 g가 몇개있냐라는 의미의 count. 
#따라서 답은 2개가 된다. 

t_find = text.find('g')
print(t_find) #답은 4. g가 몇번째 배열에 있니라는 뜻. 찾았을때 점을 포함해서 4번째 배열에 담겨있는걸 알 수 있음[4] 
t_find = text.find('g', 5)
print(t_find) #5번째부터 g가 있니라는 뜻. 따라서 답은 7 
#find와 index가 비슷해보이지만 좀 차이점이 있음. 찾고자 하는 문자가 없을때 차이가 일어남. 
#index는 배열에 담기는 것임. 하지만 해당 글자가 없을 경우 valueError가 발생
#find의 경우 반환하고자 하는 문자가 없을때 -1을 반환함(이 값이 없어=-1)

t_find = text.rfind('g')
#find앞에 r를 붙이면 뒤에서부터 찾아줘 라는 뜻. 

t_naver = text.replace("google", "naver")
print(t_naver)
#해당 경우 글자를 치환해서 다른걸로 바꿔달라는 뜻이기 때문에 www.google.com의 중간글자 google이 naver로 변경
#결과값은 www.naver.com

t_split = text.split() #문자열을 분리해주는 기능
print(text.split('.')) #.이 있기 전까지 글자들을 분리함. 
#www / google / com 이런식으로. 
#만약 split('oo')를 한다면 www.g, gle.com 이렇게 둘로 나뉨 
text = "              www.google.com                   "
print(text)
stp = text.strip() #공백을 없애주는 기능
print(stp) #공백이 제거되고 www.google.com만 출력
#하지만 만약 문자 사이사이에 공백이 있다면 ex "w w w. g o o g l e. c o m" 이런식
#이 경우 그대로 답은 w w w. g o o g l e. c o m 이렇게 나옴. 문자열 사이사이 공백은 제거x


