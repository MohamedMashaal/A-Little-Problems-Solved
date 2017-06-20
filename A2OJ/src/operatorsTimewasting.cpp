//============================================================================
// Name        : A2OJ.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstdio>
using namespace std;

int operatorr() {
	int t , n1 , n2;
	scanf("%d",&t);
	for(int i = 0 ; i < t ; i ++){
		scanf("%d %d", &n1 , &n2);
		if(n1 > n2 )
			printf("%c\n",'>');
		else if(n1 < n2 )
			printf("%c\n",'<');
		else
			printf("%c\n",'=');
	}}

