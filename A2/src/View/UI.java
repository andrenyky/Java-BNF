//package view;
//
//import controller.Controller;
//import model.statement.IStmt;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//
//
//public class UI {
//    private final Controller controller;
//    private final static int opMin = 0;
//    private final static int opMax = 4;
//    private final String[] menu = new String[]{
//            "0. End program",
//            "1. Ex 1",
//            "2. Ex 2",
//            "3. Ex 3",
//            "4. Ex 4"};
//
//    private static String optionsArrayToString(String[] optionsArray) {
//        String result = "";
//        for(String s: optionsArray) {
//            result = result + s + '\n';
//        }
//        return result;
//    }
//
//    public UI(Controller controller) {
//        this.controller = controller;
//    }
//
//    private void runController(IStmt statement) {
//        controller.addProgram(statement);
//        try {
//            controller.allStep();
//
//        }
//        catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    public void runUI() {
//        boolean running = true;
//
//
//        while (running) {
//            String optionsAsString = UI.optionsArrayToString(menu);
//            System.out.println("MENU");
//            System.out.println(optionsAsString);
//            int option = -1;
//
//            while (true) {
//                try {
//                    System.out.print("\tChoose option: ");
//                    Scanner console = new Scanner(System.in);
//                    option = console.nextInt();
//                    if (opMin <= option && option <= opMax) {
//                        break;
//                    }
//                    else {
//                        System.out.println("INVALID OPTION");
//                    }
//                }
//                catch (InputMismatchException inputMismatchException) {
//                    System.out.println("INVALID OPTION");
//                }
//            }
//
//
//            IStmt statement;
//            switch (option) {
//                case 0 : {
//                    running = false;
//                    System.out.println("\nProgram Ended!");
//                    continue;
//                }
//                case 1 : {
//                    System.out.println("\nOption 1::\n");
//                    statement = IStmt.example1;
//                    break;
//                }
//                case 2: {
//                    System.out.println("\nOption 2:\n");
//                    statement = IStmt.example2;
//                    break;
//                }
//                case 3: {
//                    System.out.println("\nOption 3:\n");
//                    statement = IStmt.example3;
//                    break;
//                }
//                case 4: {
//                    System.out.println("\nOption 4:\n");
//                    statement = IStmt.example4;
//                    break;
//                }
//                default: {
//                    System.out.println("INVALID OPTION!");
//                    System.out.print("\n\n\n");
//                    continue;
//                }
//            }
//            runController(statement);
//            System.out.print("\n\n\n");
//        }
//    }
//}
