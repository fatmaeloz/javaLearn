package j10_MethodCreation.task;

public class task20 {
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {
        String para = "$1 $12 €34 €56 $45 €78";
        dollarSum(para);
        euroSum(para);
    }

    private static void euroSum(String para) {
        int sum = 0;
        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == '€') {
                for (int j = i + 1; j < para.length(); j++) {
                    if (para.charAt(j) == ' ' && para.charAt(i) == '€') {
                        sum += Integer.parseInt(para.substring(i + 1, j));
                        break;
                    } else if (para.charAt(i) == '€' && para.length() - 1 == j) {
                        sum += Integer.parseInt(para.substring(i + 1));
                        break;
                    }
                }
            }
        }
        System.out.println("Euro total: " + sum);
    }

    private static void dollarSum(String para) {
        int sum = 0;
        for (int i = 0; i < para.length(); i++) {
            if (para.charAt(i) == '$') {
                for (int j = i + 1; j < para.length(); j++) {
                    if (para.charAt(j) == ' ' && para.charAt(i) == '$') {
                        sum += Integer.parseInt(para.substring(i + 1, j));
                        break;
                    } else if (para.charAt(i) == '$' && para.length() - 1 == j) {
                        sum += Integer.parseInt(para.substring(i + 1));
                        break;
                    }
                }
            }
        }
        System.out.println("Dollar total: " + sum);
    }
}