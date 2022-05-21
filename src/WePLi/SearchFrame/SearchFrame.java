/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WePLi.SearchFrame;

import Controller.SongController;
import Dto.Song.SongDto;
import WePLi.UI.ComponentSetting;
import WePLi.UI.JFrameSetting;
import WePLi.UI.JTableSetting;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


/**
 *
 * @author joon
 */

class PanelRenderer extends DefaultTableCellRenderer {
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {
        
        label.setIcon((ImageIcon) value);
        /* 이미지 라벨에 정렬을 적용해줘야 함 */
        label.setHorizontalAlignment(CENTER);
        label.setVerticalAlignment(CENTER);
        
        panel.add(label);
        if(isSelected) panel.setBackground(new Color(216,229,255,255));
        else panel.setBackground(new Color(255,255,255,255));
        
        return panel;
    }
}

public class SearchFrame extends javax.swing.JFrame {

    /**
     * Creates new form SearchFrame
     */
    public SearchFrame() {
        JFrameSetting.layoutInit();
        
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        
        JTableSetting.tableInit(searchScrollPanel, searchTable);
        JTableSetting.tableHeaderInit(searchTable, searchScrollPanel.getWidth(), 40);
        searchTableSetting();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void searchTableSetting(){
        JTableSetting.setTableCellSize(this.searchTable, new int[]{70, 80, 464, 140, 140});
        TableColumnModel tableColumnModel = this.searchTable.getColumnModel();
        
        tableColumnModel.getColumn(1).setCellRenderer(new PanelRenderer());
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        
        tableColumnModel.getColumn(0).setCellRenderer(dtcr);
        tableColumnModel.getColumn(3).setCellRenderer(dtcr);
        tableColumnModel.getColumn(4).setCellRenderer(dtcr);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        siteRadioGroup = new javax.swing.ButtonGroup();
        searchScrollPanel = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        SearchButton = new javax.swing.JButton();
        SearchTextField = new javax.swing.JTextField();
        melonRadio = new javax.swing.JRadioButton();
        genieRadio = new javax.swing.JRadioButton();
        bugsRadio = new javax.swing.JRadioButton();
        backgroundPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchScrollPanel.setBackground(new java.awt.Color(255,255,255,0)
        );
        searchScrollPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        searchScrollPanel.setToolTipText("");
        searchScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        searchScrollPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                searchScrollPanelMouseWheelMoved(evt);
            }
        });

        searchTable.setBackground(new java.awt.Color(255,255,255,0));
        searchTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchTable.setFont(new java.awt.Font("AppleSDGothicNeoR00", 0, 14)); // NOI18N
        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "순위", "곡", "제목", "가수", "앨범"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTable.setMinimumSize(new java.awt.Dimension(10, 400));
        searchTable.setRowHeight(80);
        searchTable.setSelectionBackground(new java.awt.Color(169, 230, 255));
        searchTable.getTableHeader().setResizingAllowed(false);
        searchTable.getTableHeader().setReorderingAllowed(false);
        searchScrollPanel.setViewportView(searchTable);

        getContentPane().add(searchScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 176, 896, 529));

        SearchButton.setText("검색");
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 63, -1, -1));

        SearchTextField.setToolTipText("");
        getContentPane().add(SearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 60, 513, 29));

        siteRadioGroup.add(melonRadio);
        melonRadio.setSelected(true);
        melonRadio.setText("멜론");
        melonRadio.setActionCommand("melon");
        getContentPane().add(melonRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 118, -1, -1));

        siteRadioGroup.add(genieRadio);
        genieRadio.setText("지니");
        genieRadio.setActionCommand("genie");
        getContentPane().add(genieRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 118, -1, -1));

        siteRadioGroup.add(bugsRadio);
        bugsRadio.setText("벅스");
        bugsRadio.setActionCommand("bugs");
        getContentPane().add(bugsRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 118, -1, -1));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchScrollPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_searchScrollPanelMouseWheelMoved
        // TODO add your handling code here:
        JTableSetting.tableScroll(searchTable, searchScrollPanel, evt);
    }//GEN-LAST:event_searchScrollPanelMouseWheelMoved

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        // TODO add your handling code here:
        // 검색 버튼 클릭 시
        
        SongController songController = new SongController(); // 컨트롤러 생성
        
        String musicSite = siteRadioGroup.getSelection().getActionCommand();
        String searchText = SearchTextField.getText();
        
        ArrayList<SongDto> searchResult = songController.SongSearch(musicSite,searchText); //검색 결과 리턴
        System.out.println(searchResult);
        
        Object[][] values = songDtoToObject(searchResult);
        

        DefaultTableModel model = (DefaultTableModel)searchTable.getModel();
        model.setRowCount(0);
                
        JTableSetting.insertTableRow((DefaultTableModel) searchTable.getModel(), values);
    }//GEN-LAST:event_SearchButtonMouseClicked

    public Object[][] songDtoToObject(ArrayList<SongDto> songArray){
        System.out.println(songArray.size());
        
        Object[][] values = new Object[songArray.size()][];
        
        for (int i = 0; i < songArray.size(); i++) {
            SongDto song = songArray.get(i);
            
            values[i] = new Object[] {i + 1, ComponentSetting.imageToIcon(song.getImage(), 60, 60) ,song.getTitle(),song.getSinger(),song.getAlbum()};
        }
        
        return values;
    }
   
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
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JRadioButton bugsRadio;
    private javax.swing.JRadioButton genieRadio;
    private javax.swing.JRadioButton melonRadio;
    private javax.swing.JScrollPane searchScrollPanel;
    private javax.swing.JTable searchTable;
    private javax.swing.ButtonGroup siteRadioGroup;
    // End of variables declaration//GEN-END:variables
}
