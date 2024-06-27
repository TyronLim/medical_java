package p0627;

public class C0627_07 {
	public static void main(String[] args) {
		Person p1 = new Person(8801011011111L);
//		p1.id = 8801011011111L;
		Person p2 = new Person(8801011011111L);
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		
		Students s = new Students("홍길동",100,99,98);
		System.out.println(s);
		
		String str = "네안데르탈인의 한 화석이 다운증후군을 앓는 6세 어린이였다는 연구결과가 나왔다. 다운증후군 어린이를 네안데르탈인 공동체가 함께 돌봤다는 점을 시사해 네안데르탈인의 이타적인 면모를 보여준다는 의미가 있다.\r\n"
				+ "\r\n"
				+ "스페인 알칼라대 연구팀이 이끄는 공동연구팀은 145만 년 전 살았던 '티나'라는 별칭의 6세 네안데르탈인 두개골을 분석한 결과를 26일 국제학술지 '사이언스 어드밴시스'에 발표했다.\r\n"
				+ "\r\n"
				+ "티나는 스페인 발렌시아에 위치한 동굴 유적지 '코바 네그라'에서 1989년 발견됐다. 연구팀이 동물의 것으로 분류된 화석을 조사하다 티나의 두개골을 찾아냈다. 뇌, 외이도 주변을 보호하는 측두골 중 하나의 화석이었다. X선으로 물체 내부를 샅샅이 볼 수 있는 마이크로컴퓨터단층촬영(micro-CT)으로 화석을 분석했다.\r\n"
				+ "\r\n"
				+ "그 결과 티나의 내이에 있는 달팽이관이 다른 네안데르탈인 화석에서 드러나는 모습과 달리 부피가 비정상적으로 작다는 사실을 알아냈다. 귀의 제일 안쪽인 내이에는 평형감각을 담당하는 전정기관과 청각을 담당하는 달팽이관이 있다.\r\n"
				+ "\r\n"
				+ "또 몸이 어떤 각도와 방향으로 회전하는지를 감지하는 '반고리관'에서 기형을 발견했다. 이같은 특징을 두고 연구팀은 \"다운증후군 환자에게서 주로 발견되는 특성\"이라면서 \"티나는 청력을 상실했고 균형 및 평형을 유지하는 감각이 매우 떨어져 있었을 것\"이라고 설명했다.\r\n"
				+ "\r\n"
				+ "이번 연구를 이끈 메르세데스 콘데 발베르데 교수는 \"다운증후군 증상 중 하나인 현기증 발작으로 인해 다운증후군 어린이가 속한 공동체는 쉽게 이동하기 어려웠을 것\"이라면서 \"다운증후군 어린이는 공동체로부터 많은 보살핌을 받아 6세까지 살아남은 것으로 보인다\"고 말했다.\r\n"
				+ "\r\n"
				+ "네안데르탈인의 이타적인 면모는 고고학자들이 관심 갖는 주제다. 현생 인류인 '호모사피엔스'가 이타심을 갖고 있어 살아남았다는 주장을 반박할 수 있는 내용이기 때문이다.\r\n"
				+ "\r\n"
				+ "이라크 샤니다르 동굴에서 발견된 성인 남성 네안데르탈인 화석은 부상으로 다리가 손상됐으며 한쪽 눈은 잘 보이지 않은 상태였다. 그가 부상을 입은 뒤에 10~15년 더 살았다는 사실이 밝혀져 학계에서는 이를 네안데르탈이 약한 동료를 보살필 줄 알았다는 점을 보여주는 증거라고 평가했다.";
		System.out.println(str.hashCode());
		str = "네안데르탈인의 한 화석이 다운증후군을 앓는 6세 어린이였다는 연구결과가 나왔다. 다운증후군 어린이를 네안데르탈인 공동체가 함께 돌봤다는 점을 시사해 네안데르탈인의 이타적인 면모를 보여준다는 의미가 있다.\r\n"
				+ "\r\n"
				+ "스페인 알칼라대 연구팀이 이끄는 공동연구팀은 145만 년 전 살았던 '티나'라는 별칭의 6세 네안데르탈인 두개골을 분석한 결과를 26일 국제학술지 '사이언스 어드밴시스'에 발표했다.\r\n"
				+ "\r\n"
				+ "티나는 스페인 발렌시아에 위치한 동굴 유적지 '코바 네그라'에서 1989년 발견됐다. 연구팀이 동물의 것으로 분류된 화석을 조사하다 티나의 두개골을 찾아냈다. 뇌, 외이도 주변을 보호하는 측두골 중 하나의 화석이었다. X선으로 물체 내부를 샅샅이 볼 수 있는 마이크로컴퓨터단층촬영(micro-CT)으로 화석을 분석했다.\r\n"
				+ "\r\n"
				+ "그 결과 티나의 내이에 있는 달팽이관이, 다른 네안데르탈인 화석에서 드러나는 모습과 달리 부피가 비정상적으로 작다는 사실을 알아냈다. 귀의 제일 안쪽인 내이에는 평형감각을 담당하는 전정기관과 청각을 담당하는 달팽이관이 있다.\r\n"
				+ "\r\n"
				+ "또 몸이 어떤 각도와 방향으로 회전하는지를 감지하는 '반고리관'에서 기형을 발견했다. 이같은 특징을 두고 연구팀은 \"다운증후군 환자에게서 주로 발견되는 특성\"이라면서 \"티나는 청력을 상실했고 균형 및 평형을 유지하는 감각이 매우 떨어져 있었을 것\"이라고 설명했다.\r\n"
				+ "\r\n"
				+ "이번 연구를 이끈 메르세데스 콘데 발베르데 교수는 \"다운증후군 증상 중 하나인 현기증 발작으로 인해 다운증후군 어린이가 속한 공동체는 쉽게 이동하기 어려웠을 것\"이라면서 \"다운증후군 어린이는 공동체로부터 많은 보살핌을 받아 6세까지 살아남은 것으로 보인다\"고 말했다.\r\n"
				+ "\r\n"
				+ "네안데르탈인의 이타적인 면모는 고고학자들이 관심 갖는 주제다. 현생 인류인 '호모사피엔스'가 이타심을 갖고 있어 살아남았다는 주장을 반박할 수 있는 내용이기 때문이다.\r\n"
				+ "\r\n"
				+ "이라크 샤니다르 동굴에서 발견된 성인 남성 네안데르탈인 화석은 부상으로 다리가 손상됐으며 한쪽 눈은 잘 보이지 않은 상태였다. 그가 부상을 입은 뒤에 10~15년 더 살았다는 사실이 밝혀져 학계에서는 이를 네안데르탈이 약한 동료를 보살필 줄 알았다는 점을 보여주는 증거라고 평가했다.";
		System.out.println(str.hashCode());
		
		
		
	}
}