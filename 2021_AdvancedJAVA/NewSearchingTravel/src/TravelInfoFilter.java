// 함수형 인터페이스 = 인터페이스에 하나의 메서드만 정의한 것 
public interface TravelInfoFilter {
	public boolean isMatched(TravelInfo travelInfo);
}
