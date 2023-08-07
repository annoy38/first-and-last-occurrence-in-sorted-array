public class Main {

    public static void firstAndLastOccurrence(int[] a, int key){
        int low=0;
        int high = a.length-1;
        int mid=0;
        int result = -1;
        while (low<=high){
            mid = low+(high-low)/2;
            if(a[mid]==key){
              //  high = mid-1; first occurrence part
                low = mid+1; // last occurrence part
                result = mid;
            }
            else if(key<a[mid]){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
//        System.out.println("First Occurrence of "+key+" is Index "+result);
        System.out.println("Last Occurrence of "+key+" is Index "+result);

    }

    public static void main(String[] args) {
        int[] array = new int[]{2,4,5,7,9,9,9};
        firstAndLastOccurrence(array, 9);

    }
}