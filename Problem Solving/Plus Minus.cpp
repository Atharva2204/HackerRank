#include<iostream>
using namespace std;

int main()
{
    int n=0;
    cin>>n;
    int num[n];
    int pos=0;
    int neg=0;
    int zero=0;

    for(int i=0;i<n;i++)
        cin>>num[i];
    for(int i=0;i<n;i++)
    {
        if(num[i]>0)
            pos++;
        else if(num[i]<0)
            neg++;
        else
            zero++;
    }
    cout<<(double)pos/n<<"\n";
    cout<<(double)neg/n<<"\n";
    cout<<(double)zero/n;
}
