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
import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

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
        if (isSelected) {
            panel.setBackground(new Color(169, 230, 255, 255));
        } else {
            panel.setBackground(new Color(255, 255, 255, 255));
        }

        return panel;
    }
}

public class SearchFrame extends javax.swing.JFrame {

    // Item 리스너 작성
    class MyItemListener implements ItemListener {

        public void itemStateChanged(ItemEvent e) {
            melonRadio.setIcon(melonRadio.isSelected()
                    ? new ImageIcon("./src/resources/layout/button/hover/melon_select.png")
                    : new ImageIcon("./src/resources/layout/button/normal/melon.png"));
            bugsRadio.setIcon(bugsRadio.isSelected()
                    ? new ImageIcon("./src/resources/layout/button/hover/bugs_select.png")
                    : new ImageIcon("./src/resources/layout/button/normal/bugs.png"));
            genieRadio.setIcon(genieRadio.isSelected()
                    ? new ImageIcon("./src/resources/layout/button/hover/genie_select.png")
                    : new ImageIcon("./src/resources/layout/button/normal/genie.png"));
        }
    }

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
    public void searchTableSetting() {
        JTableSetting.setTableCellSize(this.searchTable, new int[]{70, 80, 464, 140, 140, 0});
        TableColumnModel tableColumnModel = this.searchTable.getColumnModel();

        tableColumnModel.getColumn(1).setCellRenderer(new PanelRenderer());
        DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
        dtcr.setHorizontalAlignment(SwingConstants.CENTER);

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
        backgroundPanel = new javax.swing.JPanel();
        searchTextField = new javax.swing.JTextField();
        searchNavbarLabel = new javax.swing.JLabel();
        searchFieldLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        bugsRadio = new javax.swing.JRadioButton();
        genieRadio = new javax.swing.JRadioButton();
        melonRadio = new javax.swing.JRadioButton(new ImageIcon("./src/resources/avatar.png"));
        submitButton = new javax.swing.JButton();

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
                "번호", "곡", "제목", "가수", "앨범", "이미지"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchTable.setMinimumSize(new java.awt.Dimension(10, 400));
        searchTable.setRowHeight(80);
        searchTable.setSelectionBackground(new java.awt.Color(169, 230, 255));
        searchTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        searchTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        searchTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        searchTable.getTableHeader().setResizingAllowed(false);
        searchTable.getTableHeader().setReorderingAllowed(false);
        searchScrollPanel.setViewportView(searchTable);
        if (searchTable.getColumnModel().getColumnCount() > 0) {
            searchTable.getColumnModel().getColumn(5).setMinWidth(0);
            searchTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            searchTable.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        getContentPane().add(searchScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 145, 896, 560));

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchTextField.setBackground(new Color(255,255,255,0));
        searchTextField.setToolTipText("");
        searchTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        backgroundPanel.add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 390, 29));

        searchNavbarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/background/search_navbar.png"))); // NOI18N
        backgroundPanel.add(searchNavbarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 64));

        searchFieldLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchFieldLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/component/normal/search.png"))); // NOI18N
        searchFieldLabel.setPreferredSize(new java.awt.Dimension(451, 41));
        backgroundPanel.add(searchFieldLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 451, 50));

        searchButton.setBackground(new Color(255,255,255,0));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/component/normal/search_btn.png"))); // NOI18N
        searchButton.setPreferredSize(new java.awt.Dimension(75, 28));
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchButtonMouseExited(evt);
            }
        });
        backgroundPanel.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        bugsRadio.addItemListener(new MyItemListener());
        siteRadioGroup.add(bugsRadio);
        bugsRadio.setActionCommand("bugs");
        bugsRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bugsRadioMouseEntered(evt);
            }
        });
        backgroundPanel.add(bugsRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 30, 30));

        genieRadio.addItemListener(new MyItemListener());
        siteRadioGroup.add(genieRadio);
        genieRadio.setActionCommand("genie");
        genieRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                genieRadioMouseEntered(evt);
            }
        });
        backgroundPanel.add(genieRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 30, 30));

        siteRadioGroup.add(melonRadio);
        melonRadio.addItemListener(new MyItemListener());
        melonRadio.setSelected(true);
        melonRadio.setActionCommand("melon");
        melonRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                melonRadioMouseEntered(evt);
            }
        });
        backgroundPanel.add(melonRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 30, 30));

        searchButton.setBackground(new Color(255,255,255,0));
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/component/normal/search_btn.png"))); // NOI18N
        submitButton.setPreferredSize(new java.awt.Dimension(75, 28));
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });
        backgroundPanel.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, -1, -1));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchScrollPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_searchScrollPanelMouseWheelMoved
        // TODO add your handling code here:
        JTableSetting.tableScroll(searchTable, searchScrollPanel, evt);
    }//GEN-LAST:event_searchScrollPanelMouseWheelMoved

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
        // 검색 버튼 클릭 시

        SongController songController = new SongController(); // 컨트롤러 생성

        String musicSite = siteRadioGroup.getSelection().getActionCommand();
        String searchText = searchTextField.getText();

        ArrayList<SongDto> searchResult = songController.SongSearch(musicSite, searchText); //검색 결과 리턴
        
        for (SongDto songDto : searchResult) {
            System.out.println(songDto);
        }
        Object[][] values = songDtoToObject(searchResult);

        DefaultTableModel model = (DefaultTableModel) searchTable.getModel();
        model.setRowCount(0);

        JTableSetting.insertTableRow((DefaultTableModel) searchTable.getModel(), values);
    }//GEN-LAST:event_searchButtonMouseClicked

    private void searchButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseEntered
        // TODO add your handling code here:
        searchButton.setIcon(new ImageIcon("./src/resources/layout/component/focus/search_btn_focus.png"));
        searchButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_searchButtonMouseEntered

    private void searchButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseExited
        // TODO add your handling code here:
        searchButton.setIcon(new ImageIcon("./src/resources/layout/component/normal/search_btn.png"));
        searchButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_searchButtonMouseExited

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        // TODO add your handling code here:
        searchFieldLabel.setIcon(new ImageIcon("./src/resources/layout/component/focus/search_focus.png"));
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        // TODO add your handling code here:
        searchFieldLabel.setIcon(new ImageIcon("./src/resources/layout/component/normal/search.png"));
    }//GEN-LAST:event_searchTextFieldFocusLost

    private void melonRadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_melonRadioMouseEntered
        // TODO add your handling code here:
        melonRadio.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_melonRadioMouseEntered

    private void genieRadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genieRadioMouseEntered
        // TODO add your handling code here:
        genieRadio.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_genieRadioMouseEntered

    private void bugsRadioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bugsRadioMouseEntered
        // TODO add your handling code here:
        bugsRadio.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_bugsRadioMouseEntered

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        // TODO add your handling code here:

        int[] rows = this.searchTable.getSelectedRows();
        TableModel model = this.searchTable.getModel();

        for (int i = 0; i < rows.length; i++) {
            
            System.out.println("선택된 커버이미지 : " + model.getValueAt(rows[i], 5).toString() + ", 제목 :" + model.getValueAt(rows[i], 2) + ", 가수 :" + model.getValueAt(rows[i], 3) + ", 제목 :" + model.getValueAt(rows[i], 4));
        }

    }//GEN-LAST:event_submitButtonMouseClicked

    
    public Object[][] songDtoToObject(ArrayList<SongDto> songArray) {
        System.out.println(songArray.size());

        Object[][] values = new Object[songArray.size()][];

        for (int i = 0; i < songArray.size(); i++) {
            SongDto song = songArray.get(i);

            values[i] = new Object[]{i + 1, ComponentSetting.imageToIcon(song.getImage(), 60, 60), song.getTitle(), song.getSinger(), song.getAlbum(),song.getImage()};
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
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JRadioButton bugsRadio;
    private javax.swing.JRadioButton genieRadio;
    private javax.swing.JRadioButton melonRadio;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel searchFieldLabel;
    private javax.swing.JLabel searchNavbarLabel;
    private javax.swing.JScrollPane searchScrollPanel;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField searchTextField;
    private javax.swing.ButtonGroup siteRadioGroup;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
