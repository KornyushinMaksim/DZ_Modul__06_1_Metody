package Task6;

public class TestStr {
    public static String test (String str){
        String strTmp = "true str";
        char[] chars = str.toCharArray();
        //boolean flag = true;
        int Parenthesis = 0;
        int SquareBracket = 0;

        for(int i = 0; i < str.length(); i++){      //проверка на чётность
            if (str.charAt(i) == '('){
                Parenthesis++;
            }
            if (str.charAt(i) == ')'){
                Parenthesis--;
            }
            if (str.charAt(i) == '['){
                SquareBracket++;
            }
            if(str.charAt(i) == ']'){
                SquareBracket--;
            }
        }
        if (Parenthesis == 0 && SquareBracket == 0) {
            //flag = true;
        } else {
            return "false str";
        }

        for (int i = 0; i < str.length(); i++){         //проверка поседовательного расположения
            if (chars[i] == '('){
                for (int j = i + 1; j < str.length(); j++){
                    if (chars[j] == '(' || chars[j] == '['){
                        test(chars.toString());
                        //flag = true;
                        break;
                    } else if (chars[j] == ')'){
                        chars[i] = '+';
                        chars[j] = '+';
                        //flag = true;
                        break;
                    } else if (chars[j] == ']'){
                        //flag = false;
                        return "false str";
                    }
                }
            }
            if (chars[i] == '['){
                for (int j = i + 1; j < str.length(); j++){
                    if (chars[j] == '(' || chars[j] == '['){
                        test(chars.toString());
                        //flag = true;
                        break;
                    } else if (chars[j] == ']'){
                        chars[i] = '+';
                        chars[j] = '+';
                        //flag = true;
                        break;
                    } else if (chars[j] == ')'){
                        //flag = false;
                        return "false str";
                    }
                }
            }

//            if (flag == false){
//                break;
//            }
        }
        return strTmp;
    }
}
