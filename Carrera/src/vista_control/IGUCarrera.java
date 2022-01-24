package vista_control;

import Excepciones.MaximoCompetidoresException;
import Excepciones.MaximoPistasException;
import Excepciones.PistasException;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import modelo.Carrera;
import modelo.Competidor;
import modelo.Serializador;

/**
 *
 * @author ADRIANA
 */
public class IGUCarrera extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos;
    Thread principalh;

    /**
     * Creates new form IGUCarrera
     */
    public IGUCarrera() {

        carrera = new Carrera("Olimpiadas");
        Competidor competidor = new Competidor();
        initComponents();
        lblFechaCarrera.setText(fecha());
        principalh = new Thread(this);
        principalh.start();
        setVisible(true);
        objetos = new Competidor[8];

        c1 = new Competidor("Luis", 18, "Colombia", carrera, 0);
        c2 = new Competidor("Maria", 18, "Colombia", carrera, 1);
        c3 = new Competidor("Pepe", 18, "Colombia", carrera, 2);
        c4 = new Competidor("Ana", 18, "Colombia", carrera, 3);
        c5 = new Competidor("Felipe", 18, "Colombia", carrera, 4);
        c6 = new Competidor("Sara", 18, "Colombia", carrera, 5);
        c7 = new Competidor("Juan", 18, "Colombia", carrera, 6);
        c8 = new Competidor("Martha", 18, "Colombia", carrera, 7);
        objetos[0] = c1;
        objetos[1] = c2;
        objetos[2] = c3;
        objetos[3] = c4;
        objetos[4] = c5;
        objetos[5] = c6;
        objetos[6] = c7;
        objetos[7] = c8;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        tpInscripccion = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNroC = new javax.swing.JLabel();
        txtNroPistas = new javax.swing.JTextField();
        btnIngreso = new javax.swing.JButton();
        lblPosicion = new javax.swing.JLabel();
        txtNroCompe = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPista = new javax.swing.JTable();
        pnlDetCarrera = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblFechaCarrera = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblHoraCarrera = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTiempoComp1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblComp1 = new javax.swing.JLabel();
        lblComp2 = new javax.swing.JLabel();
        lblTiempoComp2 = new javax.swing.JLabel();
        lblComp3 = new javax.swing.JLabel();
        lblTiempoComp3 = new javax.swing.JLabel();
        lblComp4 = new javax.swing.JLabel();
        lblComp5 = new javax.swing.JLabel();
        lblComp6 = new javax.swing.JLabel();
        lblTiempoComp4 = new javax.swing.JLabel();
        lblTiempoComp5 = new javax.swing.JLabel();
        lblTiempoComp6 = new javax.swing.JLabel();
        lblComp7 = new javax.swing.JLabel();
        lblComp8 = new javax.swing.JLabel();
        lblTiempoComp7 = new javax.swing.JLabel();
        lblTiempoComp8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTComp1 = new javax.swing.JLabel();
        lblPrimerPuesto = new javax.swing.JLabel();
        lblTComp2 = new javax.swing.JLabel();
        lblSegundoPuesto = new javax.swing.JLabel();
        lblTComp3 = new javax.swing.JLabel();
        lblTercerPuesto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCuartoPuesto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblQuintoPuesto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSextoPuesto = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblSeptimoPuesto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblOctavoPuesto = new javax.swing.JLabel();
        btnLimpiar1 = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        btnSeguir = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnLimpiarTabla = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnuAbrir = new javax.swing.JMenuItem();
        mnuGuardar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNroC.setText("Numero de competidores");

        btnIngreso.setText("jButton1");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        lblPosicion.setText("Numero de pistas ");

        txtNroCompe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroCompeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNroC)
                    .addComponent(lblPosicion))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNroPistas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNroCompe, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(322, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngreso)
                .addGap(210, 210, 210))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNroC)
                    .addComponent(txtNroCompe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosicion)
                    .addComponent(txtNroPistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnIngreso)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 295, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tpInscripccion.addTab("Inscripcion", jPanel1);

        tblPista.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPista);

        tpInscripccion.addTab("Carrera", jScrollPane1);

        jLabel3.setText("Fecha de la carrera");

        lblFechaCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Hora de la carrera");

        lblHoraCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Tiempo final de los competidores");

        lblTiempoComp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblComp1.setText("Luis");

        lblComp2.setText("Maria");

        lblTiempoComp2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblComp3.setText("Pepe");

        lblTiempoComp3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblComp4.setText("Ana");

        lblComp5.setText("Felipe");

        lblComp6.setText("Sara");

        lblTiempoComp4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTiempoComp5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTiempoComp6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblComp7.setText("Juan");

        lblComp8.setText("Martha");

        lblTiempoComp7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTiempoComp8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Posiciones de la carrera");

        lblTComp1.setText("1° Puesto");

        lblPrimerPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTComp2.setText("2° Puesto");

        lblSegundoPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTComp3.setText("3° Puesto");

        lblTercerPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("4° Puesto");

        lblCuartoPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("5° Puesto");

        lblQuintoPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("6° Puesto");

        lblSextoPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setText("7° Puesto");

        lblSeptimoPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("8° Puesto ");

        lblOctavoPuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDetCarreraLayout = new javax.swing.GroupLayout(pnlDetCarrera);
        pnlDetCarrera.setLayout(pnlDetCarreraLayout);
        pnlDetCarreraLayout.setHorizontalGroup(
            pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetCarreraLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                    .addComponent(lblTComp1)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblPrimerPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                    .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTComp3)
                                        .addComponent(lblTComp2)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSegundoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTercerPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCuartoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDetCarreraLayout.createSequentialGroup()
                                    .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addComponent(lblSextoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDetCarreraLayout.createSequentialGroup()
                                    .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblOctavoPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSeptimoPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)))))
                        .addGap(128, 128, 128))
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(lblQuintoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)))
                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblComp2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblComp1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblComp5)
                                    .addComponent(lblComp6)
                                    .addComponent(lblComp4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblComp3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblComp7)
                                    .addComponent(lblComp8)))
                            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2)))
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetCarreraLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFechaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetCarreraLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHoraCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))))
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addComponent(btnLimpiar2)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetCarreraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiempoComp1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoComp2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoComp3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoComp4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoComp5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoComp6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoComp7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoComp8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(252, 252, 252))
        );
        pnlDetCarreraLayout.setVerticalGroup(
            pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblComp1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblComp2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(lblFechaCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblHoraCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))))
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrimerPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTComp1)))
                            .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTiempoComp1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTComp2)
                                .addComponent(lblSegundoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTiempoComp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTComp3)
                    .addComponent(lblTercerPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComp3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoComp3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblCuartoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblComp4))
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTiempoComp4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblQuintoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblSextoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblSeptimoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOctavoPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1)
                            .addComponent(btnLimpiar1)
                            .addComponent(btnLimpiar2)))
                    .addGroup(pnlDetCarreraLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComp5)
                            .addComponent(lblTiempoComp5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComp6)
                            .addComponent(lblTiempoComp6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComp7)
                            .addComponent(lblTiempoComp7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDetCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComp8)
                            .addComponent(lblTiempoComp8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tpInscripccion.addTab("Detalles de la carrera", pnlDetCarrera);

        btnSeguir.setText("Seguir");
        btnSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeguirActionPerformed(evt);
            }
        });

        btnDetener.setText("Detener");
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnLimpiarTabla.setText("Limpiar Tabla");
        btnLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTablaActionPerformed(evt);
            }
        });

        jMenu2.setText("Archivo");

        mnuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuAbrir.setText("Abrir");
        mnuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAbrirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAbrir);

        mnuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mnuGuardar.setText("Guardar");
        mnuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuGuardar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tpInscripccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnDetener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeguir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnLimpiarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tpInscripccion, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnFinalizar)
                .addGap(18, 18, 18)
                .addComponent(btnSeguir)
                .addGap(18, 18, 18)
                .addComponent(btnDetener)
                .addGap(41, 41, 41)
                .addComponent(btnLimpiarTabla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroCompeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroCompeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroCompeActionPerformed

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        int numCompe = Integer.parseInt(txtNroCompe.getText());
        carrera.setNumComp(Integer.parseInt(txtNroPistas.getText()));
        if (Integer.parseInt(txtNroPistas.getText()) > 8) {
            try {
                MaximoPistasException exception1 = new MaximoPistasException();
                throw exception1;
            } catch (MaximoPistasException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Demasiadas pistas", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (numCompe > Integer.parseInt(txtNroPistas.getText())) {
            try {
                PistasException exception2 = new PistasException();
                throw exception2;
            } catch (PistasException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage() + " vuelva a ingresar los datos", "Pistas y competidores", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (numCompe > 8) {
            try {
                MaximoCompetidoresException exception3 = new MaximoCompetidoresException();
                throw exception3;
            } catch (MaximoCompetidoresException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Demasiados competidores", JOptionPane.ERROR_MESSAGE);
            }
        }

        c1 = new Competidor("Luis", 18, "Colombia", carrera, 0);
        c2 = new Competidor("Maria", 18, "Colombia", carrera, 1);
        c3 = new Competidor("Pepe", 18, "Colombia", carrera, 2);
        c4 = new Competidor("Ana", 18, "Colombia", carrera, 3);
        c5 = new Competidor("Felipe", 18, "Colombia", carrera, 4);
        c6 = new Competidor("Sara", 18, "Colombia", carrera, 5);
        c7 = new Competidor("Juan", 18, "Colombia", carrera, 6);
        c8 = new Competidor("Martha", 18, "Colombia", carrera, 7);
        if (numCompe == 1) {
            c1.start();
        }
        if (numCompe == 2) {
            c1.start();
            c2.start();
        }
        if (numCompe == 3) {
            c1.start();
            c2.start();
            c3.start();
        }
        if (numCompe == 4) {
            c1.start();
            c2.start();
            c3.start();
            c4.start();
        }
        if (numCompe == 5) {
            c1.start();
            c2.start();
            c3.start();
            c4.start();
            c5.start();
        }
        if (numCompe == 6) {
            c1.start();
            c2.start();
            c3.start();
            c4.start();
            c5.start();
            c6.start();
        }
        if (numCompe == 7) {
            c1.start();
            c2.start();
            c3.start();
            c4.start();
            c5.start();
            c6.start();
            c7.start();
        }
        if (numCompe == 8) {
            c1.start();
            c2.start();
            c3.start();
            c4.start();
            c5.start();
            c6.start();
            c7.start();
            c8.start();
        }

        carrera.actualizarModelo();
        tblPista.setModel(carrera.getModelCarrera());

        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int t1, t2, t3, t4, t5, t6, t7, t8;
        t1 = c1.getTiempoFinal();
        t2 = c2.getTiempoFinal();
        t3 = c3.getTiempoFinal();
        t4 = c4.getTiempoFinal();
        t5 = c5.getTiempoFinal();
        t6 = c6.getTiempoFinal();
        t7 = c7.getTiempoFinal();
        t8 = c8.getTiempoFinal();
        String tiempo1 = String.valueOf(t1);
        String tiempo2 = String.valueOf(t2);
        String tiempo3 = String.valueOf(t3);
        String tiempo4 = String.valueOf(t4);
        String tiempo5 = String.valueOf(t5);
        String tiempo6 = String.valueOf(t6);
        String tiempo7 = String.valueOf(t7);
        String tiempo8 = String.valueOf(t8);
        if (c1.isAlive() == false) {
            lblTiempoComp1.setText(tiempo1);
            lblComp1.setVisible(true);
        } else {
            lblComp1.setVisible(false);
            lblTiempoComp1.setVisible(false);
        }
        if (c2.isAlive() == false) {
            lblComp2.setVisible(true);
            lblTiempoComp2.setText(tiempo2);
        } else {
            lblComp2.setVisible(false);
            lblTiempoComp2.setVisible(false);
        }
        if (c3.isAlive() == false) {
            lblComp3.setVisible(true);
            lblTiempoComp3.setText(tiempo3);
        } else {
            lblComp3.setVisible(false);
            lblTiempoComp3.setVisible(false);
        }
        if (c4.isAlive() == false) {                // esta parte si sirve
            lblComp4.setVisible(true);
            lblTiempoComp4.setText(tiempo4);

        } else {
            lblComp4.setVisible(false);
            lblTiempoComp4.setVisible(false);
        }
        if (c5.isAlive() == false) {
            lblComp5.setVisible(true);
            lblTiempoComp5.setVisible(true);
            lblTiempoComp5.setText(tiempo5);

        } else {
            lblComp5.setVisible(false);
            lblTiempoComp5.setVisible(false);
        }
        if (c6.isAlive() == false) {
            lblTiempoComp6.setText(tiempo6);
            lblComp6.setVisible(true);
        } else {
            lblComp6.setVisible(false);
            lblTiempoComp6.setVisible(false);
        }
        if (c7.isAlive() == false) {
            lblTiempoComp7.setText(tiempo7);
            lblComp6.setVisible(true);
        } else {
            lblComp7.setVisible(false);
            lblTiempoComp7.setVisible(false);
        }
        if (c8.isAlive() == false) {
            lblTiempoComp8.setText(tiempo8);
            lblComp7.setVisible(true);
        } else {
            lblComp8.setVisible(false);
            lblTiempoComp8.setVisible(false);
        }

        System.out.println(t1 + c1.getNombre());
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Boton puestos
        int numCompe = Integer.parseInt(txtNroCompe.getText());
        System.out.println(numCompe);
        int t1, t2, t3, t4, t5, t6, t7, t8;
        int tiempos[] = new int[8];
        int minimo = 50;
        boolean pos2 = false;
        boolean pos3 = false;
        boolean pos4 = false;
        boolean pos5 = false;
        boolean pos6 = false;
        boolean pos7 = false;
        boolean pos8 = false;
        t1 = c1.getTiempoFinal();
        t2 = c2.getTiempoFinal();
        t3 = c3.getTiempoFinal();
        t4 = c4.getTiempoFinal();
        t5 = c5.getTiempoFinal();
        t6 = c6.getTiempoFinal();
        t7 = c7.getTiempoFinal();
        t8 = c8.getTiempoFinal();
        tiempos[0] = t1;
        tiempos[1] = t2;
        tiempos[2] = t3;
        tiempos[3] = t4;
        tiempos[4] = t5;
        tiempos[5] = t6;
        tiempos[6] = t7;
        tiempos[7] = t8;
        System.out.println(objetos[0].getTiempoFinal());
        System.out.println(objetos[1].getTiempoFinal());
        for (int i = 0; i < numCompe; i++) {
            if (tiempos[i] < minimo) {
                minimo = tiempos[i];
                lblPrimerPuesto.setText(objetos[i].getNombre());
            }
        }
        for (int minimo2 = minimo + 1; minimo2 < 100; minimo2++) {
            for (int j = 0; j < numCompe; j++) {
                if (pos2 == false) {
                    if (tiempos[j] == minimo2) {
                        lblSegundoPuesto.setText(objetos[j].getNombre());
                        pos2 = true;
                    }
                } else {
                    if (pos3 == false) {
                        if (tiempos[j] == minimo2) {
                            lblTercerPuesto.setText(objetos[j].getNombre());
                            pos3 = true;
                        }
                    } else {
                        if (pos4 == false) {
                            if (tiempos[j] == minimo2) {
                                lblCuartoPuesto.setText(objetos[j].getNombre());
                                pos4 = true;
                            }
                        } else {
                            if (pos5 == false) {
                                if (tiempos[j] == minimo2) {
                                    lblQuintoPuesto.setText(objetos[j].getNombre());
                                    pos5 = true;
                                }
                            } else {
                                if (pos6 == false) {
                                    if (tiempos[j] == minimo2) {
                                        lblSextoPuesto.setText(objetos[j].getNombre());
                                        pos6 = true;
                                    }
                                } else {
                                    if (pos7 == false) {
                                        if (tiempos[j] == minimo2) {
                                            lblSeptimoPuesto.setText(objetos[j].getNombre());
                                            pos7 = true;
                                        }
                                    } else {
                                        if (pos8 == false) {
                                            if (tiempos[j] == minimo2) {
                                                lblOctavoPuesto.setText(objetos[j].getNombre());
                                                pos8=true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeguirActionPerformed

        c1.resume();
        c2.resume();
        c3.resume();
        c4.resume();
        c5.resume();
        c6.resume();
        c7.resume();
        c8.resume();
        principalh.resume();
// TODO add your handling code here:
    }//GEN-LAST:event_btnSeguirActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        c1.stop();
        c2.stop();
        c3.stop();
        c4.stop();
        c5.stop();
        c6.stop();
        c7.stop();
        c8.stop();
        principalh.stop();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
        c1.suspend();
        c2.suspend();
        c3.suspend();
        c4.suspend();
        c5.suspend();
        c6.suspend();
        c7.suspend();
        c8.suspend();
        principalh.suspend();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetenerActionPerformed

    private void mnuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAbrirActionPerformed
        serializador = new Serializador();  
        int numCompe = Integer.parseInt(txtNroCompe.getText());
        Competidor[] objeto = new Competidor[8];
        String nombreDelArchivo = JOptionPane.showInputDialog(this, "Escriba el nombre del archivo", "Nombre del archivo", WIDTH);
        serializador.abrirObjeto(nombreDelArchivo);
        for(int i=0; i<8 ;i++){
            objeto[i]= (Competidor) serializador.getParticipantes(i);
            //lblTiempoComp1.setText(objetos[i].getTiempoFinal());
        }
        carrera.actualizarModelo();
        tblPista.setModel(carrera.getModelCarrera());
        System.out.println(objeto[0].getNombre());
        for (int a = 0; a <= numCompe; a++) {
            for(int b=0; b<=(objeto[a].getUltimaPosicion());b++){
            carrera.getModelCarrera().setValueAt(objeto[a].getNombre(), a, b);
            }
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAbrirActionPerformed

    private void mnuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarActionPerformed
        serializador=new Serializador();
        int numCompe = Integer.parseInt(txtNroCompe.getText());
        if (objetos != null) {
            String nombreDelArchivo = JOptionPane.showInputDialog(this, "Escriba el nombre del archivo", "Nombre del archivo", JOptionPane.QUESTION_MESSAGE);
            
            serializador.guardarObjeto(objetos, nombreDelArchivo);
            JOptionPane.showMessageDialog(this, "La carrera ha sido guardada correctamente");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuGuardarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        lblPrimerPuesto.setText(" ");
        lblSegundoPuesto.setText(" ");
        lblTercerPuesto.setText(" ");
        lblCuartoPuesto.setText(" ");
        lblQuintoPuesto.setText(" ");
        lblSextoPuesto.setText(" ");
        lblSeptimoPuesto.setText(" ");
        lblOctavoPuesto.setText(" ");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
        lblTiempoComp1.setText(" ");
        lblTiempoComp2.setText(" ");
        lblTiempoComp3.setText(" ");
        lblTiempoComp4.setText(" ");
        lblTiempoComp5.setText(" ");
        lblTiempoComp6.setText(" ");
        lblTiempoComp7.setText(" ");
        lblTiempoComp8.setText(" ");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar2ActionPerformed

    private void btnLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTablaActionPerformed
        carrera.actualizarModelo();
        this.tblPista.setModel(carrera.getModelCarrera());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarTablaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static String fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/YYYY");
        return formatDate.format(fecha);
    }

    public void hora() {
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public void run() {

        Thread current = Thread.currentThread();
        while (current == principalh) {
            hora();
            lblHoraCarrera.setText(hora + ":" + minutos + ":" + segundos);
        }
    }

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
            java.util.logging.Logger.getLogger(IGUCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IGUCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IGUCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IGUCarrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new IGUCarrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnLimpiarTabla;
    private javax.swing.JButton btnSeguir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblComp1;
    private javax.swing.JLabel lblComp2;
    private javax.swing.JLabel lblComp3;
    private javax.swing.JLabel lblComp4;
    private javax.swing.JLabel lblComp5;
    private javax.swing.JLabel lblComp6;
    private javax.swing.JLabel lblComp7;
    private javax.swing.JLabel lblComp8;
    private javax.swing.JLabel lblCuartoPuesto;
    private javax.swing.JLabel lblFechaCarrera;
    private javax.swing.JLabel lblHoraCarrera;
    private javax.swing.JLabel lblNroC;
    private javax.swing.JLabel lblOctavoPuesto;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblPrimerPuesto;
    private javax.swing.JLabel lblQuintoPuesto;
    private javax.swing.JLabel lblSegundoPuesto;
    private javax.swing.JLabel lblSeptimoPuesto;
    private javax.swing.JLabel lblSextoPuesto;
    private javax.swing.JLabel lblTComp1;
    private javax.swing.JLabel lblTComp2;
    private javax.swing.JLabel lblTComp3;
    private javax.swing.JLabel lblTercerPuesto;
    private javax.swing.JLabel lblTiempoComp1;
    private javax.swing.JLabel lblTiempoComp2;
    private javax.swing.JLabel lblTiempoComp3;
    private javax.swing.JLabel lblTiempoComp4;
    private javax.swing.JLabel lblTiempoComp5;
    private javax.swing.JLabel lblTiempoComp6;
    private javax.swing.JLabel lblTiempoComp7;
    private javax.swing.JLabel lblTiempoComp8;
    private javax.swing.JMenuItem mnuAbrir;
    private javax.swing.JMenuItem mnuGuardar;
    private javax.swing.JPanel pnlDetCarrera;
    private javax.swing.JTable tblPista;
    private javax.swing.JTabbedPane tpInscripccion;
    private javax.swing.JTextField txtNroCompe;
    private javax.swing.JTextField txtNroPistas;
    // End of variables declaration//GEN-END:variables

    Serializador serializador = null;
    Carrera carrera = null;
    Competidor[] objetos = null;
    Competidor competidor = null;
    Competidor c1 = null;
    Competidor c2 = null;
    Competidor c3 = null;
    Competidor c4 = null;
    Competidor c5 = null;
    Competidor c6 = null;
    Competidor c7 = null;
    Competidor c8 = null;

}
