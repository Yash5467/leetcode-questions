class Solution {

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
    public static String intToRoman(int num) {
         StringBuilder str=new StringBuilder();
          append(str,'M','*','*',num/1000);
        num=num%1000;
         append(str,'C','D','M',num/100);
        num=num%100;
         append(str,'X','L','C',num/10);
        num=num%10;
        append(str,'I','V','X',num);

        return str.toString();

    }

     public static void append( StringBuilder str,char l , char m , char h , int num)
    {    

        if(num==0)
        {
            
        }
        else if( num<=3)
        {
            for(int i=1;i<=num;i++)
            {
                str.append(l);
            }
        }
        else if(num==4)
        {
            str.append(l);
            str.append(m);
        }
        else if(num==5)
        {
            str.append(m);
        }
        else if(num<=8)
        {   str.append(m);
            for(int i=6;i<=num;i++)
            {
                str.append(l);
            }
        }
        else if(num==9)
        {
            str.append(l);
            str.append(h);
        }
      

    }
}
