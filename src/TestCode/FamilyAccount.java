package TestCode;

public class FamilyAccount {

	public static void main(String[] args) {
		boolean isFlag = true;
		String details = "收支\t\t账户金额\t\t收支金额\t\t说 明\n";
		int balance = 10000;
//		System.out.println(Utility.printLine("居 中"));
//		System.out.println(Utility.printLine(""));
//		System.out.println(Utility.printLine("汉"));
		
		while (isFlag) {
			System.out.println("---------------------家庭收支记账软件--------------------\n");
			System.out.println("                     1 收支明细");
			System.out.println("                     2 登记收入");
			System.out.println("                     3 登记支出");
			System.out.println("                     4 退   出\n");
			System.out.print("                     请选择（1-4）： ");

			char selection = Utility.readMenuSelection();
			switch (selection) {
			case '1':
				// System.out.println("1 收支明细");
				System.out.println("---------------------当前收支明细记录-------------------\n");
				System.out.println(details);
				System.out.println("------------------------------------------------------");

				break;
			case '2':
				// System.out.println("2 登记收入");
				System.out.print("本次收入金额：");
				int money = Utility.readNumber();
				System.out.print("本次收入说明：");
				String info = Utility.readString();
				// 处理details
				balance += money;
				details += ("收入\t\t" + balance + "\t\t" + money + "\t\t" + info + "\n");
				System.out.println("-----------------------登记完成-------------------------");
				break;
			case '3':
				System.out.print("本次支出金额：");
				int outMoney = Utility.readNumber();
				System.out.print("本次支出说明：");
				String outInfo = Utility.readString();
				// 处理details
				if (outMoney > balance) {
					System.out.println("支出超过账户总金额");
				} else {
					balance -= outMoney;
					details += ("收入\t\t" + balance + "\t\t" + outMoney + "\t\t" + outInfo + "\n");
					System.out.println("-----------------------登记完成-------------------------");
				}
				break;
			case '4':
				// System.out.println("4 退出");
				System.out.print("是否确认退出(Y/N): ");
				char isExit = Utility.readConfirmSelection();
				if (isExit == 'Y') {
					System.out.println("程序已退出！");
					isFlag = false;
				}
				break;
			default:
				break;
			}

		}

	}
}
