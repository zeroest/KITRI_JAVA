4장 조건문 반복문 이동문 //=>제어문이라 한다!!
1개 실행 기능 단위 = 문장 = statement

class 이름 {
	public static void main ( String[] args){
		1;
		2;
		3;
	}
}


- 조건문 = 선택문 if, switch
	1. if(조건식)
		true 인 경우 실행문장 1개 // 중괄호 하지 않아도 된다.
	
	
	2. if(조건식 = boolean){
		true 인 경우 실행 문장들;
	}else{
		false 인 경우 실행 문장들;
	}
	
	3. if(조건1){
		조건1 true 인 경우 실행 문장들;
	}else if (조건2){
		조건1 false 이고 + 조건2 true 인 경우 실행 문장들;
	}else if (조건3){
		조건1,2 false 이고 + 조건3 true 인 경우 실행 문장들;
	}else{
		조건1,2,3 false 인 경우 : 불만족 문장;
	}
	
조건3항 연산자: 수행 1개 문장 
조건식? true 수행수식 : false 수행수식; //수행할 수식이 2개 이상인 경우 문제
	
	1.switch - case [break]
	switch(byte, short, int, char){
		case [==] 숫자값1 : 
			//int 변수가 숫자값1 동일 경우 실행 문장들;
			//break 없을시 밑 조건 검사 없이 수행진행한다!!!
		case 숫자값2 :
			//int 변수가 숫자값2 동일 경우 실행 문장들;
			break;//중단
		default :
			//위 case 들과 일치하지 않는 나머지 경우 실행 문장들;
	}
	
	
	char c1 = 'a';
	
	switch(c1){
		case 'a' :
		...
	}
	
	jdk 1.7 버전 이후부터 : String 가능!!!
	switch(int , char, byte, short + String)
	switch(String){
		case "자바" :
		...
		break;
	}
	

- 반복문 for, while,do-while
	for=> 0번 이상의 유한횟수
	while=> 0번 이상의 유/무한횟수
	do-while=> 최소 1번 이상 반복 필요(반드시)

	1. for (반복시작문장 ; 반복조건식 ; 반복변화식){
		반복 실행 문장 : 
	}
	for(1;2;3){
		4;
	}
	1 > 2 > 4 > 3 > 2 > 4 > 3 > ...


	
	
==================================================	

	------------------------------------------------
	do-while
	int i = 1;
	do{
	sop(i);
	i++
	}while(i<=10);
	=> 최소 1번은 수행하게 됨 do 가 먼저 실행되고 조건을 체크하기 때문
	-------------------------------------------------
- 이동문
	break; 
	
	1.switch-case문 : switch 문 중단
	2. for, while, do while :반복문 중단
	=>for(){
		1;
		if(조건식) break; //중단하고 3번으로 이동
		2;
	}
		3;
	
	continue; => 반복문 내부 사용 for while do while
		반복 도중에 continue만날시 반복 일시 생략하고 반복을 처음부터 다시 수행
		
		for(){
			1;
			if() continue;
			2;
		}
			3;

	String result = "";
		int data = 1;
		for(int i =1 ; i<10 ; i++){
			for(int j = 2 ; j <10 ; j++){
				//if (j == 4) continue; // 4단 제외 수행
				if (j==6) break; //6단부터 정지
				data = j*i;
				result = j+"*"+i+" = "+data+" \t";
				System.out.print(result);
			}
			System.out.println();
		}
	
	int i =1;
	int sum = 0;
	while(true){
		sum +=i;
		i++;
		if(sum >=30) break;
	}
	System.out.println("int i = "+i+" , sum = "+sum);


=======================================
*3. while / continue/break

'A'-'Z' 코드 65-90 : 대문자
'a'-'z' 코드 97-122 : 소문자


무한반복
1.난수 발생시(1-200 범위)

2.65-90사이면 (대문자이면)
예)   65 라면 : 'A'를 'a'로 변경합니다 출력

3.97-122사이면 (소문자이면)
예)  97 이라면 : 'a'를 'A'로 변경합니다 출력

4. 1-50 이거나 150-200 사이면 종료


int ran = (int)(Math.random()*200)+1;


	while(true){
		//1.난수 발생시(1-200 범위)
		int ran = (int)(Math.random()*200)+1;
		
		//2.65-90사이면 (대문자이면)
		//예)   65 라면 : 'A'를 'a'로 변경합니다 출력
		if(ran >=65 && ran <=90){
			char c1 = (char)ran; //대문자
			char c2 = (char)(ran+32); //소문자
			System.out.println(c1+"를 "+c2+"로 변경합니다.");
		
		//3.97-122사이면 (소문자이면)
		//예)  97 이라면 : 'a'를 'A'로 변경합니다 출력
		
		}else if(ran>=97 && ran<=122) {
				char c1 = (char)ran;
				char c2 = (char)(ran-32);
				System.out.println(c1+"를 "+c2+"로 변경합니다.");
		
		//4. 1-50 이거나 150-200 사이면 종료
		
		}else if((ran>=1 && ran<=50) || 
		(ran>=150 && ran<=200)) break;
	}
		
		
		
	




















