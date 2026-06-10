#include<stdio.h>
void main(){
    int n,i,j=0;

    printf("entre the n");
    scanf("%d",&n);
    for(i=1;i<=n;i+2){
         j=j+i;
    }
    printf("%d",j);
}