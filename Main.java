import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
public class Main{

    public static boolean allIn(int[] a){
    	int[] b = new int[10]	;
    	int counter = 0;
    	for(int i = 0 ; i < b.length; i++){
    		if(b[a[i]] == 0){
    			b[a[i]] = 1;
    			counter++;
    	}
    		
    	}
    	if(counter == 10)
    	return true;
    	else 
    	return false;
    	
    }
	
	public static int biggest(int a, int b, int c){
		int maxi = 0;
		maxi = Math.max(a,b);
		maxi = Math.max(maxi, c);
		return maxi;
	}
	
	public static int largestNum(int a, int b, int c){
		int max = a;
		if(b > max){
			max = b;
		}
		if(c > max){
			max = c;
		}
		return max;
	}
    public static boolean isPrime(int x){
        for(int i = 2; i < x; i++){
            if(x % i == 0){
               return false; 
            }
        }
        return true;
    }
    public static boolean isPalindrom(String x){
        for(int i = 0; i < x.length() / 2; i++){
            if(x.charAt(i) != x.charAt(x.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static int minimizeNumber(int x){
        int minimized = 0, last = x % 10;
        while(x > 9){
            x /= 10;
        }
        minimized += x;
        minimized *= 10;
        minimized += last;
        return minimized;
    }
    public static double big(double a, double b){

        if(a > b)
            return a;
        return b;
    }        
    public static void sumOf9() {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(i + j == 9){
                    System.out.println(i + ":i." + j + ":j");
                }
            }
        }
    }
    public static void compareTwoStrings(String a, String b){
        System.out.println(a.compareToIgnoreCase(b));
    }
    
    public static boolean isInIt(String str, char c){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                return true;
            }
        }
        return false;
    }
    public static StringBuilder encrypt(String str){
        StringBuilder newStr = new StringBuilder(str);
        for(int i = 0; i < newStr.length(); i++){
            switch(newStr.charAt(i)){
                case 'a':
                newStr.setCharAt(i, '*');
                break;
                case 'u':
                newStr.setCharAt(i, '%');
                break;
                case 'e':
                newStr.setCharAt(i, '#');
                break;
                case 'i':
                newStr.setCharAt(i, '&');
                break;
                case 'o':
                newStr.setCharAt(i, '$');
                break;
                default: 
                break;
            }
        }
        return newStr;
    }
    public static String encryptString(String str){
        char[] strArr = new char[str.length()];
        for(int i = 0; i < str.length();i++){
            strArr[i] = str.charAt(i);
            switch(strArr[i]){
                case 'a':
                strArr[i] = '*';
                break;
                case 'u':
                strArr[i] = '%';
                break;
                case 'e':
                strArr[i] = '#';
                break;
                case 'i':
                strArr[i] = '&';
                break;
                case 'o':
                strArr[i] = '$';
                break;
                default: 
                break;
            }
        }
        String newStr = new String(strArr);
        return newStr;
    }
    public static String encryptSubstring(String str){
        for(int i = 0; i < str.length();i++){
            switch(str.charAt(i)){
                case 'a':
                str = str.substring(0, i) + '*' + str.substring( i + 1);
                break;
                case 'u':
                str = str.substring(0, i) + '%' + str.substring( i + 1);

                break;
                case 'e':
                str = str.substring(0, i) + '#' + str.substring( i + 1);

                break;
                case 'i':
                str = str.substring(0, i) + '&' + str.substring( i + 1);

                break;
                case 'o':
                str = str.substring(0, i) + '$' + str.substring( i + 1);

                break;
                default: 
                break;
            }
        }
        
        return str;
        
    }
    public static String decryptSubstring(String str){
        for(int i = 0; i < str.length();i++){
            switch(str.charAt(i)){
                case '*':
                str = str.substring(0, i) + 'a' + str.substring( i + 1);
                break;
                case '%':
                str = str.substring(0, i) + 'u' + str.substring( i + 1);

                break;
                case '#':
                str = str.substring(0, i) + 'e' + str.substring( i + 1);

                break;
                case '&':
                str = str.substring(0, i) + 'i' + str.substring( i + 1);

                break;
                case '$':
                str = str.substring(0, i) + 'o' + str.substring( i + 1);

                break;
                default: 
                break;
            }
        }
        
        return str;
    }

