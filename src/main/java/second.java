import java.util.Random;
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        System.out.println("四则运算生成器");
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年级：");
        int grade=sc.nextInt();
        System.out.println("请输入题目数量：");
        int count= sc.nextInt();
        switch(grade){
            case 1:
                for(int i=0;i<count;i++)
                {
                    int x=r.nextInt(15);
                    int y=r.nextInt(5);
                    if(i%2==0)
                    {
                        System.out.println(x+"+"+y+"="+(x+y));

                    }
                    else
                    {
                        System.out.println(x+"-"+y+"="+(x-y));
                    }
                }
                break;
            case 2:
                for(int i=0;i<count;i++)
                {
                    int x=r.nextInt(35);
                    int y=r.nextInt(15);
                    if(i%2==0)
                    {
                        System.out.println(x+"+"+y+"="+(x+y));
                    }
                    else
                    {
                        System.out.println(x+"-"+y+"="+(x-y));
                    }
                }
                break;
            case 3:
                for(int i=0;i<count;i++)
                {
                    int q1=r.nextInt(1000);
                    int q2=r.nextInt(1000);
                    int q3=r.nextInt(1000);
                    int q4=r.nextInt(1000);

                    if(i%2==0)
                    {
                        System.out.println(q1+"+"+q2+"*"+q3+"-"+q4+"="+(q1+(q2*q3)-q4));
                    }
                    else if(i%3==0)
                    {
                        System.out.println(q1+"-"+q2+"+"+q3+"*"+q4+"="+(q1-q2+(q3*q4)));
                    }
                }
                break;
            case 4,5,6:
                for(int i=0;i<count;i++)
                {
                    int q1=r.nextInt(10000)+1000;
                    int q2=r.nextInt(10000);
                    int q3=r.nextInt(10000);
                    int q4=r.nextInt(20)+1;
                    if((q1+q2-q3)%q4==0) {
                        System.out.println("("+q1+"+"+q2+"-"+q3+")"+"/"+q4+"="+((q1+q2-q3)/q4));
                    }
                    else if(q1>q3) {
                        System.out.println("("+q1+"+"+q2+"-"+q3+")"+"*"+q4+"="+((q1+q2-q3)*q4));
                    }
                    else if(q1>q2) {
                        System.out.println("("+q1+"-"+q2+")"+"*"+q3+"+"+q4+"="+(((q1-q2)*q3)+q4));
                    }
                    else {
                        System.out.println("("+q1+"+"+q2+")"+"*"+q4+"-"+q3+"="+(((q1+q2)*q4)-q3));
                    }

                }
                break;

        }


    }
}
