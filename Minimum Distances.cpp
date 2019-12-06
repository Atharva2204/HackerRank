#include<iostream>
#include<cmath>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int num[n];
    for(int i=0;i<n;i++)
        cin>>num[i];

    int a=0;
    int diff[n];
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(num[i]==num[j])
            {
                diff[a] = abs(j-i);
                a++;
            }
        }
    }
    int min=0;
    if(a!=0)
    {
        for(int i=0;i<a;i++)
        {
            if(diff[min]>diff[i])
                min=i;
        }
        cout<<diff[min];
    }
    else
        cout<<"-1";
}