    public static int[] combineIntArr(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int bCounter = 0;
        System.out.println(c.length);
        for(int i = 0; i < c.length ;i++){
            if(i < a.length){
                c[i] = a[i];
            } else {
                c[i] = b[bCounter++];
            }
        }
        return c;
    }

    public static double biggestDouble(double[] data){
        double biggest = 0;
        for(int i = 0; i < data.length; i++){
            if(data[i] > biggest){
                biggest = data[i];
            }
        }
        return biggest;
    }

    public static double maxBig(double[][] data){
        double biggest = 0;
        for(int i = 0; i < data.length; i++){
            if (biggestDouble(data[i]) > biggest){
                biggest = biggestDouble(data[i]);
            }
        }
        return biggest;
    }
    
    // java 12/19
    // questio 1
    public static void switchLines(int[] a, int[] b){
        int temp = 0;
        for(int i = 0; i < a.length; i++){
            temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }
    public static int[] largestInMat(int[][] mat){
        int rows = mat.length;
        int cols = mat[0].length;
        int[] largestArr = new int[rows];
        double sum = 0, avg[] = new double[rows];
        for(int i = 0; i < rows; i++){
            sum = 0;
            for(int j = 0; j < cols; j++){
                sum += mat[i][j];
            }
            avg[i] = sum / cols;
            System.out.println("avg of line " + (i + 1) + ": " + avg[i]);
        }
        System.out.println();
        
        double smallest = avg[0];
        int index = 0;
        for(int i = 1; i < rows; i++){
            if(avg[i] < smallest){
                smallest = avg[i];
                index = i;
            }
                
        }
        switchLines(mat[index], mat[0]);
        
        // mat sorted
        System.out.println("sorted mat");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(mat[i][j] + "\t ");
            }
            System.out.println();
        }
        int largest = 0;
        for(int i=0 ; i < cols; i++){
            largest = 0;
            for(int j = 0; j < rows - 1 ; j++){
                if(mat[j][i] > largest){
                    largest = mat[j][i];
                }
                largestArr[i] = largest; 
            }
        }
        return largestArr;
    }
    // question 2
    public static int bigger(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }

    public static int largestCombine(int a, int b){
        if(a < 0 || b < 0){
            System.out.println("the input is wrong");
            return 0;
        }
        int func = 0, reversed = 0, largest = 0;
        int lengthA = String.valueOf(a).length();
        int lengthB = String.valueOf(b).length();
        int longer = lengthA > lengthB?lengthA:lengthB;


        for(int i = 0; i < longer; i++ ){
            func = bigger(a%10, b%10);
            a /= 10;
            b /= 10;
            reversed *= 10;
            reversed += func;
        }
        for(int i = 0; i < longer; i++ ){
            largest *= 10;
            largest += reversed % 10;
            reversed /= 10;
        }


        return largest;
    }
    
    // question 3
    public static void pyramide(){
        int rows = 5;
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for(int j = 0 ; j < rows - i; j++){
                System.out.print(" ");
            }
            while(k != 2 * i - 1){
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }

    // question 4
    public static void printMatFromInput(int size){
        Scanner s = new Scanner(System.in);
        int count = 0;
        while(size < 0 || size > 10){
            System.out.println("re-enter the number");
            size = s.nextInt();
        }
        int[][] mat = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int  j = 0 ; j < size; j++){
                if(i + j < size - 1){
                    mat[i][j] = size;
                } else if(i + j == size - 1){
                    mat[i][j] = size * size;
                } else {
                    mat[i][j] = count++;
                }
            }
        } 
        for(int i = 0; i < size; i++){
            for(int  j = 0 ; j < size; j++){
                System.out.print(mat[i][j] + "   ");
            }
            System.out.println();
        } 
    }


    public static void main(String[] args) {

        printMatFromInput(50);
        //pyramide();
        //System.out.println(largestCombine(7231, 6213));




        // int rows = 5;
        // int cols = 5;
        // int mat[][] = new int[rows][cols]; 
        // Random rand = new Random();
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < cols; j++){
        //         mat[i][j] = rand.nextInt(50);
        //     }
        // }
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0; j < cols; j++){
        //         System.out.print(mat[i][j] + "\t ");
        //     }
        //     System.out.println();
        // }
        // int[] lar = largestInMat(mat);
        // for(int i = 0 ; i < cols; i++){
        //     System.out.print(" " + lar[i] + "\t ");
        // }
        
        

      



    }
}