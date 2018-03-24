package sizeyunsuan;

import java.util.*;

public class jiajianchengchu {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要输出多少道运算题");
		int h=input.nextInt();
		String [] arr1=new String[h];
		System.out.println("请输入你要计算数的最大值");
		int g=input.nextInt();
		Random random = new Random();
		char arr[] = {'+','-','*','/'};
			System.out.println("201571030331");
			for(int i=0;i<h;i++)
                 {
                     int u=(int)(Math.random()*g);
                     int v=(int)(Math.random()*g);
                     int x=(int)(Math.random()*g);
                     int y=(int)(Math.random()*g);
                     char w=arr[random.nextInt(4)];
                     if(u%v==0 && u%x==0 && u%y==0 && v%x==0 && v%y==0 && x%y==0 && w=='/'){
                         System.out.println(u+" "+w+" "+v+" "+w+" "+x+" "+w+" "+y+"=");
                     }
                    else
                        System.out.println(u+" "+arr[random.nextInt(4)]+" "+v+" "
                    +arr[random.nextInt(4)]+" "+x+" "+arr[random.nextInt(4)]+" "+y+" = ");
                 }   
             }
		}	
