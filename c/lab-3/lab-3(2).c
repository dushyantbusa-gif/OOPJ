#include<stdio.h>
void main(){
	int i,n,ne=0,p=0,z=0;
	printf("entre the Number");
	scanf("%d",&n);
	int a[n][n],j;
	printf("entre %d Number",n);
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			scanf("%d",&a[i][j]);
		}
	}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
		
		if(a[i][j]<0){
			ne++;
		}
		else if(a[i][j]>0){
			p++;
		}
		else{
			z++;
		}
	}
	}
	printf("p=%d ne=%d z=%d",p,ne,z);
	
	
}
