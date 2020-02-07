public class LogicAPI {

// BOOLEAN GATES

    // OR
    public static boolean orGate(boolean input1, boolean input2){
        return input1 || input2;
    }

    // NOR
    public static boolean norGate(boolean input1, boolean input2){
        return !input1 && !input2;
    }


    // AND
    public static boolean andGate(boolean input1, boolean input2){
        return input1 && input2;
    }

    // NAND
    public static boolean nandGate(boolean input1, boolean input2){
        return !input1 || !input2;
    }

    // XOR
    public static boolean xorGate(boolean input1, boolean input2){
        return (!(input1 = input2));
    }

    // XNOR
    public static boolean xnorGate(boolean input1, boolean input2){
        return (input1 = input2);
    }

    // BUFFER
    public static boolean bufferGate(boolean input){
        return input;
    }

    // NOT
    public static boolean notGate(boolean input){
        return !input;
    }

// INTPUT GATES

    // OR
    public static Integer orGate(Integer input1, Integer input2) {
        if (input1 == 1 && input2 == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    // NOR
    public static Integer norGate(Integer input1, Integer input2) {
        if (input1 == 1 && input2 == 1) {
            return 0;
        } else {
            return 1;
        }
    }


    // AND
    public static Integer andGate(Integer input1, Integer input2){
        if(input1 == 1 && input2 == 1){
            return 1;
        }
        else return 0;
    }

    // NAND
    public static Integer nandGate(Integer input1, Integer input2){
        if(input1 == 1 && input2 == 1){
            return 0;
        }
        else return 1;
    }

    // XOR
    public static Integer xorGate(Integer input1, Integer input2){
        if(input1 == input2){
            return 0;
        } else return 1;
    }

    // XNOR
    public static Integer xnorGate(Integer input1, Integer input2){
        if((input1 == input2)){
            return 1;
        } else return 0;
    }

    // BUFFER
    public static Integer bufferGate(Integer input){
        return input;
    }

    // NOT
    public static Integer notGate(Integer input){
        if(input == 1) return 0;
        if(input == 0) return 1;
        else return -1;
    }
}
