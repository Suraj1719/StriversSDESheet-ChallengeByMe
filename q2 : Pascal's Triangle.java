import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int numRows) {
        ArrayList<ArrayList<Long>> ans=new ArrayList<>();
        ArrayList<Long>first=new ArrayList<>();
        first.add(1l);
        ans.add(first);
        if(numRows==1)
        return ans;
        ArrayList<Long>sec=new ArrayList<>();
        sec.add(1l);
        sec.add(1l);
        ans.add(sec);
        if(numRows==2)
        return ans;
        numRows-=2;
        first=sec;
        
        while(numRows-->0){
            ArrayList<Long>cur=new ArrayList<>();
            cur.add(1l);
            for(int i=0;i<first.size()-1;i++){
                //System.out.println(first.get(i)+" "+first.get(i+1));
                long sum=first.get(i)+first.get(i+1);
                cur.add(sum);
            }
            cur.add(1l);
            ans.add(cur);
            first=cur;
        }
    return ans;
	}
}
