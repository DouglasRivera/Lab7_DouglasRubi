/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_douglasrivera;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author river
 */
public class MENU extends javax.swing.JFrame {
   private int IndiceNaves = -1;
   private int Id = -1;
   AstroBinario astro = new AstroBinario("./astronautas.txt");
   NavesBinario nave = new NavesBinario("./naves.txt");
   DestinoBinario planetas = new DestinoBinario("./destino.txt");
   ArrayList<Astroboy> Astro = new ArrayList();
   Astroboy AS = new Astroboy();
   
    public MENU() {
        initComponents();
        
        jt_Astronautas.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Apellido", "Nacionalidad", "Peso", "Misiones"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                jt_Astronautas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        Id = jt_Astronautas.getSelectedRow();
                    }

                });
                 jt_Astronautas.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Apellido", "Nacionalidad", "Peso", "Misiones"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                jt_Astronautas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        Id = jt_Astronautas.getSelectedRow();
                    }

                });
                
                jt_Naves.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Identificador", "Cantidad de Personas", "Velocidad"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                jt_Naves.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        Id = jt_Naves.getSelectedRow();
                    }

                });
                 jt_Naves.setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][]{},
                        new String[]{
                            "Nombre", "Identificador", "Cantidad de Personas", "Velocidad"
                        }
                ) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.String.class , java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, false,false,false
                    };
                    
                    

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                });
        
                jt_Naves.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        // jTable1.getSelectedRow()
                        Id = jt_Naves.getSelectedRow();
                    }

                });
                recargarTablaA(jt_Astronautas);
                recargarTablaN(jt_Naves);
    }
    private int Velocidad = -1;
    private int Consumo = -1;
     
    public void vaciarTablaA(JTable tabla){
        DefaultTableModel Modelo = (DefaultTableModel) jt_Astronautas.getModel();
        String titulos[] =  new String[]{
                             "Nombre", "Apellido", "Nacionalidad", "Peso", "Misiones"
                        };
        Modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(Modelo);

    }
     private void recargarTablaA(JTable tabla){
        vaciarTablaA(tabla);
         // Usuarios us = new Usuarios();
                for (Astroboy astro : astro.getAstronautas()) {
                    Object row[] = {astro.getNombre(), astro.getApellido(),astro.getNacionalidad(),astro.getPeso(),astro.getMisiones()};
                    DefaultTableModel m =
                            (DefaultTableModel) tabla.getModel();
                    m.addRow(row);
                    tabla.setModel(m);
                }//fin for
        
    }
     public void vaciarTablaN(JTable tabla){
        DefaultTableModel Modelo = (DefaultTableModel) jt_Naves.getModel();
        String titulos[] =  new String[]{
                            "Nombre", "Identificador", "Cantidad de Personas", "Velocidad"
                        };
        Modelo = new DefaultTableModel(null,titulos);
        tabla.setModel(Modelo);

    }
     private void recargarTablaN(JTable tabla){
        vaciarTablaA(tabla);
         // Usuarios us = new Usuarios();
                for (Naves naves : nave.getNave()) {
                    Object row[] = {naves.getNombre(), naves.getIdentificador(),naves.getCant_Personas(),naves.getVelocidad()};
                    DefaultTableModel m =
                            (DefaultTableModel) tabla.getModel();
                    m.addRow(row);
                    tabla.setModel(m);
                }//fin for
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtContextura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtMisiones = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jbAgregarAstronautas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreNave = new javax.swing.JTextField();
        txtIdentificador = new javax.swing.JTextField();
        txtCantidadPersonas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTiempoDiesplegue = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAstronautas = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTiempoAterrizaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sp_Velocidad = new javax.swing.JSpinner();
        sp_Consumo = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jbAgregarNaves = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pg_c1 = new javax.swing.JProgressBar();
        pg_c = new javax.swing.JProgressBar();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Astronautas = new javax.swing.JTable();
        jbModificarA = new javax.swing.JButton();
        jbEliminarA = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jbModificarN = new javax.swing.JButton();
        jbEliminarN = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_Naves = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Id:");

        txtId.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Nacionalidad:");

        txtNacionalidad.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Titulo Universitario:");

        txtTitulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Contextura Fisica:");

        txtContextura.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setText("Peso:");

        txtPeso.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        txtMisiones.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setText("Misiones:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setText("ASTRONAUTAS");

        jbAgregarAstronautas.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jbAgregarAstronautas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign-up.png"))); // NOI18N
        jbAgregarAstronautas.setText("Agregar");
        jbAgregarAstronautas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAstronautasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtNacionalidad)
                            .addComponent(txtTitulo)
                            .addComponent(txtContextura)
                            .addComponent(txtPeso)
                            .addComponent(txtMisiones, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jbAgregarAstronautas)))
                .addContainerGap(557, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel14)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtContextura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMisiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jbAgregarAstronautas)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ASTRONAUTAS", jPanel2);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setText("NAVES");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setText("Nombre:");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setText("Identificador:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Cantidad de Personas:");

        txtNombreNave.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        txtIdentificador.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        txtCantidadPersonas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setText("Tiempo de Despegue:");

        txtTiempoDiesplegue.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel20.setText("Astronautas Abordo:");

        txtAstronautas.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel21.setText("Tiempo de Aterrizaje:");

        txtTiempoAterrizaje.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Velocidad:");

        sp_Velocidad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        sp_Consumo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Consumo:");

        jbAgregarNaves.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbAgregarNaves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entrar.png"))); // NOI18N
        jbAgregarNaves.setText("Agregar");
        jbAgregarNaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarNavesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jLabel15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreNave, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(txtIdentificador)
                                .addComponent(txtCantidadPersonas)
                                .addComponent(txtTiempoDiesplegue)
                                .addComponent(txtAstronautas)
                                .addComponent(txtTiempoAterrizaje))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(sp_Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jbAgregarNaves))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addComponent(sp_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(520, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel15)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreNave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtCantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtTiempoDiesplegue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtAstronautas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtTiempoAterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sp_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sp_Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jbAgregarNaves)
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("NAVES", jPanel3);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("SIMULADOR NAVE");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Combustible:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Tanque de reserva:");

        pg_c1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pg_c1.setMaximum(50);
        pg_c1.setValue(50);
        pg_c1.setStringPainted(true);

        pg_c.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        pg_c.setMaximum(50);
        pg_c.setValue(50);
        pg_c.setStringPainted(true);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton3.setText("Avanzar");

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton4.setText("Detener");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pg_c, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pg_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jButton3)
                .addGap(264, 264, 264)
                .addComponent(jButton4)
                .addGap(0, 418, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pg_c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(pg_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(318, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SIMULACION", jPanel1);

        jt_Astronautas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jt_Astronautas);

        jbModificarA.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbModificarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit.png"))); // NOI18N
        jbModificarA.setText("Modificar");
        jbModificarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarAActionPerformed(evt);
            }
        });

        jbEliminarA.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbEliminarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        jbEliminarA.setText("Eliminar");
        jbEliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jbModificarA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminarA))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(502, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminarA)
                    .addComponent(jbModificarA))
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CRUD ASTRONAUTAS", jPanel4);

        jbModificarN.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbModificarN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit.png"))); // NOI18N
        jbModificarN.setText("Modificar");
        jbModificarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarNActionPerformed(evt);
            }
        });

        jbEliminarN.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jbEliminarN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        jbEliminarN.setText("Eliminar");
        jbEliminarN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarNActionPerformed(evt);
            }
        });

        jt_Naves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jt_Naves);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jbModificarN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminarN))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificarN)
                    .addComponent(jbEliminarN))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CRUD NAVES", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarAActionPerformed
        if(jt_Astronautas.getSelectedRow()>=0){
            // mostrar la segunda pestaña para editar
            jTabbedPane1.setSelectedIndex(0);
            Astroboy tp = new Astroboy();
            ArrayList<Astroboy> ast = tp.ReadFileScannerArrayList();
            this.AS = ast.get(Id);
            this.txtNombre.setText(AS.getNombre());
            this.txtApellido.setText(AS.getApellido());
            this.txtNacionalidad.setText(AS.getNacionalidad());
            this.txtTitulo.setText(AS.getTituloU());
            this.txtContextura.setText(AS.getCOntextura());
            this.txtPeso.setText(AS.getPeso()+"");
            this.txtMisiones.setText(AS.getMisiones()+"");
            JOptionPane.showMessageDialog(this, "Se ha actualizado exitosamente el astronauta");
        }
    }//GEN-LAST:event_jbModificarAActionPerformed

    private void jbEliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarAActionPerformed
        if(jt_Astronautas.getSelectedRow()>=0){
            // eliminar
            Astroboy tp = new Astroboy();           
            Astro.remove(Id);
            tp.WriteFileMod(Astro);
            this.Id = -1;            
            recargarTablaA(jt_Astronautas);
           JOptionPane.showMessageDialog(this, "Se ha eliminado exitosamente el astronauta");
        }
    }//GEN-LAST:event_jbEliminarAActionPerformed

    private void jbModificarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarNActionPerformed
        
    }//GEN-LAST:event_jbModificarNActionPerformed

    private void jbEliminarNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarNActionPerformed
        
    }//GEN-LAST:event_jbEliminarNActionPerformed

    private void jbAgregarAstronautasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAstronautasActionPerformed
        boolean valido = true;
        if (this.txtNombre.getText() == null || "".equals(this.txtNombre.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el nombre");
            valido = false; 
        }
        if (this.txtApellido.getText() == null || "".equals(this.txtApellido.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el apellido");
            valido = false;       
        }
        if (this.txtId.getText() == null || "".equals(this.txtId.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el id del astronauta: ");
            valido = false;
        }
        if (this.txtNacionalidad.getText() == null || "".equals(this.txtNacionalidad.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la Nacionalidad: ");
            valido = false; 
        }
        if (this.txtTitulo.getText() == null || "".equals(this.txtTitulo.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el titulo universitario: ");
            valido = false;       
        }
        if (this.txtContextura.getText() == null || "".equals(this.txtContextura.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la contextura del astronauta: ");
            valido = false; 
        }
        if (this.txtPeso.getText() == null || "".equals(this.txtPeso.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el peso del astronauta: ");
            valido = false; 
        }
        if (this.txtMisiones.getText() == null || "".equals(this.txtMisiones.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese las misiones del astronauta: ");
            valido = false;       
        }
        if (valido && this.Id<0) {
            Astroboy asta = new Astroboy(Integer.parseInt(txtId.getText()),txtNombre.getText(),txtApellido.getText(), txtNacionalidad.getText(), txtTitulo.getText(), txtContextura.getText(), Double.parseDouble(txtPeso.getText()), Integer.parseInt(txtMisiones.getText()));
            astro.cargarArchivoUsuario();
            astro.getAstronautas().add(asta);
            astro.escribirArchivoUsuario();
            JOptionPane.showMessageDialog(this, "Se ha agregado exitosamente el astronauta");
        } else if(this.Id>=0) {
            Astroboy tp = new Astroboy();
            ArrayList<Astroboy> asta = tp.ReadFileScannerArrayList();
            Astroboy AstroActualizar = asta.get(Id);
            AstroActualizar.setId(Integer.parseInt(txtId.getText()));
            AstroActualizar.setNombre(txtNombre.getText());
            AstroActualizar.setApellido(txtApellido.getText());
            AstroActualizar.setNacionalidad(txtNacionalidad.getText());
            AstroActualizar.setTituloU(txtTitulo.getText());
            AstroActualizar.setCOntextura(txtContextura.getText());
            AstroActualizar.setPeso(Double.parseDouble(txtPeso.getText()));
            AstroActualizar.setMisiones(Integer.parseInt(txtMisiones.getText()));
            // this.Id = -1;
            tp.WriteFileMod(asta);
            this.Id = -1;
            JOptionPane.showConfirmDialog(this, "Se actualizo correctamente");
        }
        recargarTablaA(jt_Astronautas);
    }//GEN-LAST:event_jbAgregarAstronautasActionPerformed

    private void jbAgregarNavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarNavesActionPerformed
        this.Velocidad =  (Integer) sp_Velocidad.getValue();
        this.Consumo =  (Integer) sp_Consumo.getValue();
        boolean valido = true;
         if (this.txtNombreNave.getText() == null || "".equals(this.txtNombreNave.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el nombre de la nave: ");
            valido = false; 
        }
        if (this.txtIdentificador.getText() == null || "".equals(this.txtIdentificador.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el identificador de la nave: ");
            valido = false;       
        }
        if (this.txtCantidadPersonas.getText() == null || "".equals(this.txtCantidadPersonas.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese la cantidad de personas: ");
            valido = false;
        }
        if (this.txtTiempoDiesplegue.getText() == null || "".equals(this.txtTiempoDiesplegue.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el tiempo de despegue: ");
            valido = false; 
        }
        if (this.txtAstronautas.getText() == null || "".equals(this.txtAstronautas.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese los astronautas abordo: ");
            valido = false;       
        }
         if (this.txtTiempoAterrizaje.getText() == null || "".equals(this.txtTiempoAterrizaje.getText())) {
            JOptionPane.showConfirmDialog(this, "Ingrese el tiempo de aterrizaje: ");
            valido = false;
        }
        if (this.Consumo == -1 || "".equals(this.Consumo)) {
            JOptionPane.showConfirmDialog(this, "Ingrese el consumo: ");
            valido = false; 
        }
        if (this.Velocidad == -1 || "".equals(this.Velocidad)) {
            JOptionPane.showConfirmDialog(this, "Ingrese la velocidad: ");
            valido = false; 
        }if (valido && this.Id<0) {
        Naves naves = new Naves(txtNombreNave.getText(), txtIdentificador.getText(), Integer.parseInt(txtCantidadPersonas.getText()), Integer.parseInt(txtTiempoDiesplegue.getText()), Integer.parseInt(txtAstronautas.getText()), Integer.parseInt(txtTiempoAterrizaje.getText()), this.Consumo, this.Velocidad);
        nave.cargarArchivoUsuario();
        nave.getNave().add(naves);
        nave.escribirArchivoUsuario();
        JOptionPane.showMessageDialog(this, "Se ha agregado exitosamente la nave");
        }
        recargarTablaN(jt_Naves);
    }//GEN-LAST:event_jbAgregarNavesActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAgregarAstronautas;
    private javax.swing.JButton jbAgregarNaves;
    private javax.swing.JButton jbEliminarA;
    private javax.swing.JButton jbEliminarN;
    private javax.swing.JButton jbModificarA;
    private javax.swing.JButton jbModificarN;
    private javax.swing.JTable jt_Astronautas;
    private javax.swing.JTable jt_Naves;
    public javax.swing.JProgressBar pg_c;
    public javax.swing.JProgressBar pg_c1;
    private javax.swing.JSpinner sp_Consumo;
    private javax.swing.JSpinner sp_Velocidad;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAstronautas;
    private javax.swing.JTextField txtCantidadPersonas;
    private javax.swing.JTextField txtContextura;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtMisiones;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreNave;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTiempoAterrizaje;
    private javax.swing.JTextField txtTiempoDiesplegue;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
