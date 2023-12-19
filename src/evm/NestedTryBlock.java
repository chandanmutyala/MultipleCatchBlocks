package evm;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            try {

            } catch(Exception e) {
            }
        }catch(Exception e) {

        }
    }
}
