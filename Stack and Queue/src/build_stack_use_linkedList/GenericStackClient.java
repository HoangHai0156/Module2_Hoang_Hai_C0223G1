package build_stack_use_linkedList;

public class GenericStackClient {
    private static void stackOfStrings(){
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("Five");
        myGenericStack.push("Four");
        myGenericStack.push("Three");
        myGenericStack.push("Two");
        myGenericStack.push("One");
        System.out.println("1.1. Size of the stack after push: "+ myGenericStack.size());

        System.out.printf("1.2. Pop elements from the stack: ");
        while (!myGenericStack.isEmpty()){
            System.out.printf("%s ",myGenericStack.pop());
        }

        System.out.println("\n1.3. Size of the stack after pop operation: "+myGenericStack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> myGenericStack = new MyGenericStack<>();
        myGenericStack.push(5);
        myGenericStack.push(4);
        myGenericStack.push(3);
        myGenericStack.push(2);
        myGenericStack.push(1);
        System.out.println("2.1. Size of the stack afer push: "+myGenericStack.size());

        System.out.printf("2.2. Pop element from the stack: ");
        while (!myGenericStack.isEmpty()){
            System.out.printf("%d ",myGenericStack.pop());
        }

        System.out.println("\n2.3. Size of the stack after pop: "+myGenericStack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of String");
        stackOfStrings();
        System.out.println("Stack of Integer");
        stackOfIntegers();
    }
}
