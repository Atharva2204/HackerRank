#include<iostream>
using namespace std;
int main()
{
    int n,p;
    cin>>n;
    cin>>p;
      
    // Explanation:
    //   - The last page is n/2 page turns away.
    //   - It takes p/2 pages to get to the p-th page (from the front)
    //   - It takes n/2 - p/2 pages to get to the p-th page (from the back)
    //   - The minimum of p/2 and (n/2 - p/2) is the minimum number of pages Brie must turn

    int pagefromfront = p/2;
    int pagefromback =  n/2 - p/2;

    if(pagefromfront >pagefromback)
        cout<<pagefromback;
    else
        cout<<pagefromfront;
}

