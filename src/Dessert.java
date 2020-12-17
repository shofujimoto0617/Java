
public enum Dessert {
//	APPLE(100), ICE_CREAM(200), CAKE(300),;
//
//	private int price;
//
//	private Dessert(int price) {
//		this.price = price;
//	}
//
//	public int getPrice() {
//		return price;
//	}

	APPLE(100) {
		@Override
		void advertise() {
			System.out.println("まっかなりんご" + getPrice() + "円!");
		}
	},

	ICE_CREAM(200) {
		@Override
		void advertise() {
			System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円!");
		}
	},

	CAKE(300) {
		@Override
		void advertise() {
			System.out.println("皆大好き甘いケーキが" + getPrice() + "円!");
		}
	}
	;

	private int price;

	private Dessert(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	abstract void advertise();

	public static void main(String[] args) {
//		System.out.println(Dessert.APPLE.getPrice());
//		System.out.println(Dessert.ICE_CREAM.getPrice());
//		System.out.println(Dessert.CAKE.getPrice());

		Dessert.APPLE.advertise();
		Dessert.ICE_CREAM.advertise();
		Dessert.CAKE.advertise();

	}
}


