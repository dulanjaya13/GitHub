/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dulanjaya Tennekoon
 */
public class Simulator extends javax.swing.JFrame {

    /**
     * Creates new form Simulator
     */
    private static Dispatcher dispatcher;
    private Job curJobRunning = null;
    private JTable jtb;
    private int clock = 0;

    public Simulator() {
        initComponents();
        initProcessor();
        jtb = jTable2;
        jtb.setModel(new AbsTableModel(dispatcher));
        initStartUpSettings();
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void initStartUpSettings() {
        this.setTitle("Highest Respond Ratio First Process Scheduler Simulator");
        this.setExtendedState(MAXIMIZED_BOTH);
        setPanelBorders();

    }

    public void initProcessor() {
        dispatcher = new AlgorithmHRRN();
        dispatcher.newJob(0, 2, "Job 1", 1);
        dispatcher.newJob(2, 6, "Job 2", 2);
        dispatcher.newJob(4, 4, "Job 3", 3);
        dispatcher.newJob(6, 5, "Job 4", 4);
        dispatcher.newJob(8, 2, "Job 5", 5);
        //dispatcher.newJob(5, 2, "Job 6", 6);
    }

    public void setPanelBorders() {
        pnlProcessor.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                pnlProcessor.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(90, 6, 213)));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                pnlProcessor.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, pnlProcessor.getBackground()));
            }
        });
        pnlSettings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                pnlSettings.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(90, 6, 213)));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                pnlSettings.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, pnlSettings.getBackground()));
            }
        });
        pnlData.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                pnlData.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(90, 6, 213)));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                pnlData.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, pnlData.getBackground()));
            }
        });
        pnlTeamInfo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                pnlTeamInfo.setBackground(new Color(102, 0, 204));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                pnlTeamInfo.setBackground(new Color(36, 0, 64));
            }
        });
        pnlGanttHead.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                pnlGanttHead.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(90, 6, 213)));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                pnlGanttHead.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, pnlGanttHead.getBackground()));
            }
        });
        pnlJobPool.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                pnlJobPool.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(90, 6, 213)));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                pnlJobPool.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, pnlJobPool.getBackground()));
            }
        });
        jtb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                pnlJobPool.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(90, 6, 213)));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                pnlJobPool.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, pnlJobPool.getBackground()));
            }
        });
        pnlProcIm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                pnlProcIm.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(90, 6, 213)));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                pnlProcIm.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(36,0,64)));
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelStartScreen1 = new simulator.JPanelStartScreen();
        pnlProcessor = new javax.swing.JPanel();
        lblProcessor = new javax.swing.JLabel();
        lblCurrentJob = new javax.swing.JLabel();
        lblCurrentJobD = new javax.swing.JLabel();
        lblProgress = new javax.swing.JLabel();
        pbProcessor = new javax.swing.JProgressBar();
        pnlJobPool = new javax.swing.JPanel();
        lblJobPool = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pnlSettings = new javax.swing.JPanel();
        lblControls = new javax.swing.JLabel();
        btnPowerOn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlData = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pnlGanttHead = new javax.swing.JPanel();
        lblGanttChart = new javax.swing.JLabel();
        ganttChart1 = new simulator.GanttChart();
        jLabel1 = new javax.swing.JLabel();
        pnlTeamInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlProcIm = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setUndecorated(true);
        setResizable(false);

        jPanelStartScreen1.setMaximumSize(new java.awt.Dimension(1000, 1000));

        pnlProcessor.setBackground(new java.awt.Color(201, 81, 2));
        pnlProcessor.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(201, 81, 2)));

        lblProcessor.setFont(new java.awt.Font("Tekton Pro", 1, 36)); // NOI18N
        lblProcessor.setForeground(new java.awt.Color(255, 255, 255));
        lblProcessor.setText("Processor");

        lblCurrentJob.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblCurrentJob.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentJob.setText("Current Job");

        lblCurrentJobD.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentJobD.setText("IDLE");

        lblProgress.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 14)); // NOI18N
        lblProgress.setForeground(new java.awt.Color(255, 255, 255));
        lblProgress.setText("Progress");

        javax.swing.GroupLayout pnlProcessorLayout = new javax.swing.GroupLayout(pnlProcessor);
        pnlProcessor.setLayout(pnlProcessorLayout);
        pnlProcessorLayout.setHorizontalGroup(
            pnlProcessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcessorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlProcessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurrentJob)
                    .addComponent(lblCurrentJobD))
                .addGap(18, 18, 18)
                .addGroup(pnlProcessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProgress))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProcessorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProcessor)
                .addGap(70, 70, 70))
        );
        pnlProcessorLayout.setVerticalGroup(
            pnlProcessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcessorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblProcessor)
                .addGap(18, 18, 18)
                .addGroup(pnlProcessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentJob)
                    .addComponent(lblProgress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProcessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurrentJobD)
                    .addComponent(pbProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pnlJobPool.setBackground(new java.awt.Color(0, 153, 0));
        pnlJobPool.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 0)));

        lblJobPool.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        lblJobPool.setForeground(new java.awt.Color(255, 255, 255));
        lblJobPool.setText("Job Pool");

        jScrollPane2.setBackground(new java.awt.Color(0, 153, 0));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        jTable2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTable2.setGridColor(new java.awt.Color(36, 0, 64));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout pnlJobPoolLayout = new javax.swing.GroupLayout(pnlJobPool);
        pnlJobPool.setLayout(pnlJobPoolLayout);
        pnlJobPoolLayout.setHorizontalGroup(
            pnlJobPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJobPoolLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlJobPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlJobPoolLayout.createSequentialGroup()
                        .addComponent(lblJobPool, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlJobPoolLayout.setVerticalGroup(
            pnlJobPoolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJobPoolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJobPool, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlSettings.setBackground(new java.awt.Color(1, 87, 217));
        pnlSettings.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(1, 87, 217)));

        lblControls.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        lblControls.setForeground(new java.awt.Color(255, 255, 255));
        lblControls.setText("Controls");

        btnPowerOn.setText("Power On");
        btnPowerOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerOnActionPerformed(evt);
            }
        });

        jButton1.setText("Create Job");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Power Off");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Start");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Step Forward");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSettingsLayout = new javax.swing.GroupLayout(pnlSettings);
        pnlSettings.setLayout(pnlSettingsLayout);
        pnlSettingsLayout.setHorizontalGroup(
            pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSettingsLayout.createSequentialGroup()
                        .addGroup(pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblControls)
                            .addComponent(btnPowerOn, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSettingsLayout.setVerticalGroup(
            pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPowerOn)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblControls)
                .addContainerGap())
        );

        pnlData.setBackground(new java.awt.Color(0, 153, 255));
        pnlData.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlDataLayout = new javax.swing.GroupLayout(pnlData);
        pnlData.setLayout(pnlDataLayout);
        pnlDataLayout.setHorizontalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDataLayout.setVerticalGroup(
            pnlDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlGanttHead.setBackground(new java.awt.Color(204, 6, 85));
        pnlGanttHead.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 6, 85)));

        lblGanttChart.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        lblGanttChart.setForeground(new java.awt.Color(255, 255, 255));
        lblGanttChart.setText("Gantt Chart");

        ganttChart1.setBackground(new java.awt.Color(204, 6, 85));

        javax.swing.GroupLayout ganttChart1Layout = new javax.swing.GroupLayout(ganttChart1);
        ganttChart1.setLayout(ganttChart1Layout);
        ganttChart1Layout.setHorizontalGroup(
            ganttChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );
        ganttChart1Layout.setVerticalGroup(
            ganttChart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlGanttHeadLayout = new javax.swing.GroupLayout(pnlGanttHead);
        pnlGanttHead.setLayout(pnlGanttHeadLayout);
        pnlGanttHeadLayout.setHorizontalGroup(
            pnlGanttHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGanttHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGanttHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGanttChart)
                    .addComponent(ganttChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGanttHeadLayout.setVerticalGroup(
            pnlGanttHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGanttHeadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ganttChart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGanttChart)
                .addGap(32, 32, 32))
        );

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Simulator");

        pnlTeamInfo.setBackground(new java.awt.Color(36, 0, 64));

        jLabel2.setFont(new java.awt.Font("Chaparral Pro", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Team");

        jLabel3.setFont(new java.awt.Font("Chaparral Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("16");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg_team - Copy.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlTeamInfoLayout = new javax.swing.GroupLayout(pnlTeamInfo);
        pnlTeamInfo.setLayout(pnlTeamInfoLayout);
        pnlTeamInfoLayout.setHorizontalGroup(
            pnlTeamInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeamInfoLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(pnlTeamInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(23, 23, 23))
        );
        pnlTeamInfoLayout.setVerticalGroup(
            pnlTeamInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTeamInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTeamInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTeamInfoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(47, 47, 47))
        );

        pnlProcIm.setBackground(new java.awt.Color(204, 0, 204));
        pnlProcIm.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(36, 0, 64)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ss-intel-ivy-bridge-processor.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlProcImLayout = new javax.swing.GroupLayout(pnlProcIm);
        pnlProcIm.setLayout(pnlProcImLayout);
        pnlProcImLayout.setHorizontalGroup(
            pnlProcImLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcImLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnlProcImLayout.setVerticalGroup(
            pnlProcImLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelStartScreen1Layout = new javax.swing.GroupLayout(jPanelStartScreen1);
        jPanelStartScreen1.setLayout(jPanelStartScreen1Layout);
        jPanelStartScreen1Layout.setHorizontalGroup(
            jPanelStartScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStartScreen1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanelStartScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelStartScreen1Layout.createSequentialGroup()
                        .addGroup(jPanelStartScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlProcessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelStartScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pnlData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlJobPool, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelStartScreen1Layout.createSequentialGroup()
                                .addComponent(pnlGanttHead, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pnlProcIm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelStartScreen1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(657, 657, 657)
                        .addComponent(pnlTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelStartScreen1Layout.setVerticalGroup(
            jPanelStartScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStartScreen1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelStartScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelStartScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlJobPool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProcessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelStartScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelStartScreen1Layout.createSequentialGroup()
                        .addComponent(pnlData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelStartScreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlGanttHead, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlProcIm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(281, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelStartScreen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelStartScreen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPowerOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerOnActionPerformed
        initProcessor();
        Timer pbStartSupport = new Timer(2, new ActionListener() {
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (i == 100) {
                    i = 0;
                    ((Timer) ae.getSource()).stop();
                    pbProcessor.setValue(0);
                }
                jtb.setModel(new AbsTableModel(dispatcher));
                ((AbstractTableModel) jtb.getModel()).fireTableDataChanged();
                jtb.repaint();
                i++;
                pbProcessor.setValue(i);
            }
        });
        pbStartSupport.start();
    }//GEN-LAST:event_btnPowerOnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        initProcessor();
        Timer pbStartSupport = new Timer(2, new ActionListener() {
            int i = 0;
            int clock = 0;

            @Override
            public void actionPerformed(ActionEvent ae) {
                if (i == 1002) {
                    i = 0;
                    System.out.println("Finish");
                }
                if (i % 100 == 0) {
                    i = 0;
                    clock++;
                    System.out.println("Clock : " + clock);
                    dispatcher.updateCPUTime(clock);
                    pbProcessor.setValue(0);
                    try {
                        Job job = dispatcher.getNextJob();
                        lblCurrentJobD.setText(job.getJobName());
                        if (curJobRunning != job || curJobRunning == null) {
                            curJobRunning = job;
                            ganttChart1.drawNextBar(true, job.getJobID());
                        } else {
                            ganttChart1.drawNextBar(false, job.getJobID());
                        }
                    } catch (Exception e) {
                        ((Timer) ae.getSource()).stop();
                    }
                }
                pbProcessor.setValue(i);
                i++;
                jtb.setModel(new AbsTableModel(dispatcher));
                jtb.repaint();
            }
        });
        pbStartSupport.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //initProcessor();

        try {
            clock++;
            System.out.println("xxxxxxclock : " + clock);
            dispatcher.updateCPUTime(clock);
            Job job = dispatcher.getNextJob();
            lblCurrentJobD.setText(job.getJobName());
            if (curJobRunning != job || curJobRunning == null) {
                curJobRunning = job;
                ganttChart1.drawNextBar(true, job.getJobID());
            } else {
                ganttChart1.drawNextBar(false, job.getJobID());
            }
            jtb.setModel(new AbsTableModel(dispatcher));
            jtb.repaint();
            Timer pbStartSupport = new Timer(2, new ActionListener() {
                int i = 0;

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (i == 100) {
                        i = 0;
                        ((Timer) ae.getSource()).stop();
                        pbProcessor.setValue(0);
                    }
                    //jtb.setModel(new AbsTableModel(dispatcher));
                    //((AbstractTableModel) jtb.getModel()).fireTableDataChanged();
                    //jtb.repaint();
                    i++;
                    pbProcessor.setValue(i);
                }

                
            });
            pbStartSupport.start ();
        } catch (NullPointerException e) {

        }

        //float i = ((AbsTableModel)jtb.getModel()).d.jobPool.get(0).getRes_ratio();
        //System.out.println("sdfsdfsf" + i);
    }//GEN-LAST:event_jButton4ActionPerformed

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
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPowerOn;
    private simulator.GanttChart ganttChart1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private simulator.JPanelStartScreen jPanelStartScreen1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblControls;
    private javax.swing.JLabel lblCurrentJob;
    private javax.swing.JLabel lblCurrentJobD;
    private javax.swing.JLabel lblGanttChart;
    private javax.swing.JLabel lblJobPool;
    private javax.swing.JLabel lblProcessor;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JProgressBar pbProcessor;
    private javax.swing.JPanel pnlData;
    private javax.swing.JPanel pnlGanttHead;
    private javax.swing.JPanel pnlJobPool;
    private javax.swing.JPanel pnlProcIm;
    private javax.swing.JPanel pnlProcessor;
    private javax.swing.JPanel pnlSettings;
    private javax.swing.JPanel pnlTeamInfo;
    // End of variables declaration//GEN-END:variables
}
