
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NANON
 */
public class Application {

    private String word;
    private int state;
    private ArrayList<Word> wordList = new ArrayList();

    public void process(String stringinput) {
        wordList.clear();
        word = "";
        state = 0;
        int i = 0;
        boolean errorfound = false;
        while (i < stringinput.length() && errorfound == false) {
            switch (state) {
                case 0: {
                    if (stringinput.charAt(i) == ' ') {
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'p' || stringinput.charAt(i) == 'q' || stringinput.charAt(i) == 'r' || stringinput.charAt(i) == 's') {
                        word += stringinput.charAt(i);
                        state = 1;
                    } else if (stringinput.charAt(i) == 'n') {
                        word += stringinput.charAt(i);
                        state = 2;
                    } else if (stringinput.charAt(i) == 'a') {
                        word += stringinput.charAt(i);
                        state = 5;
                    } else if (stringinput.charAt(i) == 'o') {
                        word += stringinput.charAt(i);
                        state = 8;
                    } else if (stringinput.charAt(i) == 'x') {
                        word += stringinput.charAt(i);
                        state = 10;
                    } else if (stringinput.charAt(i) == 'i') {
                        word += stringinput.charAt(i);
                        state = 11;
                    } else if (stringinput.charAt(i) == 't') {
                        word += stringinput.charAt(i);
                        state = 13;
                    } else if (stringinput.charAt(i) == '(') {
                        word += stringinput.charAt(i);
                        state = 18;
                    } else if (stringinput.charAt(i) == ')') {
                        word += stringinput.charAt(i);
                        state = 19;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 1: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 2: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'o') {
                        word += stringinput.charAt(i);
                        state = 3;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 3: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 't') {
                        word += stringinput.charAt(i);
                        state = 4;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 4: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 5: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'n') {
                        word += stringinput.charAt(i);
                        state = 6;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 6: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'd') {
                        word += stringinput.charAt(i);
                        state = 7;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 7: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 8: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'r') {
                        word += stringinput.charAt(i);
                        state = 9;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 9: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 10: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'o') {
                        word += stringinput.charAt(i);
                        state = 8;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 11: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'f') {
                        word += stringinput.charAt(i);
                        state = 12;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 12: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'f') {
                        word += stringinput.charAt(i);
                        state = 17;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 13: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'h') {
                        word += stringinput.charAt(i);
                        state = 14;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 14: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'e') {
                        word += stringinput.charAt(i);
                        state = 15;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 15: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else if (stringinput.charAt(i) == 'n') {
                        word += stringinput.charAt(i);
                        state = 16;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 16: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 17: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 18: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 19: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        word = "";
                        state = 0;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
                case 20: {
                    if (stringinput.charAt(i) == ' ') {
                        wordList.add(new Word(word, state));
                        errorfound = true;
                        word = "";
                        state = 0;
                    } else {
                        word += stringinput.charAt(i);
                        state = 20;
                    }
                    if (i == stringinput.length() - 1 && word.length() != 0) {
                        wordList.add(new Word(word, state));
                    }
                    break;
                }
            }
            i++;
        }
    }

    public ArrayList<Word> getWordList() {
        return wordList;
    }
}
