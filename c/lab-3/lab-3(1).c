#include<stdio.h>
void main(){
	int i,n,odd=0,even=0;
	printf("entre the Number");
	scanf("%d",&n);
	int a[n];
	printf("entre %d Number",n);
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		if(a[i]%2==0){
			even++;
		}
		else{
			odd++;
		}
	}
	printf("odd=%d even=%d",odd,even);
	
	
}
