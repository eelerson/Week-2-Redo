
public class code {

	public static void main(String[] args) {
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		double costOfMilk = 2.59;
		double moneyInWallet = 41.00;
		int thirstLevel = 2;
		boolean shouldBuyIceCream = (isHotOutside && hasMoneyInPocket);
		boolean willGoSwimming = (isHotOutside &&! isWeekday);
		boolean isGoodDay = (isHotOutside && hasMoneyInPocket &&! isWeekday);
		boolean willBuyMilk = (isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2 * costOfMilk);
		System.out.println(shouldBuyIceCream);
		System.out.println(willGoSwimming);
		System.out.println(isGoodDay);
		System.out.println(willBuyMilk);
	}

}
