package Reverse_string;

public class practice {
    public void test() {

        String a = "abc def ghi jkl";//abc fed ghi lkj

        boolean flag = true;

        StringBuilder same = new StringBuilder();

        StringBuilder rev = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {

            String z = String.valueOf(a.charAt(i));

            if (z.equals(" ")) {

                if (flag == true) {
                    flag = false;
                }

                else if (flag == false) {
                    flag = true;

                }
            }

            if (flag) {

                same.append(z);

            }

            if (flag == false) {

                rev.append(z);

            }

        }

        rev = rev.reverse();

        System.out.println(same);

        System.out.println(rev);

        System.out.println(same.insert(a.indexOf("d"),rev));

}

}
