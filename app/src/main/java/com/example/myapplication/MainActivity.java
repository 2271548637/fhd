package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Stack;
import java.math.BigDecimal;
import java.lang.Math;
//直接让当前类实现OnClickListener接口
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,                   //各个按钮
            btn_7,btn_8,btn_9,btn_clear,btn_percent,
            btn_del,btn_leftbra,btn_rightbra,btn_PandM,
            btn_squ2,btn_sin,btn_cos,btn_tan,btn_div,btn_mul,
            btn_sub,btn_add,btn_equ,btn_p;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //将布局文件中的按钮和文本框与Java代码中的按钮和文本框进行关联，并设置按钮的点击事件监听器
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);

        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);

        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);

        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);

        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);

        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);

        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);

        btn_percent = (Button) findViewById(R.id.btn_percent);
        btn_percent.setOnClickListener(this);

        btn_del = (Button) findViewById(R.id.btn_del);
        btn_del.setOnClickListener(this);

        btn_leftbra = (Button) findViewById(R.id.btn_leftbra);
        btn_leftbra.setOnClickListener(this);

        btn_rightbra = (Button) findViewById(R.id.btn_rightbra);
        btn_rightbra.setOnClickListener(this);

        btn_PandM = (Button) findViewById(R.id.btn_PandM);
        btn_PandM.setOnClickListener(this);

        btn_squ2 = (Button) findViewById(R.id.btn_squ2);
        btn_squ2.setOnClickListener(this);

        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_sin.setOnClickListener(this);

        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_cos.setOnClickListener(this);
        btn_cos = (Button) findViewById(R.id.btn_tan);
        btn_cos.setOnClickListener(this);

        btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);

        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);

        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(this);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        btn_equ = (Button) findViewById(R.id.btn_equ);
        btn_equ.setOnClickListener(this);

        btn_p = (Button) findViewById(R.id.btn_p);
        btn_p.setOnClickListener(this);
//  定义了一个EditText控件的引用，用于显示计算结果
        text=(EditText) findViewById(R.id.text);
    }

    @Override
//    事件的处理函数
    public void onClick(View v) {
//        通过text.getText().toString()获取到EditText控件中的文本内容，转换为字符串类型的str
        String str = text.getText().toString();
//        分支选择语句
        switch(v.getId()){
//                   退格键,判断str的长度是否>1，如果是，则将str的最后一个字符删除；如果不是，则将str设置为0
            case R.id.btn_del:
                if(str.length()>1){
                    str=str.substring(0,str.length()-1);
                }
                else{
                    str="0";
                }
                text.setText(str);
                break;
//                清除键
            case R.id.btn_clear:
                str="0";
                text.setText(str);
                break;
//                如果初始值为0，就变成相应的数字，如果不为0，就在后面加数
            case R.id.btn_0:
                if (str.equals("0")){
                    str="0";
                }
                else{
                    str+="0";
                }
                text.setText(str);
                break;
            case R.id.btn_1:
                if (str.equals("0")){
                    str="1";
                }
                else{
                    str+="1";
                }
                text.setText(str);
                break;
            case R.id.btn_2:
                if (str.equals("0")){
                    str="2";
                }
                else{
                    str+="2";
                }
                text.setText(str);
                break;
            case R.id.btn_3:
                if (str.equals("0")){
                    str="3";
                }
                else{
                    str+="3";
                }
                text.setText(str);
                break;
            case R.id.btn_4:
                if (str.equals("0")){
                    str="4";
                }
                else{
                    str+="4";
                }
                text.setText(str);
                break;
            case R.id.btn_5:
                if (str.equals("0")){
                    str="5";
                }
                else{
                    str+="5";
                }
                text.setText(str);
                break;
            case R.id.btn_6:
                if (str.equals("0")){
                    str="6";
                }
                else{
                    str+="6";
                }
                text.setText(str);
                break;
            case R.id.btn_7:
                if (str.equals("0")){
                    str="7";
                }
                else{
                    str+="7";
                }
                text.setText(str);
                break;
            case R.id.btn_8:
                if (str.equals("0")){
                    str="8";
                }
                else{
                    str+="8";
                }
                text.setText(str);
                break;
            case R.id.btn_9:
                if (str.equals("0")){
                    str="9";
                }
                else{
                    str+="9";
                }
                text.setText(str);
                break;
//                Toast提供一种提醒方式
//            +-*÷.这些符号不能挨着，否则显示输入错误
            case R.id.btn_p:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+=".";
                    text.setText(str);
                }
                break;
            case R.id.btn_add:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else{
                    str+="+";
                    text.setText(str);
                }
                break;
            case R.id.btn_sub:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "-";
                    text.setText(str);
                }
                break;
            case R.id.btn_mul:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "×";
                    text.setText(str);
                }
                break;
            case R.id.btn_div:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'||str.charAt(str.length()-1)=='.'){
                    Toast.makeText(MainActivity.this,"input error!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    str += "÷";
                    text.setText(str);
                }
                break;
