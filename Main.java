         Alternative Take char from two different Array
                             
                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

Sample Input:
ch={'a','b','c'}
ch1={'d'}

output:
{a,d,b,c}
*******************************************************************************/
import java.lang.String;
public class Main
{
	public static void main(String[] args) {
		char[] ch={'a','b','c'};
		char[] ch1={'d'};
		int len=ch.length+ch1.length;
		char[] res=new char[len];
		int k=0;
		int i=0;
		int  j=0;
			//System.out.print(len);
			try {
			    for(k=0;k<len;k++){
			        
	    if(k%2==0){
	        if(i<ch.length){           //k=5 ch=3 ch1=2
	    res[k]=ch[i];
	    i++;
	        }
	        else{
	        res[k]=ch1[j];
	    j++; }
	    }
	    else{
	         if(j<ch1.length){
	    res[k]=ch1[j];
	    j++;
	         }
	         else{
	              res[k]=ch[i];
	    i++;
	         }
	         
	    }
	    System.out.print(" "+res[k]);

	}
		   
		 	} catch(Exception e) {
			    	System.out.print(e);
			}
		}
}
