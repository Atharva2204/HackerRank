#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    unsigned long int num[n];
    unsigned long int sum=0;
    for(int i =0;i<n;i++)
    {
        cin>>num[i];
        sum+=num[i];
    }
    cout<<sum;
}
