 public class Solution{
 public int countSeniors(String[] details) {
        int seniorCount = 0;

        for (String detail : details) {
            // Extracting age information from the string
            int age = Integer.parseInt(detail.substring(11, 13));

            // Checking if the person is more than 60 years old
            if (age > 60) {
                seniorCount++;
            }
        }

        return seniorCount;
    }
 }