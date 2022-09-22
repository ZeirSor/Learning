#include<cstdio>
#include<iostream>

using namespace std;

int max(int a, int b)
{
    return a > b ? a : b;
}

//找出数列中最大和子数列的和
int maxSubArray(int* nums, int n)
{   
    int dp[1001];   //记录读到nums[i]时最大和的增长状态
    int maxValue = nums[0];
    dp[0] = nums [0];

    for (int i = 1; i < n; i++)
    {
        dp[i] = max(dp[i-1] + nums[i], nums[i]);
        maxValue = max(maxValue, dp[i]);
    }
    
    return maxValue;
}

int main()
{
    int n;
    cin >> n;
    int nums[1001];
    for (int i = 0; i < n; i++)
        cin >> nums[i];
    
    cout << maxSubArray(nums, n);
    return 0;
}
