/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores_secuenciales;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class DistribucionUniforme extends javax.swing.JFrame {
    
     JFreeChart grafica;
    DefaultCategoryDataset Datos = new DefaultCategoryDataset();
    
    
    private int k = 0; //almacena el valor de k 
    private int d = 0;//almacena el valor de d
    private int a = 0;//almacena el valor de a
    private int c = 0;//almacena el valor de c
    private double x = 0;//almacena el valor de x
    private double m = 0;//almacena el valor de m
    private double valoresObtenidos [];
    /**
     * Creates new form generador_multiplicativo
     */
    public DistribucionUniforme() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        txt_x = new javax.swing.JTextField();
        txt_k = new javax.swing.JTextField();
        txt_d = new javax.swing.JTextField();
        lbl_d = new javax.swing.JLabel();
        lbl_k = new javax.swing.JLabel();
        lbl_x = new javax.swing.JLabel();
        lbl_a = new javax.swing.JLabel();
        lbl_c = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_datos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_m = new javax.swing.JLabel();
        lbl_periodo = new javax.swing.JLabel();
        lbl_valorA = new javax.swing.JLabel();
        btn_generarNumerosUniformes = new javax.swing.JButton();
        lbl_variableB = new javax.swing.JLabel();
        lbl_intervalosHistograma = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_generarHistograma = new javax.swing.JButton();
        txt_variableC = new javax.swing.JTextField();
        txt_valorA = new javax.swing.JFormattedTextField();
        txt_valorB = new javax.swing.JFormattedTextField();
        txt_intervalosHistograma = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_numerosUniformes = new javax.swing.JTable();
        txt_mediana = new javax.swing.JTextField();
        txt_varianza = new javax.swing.JTextField();
        lbl_desviacionEstandar = new javax.swing.JLabel();
        txt_desviacionEstandar = new javax.swing.JTextField();
        lbl_varianza = new javax.swing.JLabel();
        lbl_mediana = new javax.swing.JLabel();
        txt_media = new javax.swing.JTextField();
        lbl_Media = new javax.swing.JLabel();
        principal = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_calcular.setText("Calcular");
        btn_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_calcularMouseClicked(evt);
            }
        });
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        btn_calcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_calcularKeyPressed(evt);
            }
        });
        getContentPane().add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        txt_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_xActionPerformed(evt);
            }
        });
        txt_x.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_xKeyReleased(evt);
            }
        });
        getContentPane().add(txt_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 120, 30));

        txt_k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_kMouseExited(evt);
            }
        });
        txt_k.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_kKeyReleased(evt);
            }
        });
        getContentPane().add(txt_k, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, -1));

        txt_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dActionPerformed(evt);
            }
        });
        txt_d.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dKeyReleased(evt);
            }
        });
        getContentPane().add(txt_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, -1));

        lbl_d.setText("Ingrese M:");
        getContentPane().add(lbl_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        lbl_k.setText("Ingrese K:");
        getContentPane().add(lbl_k, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lbl_x.setText("Ingrese X0:");
        getContentPane().add(lbl_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        lbl_a.setText("Valor a = ");
        getContentPane().add(lbl_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        lbl_c.setText("Ingrese C:");
        getContentPane().add(lbl_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        table_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "numero", "numero aleatorio"
            }
        ));
        jScrollPane1.setViewportView(table_datos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 230, 410));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("Generador secuencial mixto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_m.setText("Valor m=");
        getContentPane().add(lbl_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        getContentPane().add(lbl_periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 140, 20));

        lbl_valorA.setText("Ingrese A");
        getContentPane().add(lbl_valorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        btn_generarNumerosUniformes.setText("Generar numeros");
        btn_generarNumerosUniformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarNumerosUniformesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generarNumerosUniformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        lbl_variableB.setText("Ingrese B");
        getContentPane().add(lbl_variableB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        lbl_intervalosHistograma.setText("Ingrese numero de intervalos para el histograma:");
        getContentPane().add(lbl_intervalosHistograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 300, 60));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel5.setText("Distribucion Uniforme");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        btn_generarHistograma.setText("Generar histograma");
        btn_generarHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarHistogramaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generarHistograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, -1, -1));

        txt_variableC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_variableCActionPerformed(evt);
            }
        });
        txt_variableC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_variableCKeyReleased(evt);
            }
        });
        getContentPane().add(txt_variableC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 120, -1));
        getContentPane().add(txt_valorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 110, -1));
        getContentPane().add(txt_valorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 120, -1));

        txt_intervalosHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_intervalosHistogramaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_intervalosHistograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 510, 140, -1));

        tbl_numerosUniformes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "numero", "Numero Uniforme"
            }
        ));
        jScrollPane2.setViewportView(tbl_numerosUniformes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 250, 430));
        getContentPane().add(txt_mediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 110, -1));

        txt_varianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_varianzaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_varianza, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 110, -1));

        lbl_desviacionEstandar.setText("Desviación estandar");
        getContentPane().add(lbl_desviacionEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));
        getContentPane().add(txt_desviacionEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 110, -1));

        lbl_varianza.setText("Varianza");
        getContentPane().add(lbl_varianza, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));

        lbl_mediana.setText("Mediana");
        getContentPane().add(lbl_mediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));
        getContentPane().add(txt_media, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 110, -1));

        lbl_Media.setText("Media");
        getContentPane().add(lbl_Media, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));
        getContentPane().add(principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_xActionPerformed

    private void btn_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_calcularMouseClicked

        if (txt_d.getText().equalsIgnoreCase("") && txt_k.getText().equalsIgnoreCase("") && txt_x.getText().equalsIgnoreCase("")) { //verifica si estan ingresadas todas las variables
            JOptionPane.showMessageDialog(null, "Faltan valores por ingresar", "ERROR", JOptionPane.ERROR_MESSAGE);//enviamos un mensaje de error
        } else {
            double r = 0; //almacena el valor de r = Xn+1
            String columnaCabezera[] = {"n", "Numeros aleatorios"}; //almacenamos los valores de la primera fila

            Object datos[][] = new Object[(int) m][5];//almacena los datos con el tamaño de m filas por 5 columnas
            
            valoresObtenidos = new double[(int)m];
            
            double verificarPeriodo = x / m; // le damos el valor del periodo

            for (int i = 1; i <= m; i++) {
                r = (a * x + c) % m; //  almacenamos en r el calculo de Xn+1

                //le damos los valores a la fila
//                if(i>100){
                datos[i - 1][0] = "" + i; //primera columna almacena el valor de cuantas veces recorrio n
//                datos[i - 1][1] = x + "";//segunda columna almacena el valor de Xn
//                datos[i - 1][2] = r + " + " + r + "/" + m; // tercera columna almacena el valor de (aXn+c)mod m
//                datos[i - 1][3] = r + ""; //cuarta fila almacena el valor del resultado Xn+1
                datos[i - 1][1] = (r/m); // quinta fila almacena el numero uniforme
//                }
                x = r; // le damos a x el valor de Xn+1 en este caso r
                
                valoresObtenidos[i-1]=(r/m);
                
            }
            DefaultTableModel dtm = new DefaultTableModel(datos, columnaCabezera); //creamos el modelo para la tabla
            table_datos.setModel(dtm);// le damos el valor del modelo a la tabla
            
            double mediaValor = media(valoresObtenidos);
            double varianzaValor = varianza(valoresObtenidos, mediaValor);
            txt_media.setText((Math.rint(mediaValor * 10000) / 10000) + "");
            txt_mediana.setText((Math.rint(mediana(valoresObtenidos) * 10000) / 10000) + "");
            txt_varianza.setText((Math.rint(varianzaValor * 10000) / 10000) + "");
            txt_desviacionEstandar.setText((Math.rint(Math.sqrt(varianzaValor) * 10000) / 10000) + "");
        }
    }//GEN-LAST:event_btn_calcularMouseClicked

    private void txt_kMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_kMouseExited


    }//GEN-LAST:event_txt_kMouseExited

    private void txt_kKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kKeyReleased

        try {
            this.k = Integer.parseInt(txt_k.getText());//transformamos el valor de k en caso de que se ingrese un double o string saltara al catch
            a = 1 + (4 * k); //calculamos el valor de a
            lbl_a.setText("Valor a= " + a); //Cambiamos el valor del label
        } catch (NumberFormatException e) {//catch en caso de que se ingrese un decimal u string

            try {
//                Double.parseDouble(txt_k.getText());//transformamos a double en caso 
//                //de exitir un error saltara a la exepcion
//                JOptionPane.showMessageDialog(null, "El valor de K debe ser entero no decimal", "ERROR", JOptionPane.ERROR_MESSAGE);//enviamos el mensaje de error correspondiente
//                txt_k.setText("");
//                lbl_a.setText("");
            } catch (NumberFormatException e2) {// en caso de existir letras
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos", "ERROR", JOptionPane.ERROR_MESSAGE); //enviamos el mensaje de error
                txt_k.setText("");
                lbl_a.setText("");
            }

        }
    }//GEN-LAST:event_txt_kKeyReleased

    private void txt_xKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_xKeyReleased

        try {
            this.x = Double.parseDouble(txt_x.getText()); //transformamos el valor ingresado a double 
            //en caso de exitir un error se enviara a la exepcion
            if (this.x < 0) {//verificamos que x sea menor que 0 
                JOptionPane.showMessageDialog(null, "El valor de x debe ser mayor a 0", "ERROR", JOptionPane.ERROR_MESSAGE);//mensaje de error en caso de que d sea menor a 0
                txt_x.setText("");//vaciamos el texto de x
                this.x = 0;//le damos el valor de 0 a x para que se borre el valor anterior
            }
        } catch (NumberFormatException e) {//exepcion en caso de que el usuario ingrese letras o caracteres especiales
            JOptionPane.showMessageDialog(null, "Ingrese valores numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txt_x.setText("");
            this.x = 0;//el damos el valor de 0 a x para que se borre el valor anterior
        }
    }//GEN-LAST:event_txt_xKeyReleased

    private void txt_dKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dKeyReleased

        //validamos si el numero es entero
        try {
            this.d = Integer.parseInt(txt_d.getText()); //en caso de que el usuario no me ingrese un entero 
            //entonces saltara el error
            //realizamos el calculo para m 
            //m = Math.pow(2, d);
            m=d;
            lbl_m.setText("Valor m= " + m);//le damos el valor del label

           // c = (int) obtenerUltimoPrimoM((int) m); // almacena el ultimo valor primo mas proximo a m
            //lbl_c.setText("Valor c= " + c); // le damos el valor al label

        } catch (NumberFormatException e) {//exepcion si el usuario ingresa valor no entero
            try {
                Double.parseDouble(txt_d.getText());//en caso de que el valor sea double
                JOptionPane.showMessageDialog(null, "El valor de D debe ser entero no decimal", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_d.setText("");
                lbl_m.setText("");
                //lbl_c.setText("");
            } catch (NumberFormatException e2) {//en caso de que el valor este dado con letras o caracteres
                JOptionPane.showMessageDialog(null, "Ingrese valores numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_d.setText("");
               // lbl_c.setText("");
                lbl_m.setText("");
            }

        }


    }//GEN-LAST:event_txt_dKeyReleased

    private void btn_calcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_calcularKeyPressed

       
    }//GEN-LAST:event_btn_calcularKeyPressed

    private void txt_variableCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_variableCKeyReleased
     c=Integer.parseInt(txt_variableC.getText());   // TODO add your handling code here:
    }//GEN-LAST:event_txt_variableCKeyReleased

    private void txt_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dActionPerformed

    private void txt_variableCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_variableCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_variableCActionPerformed
        
    
     //retornamos el valor maximo
    public static double valorMaximo(double[] valoresObtenidos) {
        double vMaximo = 0;
        for (int i = 0; i < valoresObtenidos.length; i++) {
            vMaximo = Math.max(vMaximo, valoresObtenidos[i]);
        }
        return vMaximo;
    }

    //retornamos el valor minimo
    public static double valorMinimo(double[] valoresObtenidos) {
        double vMinimo = valoresObtenidos[0];
        for (int i = 1; i < valoresObtenidos.length; i++) {
            vMinimo = Math.min(vMinimo, valoresObtenidos[i]);
        }
        return vMinimo;
    }
    
    private void btn_generarHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarHistogramaActionPerformed
            //////////////////////////////////////////////////////////////////////////////////////////////////////7

        a = Integer.parseInt(txt_intervalosHistograma.getText());//numero de intervalos
        double numMax = valorMaximo(valoresObtenidos);
        double numMin = valorMinimo(valoresObtenidos);
        double rango = numMax - numMin;
        double amplitudIntervalo =  1;
        amplitudIntervalo = amplitudIntervalo/a;

        System.out.println("maximo" + numMax);
        System.out.println("minimo" + numMin);
        System.out.println("rango" + rango);
        System.out.println("inter" + amplitudIntervalo);
        
        double intervalosGenerados[][] = new double[a][2];
        intervalosGenerados[0][0] = numMin;
        intervalosGenerados[0][1] = numMin + amplitudIntervalo;
        for (int i = 1; i < intervalosGenerados.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    intervalosGenerados[i][j] = intervalosGenerados[i - 1][1];
                } else {
                    intervalosGenerados[i][j] = intervalosGenerados[i - 1][1] + amplitudIntervalo;
                }

            }
        }
        ///////////////////////////////////////coprobaciones
