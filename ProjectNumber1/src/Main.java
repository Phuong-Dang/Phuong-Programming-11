public class Main {
    static int problemOne(String s) {
        int answer = 0;
        /*
        for every time 'i' is smaller than the length of 's', it will compare 'ch' to a, e, i, o, or u.
        If it's equal then 'answer' will increase by 1.
        'return answer' which returns the value of the answer and that’s value gets displayed on the console.
         */
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                answer++;
            }
            }
            return answer;
        }



    static int problemTwo(String s) {
        int answer = 0;
         /*
        for every time 'i' is smaller than the length of 's', it will compare 's.charAt' to b and o.
        there are 2 'b's is because the word is 'bob'
        If it equals then 'answer' will increase by 1.
        'return answer' which returns the value of the answer and that’s value gets displayed on the console.
         */
              for (int i = 0; i < s.length()-2; i++) {
                  if ((s.charAt(i)=='b') && (s.charAt(i+1)=='o' && (s.charAt(i+2)=='b'))) {
                    answer++;
                }
            }
            return answer;
    }



    static String problemThree(String s){

        int n = s.length();
        for (int i = 1; i < n; i++) {
            /* if element at index 'i' is greater
            than the element at index 'i-1'
            then the string is sorted */
            if (s.charAt(i) > s.charAt(i - 1)) {
                return String.valueOf(s.charAt(i - 1));

            }
    }
                    return s;
    }
    public static void main(String[] args) {

        /*Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.*/

        String s;
    }
}