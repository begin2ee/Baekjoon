#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

int minCount = 64;
vector<vector<bool>> arr;

void find(int x, int y) {
    int endx = x + 8;
    int endy = y + 8;
    int cnt = 0;

    bool TF = arr[x][y];

    for (int i = x; i < endx; i++) {
        for (int j = y; j < endy; j++) {
            if (arr[i][j] != TF)
                cnt++;

            TF = !TF;
        }
        TF = !TF;
    }

    cnt = min(cnt, 64 - cnt);
    minCount = min(minCount, cnt);
}

int main() {
    int n, m;
    cin >> n >> m;
    arr.resize(n, vector<bool>(m));

    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;
        for (int j = 0; j < m; j++) {
            if (s[j] == 'W')
                arr[i][j] = true;
            else
                arr[i][j] = false;
        }
    }

    int nn = n - 7;
    int mm = m - 7;

    for (int i = 0; i < nn; i++) {
        for (int j = 0; j < mm; j++) {
            find(i, j);
        }
    }

    cout << minCount << endl;

    return 0;
}
