import java.util.Scanner;
public class Ex01tigerTeam {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" ------------.  ,------- :!!:  -------- :!!-    .-------     ,------- ~!!~  ---.          \r\n"
				+ "           $@@@@@@@@@@@~  =@@@@@@# *@@= .$@@@@@@@ *@@:   #@@@@@@@@@!   *@@@@@@@ !@@; ,#@@:          \r\n"
				+ "           $@@@@@@@@@@@~  =@@@@@@@ *@@= .$@@@@@@@ *@@:  *@@@@@@@@@@@~ .=@@@@@@@ !@@; ,@@@:          \r\n"
				+ "           -~~~~~~~~#@@-  -~~~!@@@ *@@=  -~~~#@@@ *@@: .=@@!~~~~~$@@:  -~~~@@@@ !@@; ,@@@:          \r\n"
				+ "           ~;;;;;;;;#@@-      ;@@@ *@@=      #@@# *@@: .$@@:    .=@@:      #@@@ !@@; ,@@@~          \r\n"
				+ "           $@@@@@@@@@@@-  -~~~$@@@ *@@=  ,~~~@@@* *@@:  *@@@@@@@@@@@~      #@@= !@@; ,@@@~          \r\n"
				+ "           $@@@@@@@@@@@-  =@@@@@@= *@@=  =@@@@@@~ *@@:  ,@@@@@@@@@@=.      #@@- !@@; ,@@@~          \r\n"
				+ "                    =@@-  =@@@@@@, *@@=  =@@@@@@  *@@:    .;;;;;;:        ,@@@. !@@; .$@@-          \r\n"
				+ "           -~~~~~~~~;!!:     *@@@  *@@=     =@@$  *@@: .~~~~~~~~~~~~-     *@@#  !@@; .=@#,          \r\n"
				+ "          .$@@@@@@@@@@@@    -#@@;  *@@=    -@@@:  *@@: -@@@@@@@@@@@@=    ,#@@;  !@@;  *@#.          \r\n"
				+ "          .$@@@@@@@@@@@@   .@@@#,  *@@=   -@@@=   *@@: -@@@@@@@@@@@@=   -@@@$   !@@;                \r\n"
				+ "           ;****@@@=****  $@@@@~   *@@= -#@@@#-   *@@: ,!****@@@****: ,#@@@#~   !@@;  ;@!.          \r\n"
				+ "               .@@@-      =@@=-    *@@= .$@@*,    *@@:      .@@@       =@@*,    !@@; ,#@@~          \r\n"
				+ "               .@@#-      =*.      *@@=  !!       *@@:      .@@@       ;!.      !@@; .=@#,          \r\n"
				+ "                ---                ,--,           ,--.       ---                ,--,  ,!-           ");
		
		
		
		String text = " 평화로운 쿠키마을에 사는 용맹한 전사 쿠키는 어느 날, 악당 초코몬스터와 그의 부하들이 공격해왔다. 마을은 파괴되고 주민들은 위협받고 있었다."
				+" 쿠키는 자신의 마을을 지키기 위해 전사로 일어나 악당에 맞서기로 결심한다. "
				+"그는 특별한 능력과 함께 무기를 갖추고, 모험과 도전 속에서 성장하며 친구들과 협력하여 마을을 되찾는 여정에 나선다. "
				+"악당을 물리치고 마을에 다시 평화가 찾아오게끔, 쿠키는 용감한 용사로서의 자부심을 얻는다.\r\n";
		
		
		for(int i =0;i<text.length();i++) {
			System.out.print(text.charAt(i));
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} if(i%45==0) {
				System.out.println();
				
			}
			
		}
		// 캐릭터 선택
		System.out.print("1.용맹쿠키\n"
				+ " 용맹함으로 장차 두려움없이 적진에 진입하여 쿠키마을을 지켜내는 전사 \n");
				
		System.out.print("2.딸기쿠키\n"
				+ " 5대 마법사 가문의 혈통을 이어받아 아직은 소심하지만 대마법사의 잠재력을 지니고 있는 쿠키\n");
		
		int Character =sc.nextInt();
		
		if(Character ==1) {
			
		}else if(Character==2) {
			
		}else {
		 System.out.println("쿠키가 없습니다.");
		}
		
		
		
		

		
	} 
	
}