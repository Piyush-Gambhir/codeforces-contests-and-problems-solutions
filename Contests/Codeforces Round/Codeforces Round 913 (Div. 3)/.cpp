#include <bits/stdc++.h>
using namespace std;
#define ll long long
void solve()
{
    ll n;
    cin >> n;
    vector<pair<ll, ll>> a(n);
    for (auto &i : a)
    {
        cin >> i.first >> i.second;
    }
    auto ok = [&](ll x) -> bool
    {
        ll l = 0, r = 0;
        for (auto &i : a)
        {
            l = max(l - x, i.first);
            r = min(r + x, i.second);
            if (l > r)
            {
                return false;
            }
        }
        return true;
    };
    ll low = 0, high = 1e9;
    while (low < high)
    {
        ll mid = (low + high) >> 1;
        if (ok(mid))
        {
            high = mid;
        }
        else
        {
            low = mid + 1;
        }
    }
    cout << low << endl;
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);

    int t;
    cin >> t;
    while (t--)
        solve();

    return 0;
}