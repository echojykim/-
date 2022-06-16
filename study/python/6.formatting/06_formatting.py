#문자열 포맷팅
#%(percent) sign
#format 함수
#f-string

from turtle import left, right


weather = "맑음"
temperature = 20

print("오늘의 날씨는", weather , "기온은", temperature, "도 입니다.")
print("오늘의 날씨는 %s 기온은 %d도 입니다."%(weather, temperature))
print("오늘의 날씨는 {}이며, 기온은 {}도입니다.".format(weather, temperature))

#하면서 SyntaxError: invalid syntax 오류가 났었음. 
#안에 틀린 문장이 없는데 일어날 경우 해결방법 exit() 
#자세한 설명 사이트 https://blog.naver.com/doridori0825/222349876889

weather = "맑음"
temperature = 20
chance_shower = 33.5

print("오늘의 날씨는 %s 기온은 %d도 비가 내릴 확률은 %.1f%%입니다."%(weather, temperature, chance_shower))

#format 함수
print("오늘의 날씨는 {} 기온은 {}도 비가 내릴 확률은 {}입니다.".format(weather, temperature, chance_shower))
#자료형을 명확하게 명시하지 않아도 의도한대로 나오게됨

print("오늘의 날씨는 {0} 기온은 {2}도 비가 내릴 확률은 {1}입니다.".format(weather, temperature, chance_shower))
#인덱스의 순서를 바꿀경우 에 숫자가 바뀌어 다른 결과를 보게된다. 직접 적을 필요 없음
#오늘의 날씨는 맑음 기온은 33.5도 비가 내릴 확률은 20입니다.
#반드시 중괄호 숫자와 요소 숫자와 비슷해야함(요소 숫자가 적은데 중괄호 숫자가 많다거나 하면안됨)

print("{:10}, {:10}".format(weather, temperature))
#문자 - 왼쪽정렬 (문자를 쓰고 난 다음 공백)
#숫자 - 오른쪽 정렬 (공백후 숫자)
#답 맑음      ,       20

left="left"
right="right"
middle="middle"

# <>^
print("({:>10s}), ({:^10s}), ({:<10s})".format(left, middle, right))
#출력답 (      left), (  middle  ), (right     )

print("({2:>10s}), ({1:^10s}), ({0:<10s})".format(left, middle, right))
#출력답은 right middle left 순서. 뒤 format뒤 (left, middle, right)에 각 인덱스번호를 붙이면
#left 0 middle 1 right2기 때문에 이런 결과가 나옴

print("({2:!>10s}), ({1:@^10s}), ({0:#<10s})".format(left, middle, right))
#(!!!!!right), (@@middle@@), (left######)
#공백 부분에 특수기호가 들어간걸 확인할수 있음. 각각 넣은 특수기호는 ! / @ / # 

print("({2:!>10.4s}), ({1:@^10.3s}), ({0:#<10.2s})".format(left, middle, right))
#s앞에 .숫자 부분까지만 문자가 남고 나머지는 지워짐. 지워지는 부분은 특수문자가 대신함
#(!!!!!!righ), (@@@mid@@@@), (le########)

#f-string

weather = "맑음"
temperature = 20

print(f"오늘의 날씨는 {weather}이며, 기온은 {temperature}도입니다.")
#답 오늘의 날씨는 맑음이며, 기온은 20도입니다.
#깔끔하게 답이 나오는걸 알 수 있음. 

