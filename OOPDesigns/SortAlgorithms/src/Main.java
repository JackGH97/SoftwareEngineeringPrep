import Sorts.BucketSort;

public class Main {

    public static void main(String[] args) {

//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }

//        int[] sArray = new int[]{20,35,-15,7,55,1,-22};
//        Sorts.SelectionSort.selectionSort(sArray);
//        for(int i = 0; i < sArray.length; i++){
//           System.out.println(array[i]);
//        }
//
//        int[] iArray = new int[]{20,35,-15,7,55,1,-22};
//        Sorts.InsertionSort.insertionSort(iArray);
//        for(int i = 0; i < iArray.length; i++){
//            System.out.println(array[i]);
//        }
//
//        int[] shellArray = new int[]{20,35,-15,7,55,1,-22};
//       // Sorts.ShellShort.shellSort(shellArray);
//
//        //Sorts.MergeSortDesc.mergeSort(shellArray,0,shellArray.length);
//        //Sorts.QuickSort.quickSort(shellArray,0,shellArray.length,0);
//        Sorts.InsertionSort.insertionSort(shellArray);
//
//       for(int i = 0; i < shellArray.length; i++){
//           System.out.println(shellArray[i]);
//       }
////
//        int[] cArray = new int[]{2,5,9,8,2,8,7,10,4,3};
//        Sorts.CountingSort.countingSort(cArray,1,10);
//        for(int i = 0; i < cArray.length; i++){
//         System.out.println(cArray[i]);

//
//        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
//
//        // do radix sort
//        RadixSortString.radixSort(stringsArray,26,5);
//
//        for (int i = 0; i < stringsArray.length; i++) {
//            System.out.println(stringsArray[i]);
//        }


//        System.out.println(checkForPalindrome("abccba"));
//
//        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
//
//        System.out.println(checkForPalindrome("I did, did I?"));
//
//        System.out.println(checkForPalindrome("hello"));
//        System.out.println(checkForPalindrome("Don't nod"));
//        System.out.println(checkForPalindrome("fall"));

//        Scanner scanner = new Scanner(System.in);
//        String myString = "";
//
//        Scanner scanner1 = new Scanner(System.in);
//        int test = 0;
//
//        Deque<Character> queue1 = new ConcurrentLinkedDeque<>() {
//        };
//
//
//        myString += scanner.nextLine();
//        test += scanner.nextInt();

//        int[] test = new int[]{4 ,3 ,1 ,2};
//        System.out.println(MinSwaps.minimumSwaps(test));
//
//
//          int[][] twoD= new int[][]{{1, 1, 1,0,0,0},{1, 1, 1,0,0,0}, {1, 1, 1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
//
//        System.out.println(Hourglass.hourglassSum(twoD));

//        System.out.println(BalancedBrackets1.balancedB("{[()]}"));
//        System.out.println(BalancedBrackets1.balancedB("{[(])}"));
//        System.out.println(BalancedBrackets1.balancedB("{{[[(())]]}}"));

//        int[] shellArray = new int[]{20,35,-15,7,55,1,-22};
//        Arrays.sort(shellArray);
////        for(int i = 0; i<shellArray.length; i++){
////            System.out.println(shellArray[i]);
////        }
////        System.out.println(BinarySearch.iterativeBinarySearch(shellArray, 35));
////        System.out.println(BinarySearch.iterativeBinarySearch(shellArray, -15));
//
////        System.out.println(BinarySearch.recursiveBinarySearch(shellArray, 35));
////        System.out.println(BinarySearch.recursiveBinarySearch(shellArray, -15));
//
//        System.out.println(BinarySearchRemember.binarySearch(shellArray,-22));
//        System.out.println(BinarySearchRemember.rBS(shellArray,-22));
//
//        Tree intTree = new Tree();
//        intTree.insertNode(25);
//        intTree.insertNode(20);
//        intTree.insertNode(17);
//        intTree.insertNode(15);
//        intTree.insertNode(27);
//        intTree.insertNode(30);
//        intTree.insertNode(29);
//        intTree.insertNode(26);
//        intTree.insertNode(22);
//        intTree.insertNode(32);
//        intTree.traverseInOrder();
//        System.out.println();
//        //intTree.deleteNode(15);
//        intTree.deleteNode(27);
//
//        intTree.traverseInOrder();
//        System.out.println();

        int[] sort = new int[] {54,46,83,66,95,92,43};
        BucketSort.bucketSort(sort);
        for(int i = 0; i < sort.length; i++){
            System.out.println(sort[i]);
        }

    }




}