//        for (int i = 0; i < intervalosGenerados.length; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println(intervalosGenerados[i][j]);
//            }
//        }

        double intervaloHistograma[] = new double[a];
        for (int i = 0; i < intervalosGenerados.length; i++) {

            intervaloHistograma[i] = (intervalosGenerados[i][0] + intervalosGenerados[i][1]) / 2;

        }
    
        
        ///////////////////////////////////////coprobaciones
            
//        for (int i = 0; i < intervaloHistograma.length; i++) {
//            System.out.println("his" + intervaloHistograma[i]);
//
//        }
//  
        int frecuencias[] = new int[a];
        for (int i = 0; i < frecuencias.length; i++) {
            int cont = 0;

            for (int j = 0; j < valoresObtenidos.length; j++) {
                if (j == 0) {
                    if (valoresObtenidos[j] >= intervalosGenerados[i][0] && valoresObtenidos[j] <= intervalosGenerados[i][1]) {
                        cont++;
                    }
                } else if (valoresObtenidos[j] > intervalosGenerados[i][0] && valoresObtenidos[j] <= intervalosGenerados[i][1]) {
                    cont++;
                }
            }
            frecuencias[i] = cont;
        }

        Datos = new DefaultCategoryDataset();
     
        ///////////////////////////////////////coprobaciones
