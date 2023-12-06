#include <iostream>
using namespace std;

int digitSum(int num)
{
    int sum = 0;
    while (num > 0)
    {
        sum += num % 10;
        num /= 10;
    }
    return sum;
}

int countGoodTriples(int n)
{
    int count = 0;
    int digitSums[10];
    for (int i = 0; i < 10; i++)
    {
        digitSums[i] = digitSum(i);
    }

    for (int a = 0; a <= n; ++a)
    {
        for (int b = 0; b <= n; ++b)
        {
            int c = n - a - b;
            if (c >= 0 && digitSums[a] + digitSums[b] + digitSums[c] == digitSums[n])
            {
                count++;
            }
        }
    }
    return count;
}

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int n;
        cin >> n;
        cout << countGoodTriples(n) << endl;
    }

    return 0;
}
