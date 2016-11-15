import java.io.*; 
import java.util.Arrays; 
public class Snake2 {  
public static void main(String args[])throws Exception{    

		InputStreamReader r=new InputStreamReader(System.in);  
BufferedReader br=new BufferedReader(r);

int laddercount=4;
int snakecount=4;
int[] ls=new int[laddercount+1];
int[] le=new int[laddercount+1];
int[] sm=new int[snakecount+1];
int[] st=new int[snakecount+1];
sm[1]=27;sm[2]=17;sm[3]=19;sm[4]=21;
st[1]=1;st[2]=4;st[3]=7;st[4]=9;
ls[1]=3;ls[2]=5;ls[3]=11;ls[4]=20;
le[1]=22;le[2]=8;le[3]=26;le[4]=29;
int throw1=0,diff1,insideelse=0,diff2=0;

int flag=0,flag1=0,c1=0;
int newdiceposition;
int[] ladderposition=new int[100];
int[] ladderfounder=new int[10]; 
System.out.println("Enter the destination you want to reach");
int destination=Integer.parseInt(br.readLine());
//i am changing here for starting position
int diceposition=0;
int diff=destination-diceposition;
int checking=0;
while(diff>0){
int count=1;
for(int i=diceposition;i<=diceposition+6;i++){
//System.out.println("\n dice path ="+i);

for(int j=1;j<=laddercount;j++){
//System.out.println("\n inside for");
if(ls[j]==i){
int path=destination-le[j];
//System.out.println("\n selecting ladder ="+ls[j]);
if(path>0 || path==0){
//System.out.println("\n inside ="+path);
ladderfounder[0]=0;
ladderfounder[count]=path;
count++;
ladderposition[path]=j;
}
}
}
}
if(count>1){
//System.out.println("\n inside count="+count);
//add sorting algorithm here;
//java.util.Arrays.sort(ladderfounder);
int swap;
int n=count-1;
//System.out.println("\n inside count="+n);
for (int c = 0 ; c < ( n - 1 ); c++)
  {
    for (int d = 0 ; d < n - c - 1; d++)
    {
      if (ladderfounder[d] > ladderfounder[d+1])
      {
        swap       = ladderfounder[d];
        ladderfounder[d]   = ladderfounder[d+1];
        ladderfounder[d+1] = swap;
      }
    }
  }    
 
     

//here is some problem===========================================================================
int m=ladderfounder[1];
int m1=ladderposition[m];
diceposition=le[m1];
//System.out.println("\n dice position ="+diceposition);
throw1++;
count=0;
//changed
diff2=destination-diceposition;
if(diff2==0)
break;
//System.out.println("\n inside count > 1 and diceposition ="+diceposition);
} else{//System.out.println("\n inside else");
    for(int l=6;l>0;l--){
//System.out.println("\n inside else");
diff1=destination-diceposition;
if(diff1>6){//System.out.println("\n inside diff1");

        newdiceposition=diceposition+l;

        if(newdiceposition==destination){
            throw1++;
            diceposition=newdiceposition;
            break;
        } else {
        for(int j=1;j<=snakecount;j++){
            if(newdiceposition==sm[j]){
                flag=1;
                  if(c1==0){
                       c1++;
                  diceposition=st[j];
                       break;}
            }
            
        }
        /*for(int j1=1;j1<=laddercount;j1++){
            if(newdiceposition==ls[j1]){
                flag1=1;
            }
            
        }*/
        if(flag!=1){
              if(c1==1){
                      diceposition=newdiceposition;
                   throw1++;
                    break; 
                  }
        }
        else{
            flag=0;
            flag1=0;
        }
    }
} else {
throw1++;
diceposition=diceposition+diff1;
insideelse=1;
//System.out.println("\n inside else"+throw1);
break;
}
            
    }//end of for loop 
}//end of else 
diff=destination-diceposition;
//System.out.println("\n differnece"+diff);
if(diff<=6){
if(insideelse!=1)
throw1++;

break;
}
}//end of while loop
System.out.println("Minimum throws = "+throw1);

}  
}  














































