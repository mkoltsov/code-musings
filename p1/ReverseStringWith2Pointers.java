class Solution {
    public void reverseString(char[] s) {
        // char[] result = new char[s.length];
        // int j=0;
        int i=0;
        int j = s.length-1;
        char temp;
        
        while (i<s.length/2) {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
           i++;
           j--;
            System.out.println("iter "+i);    
        }
        
    }
}