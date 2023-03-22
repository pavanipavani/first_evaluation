class main{
public static void main(String[] args){
int [] arr = {-1,2,-3,3,6,9,8,-11};
String a="";
String b="";
for(int i=0;i<arr.length;i++){
if(arr[i]>0){
a+=arr[i];
}else{
b+=arr[i];
}
}
System.out.println(a+""+b);
}
}

