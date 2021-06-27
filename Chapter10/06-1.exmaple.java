
// 최근 키워드 검색 코드
package Main;

import java.util.*;

public class Main {
    static Queue q = new LinkedList();
    final static int MAX_SIZE = 5;
    );
    public static void save(String input) {
      if(!"".equals(input)) q.offer(input
      
      if(q.size() > MAX_SIZE) {
        q.remove();
      }
  }
	
	public static void main(String[] args) {
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {

			System.out.print(">>");
      
			try {

				Scanner scan = new Scanner(System.in);
				String input = "";
				input = scan.nextLine().trim();

				if("".equals(input)) continue;
				
				if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어 "+MAX_SIZE+"개 를 보여줍니다.");
				} else if(input.equalsIgnoreCase("q")) {

					System.out.println("프로그램을 종료합니다.");
					scan.close();
					break;

				} else if(input.equalsIgnoreCase("history")) {

					save(input);
					LinkedList list = (LinkedList)q;
					final int size = q.size();
					
          for(int i=0; i<size; i++) {
						System.out.println((i+1)+"."+list.get(i));
					}

				} else {
					save(input);
				} 
			} catch(Exception e) {
				System.out.println("입력오류입니다.");
			}

		}
	} //	while 끝
}
