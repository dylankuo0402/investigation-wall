
package investigationwall;

import painting.PaintSpace;
import painting.State;

/**
 *
 * @author Dylan
 */
public class ShapeSelectWindow extends javax.swing.JFrame {

    private javax.swing.JPanel shapePanel;

    private MyButton btnCircle;
    private MyButton btnRectangle;
    private MyButton btnTriangle;
    private MyButton btnDiamond;
    private Application parent;

    /** Creates new form ShapeSelectWindow */
    public ShapeSelectWindow(Application parent) {
        initComponents();
        this.parent = parent;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        shapePanel = new javax.swing.JPanel();
        btnCircle = new MyButton();
        btnRectangle = new MyButton();
        btnTriangle = new MyButton();
        btnDiamond = new MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        
        this.shapePanel.setBackground(new java.awt.Color(80, 80, 100));

        this.btnCircle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1,1,1,1));
        this.btnRectangle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1,1,1,1));
        this.btnTriangle.setBorder(javax.swing.BorderFactory.createEmptyBorder(1,1,1,1));
        this.btnDiamond.setBorder(javax.swing.BorderFactory.createEmptyBorder(1,1,1,1));

        btnCircle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investigationwall/Images/ShapeImages/cercle.png"))); 
        btnRectangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investigationwall/Images/ShapeImages/rectangle.png"))); 
        btnTriangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investigationwall/Images/ShapeImages/triangle.png")));
        btnDiamond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/investigationwall/Images/ShapeImages/Diamond.png")));
        
        btnCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircleActionPerformed(evt);
            }
        });
        btnDiamond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiamondActionPerformed(evt);
            }
        });
        btnRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectangleActionPerformed(evt);
            }
        });
        btnTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriangleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shapePanelLayout = new javax.swing.GroupLayout(shapePanel);
        shapePanel.setLayout(shapePanelLayout);
        shapePanelLayout.setHorizontalGroup(
            shapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(shapePanelLayout.createSequentialGroup()
                        .addComponent(btnCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(shapePanelLayout.createSequentialGroup()
                        .addComponent(btnDiamond, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        shapePanelLayout.setVerticalGroup(
            shapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shapePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shapePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnDiamond, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shapePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shapePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    
    private void btnRectangleActionPerformed(java.awt.event.ActionEvent evt) {
        if(parent.howManyWall!=-1){
            WallPanel obj = parent.wallTabController.wallVector.get(parent.selectedIndex);
            obj.myPanel.paintSpace.state = State.drawRect;
            parent.shapeSelect.setVisible(false);
            parent.isClicked = true;
        }else{
            System.out.println("There's no walls");
        }
    }   
    
    private void btnCircleActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(parent.howManyWall!=-1){
            WallPanel obj = parent.wallTabController.wallVector.get(parent.selectedIndex);
            obj.myPanel.paintSpace.state = State.drawOval;
            parent.shapeSelect.setVisible(false);
            parent.isClicked = true;
        }else{
            System.out.println("There's no walls");
        }
    }
    
    private void btnTriangleActionPerformed(java.awt.event.ActionEvent evt) {
        if(parent.howManyWall!=-1){
            WallPanel obj = parent.wallTabController.wallVector.get(parent.selectedIndex);
            obj.myPanel.paintSpace.state = State.drawTri;
            parent.shapeSelect.setVisible(false);
            parent.isClicked = true;
        }else{
            System.out.println("There's no walls");
        }
        
    }
    
    private void btnDiamondActionPerformed(java.awt.event.ActionEvent evt) {
        if(parent.howManyWall!=-1){
            System.out.println("Creating Diamond");
        }else{
            System.out.println("There's no walls");
        }
        
    }

    
    

}
