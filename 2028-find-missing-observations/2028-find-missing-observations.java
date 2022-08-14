class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
	for(int i: rolls) sum += i;
	int sumOfMissing = mean * (rolls.length + n) - sum;
	if(sumOfMissing < n || sumOfMissing > n* 6) return new int[] {};
	int[] result = new int[n];
	for(int i = 0; sumOfMissing > 0; sumOfMissing -= result[i++]) 
		result[i] = sumOfMissing/(n-i);
	return result;
    }
}