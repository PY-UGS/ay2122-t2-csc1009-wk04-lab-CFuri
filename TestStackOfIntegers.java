public class TestStackOfIntegers {
    public static void main(String [] args){
        StackOfIntegers stack = new StackOfIntegers();

            for (int i = 0; i < 10; i++){
                stack.push(i);
                System.out.print(i + " ");
            }
            System.out.print("\n");

            while (!stack.empty()){
                System.out.print(stack.pop() + " ");
            }
    }
}
