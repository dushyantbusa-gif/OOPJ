#include<stdio.h>
void main(){
	int i,j,n;
	printf("Entre the number");
	scanf("%d",&n);
	int a[100],t;
	printf("Entre %d number",n);
	for(i=0;i<n;i++){
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++)
		if(a[i]>a[j]){
			t=a[i];
			a[i]=a[j];
			a[j]=t;	
		}
	}
	printf("the number is..\n");
	for(i=0;i<=n;i++){
		printf("%d\n",a[i]);
	}
	printf("new \n");
	scanf("%d",&a[i]);
	for(i=0;i<=n;i++){
		for(j=i+1;j<n;j++)
		if(a[i]>a[j]){
			t=a[i];
			a[i]=a[j];
			a[j]=t;	
		}
	}
	for(i=0;i<=n;i++){
		printf("%d\n",a[i]);
	}
	
}
