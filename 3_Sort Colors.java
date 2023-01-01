class Solution {
    public void sortColors(int[] nums) {
        
    int len=nums.length;
    int low=0;
    int mid=0;
    int high=nums.length-1;
    int temp;
   while(mid<=high)
        {
            if(nums[mid]==0)
            {
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;                        // swap mid and low
            }
            else if(nums[mid]==1)
            {
                mid++;
                
            }
            else {
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            
        }
    }

       
        
    
}
