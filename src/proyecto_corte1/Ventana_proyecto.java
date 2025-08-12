
package proyecto_corte1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventana_proyecto extends javax.swing.JFrame {

    DefaultTableModel Modelo = new DefaultTableModel();
    DefaultTableModel Modelo_1=new DefaultTableModel();
    public Ventana_proyecto() {
        initComponents();
        this.setLocationRelativeTo(this);
        jpDocente.setVisible(false);
        jp_DatosPerson.setVisible(true);
        jp_Estudiante.setVisible(false);
        Modelo.addColumn("NOMBRE");
        Modelo.addColumn("DOCUMENTO");
        Modelo.addColumn("CLASE");
        Modelo.addColumn("HORARIO");
        Modelo_1.addColumn("NOMBRE");
        Modelo_1.addColumn("DOCUMENTO");
        Modelo_1.addColumn("CLASE");
        Modelo_1.addColumn("HORARIO");
        jt_Tabla_Docente.setModel(Modelo);
        jt_Tabla_Estudiante.setModel(Modelo_1);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jpPrincipal = new javax.swing.JPanel();
        jp_DatosPerson = new javax.swing.JPanel();
        Apellido = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        txt_Edad = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Documento = new javax.swing.JTextField();
        Documento = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        rbFemenino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        Ciudad = new javax.swing.JLabel();
        Departamento = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox<>();
        cbDepartamento = new javax.swing.JComboBox<>();
        btn_Salir = new javax.swing.JButton();
        btn_Docente = new javax.swing.JButton();
        Btn_Estudiante = new javax.swing.JButton();
        jpDocente = new javax.swing.JPanel();
        jp_Datos_Doc = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cb_Clase = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        Btn_Regresar = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Editar = new javax.swing.JButton();
        cb_Horario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Tabla_Docente = new javax.swing.JTable();
        lbl_Fondo = new javax.swing.JLabel();
        jp_Estudiante = new javax.swing.JPanel();
        jp_Datos_Estudiante = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cb_Clase1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cb_Horario1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Tabla_Estudiante = new javax.swing.JTable();
        Btn_Guardar1 = new javax.swing.JButton();
        Btn_Regresar1 = new javax.swing.JButton();
        Btn_Salir1 = new javax.swing.JButton();
        Btn_Editar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_DatosPerson.setBackground(new java.awt.Color(102, 204, 255));
        jp_DatosPerson.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(0, 0, 255))); // NOI18N
        jp_DatosPerson.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Apellido.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Apellido.setForeground(new java.awt.Color(0, 0, 255));
        Apellido.setText("Apellido:");
        jp_DatosPerson.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, -1));

        Sexo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Sexo.setForeground(new java.awt.Color(0, 0, 255));
        Sexo.setText("Sexo:");
        jp_DatosPerson.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 40, 20));

        txt_Edad.setBackground(java.awt.Color.black);
        txt_Edad.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Edad.setForeground(new java.awt.Color(0, 0, 255));
        txt_Edad.setOpaque(false);
        jp_DatosPerson.add(txt_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 140, -1));

        txt_Nombre.setBackground(java.awt.Color.black);
        txt_Nombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Nombre.setForeground(new java.awt.Color(0, 0, 255));
        txt_Nombre.setOpaque(false);
        jp_DatosPerson.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 200, -1));

        txt_Apellido.setBackground(java.awt.Color.black);
        txt_Apellido.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Apellido.setForeground(new java.awt.Color(0, 0, 255));
        txt_Apellido.setOpaque(false);
        jp_DatosPerson.add(txt_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 200, -1));

        txt_Documento.setBackground(java.awt.Color.black);
        txt_Documento.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txt_Documento.setForeground(new java.awt.Color(0, 0, 255));
        txt_Documento.setMaximumSize(new java.awt.Dimension(4, 20));
        txt_Documento.setOpaque(false);
        jp_DatosPerson.add(txt_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 140, -1));

        Documento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Documento.setForeground(new java.awt.Color(0, 0, 255));
        Documento.setText("Documento:");
        jp_DatosPerson.add(Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        Edad.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Edad.setForeground(new java.awt.Color(0, 0, 255));
        Edad.setText("Edad:");
        jp_DatosPerson.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 70, -1));

        Nombre.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 255));
        Nombre.setText("Nombre:");
        jp_DatosPerson.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));

        rbFemenino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupSexo.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        rbFemenino.setForeground(new java.awt.Color(0, 0, 255));
        rbFemenino.setText("Femenino");
        rbFemenino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jp_DatosPerson.add(rbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        rbMasculino.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupSexo.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(0, 0, 255));
        rbMasculino.setText("Masculino");
        rbMasculino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jp_DatosPerson.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        Ciudad.setBackground(new java.awt.Color(0, 255, 255));
        Ciudad.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Ciudad.setForeground(new java.awt.Color(0, 0, 255));
        Ciudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ciudad.setText("Ciudad:");
        jp_DatosPerson.add(Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Departamento.setBackground(new java.awt.Color(0, 255, 255));
        Departamento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Departamento.setForeground(new java.awt.Color(0, 0, 255));
        Departamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Departamento.setText("Departamento:");
        jp_DatosPerson.add(Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        cbCiudad.setBackground(java.awt.Color.black);
        cbCiudad.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cbCiudad.setForeground(new java.awt.Color(0, 0, 255));
        cbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                    ", "Arauca", "Armenia", "Barranquilla", "Bogotá", "Bucaramanga", "Cali", "Cartagena", "Cúcuta", "Florencia", "Ibagué", "Leticia", "Manizales", "Medellín", "Mocoa", "Montería", "Neiva", "Mitú", "Pasto", "Pereira", "Popayán", "Puerto Carreño", "Puerto Inírida", "Quibdó", "Riohacha", "San Andres", "San José del Guaviare", "Santa Marta", "Sincelejo", "Tunja", "Valledupar", "Villavicencio", "Yopal" }));
        cbCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbCiudad.setOpaque(false);
        cbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCiudadActionPerformed(evt);
            }
        });
        jp_DatosPerson.add(cbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, -1));

        cbDepartamento.setBackground(java.awt.Color.black);
        cbDepartamento.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cbDepartamento.setForeground(new java.awt.Color(0, 0, 255));
        cbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                 ", "Amazonas", "Antioquia", "Arauca", "Atlàntico", "Bolìvar", "Boyacà", "Caldas", "Caquetà", "Casanare", "Cauca", "Cesar", "chocò", "Còrdoba", "Cundinamarca", "Guainìa", "Guaviare", "Huila", "La Guajira", "Magdalena", "Meta", "Nariño", "Norte de Santander", "Putumayo", "Quindio", "Risaralda", "San Andres y Providencia", "Santander", "Sucre", "Tolima", "Valle del Cauca", "Vaupès", "Vichada", " " }));
        cbDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbDepartamento.setOpaque(false);
        jp_DatosPerson.add(cbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, -1));

        btn_Salir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_Salir.setForeground(new java.awt.Color(0, 0, 255));
        btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-cancelar_azul.png"))); // NOI18N
        btn_Salir.setText("SALIR");
        btn_Salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        btn_Salir.setContentAreaFilled(false);
        btn_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Salir.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-cancelar.png"))); // NOI18N
        btn_Salir.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-cancelar.png"))); // NOI18N
        btn_Salir.setName("btn_Salir"); // NOI18N
        btn_Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-cancelar.png"))); // NOI18N
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        jp_DatosPerson.add(btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 80, -1));

        btn_Docente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_Docente.setForeground(new java.awt.Color(0, 0, 255));
        btn_Docente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-empleado.png"))); // NOI18N
        btn_Docente.setText("DOCENTE");
        btn_Docente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        btn_Docente.setContentAreaFilled(false);
        btn_Docente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Docente.setName("btn_Salir"); // NOI18N
        btn_Docente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-usuario.png"))); // NOI18N
        btn_Docente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DocenteActionPerformed(evt);
            }
        });
        jp_DatosPerson.add(btn_Docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        Btn_Estudiante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Btn_Estudiante.setForeground(new java.awt.Color(0, 0, 255));
        Btn_Estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-usuario.png"))); // NOI18N
        Btn_Estudiante.setText("ESTUDIANTE");
        Btn_Estudiante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255), null));
        Btn_Estudiante.setContentAreaFilled(false);
        Btn_Estudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Estudiante.setName("btn_Salir"); // NOI18N
        Btn_Estudiante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-empleado.png"))); // NOI18N
        Btn_Estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EstudianteActionPerformed(evt);
            }
        });
        jp_DatosPerson.add(Btn_Estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, -1));

        jpPrincipal.add(jp_DatosPerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 330));

        jpDocente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_Datos_Doc.setBackground(new java.awt.Color(102, 204, 255));
        jp_Datos_Doc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Docente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jp_Datos_Doc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 255, 255));
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Clase:");
        jLabel8.setMaximumSize(new java.awt.Dimension(45, 45));
        jLabel8.setMinimumSize(new java.awt.Dimension(60, 60));
        jp_Datos_Doc.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

        cb_Clase.setBackground(new java.awt.Color(0, 0, 0));
        cb_Clase.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cb_Clase.setForeground(new java.awt.Color(0, 0, 255));
        cb_Clase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                                ", "Programación WEB", "Programación Avanzada", "Redes 1", "Dispositivos de Interconexión", "Teoria General de Sistemas", "Mantenimiento del PC", "Cableado Estructurado", "Opción de Grado", "Redes 2", " " }));
        cb_Clase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cb_Clase.setOpaque(false);
        jp_Datos_Doc.add(cb_Clase, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 240, -1));

        jLabel9.setBackground(new java.awt.Color(0, 255, 255));
        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Horario:");
        jLabel9.setMaximumSize(new java.awt.Dimension(45, 45));
        jLabel9.setMinimumSize(new java.awt.Dimension(60, 60));
        jp_Datos_Doc.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 20));

        jLabel13.setBackground(new java.awt.Color(0, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Día");
        jp_Datos_Doc.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jp_Datos_Doc.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 255, 255));
        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Mes");
        jp_Datos_Doc.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jSpinner2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jp_Datos_Doc.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 255, 255));
        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Año");
        jp_Datos_Doc.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jSpinner3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1950, 1950, 2018, 1));
        jp_Datos_Doc.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 255, 255));
        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Fecha de Ingreso:");
        jLabel10.setMaximumSize(new java.awt.Dimension(45, 45));
        jLabel10.setMinimumSize(new java.awt.Dimension(60, 60));
        jp_Datos_Doc.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, -1));

        Btn_Regresar.setBackground(new java.awt.Color(0, 255, 255));
        Btn_Regresar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Btn_Regresar.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-atras.png"))); // NOI18N
        Btn_Regresar.setText("REGRESAR");
        Btn_Regresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-atras_azul.png"))); // NOI18N
        Btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegresarActionPerformed(evt);
            }
        });
        jp_Datos_Doc.add(Btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        Btn_Salir.setBackground(new java.awt.Color(0, 255, 255));
        Btn_Salir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Btn_Salir.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-cancelar.png"))); // NOI18N
        Btn_Salir.setText("Salir");
        Btn_Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-cancelar_azul.png"))); // NOI18N
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        jp_Datos_Doc.add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        Btn_Guardar.setBackground(new java.awt.Color(0, 255, 255));
        Btn_Guardar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Btn_Guardar.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-add.png"))); // NOI18N
        Btn_Guardar.setText("GUARDAR");
        Btn_Guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-add_azul.png"))); // NOI18N
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });
        jp_Datos_Doc.add(Btn_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        Btn_Editar.setBackground(new java.awt.Color(0, 255, 255));
        Btn_Editar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Btn_Editar.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-editar_doc.png"))); // NOI18N
        Btn_Editar.setText("EDITAR");
        Btn_Editar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-editar.png"))); // NOI18N
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });
        jp_Datos_Doc.add(Btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        cb_Horario.setBackground(new java.awt.Color(0, 0, 0));
        cb_Horario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cb_Horario.setForeground(new java.awt.Color(0, 0, 204));
        cb_Horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                     ", "Diurno", "Nocturno" }));
        cb_Horario.setOpaque(false);
        jp_Datos_Doc.add(cb_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jt_Tabla_Docente.setBackground(new java.awt.Color(204, 255, 255));
        jt_Tabla_Docente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jt_Tabla_Docente.setForeground(new java.awt.Color(0, 0, 204));
        jt_Tabla_Docente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jt_Tabla_Docente);

        jp_Datos_Doc.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 540, 180));

        jpDocente.add(jp_Datos_Doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 330));

        lbl_Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jpDocente.add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 330));

        jpPrincipal.add(jpDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 330));

        jp_Estudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_Datos_Estudiante.setBackground(new java.awt.Color(102, 204, 255));
        jp_Datos_Estudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jp_Datos_Estudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(0, 255, 255));
        jLabel14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Clase:");
        jLabel14.setMaximumSize(new java.awt.Dimension(45, 45));
        jLabel14.setMinimumSize(new java.awt.Dimension(60, 60));
        jp_Datos_Estudiante.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

        cb_Clase1.setBackground(new java.awt.Color(0, 0, 0));
        cb_Clase1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cb_Clase1.setForeground(new java.awt.Color(0, 0, 255));
        cb_Clase1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                                ", "Programación WEB", "Programación Avanzada", "Redes 1", "Dispositivos de Interconexión", "Teoria General de Sistemas", "Mantenimiento del PC", "Cableado Estructurado", "Opción de Grado", "Redes 2", " " }));
        cb_Clase1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cb_Clase1.setOpaque(false);
        jp_Datos_Estudiante.add(cb_Clase1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 240, -1));

        jLabel15.setBackground(new java.awt.Color(0, 255, 255));
        jLabel15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Horario:");
        jLabel15.setMaximumSize(new java.awt.Dimension(45, 45));
        jLabel15.setMinimumSize(new java.awt.Dimension(60, 60));
        jp_Datos_Estudiante.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 20));

        cb_Horario1.setBackground(new java.awt.Color(0, 0, 0));
        cb_Horario1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cb_Horario1.setForeground(new java.awt.Color(0, 0, 204));
        cb_Horario1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                     ", "Diurno", "Nocturno" }));
        cb_Horario1.setOpaque(false);
        jp_Datos_Estudiante.add(cb_Horario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel16.setBackground(new java.awt.Color(0, 255, 255));
        jLabel16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Fecha de Ingreso:");
        jLabel16.setMaximumSize(new java.awt.Dimension(45, 45));
        jLabel16.setMinimumSize(new java.awt.Dimension(60, 60));
        jp_Datos_Estudiante.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, -1));

        jLabel17.setBackground(new java.awt.Color(0, 255, 255));
        jLabel17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Día");
        jp_Datos_Estudiante.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel18.setBackground(new java.awt.Color(0, 255, 255));
        jLabel18.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Mes");
        jp_Datos_Estudiante.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jLabel19.setBackground(new java.awt.Color(0, 255, 255));
        jLabel19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Año");
        jp_Datos_Estudiante.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jSpinner4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jp_Datos_Estudiante.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, -1, -1));

        jSpinner5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jp_Datos_Estudiante.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jSpinner6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1950, 1950, 2018, 1));
        jp_Datos_Estudiante.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        jt_Tabla_Estudiante.setBackground(new java.awt.Color(204, 255, 255));
        jt_Tabla_Estudiante.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jt_Tabla_Estudiante.setForeground(new java.awt.Color(0, 0, 204));
        jt_Tabla_Estudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jt_Tabla_Estudiante);

        jp_Datos_Estudiante.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 540, 180));

        Btn_Guardar1.setBackground(new java.awt.Color(0, 255, 255));
        Btn_Guardar1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Btn_Guardar1.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Guardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-add.png"))); // NOI18N
        Btn_Guardar1.setText("GUARDAR");
        Btn_Guardar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-add_azul.png"))); // NOI18N
        Btn_Guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar1ActionPerformed(evt);
            }
        });
        jp_Datos_Estudiante.add(Btn_Guardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        Btn_Regresar1.setBackground(new java.awt.Color(0, 255, 255));
        Btn_Regresar1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Btn_Regresar1.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Regresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-atras.png"))); // NOI18N
        Btn_Regresar1.setText("REGRESAR");
        Btn_Regresar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-atras_azul.png"))); // NOI18N
        Btn_Regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Regresar1ActionPerformed(evt);
            }
        });
        jp_Datos_Estudiante.add(Btn_Regresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        Btn_Salir1.setBackground(new java.awt.Color(0, 255, 255));
        Btn_Salir1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Btn_Salir1.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-cancelar.png"))); // NOI18N
        Btn_Salir1.setText("Salir");
        Btn_Salir1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-cancelar_azul.png"))); // NOI18N
        Btn_Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Salir1ActionPerformed(evt);
            }
        });
        jp_Datos_Estudiante.add(Btn_Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        Btn_Editar1.setBackground(new java.awt.Color(0, 255, 255));
        Btn_Editar1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Btn_Editar1.setForeground(new java.awt.Color(0, 0, 204));
        Btn_Editar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-editar_doc.png"))); // NOI18N
        Btn_Editar1.setText("EDITAR");
        Btn_Editar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x26-editar.png"))); // NOI18N
        Btn_Editar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Editar1ActionPerformed(evt);
            }
        });
        jp_Datos_Estudiante.add(Btn_Editar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jp_Estudiante.add(jp_Datos_Estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 330));

        jpPrincipal.add(jp_Estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 330));

        getContentPane().add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void cbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCiudadActionPerformed
        
    }//GEN-LAST:event_cbCiudadActionPerformed

    private void btn_DocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DocenteActionPerformed
        if(txt_Nombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingrese su Nombre  !!!","ERROR",JOptionPane.ERROR_MESSAGE);
            txt_Nombre.requestFocus();
        }else if(txt_Apellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingrese su Apellido  !!!","ERROR",JOptionPane.ERROR_MESSAGE);
            txt_Apellido.requestFocus();
        }else if(txt_Edad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingrese su Edad  !!!","ERROR",JOptionPane.ERROR_MESSAGE);
            txt_Edad.requestFocus();
       }else if(txt_Documento.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese su Documento  !!!","ERROR",JOptionPane.ERROR_MESSAGE);
           txt_Documento.requestFocus();
       }else{
        jpDocente.setVisible(true);
        jpPrincipal.setVisible(true);
        jp_DatosPerson.setVisible(false);
        jp_Datos_Doc.setVisible(true);
       }
    }//GEN-LAST:event_btn_DocenteActionPerformed

    private void Btn_EstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EstudianteActionPerformed
        if(txt_Nombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingrese su Nombre  !!!","ERROR",JOptionPane.ERROR_MESSAGE);
            txt_Nombre.requestFocus();
        }else if(txt_Apellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingrese su Apellido  !!!","ERROR",JOptionPane.ERROR_MESSAGE);
            txt_Apellido.requestFocus();
        }else if(txt_Edad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingrese su Edad  !!!","ERROR",JOptionPane.ERROR_MESSAGE);
            txt_Edad.requestFocus();
       }else if(txt_Documento.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Ingrese su Documento  !!!","ERROR",JOptionPane.ERROR_MESSAGE);
           txt_Documento.requestFocus();
       }else{
        jpDocente.setVisible(false);
        jpPrincipal.setVisible(true);
        jp_DatosPerson.setVisible(false);
        jp_Datos_Doc.setVisible(false);
        jp_Estudiante.setVisible(true);
        jp_Datos_Estudiante.setVisible(true);
       }
    }//GEN-LAST:event_Btn_EstudianteActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed
        jpDocente.setVisible(false);
        jpPrincipal.setVisible(true);
        jp_DatosPerson.setVisible(true);
        jp_Datos_Doc.setVisible(false);
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Edad.setText("");
        txt_Documento.setText("");
        txt_Nombre.requestFocus();
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        Conectar_Proyecto1 cc =new Conectar_Proyecto1();
        Connection cn = cc.conexion();
        
        String Proyecto1 = "";
        String Nombre=txt_Nombre.getText();
        String Apellido=txt_Apellido.getText();
        String Edad=txt_Edad.getText();
        String Documento=txt_Documento.getText();
        String Sexo="";
        if(rbFemenino.isSelected()){
            Sexo="Femenino";
        }else {
           Sexo="Masculino";
        }
        String Ciudad=cbCiudad.getSelectedItem().toString();
        String Departamento=cbDepartamento.getSelectedItem().toString();
        String Clase=cb_Clase.getSelectedItem().toString();
        String Horario=cb_Horario.getSelectedItem().toString();
        //System.out.println(Sexo+" yefer es un alok !!!");
        Proyecto1 = "INSERT INTO datos_personales (Nombre,Apellido,Edad,Documento,Sexo,Ciudad,Departamento,Clase,Horario)VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement PST = cn.prepareStatement(Proyecto1);
            PST.setString(1,Nombre);
            PST.setString(2,Apellido);
            PST.setString(3,Edad);
            PST.setString(4,Documento);
            PST.setString(5,Sexo);
            PST.setString(6,Ciudad);
            PST.setString(7,Departamento);
            PST.setString(8,Clase);
            PST.setString(9,Horario);
            int n = PST.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Regitros Guardados en la Base de Datos correctamente !!!");
            }
        } catch (Exception e) {              
            JOptionPane.showMessageDialog(null,"error! =>"+e.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        //Muestra los datos en la tabla del programa
        String Dato[]= new String[4];
        Dato[0] = txt_Nombre.getText()+" "+txt_Apellido.getText();
        Dato[1] = txt_Documento.getText();
        Dato[2] = cb_Clase.getItemAt(WIDTH);
        Dato[3] = cb_Horario.getItemAt(WIDTH);
        Modelo.addRow(Dato);
        
        
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_Guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Guardar1ActionPerformed
        Conectar_Proyecto1 cc =new Conectar_Proyecto1();
        Connection cnn = cc.conexion();
        String Proyecto1 = "";
        String Nombre=txt_Nombre.getText();
        String Apellido=txt_Apellido.getText();
        String Edad=txt_Edad.getText();
        String Documento=txt_Documento.getText();
        /*if(rbFemenino.isSelected()){
            String Sexo="Femenino";
        }else {
           String Sexo="Masculino";
        }*/
        String Sexo="Pendiente!!!";
        String Ciudad=cbCiudad.getSelectedItem().toString();
        String Departamento=cbDepartamento.getSelectedItem().toString();
        String Clase=cb_Clase1.getSelectedItem().toString();
        String Horario=cb_Horario1.getSelectedItem().toString();
        //sfadvcascsSystem.out.println(Sexo+" yefer es un alok !!!");
        Proyecto1 = "INSERT INTO datos_estudiante (Nombre,Apellido,Edad,Documento,Sexo,Ciudad,Departamento,Clase,Horario)VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement PST1 = cnn.prepareStatement(Proyecto1);
            PST1.setString(1,Nombre);
            PST1.setString(2,Apellido);
            PST1.setString(3,Edad);
            PST1.setString(4,Documento);
            PST1.setString(5,Sexo);
            PST1.setString(6,Ciudad);
            PST1.setString(7,Departamento);
            PST1.setString(8,Clase);
            PST1.setString(9,Horario);
            int n = PST1.executeUpdate();
            if(n>0){
                JOptionPane.showMessageDialog(null, "Regitros Guardados en la Base de Datos correctamente !!!");
            }
          } catch (Exception e) {
              
        }




        //Muestra los datos en la tabla del programa
        String Dato_estu[]= new String[4];
        Dato_estu[0] = txt_Nombre.getText()+" "+txt_Apellido.getText();
        Dato_estu[1] = txt_Documento.getText();
        Dato_estu[2] = cb_Clase.getItemAt(WIDTH);
        Dato_estu[3] = cb_Horario.getItemAt(WIDTH);
        Modelo_1.addRow(Dato_estu);
    }//GEN-LAST:event_Btn_Guardar1ActionPerformed

    private void Btn_Regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Regresar1ActionPerformed
        jpDocente.setVisible(false);
        jpPrincipal.setVisible(true);
        jp_DatosPerson.setVisible(true);
        jp_Datos_Doc.setVisible(false);
        jp_Estudiante.setVisible(false);
        jp_Datos_Estudiante.setVisible(false);
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Edad.setText("");
        txt_Documento.setText("");
        txt_Nombre.requestFocus();
    }//GEN-LAST:event_Btn_Regresar1ActionPerformed

    private void Btn_Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Salir1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_Btn_Salir1ActionPerformed

    private void Btn_Editar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Editar1ActionPerformed
        jpDocente.setVisible(false);
        jpPrincipal.setVisible(true);
        jp_DatosPerson.setVisible(true);
        jp_Datos_Doc.setVisible(false);
        jp_Estudiante.setVisible(false);
        jp_Datos_Estudiante.setVisible(false);
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Edad.setText("");
        txt_Documento.setText("");
        txt_Nombre.requestFocus();
    }//GEN-LAST:event_Btn_Editar1ActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed
        jpDocente.setVisible(false);
        jpPrincipal.setVisible(true);
        jp_DatosPerson.setVisible(true);
        jp_Datos_Doc.setVisible(false);
        jp_Estudiante.setVisible(false);
        jp_Datos_Estudiante.setVisible(false);
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Edad.setText("");
        txt_Documento.setText("");
        txt_Nombre.requestFocus();
        
    }//GEN-LAST:event_Btn_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_proyecto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_proyecto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Editar1;
    private javax.swing.JButton Btn_Estudiante;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Guardar1;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JButton Btn_Regresar1;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JButton Btn_Salir1;
    private javax.swing.JLabel Ciudad;
    private javax.swing.JLabel Departamento;
    private javax.swing.JLabel Documento;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Sexo;
    private javax.swing.JButton btn_Docente;
    private javax.swing.JButton btn_Salir;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JComboBox<String> cbCiudad;
    private javax.swing.JComboBox<String> cbDepartamento;
    private javax.swing.JComboBox<String> cb_Clase;
    private javax.swing.JComboBox<String> cb_Clase1;
    private javax.swing.JComboBox<String> cb_Horario;
    private javax.swing.JComboBox<String> cb_Horario1;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JPanel jpDocente;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jp_DatosPerson;
    private javax.swing.JPanel jp_Datos_Doc;
    private javax.swing.JPanel jp_Datos_Estudiante;
    private javax.swing.JPanel jp_Estudiante;
    private javax.swing.JTable jt_Tabla_Docente;
    private javax.swing.JTable jt_Tabla_Estudiante;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Documento;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
