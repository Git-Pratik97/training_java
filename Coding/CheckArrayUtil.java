import java.util.Arrays;

public class CheckArrayUtil {
    public static void main(String[] args) {
        // ArrayUtil
        ArrayUtil arrayUtil = new ArrayUtil();
        // Array initialisation
        //9,5.5f,1,3.8f,6,8.0f,4,7.4f,2
        int[] arrayInt = new int[]{9,5,1,3,6,8,4,7,2};
        float[] arrayFloat = new float[]{9.2f,5.14f,1.6f,3.4f,6.8f,8.6f,4.4f,7.2f,2.3f};
        Object[] arrayObject = new Object[]{new Object("A1", 9),
                new Object("A2", 5),
                new Object("A3", 1),
                new Object("A4", 3),
                new Object("A5", 6),};

        System.out.println("Original Arrays: ");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayFloat));
        for (Object object:
                arrayObject) {
            System.out.print(object + ", ");
        }
        System.out.println("\n");

        // Sorting
        ArrayUtil.sort(arrayInt,0,arrayInt.length-1);
        ArrayUtil.sort(arrayFloat,0,arrayFloat.length-1);
        ArrayUtil.sort(arrayObject,0,arrayObject.length-1);

        System.out.println("Sorting array from index 0 to index 4:");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayFloat));
        for (Object object:
                arrayObject) {
            System.out.print(object + ", ");
        }
        System.out.println("\n");


        // Binary Search
        Object obj = new Object("A4", 3);

        int indexInt = arrayUtil.searchUsingBinarySearch(arrayInt, 7);
        int indexFloat = arrayUtil.searchUsingBinarySearch(arrayFloat, 3.4f);
        int indexObject = arrayUtil.searchUsingBinarySearch(arrayObject, obj);

        System.out.println("Using binary search for finding index:");
        System.out.println("Index of Key " + 7 + " in Integer array is : " + indexInt);
        System.out.println("Index of Key " + 3.4f + " in Integer array is : " + indexFloat);
        System.out.println("Index of Key " + obj + " in Integer array is : " + indexObject);
        System.out.println("\n");

        int[] newArrayInt = ArrayUtil.arrayCopy(arrayInt, 15);
        float[] newArrayFloat = ArrayUtil.arrayCopy(arrayFloat, 15);
        Object[] newArrayObject = ArrayUtil.arrayCopy(arrayObject, 15);

        System.out.println("Increasing array length to 15:");
        System.out.println(Arrays.toString(newArrayInt));
        System.out.println(Arrays.toString(newArrayFloat));
        for (Object object:
                newArrayObject) {
            System.out.print(object + ", ");
        }
        System.out.println("\n");


    }

}

class Object{
    String name;
    int value;

    public Object(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

class ArrayUtil{
    int searchUsingBinarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        int mid;
        int index = -1;

        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid] == key){
                index = mid;
                break;
            } else
            if(arr[mid]>key){
                end = mid-1;
            } else
            if(arr[mid]<key){
                start = mid+1;
            }
        }

        return index;
    }
    int searchUsingBinarySearch(float[] arr, float key){
        int start = 0;
        int end = arr.length-1;
        int mid;
        int index = -1;

        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid] == key){
                index = mid;
                break;
            } else
            if(arr[mid]>key){
                end = mid-1;
            } else
            if(arr[mid]<key){
                start = mid+1;
            }
        }

        return index;
    }
    int searchUsingBinarySearch(Object[] arr, Object key){
        int start = 0;
        int end = arr.length-1;
        int mid;
        int index = -1;

        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid].value == key.value){
                index = mid;
                break;
            } else
            if(arr[mid].value>key.value){
                end = mid-1;
            } else
            if(arr[mid].value<key.value){
                start = mid+1;
            }
        }

        return index;
    }
    static int[] arrayCopy(int[] original, int newLength){
        int[] newArray = new int[newLength];
        int arrayLength = Math.min(newLength, original.length);
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }
    static float[] arrayCopy(float[] original, int newLength){
        float[] newArray = new float[newLength];
        int arrayLength = Math.min(newLength, original.length);
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }
    static Object[] arrayCopy(Object[] original, int newLength){
        Object[] newArray = new Object[newLength];
        int arrayLength = Math.min(newLength, original.length);
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }
    static void sort(int[] arr, int fromIndex, int toIndex){

        for (int i = fromIndex; i < toIndex; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < toIndex+1; j++)
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    static void sort(float[] arr, int fromIndex, int toIndex){
        for (int i = fromIndex; i < toIndex; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < toIndex+1; j++)
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            float temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    static void sort(Object[] arr, int fromIndex, int toIndex){
        for (int i = fromIndex; i < toIndex; i++)
        {
            int minIndex = i;
            for (int j = i+1; j < toIndex+1; j++)
                if (arr[j].value < arr[minIndex].value) {
                    minIndex = j;
                }
            Object temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
