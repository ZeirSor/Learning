//linkOrderMerge
#include<cstdio>
#include<iostream>
#include<malloc.h>

using namespace std;

typedef struct linkNode
{
	int data;
	struct linkNode* next;
}linkNode;

void insertRear(linkNode **L, int arr[], int len)
{
	linkNode* rear = *L;
	for(int i = 0; i < len; i++){
		linkNode* s = (linkNode*)malloc(sizeof(linkNode));
		s->next = NULL;
		s->data = arr[i];
		s->next = rear->next;
		rear->next = s;
		rear = s;
	}
}

void printLink(linkNode* L)
{
	linkNode* p = L->next;
	while(p) {
		cout << p->data << " ";
		p = p->next;
	}
	cout << endl;
}

void linkMerge(linkNode* la, linkNode *lb ,linkNode** lc)
{
	if(!la){
		*lc = lb;
		return ;
	}
	if(!lb){
		*lc = la;
		return ;
	}
	if(la->data < lb->data)
	{
		*lc = la;
		linkMerge(la->next, lb, &(*lc)->next);
	}

	else if(la->data == lb->data)
		linkMerge(la, lb->next, &(*lc));
	
	else
	{
		*lc = lb;
		linkMerge(lb->next, la, &(*lc)->next);
	}
}

int main_linkList()
{
	linkNode* la = (linkNode*)malloc(sizeof(linkNode));
	la->next = NULL;
	linkNode* lb = (linkNode*)malloc(sizeof(linkNode));
	lb->next = NULL;
	int arr1[4] = {2, 5, 7, 9};
	int arr2[5] = {4, 5, 6, 8, 10};
	insertRear(&la, arr1, 4);
	insertRear(&lb, arr2, 5);
	printLink(la);
	printLink(lb);
	
	linkNode* lc = (linkNode*)malloc(sizeof(linkNode));
	lc->next = NULL;
	linkMerge(la->next, lb->next, &lc->next);
	printLink(lc); 

	return 0;
}

int main_sqStack()
{
	int sqStack[10];
	int top = -1;
	for(int i = 0; i <= 6; i++){
		cin >> sqStack[++top];
	}
	for(int j = top; top != -1; j--){
		cout << sqStack[top--] << " ";
	}
//	cout << "hello" << endl;
	return 0;
}
