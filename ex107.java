public class ex107 { 
public static void main(String[] args) { 
int[] numArr = new int[] {12, 11, 12, 13, 14, 45, 30};
int count = 0; 
for(int i = 1; i < numArr.length; i++) { 
if(numArr[i] == numArr[i - 1] + 1) {
count++;
} 
}
System.out.println(count == 3);
} 
}