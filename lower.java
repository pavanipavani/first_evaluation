class main{
public static void main(String[] args){
String lower={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
String upper={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
String str=“Great PoWer”;
for(int i=0;i<str.length;i++)
{
	if(str[i]==lower[i]){
	lower[i]=upper[i];
        }
}
System.out.println(lower[i]);
}
}



