import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int i,j;
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String rom[]={" ","I","V","X","L","C","D","M"};
        int num[]={0,1,5,10,50,100,500,1000};
        int x[]=new int[sb.length()];
        for(i=0;i<sb.length();i++)
        {
            for(j=0;j<rom.length;j++)
            {
                if(sb.substring(i,i+1).equals(rom[j]))
                {
                    x[i]=num[j];
                }
            }
        }
        int val=x[0];
        for(i=1;i<x.length;i++)
        {
            if(x[i-1]>x[i])
                x[i]=x[i]*-1;
            val+=x[i];
        }
        return val;
    }    
}