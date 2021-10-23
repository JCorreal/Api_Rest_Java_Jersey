package cliente_api_rest;

import BO.Usuario;
import com.google.gson.Gson;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Properties;
import javax.swing.JOptionPane;


public class Jframe_Consumir_Api extends javax.swing.JFrame {
   public Jframe_Consumir_Api() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Nombres = new javax.swing.JTextField();
        jTextField_Apellidos = new javax.swing.JTextField();
        jButton_Agregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField_ConsultarUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_Nombres = new javax.swing.JLabel();
        jLabel_Apellidos = new javax.swing.JLabel();
        jButton_Consultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_NombresC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_ApellidosC = new javax.swing.JTextField();
        jButton_Actualizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField_Usuario_Id = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField_Eliminar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton_Eliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel_Respuesta = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton_ConsultarTodo = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente Consumo API Rest");
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Post - Agregar Usuario");

        jButton_Agregar.setText("Agregar");
        jButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombres");

        jLabel7.setText("Apellidos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButton_Agregar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jButton_Agregar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_ConsultarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ConsultarUsuarioKeyTyped(evt);
            }
        });

        jLabel3.setText("Ingresar ID:");

        jLabel_Nombres.setText("Nombres:");

        jLabel_Apellidos.setText("Apellidos:");

        jButton_Consultar.setText("Consultar");
        jButton_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("Get - Consultar Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Apellidos)
                            .addComponent(jLabel_Nombres)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Consultar)
                                    .addComponent(jTextField_ConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_ConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Nombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Apellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Consultar)
                .addGap(302, 302, 302))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel8.setText("Put - Actualizar Usuario");

        jLabel9.setText("Nombres");

        jLabel10.setText("Apellidos");

        jButton_Actualizar.setText("Actualizar");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });

        jLabel11.setText("Usuario_Id");

        jTextField_Usuario_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Usuario_IdKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton_Actualizar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Usuario_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_NombresC, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ApellidosC, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Usuario_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_NombresC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ApellidosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton_Actualizar)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_Eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_EliminarKeyTyped(evt);
            }
        });

        jLabel4.setText("Ingresar ID:");

        jButton_Eliminar.setText("Eliminar");
        jButton_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EliminarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setText("Delete - Eliminar Usuario");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Eliminar)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButton_Eliminar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        jLabel_Respuesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Respuesta.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_Respuesta.setText(".");

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jList1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(jList1);

        jButton_ConsultarTodo.setText("Consultar Todo");
        jButton_ConsultarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConsultarTodoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel12.setText("Get - Consultar  Todo");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jButton_ConsultarTodo))
                    .addComponent(jLabel12)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_ConsultarTodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel_Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_Respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(580, 542));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarActionPerformed
       jLabel_Respuesta.setText("");
       if (jTextField_ConsultarUsuario.getText().trim().equals(""))
       {
          JOptionPane.showMessageDialog(rootPane, "Ingresar Documento", "Consumir API_Rest",javax.swing.JOptionPane.ERROR_MESSAGE);
       }    
       else
       {
          ConsultarUsuario();
       }
	
    }//GEN-LAST:event_jButton_ConsultarActionPerformed

    private void ConsultarUsuario()
    {
     String miurl = "http://localhost:21185/Api_Rest/service/usuarios/" + jTextField_ConsultarUsuario.getText();
     try
      {        
        URL url = new URL(miurl); // creamos una URL donde esta nuestro webservice
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();        
        conn.setRequestMethod("GET"); // Indicamos por que verbo HTML ejecutaremos la solicitud
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) 
        { // si la respuesta del servidor es distinta al codigo 200 lanzaremos una Exception
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String linea;
        String fichero = "";
      
        while ((linea = br.readLine()) != null)
        {
           fichero += linea;
           
        }
        Gson gson = new Gson();
        Properties properties = gson.fromJson(fichero, Properties.class);
        jLabel_Nombres.setText("Nombres: "+properties.get("nombres").toString());
        jLabel_Apellidos.setText("Apellidos: "+properties.get("apellidos").toString());
        
	conn.disconnect();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }

    }
    
    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed
       jLabel_Respuesta.setText("");
       if ((jTextField_Nombres.getText().trim().equals("")) || (jTextField_Apellidos.getText().trim().equals("")))
       {
          JOptionPane.showMessageDialog(rootPane, "Ingresar nombres y apellidos", "Consumir API_Rest",javax.swing.JOptionPane.ERROR_MESSAGE);
       }    
       else
       {
          AgregarUsuario();
       }            
    }//GEN-LAST:event_jButton_AgregarActionPerformed

    
    private void AgregarUsuario()
    {
        try 
        {
	   URL url = new URL("http://localhost:21185/Api_Rest/service/usuarios");
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	   conn.setDoOutput(true);
	   conn.setRequestMethod("POST");
	   conn.setRequestProperty("Content-Type", "application/json");
           Usuario usuario = new Usuario();
           usuario.setUsuario_id(0);
           usuario.setNombres(jTextField_Nombres.getText());
           usuario.setApellidos(jTextField_Apellidos.getText());
           Gson gson = new Gson();
           String json = gson.toJson(usuario);
   	   OutputStream os = conn.getOutputStream();
	   os.write(json.getBytes());
	   os.flush();
           os.close();
     	   if (conn.getResponseCode() != 200) 
           { // si la respuesta del servidor es distinta al codigo 200 lanzaremos una Exception
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
           }
    	   BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
           String output = br.readLine();
	   conn.disconnect();        
           jLabel_Respuesta.setText(output);
        } 
        catch (IOException | RuntimeException e)
        {
         System.out.println("Error: " + e);
	}  
    }
    
    private void jButton_ConsultarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConsultarTodoActionPerformed
     String miurl = "http://localhost:21185/Api_Rest/service/usuarios";
     try
      {        
        URL url = new URL(miurl); // creamos una URL donde esta nuestro webservice
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();        
        conn.setRequestMethod("GET"); // Indicamos por que verbo HTML ejecutaremos la solicitud
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) 
        { // si la respuesta del servidor es distinta al codigo 200 lanzaremos una Exception
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String linea;
        String fichero = "";    
        while ((linea = br.readLine()) != null)
        {
            fichero += linea;
        }
        Gson gson = new Gson();
        String jsonAll = fichero;       
        Usuario[] listadoUsuarios = gson.fromJson(jsonAll,Usuario[].class);
        javax.swing.DefaultListModel datosLista;
        jList1.setModel( new javax.swing.DefaultListModel());
        datosLista = (javax.swing.DefaultListModel)jList1.getModel();   
        for (Usuario elUsuario : listadoUsuarios)
        {
            datosLista.addElement(elUsuario.getUsuario_id()+" - "+elUsuario.getNombres()+" "+elUsuario.getApellidos());
        }
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_jButton_ConsultarTodoActionPerformed

    private void jButton_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EliminarActionPerformed
       jLabel_Respuesta.setText("");
       if (jTextField_Eliminar.getText().trim().equals(""))
       {
          JOptionPane.showMessageDialog(rootPane, "Ingresar Documento", "Consumir API_Rest",javax.swing.JOptionPane.ERROR_MESSAGE);
       }    
       else
       {
          EliminarUsuario();
       }
    }//GEN-LAST:event_jButton_EliminarActionPerformed

    private void EliminarUsuario()
    {
      try 
        {
         String miurl = "http://localhost:21185/Api_Rest/service/usuarios/" + jTextField_Eliminar.getText();
         URL url = new URL(miurl); // creamos una URL donde esta nuestro webservice
         HttpURLConnection conn = (HttpURLConnection) url.openConnection();        
         conn.setRequestMethod("DELETE"); // Indicamos por que verbo HTML ejecutaremos la solicitud
         conn.setRequestProperty("Accept", "application/json");
         if (conn.getResponseCode() != 200) 
         { // si la respuesta del servidor es distinta al codigo 200 lanzaremos una Exception
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
         }         
         BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
         String output = br.readLine();
	 conn.disconnect();        	   
         jLabel_Respuesta.setText(output);
        } 
        catch (IOException | RuntimeException e)
        {
         System.out.println("Error: " + e);
	}
    }
    
    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
