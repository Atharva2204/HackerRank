#include<iostream>
using namespace std;

int main()
{
    int n=0;
    cin>>n;
    int num[n][n];

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
            cin>>num[i][j];
    }

    int sum=0;
    int sum1=0;

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i==j)
                sum+=num[i][j];           
        }
        sum1+=num[i][n-1-i];
    }
    int abs = 0;
    if(sum>sum1)
        abs = sum-sum1;
    else
        abs = sum1-sum;
    cout<<abs;
}
