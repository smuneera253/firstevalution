class main{
    public static void main(String[]args){
    int num=4;
    for(int i=1;i<=num;i++){
    	String bag="";
    	for(int j=1;j<=num;j++){
    	if(j%2==1){
    	if(i%2==1){
    	bag+="*"+"_"+"*"+"_";
    	}
    	}
    	else if(j%2==0){
    	if(i%2==0){
    	bag+="_"+"*"+"*";
    	}
    	}
    	
    	}
    	System.out.println(bag);
    	}
    	}
}
