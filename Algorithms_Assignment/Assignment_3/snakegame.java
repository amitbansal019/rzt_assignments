import java.io.*; 
import java.util.Arrays; 
public class Snakegame {  
public static void main(String args[])throws Exception{    

		InputStreamReader r=new InputStreamReader(System.in);  
BufferedReader br=new BufferedReader(r);

int laddercount=4;
int snakecount=4;
int[] ls=new int[laddercount+1];
int[] le=new int[laddercount+1];
int[] sm=new int[snakecount+1];
int[] st=new int[snakecount+1];
sm[1]=17;sm[2]=19;sm[3]=21;sm[4]=27;
st[1]=4;st[2]=7;st[3]=9;st[4]=1;
ls[1]=3;ls[2]=5;ls[3]=11;ls[4]=20;
le[1]=22;le[2]=8;le[3]=26;le[4]=29;
int throw1=0,diff1,insideelse=0,diff2=0;
int count=1;
int flag=0,flag1=0;
int newdiceposition;
int[] ladderposition=new int[100];
int[] ladderfounder=new int[10]; 
System.out.println("Enter the destination you want to reach");
int destination=Integer.parseInt(br.readLine());
//i am changing here for starting position
int diceposition=1;
int diff=destination-diceposition;
int checking=0;
while(diff>0){
for(int i=diceposition+1;i<=diceposition+6;i++){


for(int j=1;j<=laddercount;j++){
if(ls[j]==i){
int path=destination-le[j];

if(path>0 || path==0){
//System.out.println("\n difference ="+path);
ladderfounder[0]=0;
ladderfounder[count]=path;
count++;
ladderposition[path]=j;
}
}
}
}
if(count>1){
//add sorting algorithm here;
//java.util.Arrays.sort(ladderfounder);
int m=ladderfounder[1];
int m1=ladderposition[m];
diceposition=le[m1];
throw1++;
count=0;
//changed
diff2=destination-diceposition;
if(diff2==0)
break;
//System.out.println("\n inside count > 1 and diceposition ="+diceposition);
} else{
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
            }
            
        }
        for(int j1=1;j1<=laddercount;j1++){
            if(newdiceposition==ls[j1]){
                flag1=1;
            }
            
        }
        if(flag!=1 || flag1!=1){
            diceposition=newdiceposition;
            throw1++;
            break;
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
System.out.println("throws ="+throw1);
  
}  
}  














































