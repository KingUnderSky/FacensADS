package login.form;
import javax.swing.JOptionPane;

public class Splash extends javax.swing.JFrame {

    public Splash() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Splash");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("splash"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(650, 341));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/griss image.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(splashbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(splashbar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("Splash Login Form");
        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) { 
        
        Splash carregamento = new Splash();
        carregamento.setVisible(true);

        try {

            for (int i = 0; i <= 100; i += 2) {

                Thread.sleep(25);
                carregamento.splashbar.setValue(i);                

            }
            
            carregamento.dispose();

            SignUp login = new SignUp();
            login.setVisible(true);

        } catch (InterruptedException ex) {
            JOptionPane.showConfirmDialog(null, "erro");                
        }  
        
        
                /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar splashbar;
    // End of variables declaration//GEN-END:variables
}
