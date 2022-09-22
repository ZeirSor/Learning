#include <iostream>

using namespace std;

int cmp(const void *a, const void *b)
{
    return *(int *)a - *(int *)b;
}

int main()
{
    int nums[100] = {5, 7, 8, 0, 3, 8, 1, 4, 5, 2};
    qsort(nums, 10, sizeof(int), cmp);
    for (int i = 0; i < 10; i++)
    {
        cout << nums[i] << " ";
    }

    return 0;
}
