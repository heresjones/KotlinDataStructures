/*

TODO: FINISH THIS

A stack is a linear data structure which follows a particular order in which the operations are performed.
The order may be LIFO(Last In First Out) or FILO(First In Last Out).
For this implementation, LIFO

The following basic operations are performed on a stack:

Push: Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
Pop: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the stack is empty, then it is said to be an Underflow condition.
Peek or Top: Returns top element of stack.
isEmpty: Returns true if stack is empty, else false.


 */
package `data-structures`

var myStack = Stack(3)

class Stack(var root: Any) {
    var theList: MutableList<Any> = mutableListOf()
    var index = 0

    init {
        theList.add(root)
    }

    fun push(pushVal: kotlin.Any) {
        theList.add(pushVal)
        index++
    }

    fun pop(): kotlin.Any {
        return theList[--index]

    }

//  fun peek

}

private class StackElement

