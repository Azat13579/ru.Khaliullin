package searchForTruth.truth5;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    static private int addNum=0;
    static private List<Character> kucha = new ArrayList<>();

    public void push(Character s){
        kucha.add(addNum, s);
        addNum++;
    }

    public char pull(){
        char ch = kucha.get(addNum-1);
        kucha.remove(addNum-1);
        addNum--;
        return ch;
    }

    public void getMyStack(String s) { // требуется переименовать метод
        int i1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            switch (ch){
                case ('{'):
                case ('('):
                case ('['):
                case ('<'):
                    push(ch);
                    break;

                case ('}'):
                case (')'):
                case (']'):
                case ('>'):
                    char ch1 = pull();
                    char ch2 = ch1;
                    if(ch == '}') {
                        ch2 = '{';
                    }else if(ch == ']'){
                        ch2 = '[';
                    }else if(ch == ')'){
                        ch2 = '(';
                    }else if(ch == '>') {
                        ch2 ='<';
                    }

                    if(ch1 != ch2) {
                        System.out.println("Error in elements " + (i + 1));
                        i1++;
                    }
            }
        }

        if(i1==0){
            System.out.println("All right!!!");
        }


    }
}
