/*
Jun 13, 2017
Mohamed Mashaal
centerpoint.cpp
*/

#include <iostream>
#include <cstdio>
using namespace std;

int main(){
	int k ;
	int x , y ;
	int res_x , res_y ;
	while(scanf("%d",&k) , k){
		scanf("%d %d", &x,&y);
		for(int i = 0 ; i < k ; i ++){
			scanf("%d %d",&res_x ,&res_y);
			if(res_x == x || res_y == y)
				printf("divisa");
			else if (res_x > x && res_y > y)
				printf("NE");
			else if (res_x < x && res_y > y)
				printf("NO");
			else if (res_x < x && res_y < y)
				printf("SE");
			else if (res_x > x && res_y < y)
				printf("SE");
		}
	}
	return 0;
}
