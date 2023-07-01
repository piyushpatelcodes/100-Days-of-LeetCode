class Solution{
    static int[] twoSum(int []a , int target){
        for(int i = 0 ; i < a.length - 1 ; i++)
            for(int j = i + 1 ; j < a.length ; j++)
            {
                if(a[i] + a[j] == target)
                    return new int[]{i  , j };
            }
        return new int[]{-1 , -1};
    }
    public static void main(String args[])
    {
        int [] a = {2,7,11,15};
        int target = 9;
        for(int x : twoSum(a , target))
            System.out.print(x + " ");
    }
}