//        for (int i = 0; i < frecuencias.length; i++) {
//            System.out.println("i " + i + "->" + frecuencias[i]);
//
//        }
        
        for (int i = 0; i < frecuencias.length; i++) {
            
            Datos.addValue(frecuencias[i], "Data", intervaloHistograma[i] + "");

        }

        grafica = ChartFactory.createBarChart3D("Histograma",
                "Intervalos : (valor minimo= " + numMin + "; Amplitud del intervalo=" + amplitudIntervalo + ")", "Frecuencia", Datos,
                PlotOrientation.VERTICAL, true, true, false);

        //para el boton
        ChartPanel Panel = new ChartPanel(grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        //////////////////////////////////////////////////////////////////////////////////////////////////////7    
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_generarHistogramaActionPerformed

    private void btn_generarNumerosUniformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarNumerosUniformesActionPerformed
        if (txt_valorA.getText().equalsIgnoreCase("") && txt_valorB.getText().equalsIgnoreCase("") ) { //verifica si estan ingresadas todas las variables
            JOptionPane.showMessageDialog(null, "Faltan valores por ingresar", "ERROR", JOptionPane.ERROR_MESSAGE);//enviamos un mensaje de error
        } else {
            
            int valorA = Integer.parseInt(txt_valorA.getText());
            int valorB = Integer.parseInt(txt_valorB.getText());
            String columnaCabezera[] = {"n", "Numeros uniformes"}; //almacenamos los valores de la primera fila

            Object datos[][] = new Object[(int) m][2];//almacena los datos con el tamaño de m filas por 5 columnas
            
 
            for (int i = 0; i < valoresObtenidos.length; i++) {
                datos[i][0] = "" + i; //primera columna almacena el valor de cuantas veces recorrio n
                datos[i][1] = valorA+(valorB-valorA)* valoresObtenidos[i]; // quinta fila almacena el numero uniforme
                
            }
            DefaultTableModel dtm = new DefaultTableModel(datos, columnaCabezera); //creamos el modelo para la tabla
            tbl_numerosUniformes.setModel(dtm);// le damos el valor del modelo a la tabla
        }                // TODO add your handling code here:
    }//GEN-LAST:event_btn_generarNumerosUniformesActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void txt_varianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_varianzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_varianzaActionPerformed
    
    
    //retornamos el valor maximo
   
    //metodo para generar la media
    public static double media(double[] valoresObtenidos) {
        double total = 0;
        for (int i = 0; i < valoresObtenidos.length; i++) {
            total += valoresObtenidos[i];

        }
        total = total / valoresObtenidos.length;

        return total;
    }

    //retornamos la mediana
    public static double mediana(double[] valoresObtenidos) {
        double[] orden = ordenar(valoresObtenidos, 0);
        int valor = Math.round(valoresObtenidos.length / 2);
        double total = orden[valor];
        return total;
    }

    //retornamos la varianza
    public static double varianza(double[] valoresObtenidos, double media) {
        double auxAcumulador = 0;
        for (int i = 0; i < valoresObtenidos.length; i++) {
            auxAcumulador += Math.pow(valoresObtenidos[i] - media, 2);
        }
        auxAcumulador = auxAcumulador / (valoresObtenidos.length - 1);

        return auxAcumulador;
    }

    //retornamos los valores ordenados 0 para ascendete 1 para desendente
    public static double[] ordenar(double[] data, int ord) {
        double []valor = data; 
        int i, j;
        double n = valor.length, aux = 0;

        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (ord == 0) {
                    if (valor[i] > valor[j]) {
                        aux = valor[j];
                        valor[j] = valor[i];
                        valor[i] = aux;
                    } else if (ord == 1) {
                        if (valor[i] < valor[j]) {
                            aux = valor[i];
                            valor[i] = valor[j];
                            valor[j] = aux;
                        }
                    }
                }
            }
        }
        return data;
    }
    
    
    private void txt_intervalosHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_intervalosHistogramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_intervalosHistogramaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(DistribucionUniforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DistribucionUniforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DistribucionUniforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DistribucionUniforme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DistribucionUniforme().setVisible(true);
            }
        });

    }

    //retornamos el ultimo valor primo para el calculo de m
    static double obtenerUltimoPrimoM(int numero) {
        int contador = 2; //almacena el conteo desde 2 ya que un primo es divisible para si mismo y para la unidad
        boolean primo = true;//almacena la verificacion de que si el numero es primo o no

        while ((primo) && (contador != numero)) {//mietras primo sea true y contador no sea igual al numero que es ingresado 
            if (numero % contador == 0) { //verificamos que el numero no sea divisible
                primo = false;//retornamos el valor falso en caso de encontrar un numero que sea divisible
            }
            contador++;//aumentamos el contador
        }

        if (primo) {//en caso de ser primo retornamos el numero
            return numero;
        } else {
            return obtenerUltimoPrimoM(numero - 1); //reducimos en uno el valor a buscar
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_generarHistograma;
    private javax.swing.JButton btn_generarNumerosUniformes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_Media;
    private javax.swing.JLabel lbl_a;
    private javax.swing.JLabel lbl_c;
    private javax.swing.JLabel lbl_d;
    private javax.swing.JLabel lbl_desviacionEstandar;
    private javax.swing.JLabel lbl_intervalosHistograma;
    private javax.swing.JLabel lbl_k;
    private javax.swing.JLabel lbl_m;
    private javax.swing.JLabel lbl_mediana;
    private javax.swing.JLabel lbl_periodo;
    private javax.swing.JLabel lbl_valorA;
    private javax.swing.JLabel lbl_variableB;
    private javax.swing.JLabel lbl_varianza;
    private javax.swing.JLabel lbl_x;
    private javax.swing.JLabel principal;
    private javax.swing.JTable table_datos;
    private javax.swing.JTable tbl_numerosUniformes;
    private javax.swing.JTextField txt_d;
    private javax.swing.JTextField txt_desviacionEstandar;
    private javax.swing.JFormattedTextField txt_intervalosHistograma;
    private javax.swing.JTextField txt_k;
    private javax.swing.JTextField txt_media;
    private javax.swing.JTextField txt_mediana;
    private javax.swing.JFormattedTextField txt_valorA;
    private javax.swing.JFormattedTextField txt_valorB;
    private javax.swing.JTextField txt_variableC;
    private javax.swing.JTextField txt_varianza;
    private javax.swing.JTextField txt_x;
    // End of variables declaration//GEN-END:variables
}
