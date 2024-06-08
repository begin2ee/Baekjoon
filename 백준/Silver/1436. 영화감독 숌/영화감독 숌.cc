#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    cin >> n;

    int num = 666;
    int cnt = 1;
    while (cnt != n) {
        num++;
        if (to_string(num).find("666") != -1) {
            cnt++;
        }
    }

    cout << num << endl;
    return 0;
}
