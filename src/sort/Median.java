public class Solution {
  public static void main(String[] args){
    int[] arr1={1,2,4};
    int[] arr2={3,5,9};
    double median=findMedianSortedArrays(arr1,arr2);
    System.out.println(median);
  }
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int[] answer=new int[nums1.length+nums2.length];
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                answer[k]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                answer[k]=nums2[j];
                j++;
            }else if(nums1[i]==nums2[j]){
                answer[k]=nums1[i];
                k++;
                answer[k]=nums2[j];
                i++;
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            answer[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            answer[k]=nums2[j];
            j++;
            k++;
        }

        
        int end=answer.length;
        int mid=end/2;
        if(answer.length%2!=0){
            return answer[mid];
        }else{
            return (answer[mid]+answer[mid-1])/2d;
        }
    }
    
}
