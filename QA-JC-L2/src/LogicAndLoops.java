
public class LogicAndLoops {

	public static void main(String[] args) {
		// оператор if
		boolean a = true;
		        if(a==true){
		            System.out.println("true");    
		        }
		        
		        int month=12;
		        if(month==12){            
		            System.out.println("December");
		        }
		        
		        /*
		         * Создать программу, проверяющую и сообщающую
		         * на экран, является ли целое число записанное в
		         * переменную n, чётным либо нечётным.
		         */
		        int n=10;
		        if(n%2==1){            
		            System.out.println("Число "+n+" являеться не четным");
		        }
		        if(n%2==0){            
		            System.out.println("Число "+n+" являеться четным");
		        }

		        String cht="";//"" т.к. просит инициализировать переменную
		        if(n%2==1){            
		            cht ="не четным";
		        }
		        if(n%2==0){            
		            cht ="четным";
		        }
		        System.out.println("Число "+n+" являеться "+cht);
		        
		        //решение через if-else
		        if(n%2==1){            
		            System.out.println("Число "+n+" являеться не четным");
		        }else{
		            System.out.println("Число "+n+" являеться четным");
		        }
		        
		        /*Создать программу, выводящую на экран
		         * ближайшее к 10 из двух чисел, записанных в переменные m и b.
		         * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
		         */
		        double m=8.5, b=11.45;
		        if(Math.abs(10-m)<Math.abs(10-b))            
		            System.out.println("Число "+m+" ближайшее к десяти");
		        else
		            System.out.println("Число "+b+" ближайшее к десяти");
		        
		        //тернарный оператор
		        boolean a1=true;
		        boolean b1=true;
		        System.out.println(a1==b1 ? "a и b равны!" : "a и b не равны!");
		        
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
		                        dayString = "Понедельник";
		                    break;//обязательно в конце каждого кейса, 
		                    	  //иначе пойдет выполнение следующего
		                    case 2:  
		                        dayString = "Вторник";
		                    break;
		                    case 3:  
		                        dayString = "Среда";
		                    break;
		                    case 4:  
		                        dayString = "Четверг";
		                    break;
		                    case 5:  
		                        dayString = "Пятница";
		                    break;
		                    case 6:  
		                        dayString = "Суббота";
		                    break;
		                    case 7:  
		                        dayString = "Воскресенье";
		                    break;
		                    default:
		                        dayString = "Ошибка";
		                    break;
		                }
		                System.out.println(dayString);
		               
		                //Оператор break
		                boolean t = true;
		                first:{
		                    second:{
		                        third:{
		                            System.out.println("Предшествует оператору break.");
		                                if(t) break second; // выход из блока second
		                                System.out.println("не будет выполняться");
		                        }
		                		System.out.println("не будет выполняться");
                        	}
		                	System.out.println("следует за блоком second.");
		                }
		                
		                String who = "someone";
		                if (!who.equals("me"))//сравнение строк
		                	who = "Cat";
		                else
		                	who = "me";
		                System.out.println(who);
		           
		                //Вложенный if
		                int i=5, j=21, a3=1, b3=2, c3=3, d3=4, k3=5;		                
		                if(i == 10){
		                    if(j < 20) a3 =b3;
		                    if(k3 > 100) c3 =d3;
		                    else 
		                    	a3 = c3;  // else относится к if(k > 100)
		                }
		                else 
		                	a3 = d3; // else относится к if(i == 10)
		                
		                //Сокращенные логические операции
		                int mouse; // число мышек
		                int weight; // вес кота в граммах
		                mouse = 0;
		                weight = 4500;
		                if (mouse != 0 && weight / mouse < 1000) {
		                	System.out.println("Можно кормить кота");
		                }
		                
		                //for с несколькими счетчиками
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
