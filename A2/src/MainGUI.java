import GUI.StatementController;
import Model.exp.*;
import Model.stmt.*;
import Model.types.BoolType;
import Model.types.IntType;
import Model.types.RefType;
import Model.types.StringType;
import Model.value.BoolValue;
import Model.value.IntValue;
import Model.value.StringValue;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainGUI extends Application {

    StatementController statementController;

    @Override
    public void start(Stage primaryStage){
        try{
            Rectangle2D screenBounds = Screen.getPrimary().getBounds();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GUI/Statement.fxml"));
            GridPane root = fxmlLoader.load();
            statementController = fxmlLoader.getController();
            addStatementsToController();
            statementController.setMenuStage(primaryStage);
            Scene scene = new Scene(root, screenBounds.getWidth() /3, screenBounds.getHeight());
            primaryStage.setTitle("GUI");
            primaryStage.setScene(scene);
            primaryStage.setX(0);
            primaryStage.setY(0);
            primaryStage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void addStatementsToController() {
        statementController.addStatement(example1);
        statementController.addStatement(example2);
        statementController.addStatement(example3);
        statementController.addStatement(example4);
        statementController.addStatement(example5);
        statementController.addStatement(example6);
        statementController.addStatement(example7);
    }

    private static final IStmt example1;
    static {
        example1 = new CompStmt(new VarDeclStmt("a", new IntType()), new CompStmt(new VarDeclStmt("b", new IntType()),
                new CompStmt(new AssignStmt("a", new ArithmeticExpression('+', new ValueExpression(new IntValue(2)), new ArithmeticExpression('*',
                        new ValueExpression(new IntValue(3)), new ValueExpression(new IntValue(5))))), new CompStmt(
                        new AssignStmt("b", new ArithmeticExpression('+', new VarExpression("a"), new ValueExpression(new IntValue(1)))),
                        new PrintStmt(new VarExpression("b"))))));
    }

    private static final IStmt example2;
    static {
        example2 = new CompStmt(new VarDeclStmt("v", new IntType()),
                new CompStmt(new AssignStmt("v", new ValueExpression(new IntValue(2))),
                        new PrintStmt(new VarExpression("v"))));
    }

    private static final IStmt example3;
    static {
        example3 = new CompStmt(new VarDeclStmt("a", new BoolType()), new CompStmt(new VarDeclStmt("v",
                new IntType()), new CompStmt(new AssignStmt("a", new ValueExpression(new BoolValue(true))),
                new CompStmt(new IfStmt(new VarExpression("a"), new AssignStmt("v", new ValueExpression(new IntValue(2))),
                        new AssignStmt("v", new ValueExpression(new IntValue(3)))), new PrintStmt(new
                        VarExpression("v"))))));
    }

    private static final IStmt example4;
    static {
        example4 = new CompStmt(new VarDeclStmt("varf", new StringType()), new CompStmt(new AssignStmt
                ("varf", new ValueExpression(new StringValue("C:\\Users\\andre\\OneDrive\\Desktop\\Facultate\\ANUL II\\MAP\\A2\\src\\test.in"))), new CompStmt(new OpenRFileStmt(new VarExpression("varf")),
                new CompStmt(new VarDeclStmt("varc", new IntType()), new CompStmt(new readFileStmt(new VarExpression("varf"), "varc"),
                        new CompStmt(new PrintStmt(new VarExpression("varc")), new CompStmt(new readFileStmt(new VarExpression("varf"), "varc"),
                                new CompStmt(new PrintStmt(new VarExpression("varc")), new CloseRFile(new VarExpression("varf"))))))))));
    }

    private static final IStmt example5;
    static {
        example5 = new CompStmt(
                new VarDeclStmt("v", new RefType(new IntType())), new CompStmt(new AllocateHeapStmt(
                "v", new ValueExpression(new IntValue(20))), new CompStmt(new VarDeclStmt("a", new RefType(
                new RefType(new IntType()))), new CompStmt(new AllocateHeapStmt("a", new VarExpression("v")),
                new CompStmt(new PrintStmt(new ReadHeapExpression(new VarExpression("v"))), new PrintStmt(new ReadHeapExpression(
                        new ReadHeapExpression(new VarExpression("a")))))))));
    }

    private static final IStmt example6;
    static {
        example6 = new CompStmt(new VarDeclStmt("v", new IntType()), new CompStmt(new AssignStmt("v",
                new ValueExpression(new IntValue(4))), new CompStmt(new WhileStmt(new RelationalExpression(">",
                new VarExpression("v"), new ValueExpression(new IntValue(0))), new CompStmt(new PrintStmt(new VarExpression("v")),
                new AssignStmt("v", new ArithmeticExpression('-', new VarExpression("v"), new ValueExpression(new IntValue(1)))))),
                new PrintStmt(new VarExpression("v")))));
    }

    private static final IStmt example7;
    static {
        example7 = new CompStmt(
                new VarDeclStmt("v", new IntType()), new CompStmt(new VarDeclStmt("a", new RefType(new IntType())),
                new CompStmt(new AssignStmt("v", new ValueExpression(new IntValue(10))), new CompStmt(new AllocateHeapStmt("a",
                        new ValueExpression(new IntValue(22))), new CompStmt(new ForkStmt(new CompStmt(new WriteHeapStmt("a", new ValueExpression(
                        new IntValue(30))), new CompStmt(new AssignStmt("v", new ValueExpression(new IntValue(32))), new CompStmt(
                        new PrintStmt(new VarExpression("v")), new PrintStmt(new ReadHeapExpression(new VarExpression("a"))))))),
                        new CompStmt(new PrintStmt(new VarExpression("v")), new PrintStmt(new ReadHeapExpression(new VarExpression("a")))))))));
    }



    public static void main(String[] args) {
        launch();
    }
}