//                如果字符串长度为1，设置为（；如果字符串中不包含运算符，则在在字符串前添加（；否则在字符串末尾添加（
            case R.id.btn_leftbra:
                if (str.length()==1){
                    str="(";
                }
                else if(!str.contains("+")&&!str.contains("-")&&!str.contains("×")&&!str.contains("÷")){
                     str="("+str;
                }
                else {
                    str += "(";
                }
                text.setText(str);
                break;
//                如果字符串长度为1，则将字符串设置为0；否则在字符串末尾添加）
            case R.id.btn_rightbra:
                if (str.length()==1){
                    str="0";
                }
                else {
                    str += ")";
                }
                text.setText(str);
                break;
//          如果最后一个字符是运算符，则提示请写出完整的计算，否则调用isMatched方法检查括号是否匹配，调用getResult方法计算结果，并根据结果进行相应的操作。一个数除0时提示0不能作为除数
            case R.id.btn_equ:
                if(str.charAt(str.length()-1)=='+'||str.charAt(str.length()-1)=='-'||str.charAt(str.length()-1)=='×'||str.charAt(str.length()-1)=='÷'){
                    Toast.makeText(MainActivity.this,"Please complete the formula!",Toast.LENGTH_SHORT).show();
                    text.setText(str);
                }
                else {
                    String ero = isMatched(str);
                    if (ero.equals("no error")) {
                        String re = getResult();
                        if (re.contains("Infinity")) {
                            Toast.makeText(MainActivity.this, "0 cannot be used as a divior!", Toast.LENGTH_SHORT).show();
                            text.setText("0");
                        } else {
                            text.setText(re);
                        }
                    } else {
                        Toast.makeText(MainActivity.this, ero, Toast.LENGTH_SHORT).show();
                    }
                }
                break;
