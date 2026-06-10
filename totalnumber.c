#include<stdio.h>
void main(){
    int n,i,j=0;

    printf("entre the n");
    scanf("%d",&n);
    for(i=n;i!=0;i=i/10){
         j++;
    }
    printf("%d",j);
}