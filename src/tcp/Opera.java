package tcp;
import javax.swing.*;
import java.awt.event.*;

public class Opera {
    private int num1,num2,doble=1;
    private String var1,var2,TCP="";

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }
    
    public String TCP(){
        doble=num1*num2*2;
        num1=(int) Math.pow(num1, 2);
        num2=(int) Math.pow(num2, 2);
        TCP=Integer.toString(num1)+var1;
        if(var1!="")
            TCP=TCP+"^2";
        TCP=TCP+" + "+Integer.toString(doble)+var1+var2+" + "+Integer.toString(num2)+var2;
                if(var2!="")
                    TCP=TCP+"^2";
        return TCP;
    }
}