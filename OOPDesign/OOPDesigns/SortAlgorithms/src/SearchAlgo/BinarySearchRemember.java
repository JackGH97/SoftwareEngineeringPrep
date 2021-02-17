package SearchAlgo;

public class BinarySearchRemember {

    public static int binarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while(start < end){
            int midpoint = ( start + end ) /2;

            if(input[midpoint] == value){
                return  midpoint;
            }
            else if(input[midpoint] < value){
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }
        return  -1;
    }

    public static int rBS(int[] input, int value){
        return  rBS(input,0,input.length,value);
    }

    public static int rBS(int[] input, int start,int end, int value){
        if(start >= end){
            return -1;
        }
        int midpoint = (start + end) /2;
        if(input[midpoint] == value){
            return  midpoint;
        }
        else if(input[midpoint] < value){
            return rBS(input,midpoint+1,end,value);
        }
        else {
            return rBS(input,start,midpoint,value);
        }
    }
}
