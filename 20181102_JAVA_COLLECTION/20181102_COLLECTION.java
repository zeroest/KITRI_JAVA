
int ar[] = new int[5];
for(int a : ar){
	sum += a;
}
for(타입 변수명 : 배열 / list / set / map){
}

-set 객체 저장시 동일 판단
1> 기준 : 사용자 정하자 : Product:code 같으면 같다
2> hashCode() 오버라이딩 : int 값 동일하면
3> equals() 오버라이딩 : true
4> set add 무시


Map(kry, data):순서 없다, 데이터 중복 허용 but 키중복 불가

Map map1 = new HashMap();
Map<K,V> map2 = new HashMap<K,V>();

저장 map1.put("subject","java");
저장 map1.put("book","java");
저장 map1.put("book","spring"); //book java를 book spring 으로 변경


조회
map1.get("subject");














































