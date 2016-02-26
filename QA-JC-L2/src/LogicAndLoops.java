
public class LogicAndLoops {

	public static void main(String[] args) {
		// �������� if
		boolean a = true;
		        if(a==true){
		            System.out.println("true");    
		        }
		        
		        int month=12;
		        if(month==12){            
		            System.out.println("December");
		        }
		        
		        /*
		         * ������� ���������, ����������� � ����������
		         * �� �����, �������� �� ����� ����� ���������� �
		         * ���������� n, ������ ���� ��������.
		         */
		        int n=10;
		        if(n%2==1){            
		            System.out.println("����� "+n+" ��������� �� ������");
		        }
		        if(n%2==0){            
		            System.out.println("����� "+n+" ��������� ������");
		        }

		        String cht="";//"" �.�. ������ ���������������� ����������
		        if(n%2==1){            
		            cht ="�� ������";
		        }
		        if(n%2==0){            
		            cht ="������";
		        }
		        System.out.println("����� "+n+" ��������� "+cht);
		        
		        //������� ����� if-else
		        if(n%2==1){            
		            System.out.println("����� "+n+" ��������� �� ������");
		        }else{
		            System.out.println("����� "+n+" ��������� ������");
		        }
		        
		        /*������� ���������, ��������� �� �����
		         * ��������� � 10 �� ���� �����, ���������� � ���������� m � b.
		         * ��������, ����� ����� 8,5 � 11,45 ��������� � ������ 11,45.
		         */
		        double m=8.5, b=11.45;
		        if(Math.abs(10-m)<Math.abs(10-b))            
		            System.out.println("����� "+m+" ��������� � ������");
		        else
		            System.out.println("����� "+b+" ��������� � ������");
		        
		        //��������� ��������
		        boolean a1=true;
		        boolean b1=true;
		        System.out.println(a1==b1 ? "a � b �����!" : "a � b �� �����!");
		        
		        int a2 = 42;
		        int b2 = 2;
		        int d = 0;
		        int e = (b == 0) ? 0 : (a2 / b2);
		        int f = (d == 0) ? 0 : (b2 / d);
		        System.out.println("a / b = " + e);
		        System.out.println("c / d = " + f);
		        
		        //switch
		            int day = 1;
		                String dayString;
		                switch (day) {
		                    case 1:  
		                        dayString = "�����������";
		                    break;//����������� � ����� ������� �����, 
		                    	  //����� ������ ���������� ����������
		                    case 2:  
		                        dayString = "�������";
		                    break;
		                    case 3:  
		                        dayString = "�����";
		                    break;
		                    case 4:  
		                        dayString = "�������";
		                    break;
		                    case 5:  
		                        dayString = "�������";
		                    break;
		                    case 6:  
		                        dayString = "�������";
		                    break;
		                    case 7:  
		                        dayString = "�����������";
		                    break;
		                    default:
		                        dayString = "������";
		                    break;
		                }
		                System.out.println(dayString);
		               
		                //�������� break
		                boolean t = true;
		                first:{
		                    second:{
		                        third:{
		                            System.out.println("������������ ��������� break.");
		                                if(t) break second; // ����� �� ����� second
		                                System.out.println("�� ����� �����������");
		                        }
		                		System.out.println("�� ����� �����������");
                        	}
		                	System.out.println("������� �� ������ second.");
		                }
		                
		                String who = "someone";
		                if (!who.equals("me"))//��������� �����
		                	who = "Cat";
		                else
		                	who = "me";
		                System.out.println(who);
		           
		                //��������� if
		                int i=5, j=21, a3=1, b3=2, c3=3, d3=4, k3=5;		                
		                if(i == 10){
		                    if(j < 20) a3 =b3;
		                    if(k3 > 100) c3 =d3;
		                    else 
		                    	a3 = c3;  // else ��������� � if(k > 100)
		                }
		                else 
		                	a3 = d3; // else ��������� � if(i == 10)
		                
		                //����������� ���������� ��������
		                int mouse; // ����� �����
		                int weight; // ��� ���� � �������
		                mouse = 0;
		                weight = 4500;
		                if (mouse != 0 && weight / mouse < 1000) {
		                	System.out.println("����� ������� ����");
		                }
		                
		                //for � ����������� ����������
		                int a4, b4;
		                b4 = 4;
		                for(a4 = 1; a4 < b4; a4++) {
		                	System.out.println("a = " + a4 + "\n");
		                	System.out.println("b = " + b4 + "\n");
		                    b4--;
		                }
		                
		                //while
		                int i2 =1;
		                while(i2 < 5){
		                    System.out.println("i= " + i2);
		                    i2++;
		                }
		                
		                //do-while
		                int i3 =10;
		                do{
		                    System.out.println("i= " + i3);
		                    i3--;
		                }while(i3 > 5);

	}

}
