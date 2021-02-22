#include<iostream>
using namespace std;

int main()
{
    int a[3];
    int b[3];

    cin>>a[0]>>a[1]>>a[2];
    cin>>b[0]>>b[1]>>b[2];
    int sum=0,sum1=0;

    for(int i=0;i<3;i++)
    {
        if(a[i]>b[i])
            sum++;
        else if(a[i]<b[i])
            sum1++;
    }
    cout<<sum<<" "<<sum1;
}
