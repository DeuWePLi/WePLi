/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WePLi;

import WePLi.UI.ComponentSetting;
import static WePLi.UI.ComponentSetting.convertPlaylistToHtml;
import static WePLi.UI.ComponentSetting.convertSongToHtml;
import WePLi.UI.JFrameSetting;
import WePLi.UI.JPanelSetting;
import WePLi.UI.JTableSetting;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Donghyeon <20183188>
 */


public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
//    private static MainFrame mainFrame;
    private ArrayList<JPanel> panelList = new ArrayList<>();

    public MainFrame() {
        JFrameSetting.layoutInit();

        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);

        panelList.add(chartPanel);
        panelList.add(playlistPanel);
        panelList.add(relaylistPanel);
        panelList.add(notifyPanel);
        panelList.add(playlistDetailPanel);
        panelList.add(relaylistDetailPanel);
        
        JPanelSetting.changePanel(panelList, chartPanel);
        
        /* ChartTable 기본 디자인 세팅 (Customize Code에 있음) */
        /* PlaylistTable 기본 디자인 세팅 (Customize Code에 있음) */
        
        /* 테스트 값 생성 */
        String url1 = "https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/662/688/82662688_1651196114166_1_600x600.JPG/dims/resize/Q_80,0";
        String url2 = "https://image.bugsm.co.kr/album/images/50/40756/4075667.jpg?version=20220515063240.0";

        Object[][] values = {
            {"1", ComponentSetting.imageToIcon(url1, 60,60), convertSongToHtml("회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)", "사랑인가 봐 (사내맞선 OST 스페셜 트랙)"), "디핵 (D-Hack)", "사랑인가 봐 (사내맞선 OST 스페셜 트랙)"},
            {"1", ComponentSetting.imageToIcon(url2, 60,60), "", "테스트", "테스트"},
            {"1", ComponentSetting.imageToIcon(url1, 60,60), convertSongToHtml("회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)", "디핵 (D-Hack)"), "디핵 (D-Hack)", "사랑인가 봐 (사내맞선 OST 스페셜 트랙)"},
            {"1", ComponentSetting.imageToIcon(url1, 60,60), convertSongToHtml("회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)", "디핵 (D-Hack)"), "디핵 (D-Hack)", "사랑인가 봐 (사내맞선 OST 스페셜 트랙)"},
            {"1", ComponentSetting.imageToIcon(url1, 60,60), convertSongToHtml("회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)", "디핵 (D-Hack)"), "디핵 (D-Hack)", "사랑인가 봐 (사내맞선 OST 스페셜 트랙)"},
            {"1", ComponentSetting.imageToIcon(url1, 60,60), convertSongToHtml("회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)", "디핵 (D-Hack)"), "디핵 (D-Hack)", "사랑인가 봐 (사내맞선 OST 스페셜 트랙)"},
            {"1", ComponentSetting.imageToIcon(url1, 60,60), convertSongToHtml("회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)", "디핵 (D-Hack)"), "디핵 (D-Hack)", "사랑인가 봐 (사내맞선 OST 스페셜 트랙)"},
            {"1", ComponentSetting.imageToIcon(url1, 60,60), convertSongToHtml("회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)", "디핵 (D-Hack)"), "디핵 (D-Hack)", "사랑인가 봐 (사내맞선 OST 스페셜 트랙)"},
        };

        /* 테이블에 값 추가*/
        JTableSetting.insertTableRow((DefaultTableModel) chartTable.getModel(), values);
        JTableSetting.insertTableRow((DefaultTableModel) playDetailTable.getModel(), values);
        JTableSetting.insertTableRow((DefaultTableModel) relayDetailTable.getModel(), values);
        
        Object[][] value = {{"P0000001", ComponentSetting.imageToIcon(url1, 100,100), convertPlaylistToHtml("플레이리스트 제목", "작성자 닉네임", "플레이리스트 설명입니다. 이거는 이러이러한 플레이리스트"), ""},
                            {"P0000001", ComponentSetting.imageToIcon(url1, 100,100), convertPlaylistToHtml("플레이리스트 제목", "작성자 닉네임", "플레이리스트 설명입니다. 이거는 이러이러한 플레이리스트"), ""}};
        
        JTableSetting.insertTableRow((DefaultTableModel) playlistTable.getModel(), value);
        JTableSetting.insertTableRow((DefaultTableModel) relaylistTable.getModel(), value);
        
        String genieUrl = "https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/540/759/82540759_1645152997958_1_600x600.JPG/dims/resize/Q_80,0";
        String bugsUrl = "https://image.bugsm.co.kr/album/images/912/40757/4075727.jpg?version=20220518025622.0";
        
        relayImageLabel.setIcon(ComponentSetting.getBigBlurImage("https://cdnimg.melon.co.kr/cm2/album/images/109/03/868/10903868_20220330103544_500.jpg?e89c53bde5d39b21b09e8007db5b9cc0/melon/resize/912/quality/80/optimize"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        HomeLabel = new javax.swing.JLabel();
        PlaylistLabel = new javax.swing.JLabel();
        RelaylistLabel = new javax.swing.JLabel();
        NotifyLabel = new javax.swing.JLabel();
        HeaderLabel = new javax.swing.JLabel();
        SidebarLabel = new javax.swing.JLabel();
        relaylistDetailPanel = new javax.swing.JPanel();
        firstSongImageLabel = new javax.swing.JLabel();
        firstSongTitleLabel = new javax.swing.JLabel();
        relaylistTitleLabel = new javax.swing.JLabel();
        firstSongSingerLabel = new javax.swing.JLabel();
        blurLabel = new javax.swing.JLabel();
        relayDetailScrollPanel = new javax.swing.JScrollPane();
        relayDetailTable = new javax.swing.JTable();
        relayImageLabel = new javax.swing.JLabel();
        relaylistPanel = new javax.swing.JPanel();
        relaylistScrollPanel = new javax.swing.JScrollPane();
        relaylistTable = new javax.swing.JTable();
        playlistPanel = new javax.swing.JPanel();
        playlistScrollPanel = new javax.swing.JScrollPane();
        playlistTable = new javax.swing.JTable();
        playlistDetailPanel = new javax.swing.JPanel();
        playImageLabel = new javax.swing.JLabel();
        playTitleLabel = new javax.swing.JLabel();
        playInformLabel = new javax.swing.JLabel();
        playDateLabel = new javax.swing.JLabel();
        playAuthorLabel = new javax.swing.JLabel();
        playDetailScrollPanel = new javax.swing.JScrollPane();
        playDetailTable = new javax.swing.JTable();
        notifyPanel = new javax.swing.JPanel();
        chartPanel = new javax.swing.JPanel();
        chartScrollPanel = new javax.swing.JScrollPane();
        chartTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/menu/normal/home.png"))); // NOI18N
        HomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeLabelMouseExited(evt);
            }
        });
        BackgroundPanel.add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 168, 55));

        PlaylistLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/menu/normal/playlist.png"))); // NOI18N
        PlaylistLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlaylistLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PlaylistLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PlaylistLabelMouseExited(evt);
            }
        });
        BackgroundPanel.add(PlaylistLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, 168, 55));

        RelaylistLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/menu/normal/relaylist.png"))); // NOI18N
        RelaylistLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelaylistLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RelaylistLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RelaylistLabelMouseExited(evt);
            }
        });
        BackgroundPanel.add(RelaylistLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 168, 55));

        NotifyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/menu/normal/notify.png"))); // NOI18N
        NotifyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotifyLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NotifyLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NotifyLabelMouseExited(evt);
            }
        });
        BackgroundPanel.add(NotifyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, 168, 55));

        HeaderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/header.png"))); // NOI18N
        BackgroundPanel.add(HeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 74));

        SidebarLabel.setBackground(new java.awt.Color(39, 49, 64));
        SidebarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/sidebar.png"))); // NOI18N
        BackgroundPanel.add(SidebarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 168, -1));

        relaylistDetailPanel.setBackground(new java.awt.Color(255, 255, 255));
        relaylistDetailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstSongImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/test/younha.jpg"))); // NOI18N
        relaylistDetailPanel.add(firstSongImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 250, 250));

        firstSongTitleLabel.setFont(new java.awt.Font("AppleSDGothicNeoSB00", 0, 18)); // NOI18N
        firstSongTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstSongTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstSongTitleLabel.setText("오늘 헤어 졌어요");
        relaylistDetailPanel.add(firstSongTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 225, 540, 30));

        relaylistTitleLabel.setFont(new java.awt.Font("나눔스퀘어 Bold", 1, 36)); // NOI18N
        relaylistTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        relaylistTitleLabel.setText("<html><p>도토리를 훔쳐간</p><br><p>싸이월드 BGM</p></html>");
        relaylistDetailPanel.add(relaylistTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 40, 390, 140));

        firstSongSingerLabel.setFont(new java.awt.Font("AppleSDGothicNeoSB00", 0, 16)); // NOI18N
        firstSongSingerLabel.setForeground(new java.awt.Color(204, 204, 204));
        firstSongSingerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstSongSingerLabel.setText("윤하");
        firstSongSingerLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        relaylistDetailPanel.add(firstSongSingerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 255, 540, 20));

        blurLabel.setBackground(new java.awt.Color(0,0,0,0));
        blurLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/layout/background/blur.png"))); // NOI18N
        relaylistDetailPanel.add(blurLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 912, 290));

        relayDetailScrollPanel.setBackground(new java.awt.Color(255,255,255,0)
        );
        relayDetailScrollPanel.setBorder(null);
        relayDetailScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        relayDetailScrollPanel.setToolTipText("");
        relayDetailScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        relayDetailScrollPanel.setOpaque(false);
        relayDetailScrollPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                relayDetailScrollPanelMouseWheelMoved(evt);
            }
        });

        relayDetailTable.setBackground(new java.awt.Color(255,255,255,0));
        relayDetailTable.setFont(new java.awt.Font("AppleSDGothicNeoR00", 0, 14)); // NOI18N
        relayDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "번호", "커버", "곡/앨범", "가수"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        relayDetailTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        relayDetailTable.setMinimumSize(new java.awt.Dimension(10, 400));
        relayDetailTable.setOpaque(false);
        relayDetailTable.setRowHeight(80);
        relayDetailTable.setSelectionBackground(new java.awt.Color(216, 229, 255));
        relayDetailTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        relayDetailTable.getTableHeader().setResizingAllowed(false);
        relayDetailTable.getTableHeader().setReorderingAllowed(false);
        relayDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relayDetailTableMouseClicked(evt);
            }
        });
        relayDetailScrollPanel.setViewportView(relayDetailTable);
        /* PlayDetailTable 기본 디자인 세팅 */
        JTableSetting.tableInit(relaylistScrollPanel, relayDetailTable);
        JTableSetting.tableHeaderInit(relayDetailTable, relaylistScrollPanel.getWidth(), 40);
        JTableSetting.songTableSetting(relayDetailTable);

        relaylistDetailPanel.add(relayDetailScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 300, 900, 350));

        relayImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/test/younha.jpg"))); // NOI18N
        relaylistDetailPanel.add(relayImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 290));

        BackgroundPanel.add(relaylistDetailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 60, 912, 660));

        relaylistPanel.setBackground(new java.awt.Color(255, 255, 255));
        relaylistPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        relaylistScrollPanel.setBackground(new java.awt.Color(255,255,255,0)
        );
        relaylistScrollPanel.setBorder(null);
        relaylistScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        relaylistScrollPanel.setToolTipText("");
        relaylistScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        relaylistTable.setBackground(new java.awt.Color(255,255,255,0));
        relaylistTable.setFont(new java.awt.Font("AppleSDGothicNeoR00", 0, 14)); // NOI18N
        relaylistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "공백", "사진", "플레이리스트                                              ", "날짜"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        relaylistTable.setMinimumSize(new java.awt.Dimension(10, 400));
        relaylistTable.setOpaque(false);
        relaylistTable.setRowHeight(100);
        relaylistTable.setSelectionBackground(new java.awt.Color(216, 229, 255));
        relaylistTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        relaylistTable.getTableHeader().setResizingAllowed(false);
        relaylistTable.getTableHeader().setReorderingAllowed(false);
        relaylistTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relaylistTableMouseClicked(evt);
            }
        });
        relaylistScrollPanel.setViewportView(relaylistTable);
        /* PlaylistTable 기본 세팅 */
        JTableSetting.tableInit(relaylistScrollPanel, relaylistTable);
        JTableSetting.tableHeaderInit(relaylistTable, relaylistPanel.getWidth(), 40);
        JTableSetting.listTableSetting(relaylistTable);

        relaylistPanel.add(relaylistScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 36, 896, 618));

        BackgroundPanel.add(relaylistPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 910, 660));

        playlistPanel.setBackground(new java.awt.Color(255, 255, 255));
        playlistPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playlistScrollPanel.setBackground(new java.awt.Color(255,255,255,0)
        );
        playlistScrollPanel.setBorder(null);
        playlistScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        playlistScrollPanel.setToolTipText("");
        playlistScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        playlistTable.setBackground(new java.awt.Color(255,255,255,0));
        playlistTable.setFont(new java.awt.Font("AppleSDGothicNeoR00", 0, 14)); // NOI18N
        playlistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "공백", "사진", "플레이리스트                                              ", "날짜"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        playlistTable.setMinimumSize(new java.awt.Dimension(10, 400));
        playlistTable.setOpaque(false);
        playlistTable.setRowHeight(100);
        playlistTable.setSelectionBackground(new java.awt.Color(216, 229, 255));
        playlistTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        playlistTable.getTableHeader().setResizingAllowed(false);
        playlistTable.getTableHeader().setReorderingAllowed(false);
        playlistTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playlistTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playlistTableMousePressed(evt);
            }
        });
        playlistScrollPanel.setViewportView(playlistTable);
        /* PlaylistTable 기본 세팅 */
        JTableSetting.tableInit(playlistScrollPanel, playlistTable);
        JTableSetting.tableHeaderInit(playlistTable, playlistPanel.getWidth(), 40);
        JTableSetting.listTableSetting(playlistTable);

        playlistPanel.add(playlistScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 36, 896, 618));

        BackgroundPanel.add(playlistPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 910, 660));

        playlistDetailPanel.setBackground(new java.awt.Color(255, 255, 255));
        playlistDetailPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/test/younha.jpg"))); // NOI18N
        playlistDetailPanel.add(playImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 260));

        playTitleLabel.setFont(new java.awt.Font("나눔스퀘어 Bold", 0, 30)); // NOI18N
        playTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        playTitleLabel.setText("윤하 노래 모음");
        playlistDetailPanel.add(playTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 5, 520, 50));

        playInformLabel.setFont(new java.awt.Font("AppleSDGothicNeoB00", 0, 14)); // NOI18N
        playInformLabel.setText("<html>초저녁 감성</html>");
        playInformLabel.setForeground(new Color(187,187,187));
        playInformLabel.setVerticalAlignment(JLabel.TOP);
        playlistDetailPanel.add(playInformLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 80, 530, 90));

        playDateLabel.setFont(new java.awt.Font("AppleSDGothicNeoR00", 0, 14)); // NOI18N
        playDateLabel.setText("2022-05-22");
        playDateLabel.setForeground(new Color(187,187,187));
        playlistDetailPanel.add(playDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 45, 510, 20));

        playAuthorLabel.setFont(new java.awt.Font("AppleSDGothicNeoB00", 0, 14)); // NOI18N
        playAuthorLabel.setForeground(new java.awt.Color(87, 144, 255));
        playAuthorLabel.setText("by 랄로(Ralo)");
        playlistDetailPanel.add(playAuthorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 245, 410, 30));

        playDetailScrollPanel.setBackground(new java.awt.Color(255,255,255,0)
        );
        playDetailScrollPanel.setBorder(null);
        playDetailScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        playDetailScrollPanel.setToolTipText("");
        playDetailScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        playDetailScrollPanel.setOpaque(false);
        playDetailScrollPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                playDetailScrollPanelMouseWheelMoved(evt);
            }
        });

        playDetailTable.setBackground(new java.awt.Color(255,255,255,0));
        playDetailTable.setOpaque(false);
        playDetailTable.setFont(new java.awt.Font("AppleSDGothicNeoR00", 0, 14)); // NOI18N
        playDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "번호", "커버", "곡/앨범", "가수"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        playDetailTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        playDetailTable.setMinimumSize(new java.awt.Dimension(10, 400));
        playDetailTable.setOpaque(false);
        playDetailTable.setRowHeight(80);
        playDetailTable.setSelectionBackground(new java.awt.Color(216, 229, 255));
        playDetailTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        playDetailTable.getTableHeader().setResizingAllowed(false);
        playDetailTable.getTableHeader().setReorderingAllowed(false);
        playDetailTable.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                playDetailTableMouseWheelMoved(evt);
            }
        });
        playDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playDetailTableMouseClicked(evt);
            }
        });
        playDetailScrollPanel.setViewportView(playDetailTable);
        /* PlayDetailTable 기본 디자인 세팅 */
        JTableSetting.tableInit(playlistScrollPanel, playDetailTable);
        JTableSetting.tableHeaderInit(playDetailTable, playlistScrollPanel.getWidth(), 40);
        JTableSetting.songTableSetting(playDetailTable);

        playlistDetailPanel.add(playDetailScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 300, 900, 350));

        BackgroundPanel.add(playlistDetailPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 910, 660));

        notifyPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout notifyPanelLayout = new javax.swing.GroupLayout(notifyPanel);
        notifyPanel.setLayout(notifyPanelLayout);
        notifyPanelLayout.setHorizontalGroup(
            notifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        notifyPanelLayout.setVerticalGroup(
            notifyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        BackgroundPanel.add(notifyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 910, 660));

        chartPanel.setBackground(new java.awt.Color(255, 255, 255));
        chartPanel.setOpaque(false);
        chartPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chartScrollPanel.setBackground(new java.awt.Color(255,255,255,0)
        );
        chartScrollPanel.setBorder(null);
        chartScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        chartScrollPanel.setToolTipText("");
        chartScrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        chartScrollPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                chartScrollPanelMouseWheelMoved(evt);
            }
        });

        chartTable.setBackground(new java.awt.Color(255,255,255,0));
        chartTable.setFont(new java.awt.Font("AppleSDGothicNeoR00", 0, 14)); // NOI18N
        chartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "순위", "커버", "곡/앨범", "가수"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        chartTable.setMinimumSize(new java.awt.Dimension(10, 400));
        chartTable.setOpaque(false);
        chartTable.setRowHeight(80);
        chartTable.setSelectionBackground(new java.awt.Color(216, 229, 255));
        chartTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        chartTable.getTableHeader().setResizingAllowed(false);
        chartTable.getTableHeader().setReorderingAllowed(false);
        chartScrollPanel.setViewportView(chartTable);
        /* ChartTable 기본 디자인 세팅 */
        JTableSetting.tableInit(chartScrollPanel, chartTable);
        JTableSetting.tableHeaderInit(chartTable, chartScrollPanel.getWidth(), 40);
        JTableSetting.songTableSetting(chartTable);

        chartPanel.add(chartScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 125, 896, 529));

        BackgroundPanel.add(chartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 60, 910, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* 홈 메뉴 마우스 이벤트 */
    private void HomeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseEntered
        // TODO add your handling code here:
        HomeLabel.setIcon(new ImageIcon("./src/resources/layout/menu/hover/home_hover.png"));
        HomeLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_HomeLabelMouseEntered

    private void HomeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseExited
        // TODO add your handling code here:
        HomeLabel.setIcon(new ImageIcon("./src/resources/layout/menu/normal/home.png"));
        HomeLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_HomeLabelMouseExited

    /* 플레이리스트 메뉴 마우스 이벤트 */
    private void PlaylistLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaylistLabelMouseEntered
        // TODO add your handling code here:
        PlaylistLabel.setIcon(new ImageIcon("./src/resources/layout/menu/hover/playlist_hover.png"));
        PlaylistLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_PlaylistLabelMouseEntered

    private void PlaylistLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaylistLabelMouseExited
        // TODO add your handling code here:
        PlaylistLabel.setIcon(new ImageIcon("./src/resources/layout/menu/normal/playlist.png"));
        PlaylistLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_PlaylistLabelMouseExited

    /* 릴레이리스트 메뉴 마우스 이벤트 */
    private void RelaylistLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelaylistLabelMouseEntered
        // TODO add your handling code here:
        RelaylistLabel.setIcon(new ImageIcon("./src/resources/layout/menu/hover/relaylist_hover.png"));
        RelaylistLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_RelaylistLabelMouseEntered

    private void RelaylistLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelaylistLabelMouseExited
        // TODO add your handling code here:
        RelaylistLabel.setIcon(new ImageIcon("./src/resources/layout/menu/normal/relaylist.png"));
        RelaylistLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_RelaylistLabelMouseExited

    /* 알림 메뉴 마우스 이벤트 */
    private void NotifyLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotifyLabelMouseEntered
        // TODO add your handling code here:
        NotifyLabel.setIcon(new ImageIcon("./src/resources/layout/menu/hover/notify_hover.png"));
        NotifyLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_NotifyLabelMouseEntered

    private void NotifyLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotifyLabelMouseExited
        // TODO add your handling code here:
        NotifyLabel.setIcon(new ImageIcon("./src/resources/layout/menu/normal/notify.png"));
        NotifyLabel.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_NotifyLabelMouseExited

    /* 스크롤 패널 스크롤 이벤트 구현 */
    private void chartScrollPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_chartScrollPanelMouseWheelMoved
        // TODO add your handling code here:
        JTableSetting.tableScroll(chartTable, chartScrollPanel, evt);
    }//GEN-LAST:event_chartScrollPanelMouseWheelMoved

    private void HomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLabelMouseClicked
        // TODO add your handling code here:
        JPanelSetting.changePanel(this.panelList, this.chartPanel);
    }//GEN-LAST:event_HomeLabelMouseClicked

    private void RelaylistLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelaylistLabelMouseClicked
        // TODO add your handling code here:
        JPanelSetting.changePanel(this.panelList, this.relaylistPanel);
    }//GEN-LAST:event_RelaylistLabelMouseClicked

    private void PlaylistLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaylistLabelMouseClicked
        // TODO add your handling code here:
        JPanelSetting.changePanel(this.panelList, this.playlistPanel);
    }//GEN-LAST:event_PlaylistLabelMouseClicked

    private void NotifyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotifyLabelMouseClicked
        // TODO add your handling code here:
        JPanelSetting.changePanel(this.panelList, this.notifyPanel);
    }//GEN-LAST:event_NotifyLabelMouseClicked

    private void playDetailScrollPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_playDetailScrollPanelMouseWheelMoved
        // TODO add your handling code here:
        JTableSetting.tableScroll(playlistTable, playlistScrollPanel, evt);
    }//GEN-LAST:event_playDetailScrollPanelMouseWheelMoved

    private void playDetailTableMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_playDetailTableMouseWheelMoved
        // TODO add your handling code here:
        JTableSetting.tableScroll(playDetailTable, playDetailScrollPanel, evt);
    }//GEN-LAST:event_playDetailTableMouseWheelMoved

    private void playDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playDetailTableMouseClicked
        // TODO add your handling code here:
        int row = this.playDetailTable.getSelectedRow();
        int column = this.playDetailTable.getSelectedColumn();
        TableModel model = this.playDetailTable.getModel();

        Document doc = Jsoup.parse(model.getValueAt(row, 2).toString());

        Element element = doc.select("body").get(0);

        System.out.println("엘리먼트 " + element);
        System.out.println("아이디 : " + element.select("input").attr("value"));
        System.out.println("제목 : " + element.select("#title").text());
        System.out.println("앨범 : " + element.select("#album").text());

        System.out.println(row + "행, " + column + "열 : " + model.getValueAt(row, 2) + " 선택했음");
    }//GEN-LAST:event_playDetailTableMouseClicked

    private void playlistTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistTableMouseClicked
        // TODO add your handling code here:
        // 선택 된 행의 플레이리스트 ID를 가져와서 컨트롤러에게 플레이리스트 정보를 요청
        // 전달받은 플레이리스트의 정보를 playDetailPanel로 전달하여 출력해야 함
        
        int row = this.playlistTable.getSelectedRow();
        int column = this.playlistTable.getSelectedColumn();
        TableModel model = this.playlistTable.getModel();
        
        System.out.println(row + "행, " + column + "열 : " + model.getValueAt(row, 2) + " 선택했음");
        JPanelSetting.changePanel(panelList, playlistDetailPanel);
    }//GEN-LAST:event_playlistTableMouseClicked

    private void relayDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relayDetailTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_relayDetailTableMouseClicked

    private void relayDetailScrollPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_relayDetailScrollPanelMouseWheelMoved
        // TODO add your handling code here:
        JTableSetting.tableScroll(relayDetailTable, relayDetailScrollPanel, evt);
    }//GEN-LAST:event_relayDetailScrollPanelMouseWheelMoved

    private void playlistTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playlistTableMousePressed
        // TODO add your handling code here:
        this.playlistTable.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_playlistTableMousePressed

    private void relaylistTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relaylistTableMouseClicked
        // TODO add your handling code here:
        JPanelSetting.changePanel(panelList, relaylistDetailPanel);
    }//GEN-LAST:event_relaylistTableMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel HeaderLabel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel NotifyLabel;
    private javax.swing.JLabel PlaylistLabel;
    private javax.swing.JLabel RelaylistLabel;
    private javax.swing.JLabel SidebarLabel;
    private javax.swing.JLabel blurLabel;
    private javax.swing.JPanel chartPanel;
    private javax.swing.JScrollPane chartScrollPanel;
    private javax.swing.JTable chartTable;
    private javax.swing.JLabel firstSongImageLabel;
    private javax.swing.JLabel firstSongSingerLabel;
    private javax.swing.JLabel firstSongTitleLabel;
    private javax.swing.JPanel notifyPanel;
    private javax.swing.JLabel playAuthorLabel;
    private javax.swing.JLabel playDateLabel;
    private javax.swing.JScrollPane playDetailScrollPanel;
    private javax.swing.JTable playDetailTable;
    private javax.swing.JLabel playImageLabel;
    private javax.swing.JLabel playInformLabel;
    private javax.swing.JLabel playTitleLabel;
    private javax.swing.JPanel playlistDetailPanel;
    private javax.swing.JPanel playlistPanel;
    private javax.swing.JScrollPane playlistScrollPanel;
    private javax.swing.JTable playlistTable;
    private javax.swing.JScrollPane relayDetailScrollPanel;
    private javax.swing.JTable relayDetailTable;
    private javax.swing.JLabel relayImageLabel;
    private javax.swing.JPanel relaylistDetailPanel;
    private javax.swing.JPanel relaylistPanel;
    private javax.swing.JScrollPane relaylistScrollPanel;
    private javax.swing.JTable relaylistTable;
    private javax.swing.JLabel relaylistTitleLabel;
    // End of variables declaration//GEN-END:variables
}
