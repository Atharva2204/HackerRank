#include<iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;

    int num[n];
    for(int i=0;i<n;i++)
        cin>>num[i];

    int max=0;
    for(int i=0;i<n;i++)
    {
        if(num[max]<num[i])
            max = i;
    }

    int count = 0;
    for(int i=0;i<n;i++)
    {
        if(num[i]==num[max])
            count++;
    }
    cout<<count;
}
