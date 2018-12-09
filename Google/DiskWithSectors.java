
package diskwithsectors;

public class DiskWithSectors {
    
    static int[] disk;
    static int[] find;
    public static void disk(int[] nums){
        disk = nums;
        find = new int[nums.length];
        int nextFree = -1;
        if (nums[nums.length-1]==0) nextFree = nums.length-1;
        for (int i=nums.length-1;i>=0;i--){
            if (nums[i]==1) find[i]=-1;
            else{
                find[i] = nextFree;
                nextFree = i;
            }
        }
    }
    
    public static boolean save(int x){
        if (disk[x]==1) return false;
        else{
            disk[x]=1;
            return true;
        }
    }
    public static int find(int x){
        return find[x];
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 0, 1, 1, 1};
        disk(nums);
        System.out.println(find(0));
        System.out.println(find(1));
        System.out.println(find(4));
        System.out.println(find(2));
        
    }
}
