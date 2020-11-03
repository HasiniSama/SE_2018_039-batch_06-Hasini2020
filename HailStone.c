#include<stdio.h>

int main(){
    int n;
    printf("Enter an integer: ");
    scanf("%d",&n);
    while(n!=1){
        if(n%2==0){
            n = n/2;
            printf("%d ",n);
        }
        else{
            n = (n*3)+ 1;
            printf("%d ",n);
        }
    }
    return 0;
}
