import java.util.*;
public class Main
{   //Recursion 
    public static int lcs1(String s1,int m,String s2,int n){
        if(m==0||n==0){
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+lcs1(s1,m-1,s2,n-1);
        }
        return Math.max(lcs1(s1,m,s2,n-1),lcs1(s1,m-1,s2,n));
    }
    //Recursion using memoization
    public static int lcs2(String s1,int m,String s2,int n,int[][] mem){
        if(m==0||n==0){
            return 0;
        }
        if(mem[m][n]!=-1){
            return mem[m][n];
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            mem[m][n]=1+lcs2(s1,m-1,s2,n-1,mem);
            return mem[m][n];
        }
        mem[m][n]=Math.max(lcs2(s1,m-1,s2,n,mem),lcs2(s1,m,s2,n-1,mem));
        return mem[m][n];
    }
    //Dynamic Programming
    public static int lcs3(String s1,int l1,String s2,int l2){
        int[][] lcs = new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++){
            for(int j=0;j<=l2;j++){
                if(i==0||j==0){
                    lcs[i][j]=0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    lcs[i][j]=1+lcs[i-1][j-1];
                }
                else{
                    lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        return lcs[l1][l2];
    }
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s1 = scanner.next();
	String s2 = scanner.next();
	int l1 = s1.length();
	int l2 = s2.length();
	System.out.println(lcs1(s1,l1,s2,l2));
	int[][] mem = new int[l1+1][l2+1];
	for(int i=0;i<=l1;i++){
	    for(int j=0;j<=l2;j++){
	        mem[i][j]=-1;
	    }
	}
	System.out.println(lcs2(s1,l1,s2,l2,mem));
	System.out.println(lcs3(s1,l1,s2,l2));
	}
}
