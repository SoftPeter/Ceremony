package C11_CollectionFramework;

import java.util.*;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID와 Password를 입력하세요.");
			System.out.print("ID : ");
			String id = sc.nextLine().trim();
			
			System.out.print("Password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("ID 없음,재입력");
			} else {
				if(!(map.get(id).equals(password))){
					System.out.println("비밀번호 불일치");
				} else {
					System.out.println("안녕하세요.");
					break;
				}
			}
		}
	}
}