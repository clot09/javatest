package mytest;

public class Testenum {

	public  enum  testcolor{
		red,green,white,black,blue;
	}
//	 枚举像普通的类一样可以添加属性和方法，可以为它添加静态和非静态的属性或方法
	public enum seasonlist{
		spring,summer,autumn,winter;
		private final static String postition="test";
			public static seasonlist getSeason(){
				// 注：枚举写在最前面，否则编译出错
				if("test".equals(postition))
					return spring;
				else 
					return winter;
			}
			
	}
	   public enum Gender{
	        //通过括号赋值,而且必须带有一个参构造器和一个属性跟方法，否则编译出错
	        //赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值；如果不赋值则不能写构造器，赋值编译也出错
	        MAN("MAN"), WOMEN("WOMEN");
	        
	        private final String value;

	        //构造器默认也只能是private, 从而保证构造函数只能在内部使用
	        Gender(String value) {
	            this.value = value;
	        }
	        
	        public String getValue() {
	            return value;
	        }
	        public enum OrderState {
	            /** 已取消 */
	            CANCEL {public String getName(){return "已取消";}},
	            /** 待审核 */
	            WAITCONFIRM {public String getName(){return "待审核";}},
	            /** 等待付款 */
	            WAITPAYMENT {public String getName(){return "等待付款";}},
	            /** 正在配货 */
	            ADMEASUREPRODUCT {public String getName(){return "正在配货";}},
	            /** 等待发货 */
	            WAITDELIVER {public String getName(){return "等待发货";}},
	            /** 已发货 */
	            DELIVERED {public String getName(){return "已发货";}},
	            /** 已收货 */
	            RECEIVED {public String getName(){return "已收货";}};
	            
	            public abstract String getName();
	        }
	        
	        public static void main(String[] args) {
	            //枚举是一种类型，用于定义变量，以限制变量的赋值；赋值时通过“枚举名.值”取得枚举中的值
	        	testcolor colorEnum = testcolor.blue;
	            switch (colorEnum) {
	            case red:
	                System.out.println("color is red");
	                break;
	            case white:
	                System.out.println("color is white");
	                break;
	            case black:
	                System.out.println("color is black");
	                break;
	            case blue:
	                System.out.println("color is blue");
	                break;
	            }
	            
	            //遍历枚举
	            System.out.println("遍历ColorEnum枚举中的值");
	            for(testcolor color : testcolor.values()){
	                System.out.println(color);
	            }
	            
	            //获取枚举的个数
	            System.out.println("testcolor枚举中的值有"+testcolor.values().length+"个");
	            
	            //获取枚举的索引位置，默认从0开始
	            System.out.println(testcolor.red.ordinal());//0
	            System.out.println(testcolor.white.ordinal());//1
	            System.out.println(testcolor.black.ordinal());//2
	            System.out.println(testcolor.blue.ordinal());//3
	            
	            //枚举默认实现了java.lang.Comparable接口
	            System.out.println(testcolor.red.compareTo(testcolor.black));//-1
	            
	            //--------------------------
	            System.out.println("===========");
	            System.err.println("季节为" + seasonlist.getSeason());
	            
	            
	            //--------------
	            System.out.println("===========");
	            for(Gender gender : Gender.values()){
	                System.out.println(gender.value);
	            }
	           
	            //--------------
	            System.out.println("===========");
	            for(OrderState order : OrderState.values()){
	                System.out.println(order.getName());
	            }
	        }
	        
	    }
}
