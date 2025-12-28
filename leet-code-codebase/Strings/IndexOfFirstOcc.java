class IndexOfFirstOcc {
    public int strStr(String haystack, String needle) {
        int n;
        if(haystack.contains(needle)){
            n= haystack.indexOf(needle);
            return n;
        }else{
            return -1;
        }
    }
	public static void main(String[] args) {
        IndexOfFirstOcc solver = new IndexOfFirstOcc();

        String h1 = "sadbutsad", n1 = "sad";
        System.out.println("Test 1: " + solver.strStr(h1, n1));
        String h2 = "hello", n2 = "ll";
        System.out.println("Test 2: " + solver.strStr(h2, n2)); 
        String h3 = "leetcode", n3 = "leeto";
        System.out.println("Test 3: " + solver.strStr(h3, n3)); 
        String h4 = "abc", n4 = "abc";
        System.out.println("Test 4: " + solver.strStr(h4, n4)); 
    }
}