//                如果字符串的第一个字符是负号，则提示负数不能开平方；如果字符串中包含运算符，则提示符号不能开平方；否则将字符串转换为double类型，进行平方根计算，并将结果格式化为字符串进行显示
            case R.id.btn_squ2:
                if(str.charAt(0)=='-'){
                    Toast.makeText(MainActivity.this,"Negative numbers cannot be squared!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                }
                else if(str.contains("+")||str.contains("-")||str.contains("×")||str.contains("÷")){
                    Toast.makeText(MainActivity.this,"Symbols cannot be squared!",Toast.LENGTH_SHORT).show();
                    text.setText("0");
                }
                else{
                    double x=Double.parseDouble(str);
                    x=Math.sqrt(x);
                    String x2=String.format("%.9f",x);
                    x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                    x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(x2);
                }
                break;
                //将字符串转换为double类型，转换为弧度，计算正弦值，并将结果格式化为字符串进行显示
            case R.id.btn_percent:
                double per=Double.parseDouble(str);
                per=per/100;
                String per1=""+per;
                per1 = per1.replaceAll("0+?$", "");//去掉多余的0
                per1 = per1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(per1);
                break;
            case R.id.btn_sin:
                double sinn=Double.parseDouble(str);
                sinn=Math.toRadians(sinn);
                sinn=Math.sin(sinn);
                String sinn1=String.format("%.9f",sinn);//规避极小误差
                sinn1 = sinn1.replaceAll("0+?$", "");//去掉多余的0
                sinn1 = sinn1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(sinn1);
                break;
            case R.id.btn_cos:
                double coss=Double.parseDouble(str);
                coss=Math.toRadians(coss);
                coss=Math.cos(coss);
                String coss1=String.format("%.9f",coss);//规避极小误差
                coss1 = coss1.replaceAll("0+?$", "");//去掉多余的0
                coss1 = coss1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(coss1);
                break;
            case R.id.btn_tan:
                double tann=Double.parseDouble(str);
                tann=Math.toRadians(tann);
                tann=Math.tan(tann);
                String tann1=String.format("%.9f",tann);//规避极小误差
                tann1 = tann1.replaceAll("0+?$", "");//去掉多余的0
                tann1 = tann1.replaceAll("[.]$", "");//如最后一位是.则去掉
                text.setText(tann1);
                break;
//                正负号
            case R.id.btn_PandM:
                if(str.charAt(0)>='0'&&str.charAt(0)<='9'){
                    if(str.equals("0")){
                        text.setText("0");
                    }
                    else{
                        text.setText("-"+str);
                    }
                }
                else if(str.charAt(0)=='-')
                    text.setText(str.substring(1,str.length()));
                else
                    text.setText(str);
                break;
            default:
                break;
        }
    }

    //将中缀表达式转换成后缀表达式
    public static StringBuffer toPostfix(String infix){
        Stack<String> stack=new Stack<String>();   //运算符栈,顺序栈
        StringBuffer postfix=new StringBuffer(infix.length()*2);   //后缀表达式字符串
        int i=0;
        while(i<infix.length()){
            char ch=infix.charAt(i);
            switch(ch){
                case '+':
                case '-':
                    while(!stack.isEmpty()&&!stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                        postfix.append(stack.pop());   //且添加到后缀表达式串
                    stack.push(ch+""); //ch入栈
                    i++;
                    break;

                case '×':
                case '÷':
                    while(!stack.isEmpty()&&(stack.peek().equals("×")||stack.peek().equals("÷")))  //如果栈顶元素不为空且栈顶元素是"*"或是"/"时,则出栈
                        postfix.append(stack.pop());
                    stack.push(ch+"");
                    i++;
                    break;

                case '(':
                    stack.push(ch+""); //直接入栈
                    i++;
                    break;

                case ')':
                    String out=stack.pop();
                    while(out!=null&&!out.equals("(")){    //如果栈顶元素不为空且不为"("时
                        postfix.append(out);   //添加到后缀表达式串
                        out=stack.pop();   //把此时位于栈顶的"("弹出
                    }
                    i++;
                    break;

                default:
                    while((i<infix.length()&&ch>='0'&&ch<='9')||(i<infix.length()&&ch=='.')){
                        postfix.append(ch);    //如果是数字直接添加到后缀表达式串
                        i++;
                        if(i<infix.length())
                            ch=infix.charAt(i);
                    }
                    postfix.append(" ");
            }

        }
        while(!stack.isEmpty())       //所有运算符出栈
            postfix.append(stack.pop());   //添加到后缀表达式中
        return postfix;
    }

    //计算后缀表达式
    public static Double toValue(StringBuffer postfix){
        Stack<Double> stack=new Stack<Double>();   //操作数栈,链式栈
        double value=0;
        int j=0;
        for(int i=0;i<postfix.length();i++){
            j=i;
            char ch=postfix.charAt(i);
            if ((ch>='0'&&ch<='9')||ch=='.') {
                value=0;
                while(ch!=' '){
                    while(ch!=' '&&ch!='.'){
                        value=value*10+ch-'0';
                        j++;
                        ch=postfix.charAt(++i);
                    }
                    if(ch!=' '&&ch=='.')
                        ch=postfix.charAt(++i);
                    while(ch!=' '&&(i>=j+1)){
                        BigDecimal valueBD=new BigDecimal(Double.toString(value));
                        BigDecimal chBD=new BigDecimal(Double.toString(ch-'0'));
                        BigDecimal nBD=new BigDecimal(Double.toString(Math.pow(10,i-j)));
                        double temp=chBD.divide(nBD).doubleValue();
                        BigDecimal tempBD=new BigDecimal(Double.toString(temp));
                        value=valueBD.add(tempBD).doubleValue();
                        ch=postfix.charAt(++i);
                    }

                    stack.push(value);
                }

            }
            else{
                if(ch!=' '){
                    Double y=stack.pop();
                    Double x=stack.pop();
                    switch(ch){
                        case'+':
                            value=x+y;
                            break;
                        case'-':
                            value=x-y;
                            break;
                        case'×':
                            value=x*y;
                            break;
                        case'÷':
                            value=x/y;
                            break;
                    }
                    stack.push(value);
                }
            }

        }
        return stack.pop();
    }
    public String getResult(){
        String infix = text.getText().toString();
        StringBuffer postfix=toPostfix(infix);
        Double result=toValue(postfix);
        String re=String.format("%.7f",result);//规避极小误差
        re = re.replaceAll("0+?$", "");//去掉多余的0
        re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
        return re;
    }
//检查括号是否匹配。创建一个stick，用于存储左括号。
    public static String isMatched(String infix){
        Stack<String> stack=new Stack<String>();
        for (int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            switch(ch){
                case'(':
                    stack.push(ch+"");
                    break;
                case')':
                    if(stack.isEmpty()||!stack.pop().equals("("))
                        return "expect   (";
            }
        }
        return(stack.isEmpty())?"no error":"expect   )";
    }
}
