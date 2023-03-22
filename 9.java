class main{
public static void main(String[] args){
int row=5;
int col=7;
for(int i=1;i<=row;i++){
   String bag="";
      for(int j=1;j<=col;j++)
      {
       if(j%2==1){
       if(i%2==1){
         bag+=" *"+"_";
      }
      }
      else if(j%2==0){ 
      if(i%2==0){
         bag+=" *"+"_";
       }
     }
     }
     System.out.println(bag);
 
}
}
}