//       jLabel_Respuesta.setText("");
       if ((jTextField_Usuario_Id.getText().trim().equals("")) || (jTextField_NombresC.getText().trim().equals("")) || (jTextField_ApellidosC.getText().trim().equals("")))
       {
          JOptionPane.showMessageDialog(rootPane, "Ingresar nombres y apellidos", "Consumir API_Rest",javax.swing.JOptionPane.ERROR_MESSAGE);
       }    
       else
       {
          ActualizarUsuario();
       } 
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jTextField_ConsultarUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ConsultarUsuarioKeyTyped
      Validar_SoloNumeros(evt);
    }//GEN-LAST:event_jTextField_ConsultarUsuarioKeyTyped

    private void jTextField_Usuario_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Usuario_IdKeyTyped
      Validar_SoloNumeros(evt);
    }//GEN-LAST:event_jTextField_Usuario_IdKeyTyped

    private void jTextField_EliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_EliminarKeyTyped
      Validar_SoloNumeros(evt);
    }//GEN-LAST:event_jTextField_EliminarKeyTyped

    private void Validar_SoloNumeros(java.awt.event.KeyEvent evt)
    {
             char a=evt.getKeyChar();  
		if (a==8)    
                {
		   return;    
                }
                if(!(a>=KeyEvent.VK_0 && a<=KeyEvent.VK_9 )) 
                {
                      evt.consume();
                }
    }
    
    private void ActualizarUsuario()
    {
      String miurl = "http://localhost:21185/Api_Rest/service/usuarios/" + jTextField_Usuario_Id.getText();
      try
      {        
           URL url = new URL(miurl); // creamos una URL donde esta nuestro webservice 
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	   conn.setDoOutput(true);
	   conn.setRequestMethod("PUT");
	   conn.setRequestProperty("Content-Type", "application/json");
           Usuario usuario = new Usuario();
           usuario.setUsuario_id(Integer.parseInt(jTextField_Usuario_Id.getText()));
           usuario.setNombres(jTextField_NombresC.getText());
           usuario.setApellidos(jTextField_ApellidosC.getText());
           Gson gson = new Gson();
           String json = gson.toJson(usuario);
   	   OutputStream os = conn.getOutputStream();
	   os.write(json.getBytes());
	   os.flush();
           os.close();
     	   if (conn.getResponseCode() != 200) 
           { // si la respuesta del servidor es distinta al codigo 200 lanzaremos una Exception
            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
           }
    	   BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
           String output = br.readLine();
           jLabel_Respuesta.setText(output);
           conn.disconnect();                   
        } 
        catch (IOException | RuntimeException e)
        {
         System.out.println("Error: " + e);
	}
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe_Consumir_Api().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_Consultar;
    private javax.swing.JButton jButton_ConsultarTodo;
    private javax.swing.JButton jButton_Eliminar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Apellidos;
    private javax.swing.JLabel jLabel_Nombres;
    private javax.swing.JLabel jLabel_Respuesta;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_Apellidos;
    private javax.swing.JTextField jTextField_ApellidosC;
    private javax.swing.JTextField jTextField_ConsultarUsuario;
    private javax.swing.JTextField jTextField_Eliminar;
    private javax.swing.JTextField jTextField_Nombres;
    private javax.swing.JTextField jTextField_NombresC;
    private javax.swing.JTextField jTextField_Usuario_Id;
    // End of variables declaration//GEN-END:variables

    private static class Json {

        public Json() {
        }
    }
}
