package Model.exp;

import Exceptions.InterpreterException;
import Model.adt.IDict;
import Model.adt.IHeap;
import Model.types.IType;
import Model.value.IValue;

public class ValueExpression extends Exp {
    final IValue value;

    public ValueExpression(IValue val) {this.value = val;}
    @Override
    public IType typecheck(IDict<String, IType> symTable) throws InterpreterException {
        return value.getType();
    }

    @Override
    public IValue eval(IDict<String, IValue> symTable, IHeap<IValue> heapTable) throws InterpreterException {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
