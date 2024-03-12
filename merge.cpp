#include <bits/stdc++.h>
using namespace std;
struct Node {
	int key;
	struct Node* next;
};

Node* newNode(int key){
	Node* temp = new Node;
	temp->key = key;
	temp->next = NULL;
	return temp;
}
int main() {

	Node* a = newNode(1);
	a->next = newNode(3);
	a->next->next = newNode(4);
	a->next->next->next = newNode(5);

	Node* b = newNode(2);
	b->next = newNode(4);
	b->next->next = newNode(9);
vector<int>v;
	while(a!=NULL){
	v.push_back(a->key);
	a=a->next;
	}
	while(b!=NULL){
	v.push_back(b->key);
	b=b->next;
	}
	sort(v.begin(),v.end());
	Node* result= newNode(-1);
	Node* temp=result;
	for(int i=0;i<v.size();i++){
	result->next=newNode(v[i]);
	result=result->next;
	}
	temp=temp->next;
	cout<<"Resultant Merge Linked List Is :"<<endl;
	while(temp!=NULL){
	cout<<temp->key<<" ";
	temp=temp->next;
	}
	return 0;
}
