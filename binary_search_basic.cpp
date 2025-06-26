#include <iostream>
using namespace std;

int binary_search(int arr[],int size, int key){
	

 int start=0;
 int end= size-1;
 
 int mid=(start+end)/2;
 
 while(start<=end){
 	if(arr[mid]==key){
 		return mid;
	 }
	 
	 if(key>arr[mid]){
	 	start=mid+1;
	 	
	 }
	 else{
	 	end=mid-1;
	 }
	 int mid=(start+end)/2 ;
 }
 return -1;
 
 
}
int main(){
	int odd[5]={3,8,11,14,16};
	int even[6]={2,4,6,8,10,18};
	
	int index=binary_search(even,6,10);
	cout << "Index of 10 is " << index << endl;
	
	return 0;
}


