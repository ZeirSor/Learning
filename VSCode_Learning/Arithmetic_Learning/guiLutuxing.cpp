#include <iostream>
#include <cstdio>

using namespace std;

int main()
{
    int n; cin >> n;

    // for (int i = 0, x = n / 2, y = n / 2; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         if (abs(x - i) + abs(y - j) <= n / 2) cout << '*';
    //         else cout << ' ';
    //     }
    //     cout << endl;
    // }
    // cout << endl;

    // for (int i = 0, x = n / 2, y = n / 2; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         if (abs(x - i) + abs(y - j) == n / 2) cout << '*';
    //         else cout << ' ';
    //     }
    //     cout << endl;
    // }
    // cout << endl;

    // for (int i = 0, x = n / 2, y = n / 2; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         if (abs(x - i) + abs(y - j) < n / 2) cout << '*';
    //         else cout << ' ';
    //     }
    //     cout << endl;
    // }
    // cout << endl;

    // for (int i = 0, x = n / 2, y = n / 2; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         if (abs(x - i) + abs(y - j) >= n / 2) cout << '*';
    //         else cout << ' ';
    //     }
    //     cout << endl;
    // }
    // cout << endl;

    // for (int i = 0, x = n / 2, y = n / 2; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         if (abs(x - i) + abs(y - j) > n / 2) cout << '*';
    //         else cout << ' ';
    //     }
    //     cout << endl;
    // }
    // cout << endl;

    // for (int i = 0, x = n / 2, y = n / 2; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         if ((j - x) * (j - x) >= (i - y) * (i - y)) cout << '*';
    //         else cout << ' ';
    //     }
    //     cout << endl;
    // }
    // cout << endl;


    // for (int i = 0, x = n / 2, y = n / 2; i < n; i++) {
    //     for (int j = 0; j < n; j++) {
    //         if ((j - x) * (j - x) == (i - y) * (i - y)) cout << '*';
    //         else cout << ' ';
    //     }
    //     cout << endl;
    // }
    // cout << endl;


    for (int i = 0, x = n / 2, y = n / 2; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if ( 0.05 * (j - x) * (j - x) > (i - y) ) cout << '*';
            else cout << ' ';
        }
        cout << endl;
    }
    cout << endl;
    
    return 0;
}