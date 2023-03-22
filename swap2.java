class main{
    public static void main(String[]args){
    int [] arr={-1,2,-3,3,6,9,8,-11};
	String bag="";
	String bag1="";
	for(int i=0;i<arr.length;i++){
	if(arr[i]>0){
	bag+=arr[i];
	}
	else{
	bag1+=arr[i];
	}
	}
	System.out.println(bag+"   "+bag1);
}
}

    
