package org.fretron.training


import java.util.*;

fun main(){

}

class MyStack{
    var elements:MutableList<Char> = mutableListOf();

    fun isEmpty() : Boolean = elements.isEmpty();

    fun size() : Int = elements.size;

    fun push(c : Char) : Any = elements.add(c);

    fun peek() : Char?{
        return elements.lastOrNull();
    }

    fun pop() : Char{
        var x = elements.lastOrNull();

        if(!isEmpty()){
            elements.removeAt(elements.size-1);
        }

        return x!!;
    }

}

class Solution {
    fun isValid(s: String): Boolean {

        var stack = MyStack();
        for (i in 0..s.length - 1) {

            var c = s[i];
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != ']')
                    return false;
                else
                    stack.pop();
            } else if (c == ')') {

                if (stack.isEmpty() || stack.peek() != ')')
                    return false;
                else
                    stack.pop();
            } else if (c == '}') {

                if (stack.isEmpty() || stack.peek() != '}')
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}