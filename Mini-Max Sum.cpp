#include<iostream>
using namespace std;

int main()
{
    unsigned long int num[5];
    for(int i=0;i<5;i++)
        cin>>num[i];

    unsigned long int min =0,max=0;

    for(int i=0;i<5;i++)
    {
        if(num[min]>num[i])
            min = i;
        if(num[max]<num[i])
            max = i;       
    }

    unsigned long int sum =0,sum1=0,sum2=0;
    for(int i=0;i<5;i++)
        sum+=num[i];

    sum1 = sum-num[max];
    sum2 = sum-num[min];

    cout<<sum1<<" "<<sum2;
}
