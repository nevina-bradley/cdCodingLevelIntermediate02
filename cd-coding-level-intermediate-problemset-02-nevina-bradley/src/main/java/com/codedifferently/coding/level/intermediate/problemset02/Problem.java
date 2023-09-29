package com.codedifferently.coding.level.intermediate.problemset02;

public class Problem {

    /* Problem 07
    Provided a string, we need you to make x amount of copies of the front of a string.
    The front of a string is considered to be the first 3 characters or whatever is there less than the 3 characters.

    Return a new string of x copies of the front of the given string.

    Example:
    frontCopies("Chocolate", 2) --> "ChoCho"
    frontCopies("Chocolate", 3) --> "ChoChoCho"
    frontCopies("Abc", 3) --> "AbcAbcAbc"
     */
    public static String frontCopies(String str, int x) {

    }


    /* Problem 08
    Lets break apart the given words and make new bits. Using those new bits we will put them together to create a new string.

    Return a new string made of every other character, but start with the first character.

    So "Hello" yields "Hllo"

    Example:
    everyOtherBit("Hello") --> "Hllo"
    everyOtherBit("Hi") --> "H"
    everyOtherBit("Heeololeo") --> "Hello"
     */

    public static String everyOtherBit(String word) {

    }


    /* Problem 09
    Sam's favorite number is 9. She wants you to count how many occurences of her favorite number that you see within
    a given set of numbers.

    The sets of number will be provided in an array, return the number of 9's seen in the array.

    Example:
    favoriteNine([1, 2, 9]) --> 1
    favoriteNine([1, 9, 9]) --> 2
    favoriteNine([1, 9, 9, 3, 9]) --> 3
     */

    public static Integer favoriteNine(int[] nums) {

    }


    /* Problem 10
    You will be provided two strings to compare against each other.
    We need you to compare to see if you see a substring in one string, that you see in the same spot in the next string.

    So "xxcaazz" and "xxbaaz" yields 3, as you can see "xx", "aa", and "az" substrings appear in the same place in both.

    Return the number of the positions where they contain the same length 2 substring.

    Example:
    amIAMatch("xxcaazz", "xxbaaz") --> 3
    amIAMatch("abc", "abc") --> 2
    amIAMatch("abc", "axc") --> 0
     */

    public static Integer amIAMatch(String x, String z) {

    }


    /* Problem 11
    Arnold is all about having goodluck stored around him. He is a pretty lucky guy, and he wants to remain that way.
    Arnold heard that the word "yak" is very unlucky. He has a group of pharses he wants to store in his "book of good pharses".

    Arnold wants you to look at the given pharses and remove all the "yak", but the "a" can be any character and the "yak"
    strings will not overlap.

    Return a new string where all the "yak" are removed to keep him a lucky man.

    unluckyYak("yakpak") --> "pak"
    unluckyYak("pakyak") --> "pak"
    unluckyYak("yak123ya") --> "123ya"
     */

    public static String unluckyYak(String phrase) {

    }


    /* Problem 12
    Given an array of numbers, we need you took look to see if it contains a 2, 7, 1 pattern.

    Return true if it contains a 2, 7, 1 pattern:
        a value,
        followed by the value plus 5,
        followed by the value minus 1.

    Additionally, the 271 counts even if the "1" differs by 2 or less from the correct value.

    Example:
    pattern271([1, 2, 7, 1]) --> true
    pattern271([1, 2, 8, 1]) --> false
    pattern271([2, 7, 1]) --> true
     */

    public static Boolean pattern271(int[] nums) {

    }
}
