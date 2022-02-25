import Exceptions.InterpreterException;
import Model.adt.*;
import Model.exp.*;
import Model.stmt.*;
import Model.types.BoolType;
import Model.types.IntType;
import Model.types.RefType;
import Model.types.StringType;
import Model.value.BoolValue;
import Model.value.IntValue;
import Model.value.StringValue;
import Repository.Repository;
import Repository.IRepository;
import Controller.Controller;
import Model.PrgState;
import View.ExitCmd;
import View.RunExample;
import View.TextMenu;


public class Main {


    public static void main(String[] args) throws InterpreterException {
        PrgState state1, state2, state3, state4, state5, state6, state7;
        Controller ctrl1, ctrl2, ctrl3, ctrl4, ctrl5, ctrl6, ctrl7;
        try {
            IStmt ex7 = new CompStmt(new VarDeclStmt("v", new IntType()), new CompStmt(new VarDeclStmt("a", new RefType(new IntType())), new CompStmt(new AssignStmt("v", new ValueExpression(new IntValue(10))), new CompStmt(new AllocateHeapStmt("a", new ValueExpression(new IntValue(22))), new CompStmt(new ForkStmt(new CompStmt(new WriteHeapStmt("a", new ValueExpression(new IntValue(30))), new CompStmt(new AssignStmt("v", new ValueExpression(new IntValue(32))), new CompStmt(new PrintStmt(new VarExpression("v")), new PrintStmt(new ReadHeapExpression(new VarExpression("a"))))))), new CompStmt(new PrintStmt(new VarExpression("v")),new PrintStmt(new ReadHeapExpression(new VarExpression("a")))))))));
            state7= new PrgState(new Stack<>(), new Dict<>(), new List<>(), new Dict<>(), new Heap<>(), ex7);
            IRepository repo7 = new Repository("C:\\Users\\andre\\OneDrive\\Desktop\\Facultate\\ANUL II\\MAP\\A2\\src\\logExample7.txt");
            repo7.addPrg(state7);
            ctrl7 = new Controller(repo7);

            IStmt ex6 = new CompStmt(new VarDeclStmt("v", new IntType()), new CompStmt(new AssignStmt("v",
                    new ValueExpression(new IntValue(4))), new CompStmt(new WhileStmt(new RelationalExpression(">",
                    new VarExpression("v"), new ValueExpression(new IntValue(0))), new CompStmt(new PrintStmt(new VarExpression("v")),
                    new AssignStmt("v", new ArithmeticExpression('-', new VarExpression("v"), new ValueExpression(new IntValue(1)))))),
                    new PrintStmt(new VarExpression("v")))));
            state6= new PrgState(new Stack<>(), new Dict<>(), new List<>(), new Dict<>(), new Heap<>(), ex6);
            IRepository repo6 = new Repository("C:\\Users\\andre\\OneDrive\\Desktop\\Facultate\\ANUL II\\MAP\\A2\\src\\logExample6.txt");
            repo6.addPrg(state6);
            ctrl6 = new Controller(repo6);

            IStmt ex5 = new CompStmt(
                    new VarDeclStmt("v", new RefType(new IntType())), new CompStmt(new AllocateHeapStmt(
                    "v", new ValueExpression(new IntValue(20))), new CompStmt(new VarDeclStmt("a", new RefType(
                    new RefType(new IntType()))), new CompStmt(new AllocateHeapStmt("a", new VarExpression("v")),
                    new CompStmt(new PrintStmt(new ReadHeapExpression(new VarExpression("v"))), new PrintStmt(new ReadHeapExpression(
                            new ReadHeapExpression(new VarExpression("a")))))))));
            state5 = new PrgState(new Stack<>(), new Dict<>(), new List<>(), new Dict<>(), new Heap<>(), ex5);
            IRepository repo5 = new Repository("C:\\Users\\andre\\OneDrive\\Desktop\\Facultate\\ANUL II\\MAP\\A2\\src\\logExample5.txt");
            repo5.addPrg(state5);
            ctrl5 = new Controller(repo5);

            IStmt ex4 = new CompStmt(new VarDeclStmt("varf", new StringType()), new CompStmt(new AssignStmt
                    ("varf", new ValueExpression(new StringValue("C:\\Users\\andre\\OneDrive\\Desktop\\Facultate\\ANUL II\\MAP\\A2\\src\\test.in"))), new CompStmt(new OpenRFileStmt(new VarExpression("varf")),
                    new CompStmt(new VarDeclStmt("varc", new IntType()), new CompStmt(new readFileStmt(new VarExpression("varf"), "varc"),
                            new CompStmt(new PrintStmt(new VarExpression("varc")), new CompStmt(new readFileStmt(new VarExpression("varf"), "varc"),
                                    new CompStmt(new PrintStmt(new VarExpression("varc")), new CloseRFile(new VarExpression("varf"))))))))));
            state4 = new PrgState(new Stack<>(), new Dict<>(), new List<>(), new Dict<>(), new Heap<>(), ex4);
            IRepository repo4 = new Repository("C:\\Users\\andre\\OneDrive\\Desktop\\Facultate\\ANUL II\\MAP\\A2\\src\\logExample4.txt");
            repo4.addPrg(state4);
            ctrl4 = new Controller(repo4);

            IStmt ex3 = new CompStmt(new VarDeclStmt("a", new BoolType()), new CompStmt(new VarDeclStmt("v",
                    new IntType()), new CompStmt(new AssignStmt("a", new ValueExpression(new BoolValue(true))),
                    new CompStmt(new IfStmt(new VarExpression("a"), new AssignStmt("v", new ValueExpression(new IntValue(2))),
                            new AssignStmt("v", new ValueExpression(new IntValue(3)))), new PrintStmt(new
                            VarExpression("v"))))));
            state3 = new PrgState(new Stack<>(), new Dict<>(), new List<>(), new Dict<>(), new Heap<>(), ex3);
            IRepository repo3 = new Repository("C:\\Users\\andre\\OneDrive\\Desktop\\Facultate\\ANUL II\\MAP\\A2\\src\\logExample3.txt");
            repo3.addPrg(state3);
            ctrl3 = new Controller(repo3);


            IStmt ex2 = new CompStmt(new VarDeclStmt("v", new IntType()),
                    new CompStmt(new AssignStmt("v", new ValueExpression(new IntValue(2))),
                            new PrintStmt(new VarExpression("v"))));
            state2 = new PrgState(new Stack<>(), new Dict<>(), new List<>(), new Dict<>(), new Heap<>(), ex2);
            IRepository repo2 = new Repository("C:\\Users\\andre\\OneDrive\\Desktop\\Facultate\\ANUL II\\MAP\\A2\\src\\logExample2.txt");
            repo2.addPrg(state2);
            ctrl2 = new Controller(repo2);

            IStmt ex1 = new CompStmt(new VarDeclStmt("a", new IntType()), new CompStmt(new VarDeclStmt("b", new IntType()),
                    new CompStmt(new AssignStmt("a", new ArithmeticExpression('+', new ValueExpression(new IntValue(2)), new ArithmeticExpression('*',
                            new ValueExpression(new IntValue(3)), new ValueExpression(new IntValue(5))))), new CompStmt(
                            new AssignStmt("b", new ArithmeticExpression('+', new VarExpression("a"), new ValueExpression(new IntValue(1)))),
                            new PrintStmt(new VarExpression("b"))))));
            state1 = new PrgState(new Stack<>(), new Dict<>(), new List<>(), new Dict<>(), new Heap<>(), ex1);
            IRepository repo1 = new Repository("C:\\Users\\andre\\OneDrive\\Desktop\\Facultate\\ANUL II\\MAP\\A2\\src\\logExample1.txt");
            repo1.addPrg(state1);
            ctrl1 = new Controller(repo1);

            TextMenu menu = new TextMenu();
            menu.addCommand(new ExitCmd("0", "exit"));
            menu.addCommand(new RunExample("1", ex1.toString(), ctrl1));
            menu.addCommand(new RunExample("2", ex2.toString(), ctrl2));
            menu.addCommand(new RunExample("3", ex3.toString(), ctrl3));
            menu.addCommand(new RunExample("4", ex4.toString(), ctrl4));
            menu.addCommand(new RunExample("5", ex5.toString(), ctrl5));
            menu.addCommand(new RunExample("6", ex6.toString(), ctrl6));
            menu.addCommand(new RunExample("7", ex7.toString(), ctrl7));

            menu.show();
        } catch (InterpreterException exception) {
            System.out.println(exception.getMessage());
        }

    }
}


