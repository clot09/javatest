package mytest;

public class Testenum {

	public  enum  testcolor{
		red,green,white,black,blue;
	}
//	 ö������ͨ����һ������������Ժͷ���������Ϊ����Ӿ�̬�ͷǾ�̬�����Ի򷽷�
	public enum seasonlist{
		spring,summer,autumn,winter;
		private final static String postition="test";
			public static seasonlist getSeason(){
				// ע��ö��д����ǰ�棬����������
				if("test".equals(postition))
					return spring;
				else 
					return winter;
			}
			
	}
	   public enum Gender{
	        //ͨ�����Ÿ�ֵ,���ұ������һ���ι�������һ�����Ը�����������������
	        //��ֵ���붼��ֵ�򶼲���ֵ������һ���ָ�ֵһ���ֲ���ֵ���������ֵ����д����������ֵ����Ҳ����
	        MAN("MAN"), WOMEN("WOMEN");
	        
	        private final String value;

	        //������Ĭ��Ҳֻ����private, �Ӷ���֤���캯��ֻ�����ڲ�ʹ��
	        Gender(String value) {
	            this.value = value;
	        }
	        
	        public String getValue() {
	            return value;
	        }
	        public enum OrderState {
	            /** ��ȡ�� */
	            CANCEL {public String getName(){return "��ȡ��";}},
	            /** ����� */
	            WAITCONFIRM {public String getName(){return "�����";}},
	            /** �ȴ����� */
	            WAITPAYMENT {public String getName(){return "�ȴ�����";}},
	            /** ������� */
	            ADMEASUREPRODUCT {public String getName(){return "�������";}},
	            /** �ȴ����� */
	            WAITDELIVER {public String getName(){return "�ȴ�����";}},
	            /** �ѷ��� */
	            DELIVERED {public String getName(){return "�ѷ���";}},
	            /** ���ջ� */
	            RECEIVED {public String getName(){return "���ջ�";}};
	            
	            public abstract String getName();
	        }
	        
	        public static void main(String[] args) {
	            //ö����һ�����ͣ����ڶ�������������Ʊ����ĸ�ֵ����ֵʱͨ����ö����.ֵ��ȡ��ö���е�ֵ
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
	            
	            //����ö��
	            System.out.println("����ColorEnumö���е�ֵ");
	            for(testcolor color : testcolor.values()){
	                System.out.println(color);
	            }
	            
	            //��ȡö�ٵĸ���
	            System.out.println("testcolorö���е�ֵ��"+testcolor.values().length+"��");
	            
	            //��ȡö�ٵ�����λ�ã�Ĭ�ϴ�0��ʼ
	            System.out.println(testcolor.red.ordinal());//0
	            System.out.println(testcolor.white.ordinal());//1
	            System.out.println(testcolor.black.ordinal());//2
	            System.out.println(testcolor.blue.ordinal());//3
	            
	            //ö��Ĭ��ʵ����java.lang.Comparable�ӿ�
	            System.out.println(testcolor.red.compareTo(testcolor.black));//-1
	            
	            //--------------------------
	            System.out.println("===========");
	            System.err.println("����Ϊ" + seasonlist.getSeason());
	            
	            
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
