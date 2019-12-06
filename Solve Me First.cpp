#include<iostream>
using namespace std;
class add
{
    int x;
    int y;
    int sum1;
    public :
                void input();
                void sum();
                void display();
};

void add :: input()
{
    cin>>x;
    cin>>y;
}

void add ::sum()
{
    sum1=0;
    sum1=x+y;
}

void add :: display()
{
    cout<<sum1;
}

int main()
{
    add obj;
    
    obj.input();
    obj.sum();
    obj.display();
}
