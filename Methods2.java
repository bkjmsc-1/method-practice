public class Methods2 {
    int val = 150;

    int operation(int val){
        this.val = val * 20;
        return val;
    }

    public static void main(String[] args) {

        Methods2 method2Object = new Methods2();
        System.out.println("The value before is: " + method2Object.val);
        System.out.println("The value during the method is " + method2Object.operation(100));
        System.out.println("The value after the operation is " + method2Object.val);
    }
}
