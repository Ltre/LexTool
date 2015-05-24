package com.ltre.lt;
//暂时不支持双字运算符


public class lexTool extends javax.swing.JFrame {

    public lexTool() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        globalPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        codeField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultField = new javax.swing.JTextArea();
        exc = new javax.swing.JButton();
        exc1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C语言词法分析程序 Power by Ltre");
        setResizable(false);

        globalPane.setBackground(new java.awt.Color(102, 102, 102));

        codeField.setBackground(new java.awt.Color(153, 153, 153));
        codeField.setColumns(20);
        codeField.setFont(new java.awt.Font("微软雅黑", 0, 18)); // NOI18N
        codeField.setRows(5);
        codeField.setText("输入C/C++源代码或用Ctrl+V粘贴到此处");
        codeField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codeClick(evt);
            }
        });
        jScrollPane1.setViewportView(codeField);

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultClick(evt);
            }
        });

        resultField.setBackground(new java.awt.Color(153, 153, 153));
        resultField.setColumns(20);
        resultField.setEditable(false);
        resultField.setFont(new java.awt.Font("仿宋", 1, 18));
        resultField.setRows(5);
        resultField.setText("分析结果");
        resultField.setLineWrap(true);//自动换行
        resultField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultClick(evt);
            }
        });
        jScrollPane2.setViewportView(resultField);

        exc.setBackground(new java.awt.Color(153, 153, 255));
        exc.setFont(new java.awt.Font("微软雅黑", 0, 14));
        exc.setText("分析");
        exc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysis(evt);
            }
        });

        exc1.setBackground(new java.awt.Color(153, 153, 255));
        exc1.setFont(new java.awt.Font("微软雅黑", 0, 14));
        exc1.setText("清空");
        exc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanField(evt);
            }
        });

        javax.swing.GroupLayout globalPaneLayout = new javax.swing.GroupLayout(globalPane);
        globalPane.setLayout(globalPaneLayout);
        globalPaneLayout.setHorizontalGroup(
            globalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(globalPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(globalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exc1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(exc, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        globalPaneLayout.setVerticalGroup(
            globalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, globalPaneLayout.createSequentialGroup()
                .addGroup(globalPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, globalPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, globalPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, globalPaneLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(exc, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(exc1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(globalPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(globalPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-962)/2, (screenSize.height-563)/2, 962, 563);
    }// </editor-fold>//GEN-END:initComponents
    //单击源码框清空
    private void codeClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codeClick
        if (codeField.getText().equals("输入C/C++源代码或用Ctrl+V粘贴到此处")) {
            codeField.setText("");
        }
    }//GEN-LAST:event_codeClick
    //单击“分析”
    private void analysis(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysis
        if (codeField.getText().equals("输入C/C++源代码或用Ctrl+V粘贴到此处")) ; else {
            resultField.setText("");
            deal(codeField.getText());//处理
        }
    }//GEN-LAST:event_analysis
    //单击分析结果框
    private void resultClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultClick
        if (codeField.getText().equals("输入C/C++源代码或用Ctrl+V粘贴到此处"));
        else if(codeField.getText().equals("") && resultField.getText().equals("")){
            codeField.setText("输入C/C++源代码或用Ctrl+V粘贴到此处");
            resultField.setText("分析结果");
        }
    }//GEN-LAST:event_resultClick
    //清理两边
    private void cleanField(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanField
        codeField.setText("输入C/C++源代码或用Ctrl+V粘贴到此处");
        resultField.setText("分析结果");
    }//GEN-LAST:event_cleanField

    //处理
    private void deal(String code) {
        int len = code.length();//getText方法得到的字符串【不】以空字结尾
        for (int i = 0; i < len; i++) {
            if (Character.isWhitespace(code.charAt(i))){ //【空白符号】
                continue;
            } else if (Character.isDigit(code.charAt(i))) { //【是数字】
                if(i==len-1){  //最后一个字符是数字
                    StringBuilder digit = new StringBuilder();
                    digit.append(code.charAt(i));
                    resultField.append(digit.toString() + "\t\t3\n");
                }else{
                    StringBuilder digit = new StringBuilder();//存一串数字
                    digit.append(code.charAt(i));//抓取第一个数字
                    int j = i;//指定开始指针
                    //超前搜索，以获取完整的连续数字串
                    while (j < len - 1 && Character.isDigit(code.charAt(j + 1))) {
                        digit.append(code.charAt(j + 1));
                        j++;
                    }
                    resultField.append(digit.toString() + "\t\t3\n");//显示数字串和种别码“3”
                    digit.delete(0, digit.length());//清理
                    i = j;//准备读取数字串后的字符
                }
            } else if (Character.isLetter(code.charAt(i))) { //【是字母】
                if(i==len-1){  //最后一个字符时字母
                    StringBuilder ld = new StringBuilder();
                    ld.append(code.charAt(i));
                    resultField.append(ld.toString() + "\t\t2\n");
                }else{
                    StringBuilder ld = new StringBuilder();
                    ld.append(code.charAt(i));
                    int j = i;
                    //超前扫描，识别一串以字母开头的字母数字下划线组合
                    while (j < len - 1 && (Character.isLetter(code.charAt(j + 1))
                            || Character.isDigit(code.charAt(j + 1)) 
                            ||code.charAt(j+1)=='_')) {/*BUG:||code.charAt(j+1)=='_'提示OutOfIndexBounds异常*/
                        ld.append(code.charAt(j + 1));
                        j++;
                    }
                    int k = 0;
                    for (; k < blz.length; k++) //筛选保留字
                        if (ld.toString().equals(blz[k])) 
                            break;
                    if (k != blz.length)
                        resultField.append(ld.toString() + "\t\t1\n");//输出保留字种别码
                    else
                        resultField.append(ld.toString() + "\t\t2\n");//输出普通标识符种别码
                    ld.delete(0, ld.length());//清理
                    i = j;//准备读取数字串后的字符
                }
            } else {   //【运算符、分隔符】
                char yf = code.charAt(i);
                int j = 0;
                for(;j < fgf.length;j++)//检测分隔符
                    if(yf == fgf[j]) break;
                if(j!=fgf.length){  /*true:说明是分隔符，false:是其它*/
                    resultField.append(String.valueOf(yf) + "\t\t5\n");
                    continue;
                }else{  //运算符或其它
                    if(i==len-1){   //最后一个字符
                        int k=0;
                        for(;k<ysf.length;k++)
                            if(yf==ysf[k]) break;
                        if(k==ysf.length)continue;
                        else
                            resultField.append(String.valueOf(yf)+"\t\t4\n");
                    }else{  //非最后一个字符
                        int k = 0;
                        for(;k<ysf.length;k++) //判断当前字符是否为单字运算符
                            if(code.charAt(i)==ysf[k])
                                break;
                        if(k==ysf.length){
                            resultField.append(String.valueOf(code.charAt(i)) + "\t\t0\n");//其他字符
                            continue;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(code.charAt(i));//缓存当前字符
                        sb.append(code.charAt(i+1));//缓存追加下一字符
                        int l=0;
                        for(;l<ysf2.length;l++) //判断当前和下一字符是否组成运算符
                            if(sb.toString().equals(ysf2[l]))
                                break;
//                        System.out.println(l);//测试用
                        if(l==ysf2.length && sb.toString().equals("//")){//遇到注释“//”
                            int m=i+1;//置临时指针指向当前的下一字符
                            //遇到换行符结束循环,m+1<=len-1保证不发生code下标越界
                            while(m+1<=len-1 && code.charAt(m+1)!='\n')
                                m++;
                            i=m;//将扫描指针移到换行符处，忽略注释部分
                        }
                        //遇到注释“/*”,寻找“*/”，并忽略中间内容
                        else if(l==ysf2.length && sb.toString().equals("/*")){
                            int m=1;//置临时指针
                            //遇到“*/”结束循环,“i+m<=len-2”保证不发生code下标越界
                            while(i+m<len-2){
//                                System.out.println(m);//测试用
                                m++;
                                if(code.charAt(i+m)=='*' && code.charAt(i+m+1)=='/')
                                    break;
                            }
                            i+=m+1;//将指针移到注释块尾部，忽略中间部分
                        }else if(l==ysf2.length && sb.toString().equals("*/")){//首先遇到“*/”,报错
                            resultField.append(sb.toString() + "\t\tERROR\n");
                            i++;
                        }else if(l==ysf2.length){
                            resultField.append(String.valueOf(code.charAt(i)) + "\t\t4\n");//单字运算符
                        }else{
                            resultField.append(sb.toString() + "\t\t4\n");//双字运算符
                            i++;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lexTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lexTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lexTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lexTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new lexTool().setVisible(true);
            }
        });
    }
    private String[] blz = {"if", "int", "for", "while", "include","const",
        "static","void","class","struct","union","do", "double","float","long",
        "short","bool","goto","define","return", "break", "continue", "main",
        "public","private","protect","friend","using","namespace"};//保留字
    private char[] ysf = {'+', '-', '*', '/', '=', '>', '<', '!','\\'};//单运算符
    private String[] ysf2 = {"!=", "==", ">=", "<=","+=","-=","/=","*=","\\=","++","--","->","<<",">>","::"};//双运算符
    private char[] fgf = {',', '.',';', '{', '}', '(', ')','[',']'};//分隔符   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea codeField;
    private javax.swing.JButton exc;
    private javax.swing.JButton exc1;
    private javax.swing.JPanel globalPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea resultField;
    // End of variables declaration//GEN-END:variables
}
