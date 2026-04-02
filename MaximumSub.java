public class MaximumSub
{
public static int maxSum(int arr[], int k) {
if(arr.length<3)
return -1;
int sum=0;
int max=0;
for(int i=0;i<k;i++)
{
sum +=arr[i];
}
max=sum;
for(int i=k;i<arr.length;i++)
{
sum +=arr[i];
sum -=arr[i-k];
max=Math.max(sum,max);
}
return max;
}
public static void main(String[] args)
{
int arr[]={2,1,5,1,3,2};
int k=3;
System.out.println(maxSum(arr,k));
}
}
