/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author man_chow
 */

package texttospeech;

import java.io.*;
import com.sun.speech.freetts.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class JFrame extends javax.swing.JFrame {

    private static final String VOICENAME = "kevin16";
    private static String[] RandChoice = new String[25];
    private static String Instructions;
    public static int[] flag = new int[26];
    public static int flagstart = 0;
    public static ArrayList<Integer> list = new ArrayList<Integer>();
    public static int OrderNumber = 0;
    //flag[0] = yes and no, every other flag is the case #
    public static boolean started = false;
    
//    public int secondsPassed = 0;
    
    public static String CaseOpenedMessage = "";
    public static String imageURL = "";
    
        public ImageIcon image;
        public JLabel label;
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        CASE_1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CASE_2 = new javax.swing.JButton();
        CASE_3 = new javax.swing.JButton();
        CASE_4 = new javax.swing.JButton();
        CASE_5 = new javax.swing.JButton();
        CASE_6 = new javax.swing.JButton();
        CASE_7 = new javax.swing.JButton();
        CASE_8 = new javax.swing.JButton();
        CASE_9 = new javax.swing.JButton();
        CASE_10 = new javax.swing.JButton();
        CASE_11 = new javax.swing.JButton();
        CASE_12 = new javax.swing.JButton();
        CASE_13 = new javax.swing.JButton();
        CASE_14 = new javax.swing.JButton();
        CASE_15 = new javax.swing.JButton();
        CASE_16 = new javax.swing.JButton();
        CASE_17 = new javax.swing.JButton();
        CASE_18 = new javax.swing.JButton();
        CASE_19 = new javax.swing.JButton();
        CASE_20 = new javax.swing.JButton();
        CASE_21 = new javax.swing.JButton();
        CASE_22 = new javax.swing.JButton();
        CASE_23 = new javax.swing.JButton();
        CASE_24 = new javax.swing.JButton();
        YES = new javax.swing.JButton();
        NO = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CaseOpenedTextArea = new javax.swing.JTextArea();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        CASE_1.setText("CASE 1");
        CASE_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_1ActionPerformed(evt);
            }
        });

        jLabel1.setText("SO YOU WANT TO PLAY A GAME?");

        CASE_2.setText("CASE 2");
        CASE_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_2ActionPerformed(evt);
            }
        });

        CASE_3.setText("CASE 3");
        CASE_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_3ActionPerformed(evt);
            }
        });

        CASE_4.setText("CASE 4");
        CASE_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_4ActionPerformed(evt);
            }
        });

        CASE_5.setText("CASE 5");
        CASE_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_5ActionPerformed(evt);
            }
        });

        CASE_6.setText("CASE 6");
        CASE_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_6ActionPerformed(evt);
            }
        });

        CASE_7.setText("CASE 7");
        CASE_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_7ActionPerformed(evt);
            }
        });

        CASE_8.setText("CASE 8");
        CASE_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_8ActionPerformed(evt);
            }
        });

        CASE_9.setText("CASE 9");
        CASE_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_9ActionPerformed(evt);
            }
        });

        CASE_10.setText("CASE 10");
        CASE_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_10ActionPerformed(evt);
            }
        });

        CASE_11.setText("CASE 11");
        CASE_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_11ActionPerformed(evt);
            }
        });

        CASE_12.setText("CASE 12");
        CASE_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_12ActionPerformed(evt);
            }
        });

        CASE_13.setText("CASE 13");
        CASE_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_13ActionPerformed(evt);
            }
        });

        CASE_14.setText("CASE 14");
        CASE_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_14ActionPerformed(evt);
            }
        });

        CASE_15.setText("CASE 15");
        CASE_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_15ActionPerformed(evt);
            }
        });

        CASE_16.setText("CASE 16");
        CASE_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_16ActionPerformed(evt);
            }
        });

        CASE_17.setText("CASE 17");
        CASE_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_17ActionPerformed(evt);
            }
        });

        CASE_18.setText("CASE 18");
        CASE_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_18ActionPerformed(evt);
            }
        });

        CASE_19.setText("CASE 19");
        CASE_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_19ActionPerformed(evt);
            }
        });

        CASE_20.setText("CASE 20");
        CASE_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_20ActionPerformed(evt);
            }
        });

        CASE_21.setText("CASE 21");
        CASE_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_21ActionPerformed(evt);
            }
        });

        CASE_22.setText("CASE 22");
        CASE_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_22ActionPerformed(evt);
            }
        });

        CASE_23.setText("CASE 23");
        CASE_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_23ActionPerformed(evt);
            }
        });

        CASE_24.setText("CASE 24");
        CASE_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CASE_24ActionPerformed(evt);
            }
        });

        YES.setText("YES");
        YES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YESActionPerformed(evt);
            }
        });

        NO.setText("NO");
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });

        CaseOpenedTextArea.setColumns(20);
        CaseOpenedTextArea.setRows(5);
        jScrollPane2.setViewportView(CaseOpenedTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CASE_19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CASE_7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CASE_1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CASE_13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CASE_2)
                            .addComponent(CASE_8)
                            .addComponent(CASE_14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CASE_20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CASE_3)
                            .addComponent(CASE_9)
                            .addComponent(CASE_15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CASE_21, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CASE_10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CASE_4)
                            .addComponent(CASE_16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CASE_22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CASE_5)
                            .addComponent(CASE_11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CASE_17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CASE_23, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CASE_6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CASE_12)
                            .addComponent(CASE_18)
                            .addComponent(CASE_24)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(YES)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NO))
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CASE_1, CASE_10, CASE_11, CASE_12, CASE_13, CASE_14, CASE_15, CASE_16, CASE_17, CASE_18, CASE_19, CASE_2, CASE_20, CASE_21, CASE_22, CASE_23, CASE_24, CASE_3, CASE_4, CASE_5, CASE_6, CASE_7, CASE_8, CASE_9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NO)
                    .addComponent(YES))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CASE_1)
                    .addComponent(CASE_2)
                    .addComponent(CASE_3)
                    .addComponent(CASE_4)
                    .addComponent(CASE_5)
                    .addComponent(CASE_6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CASE_7)
                    .addComponent(CASE_8)
                    .addComponent(CASE_9)
                    .addComponent(CASE_10)
                    .addComponent(CASE_11)
                    .addComponent(CASE_12))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CASE_13)
                    .addComponent(CASE_14)
                    .addComponent(CASE_15)
                    .addComponent(CASE_16)
                    .addComponent(CASE_17)
                    .addComponent(CASE_18))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CASE_19)
                    .addComponent(CASE_20)
                    .addComponent(CASE_21)
                    .addComponent(CASE_22)
                    .addComponent(CASE_23)
                    .addComponent(CASE_24))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CASE_1, CASE_10, CASE_11, CASE_12, CASE_13, CASE_14, CASE_15, CASE_16, CASE_17, CASE_18, CASE_19, CASE_2, CASE_20, CASE_21, CASE_22, CASE_23, CASE_24, CASE_3, CASE_4, CASE_5, CASE_6, CASE_7, CASE_8, CASE_9});

        pack();
    }// </editor-fold>                        

    public static void populateStringArray()
    {
        RandChoice[0] = "YOU FOUND THE GOLDEN TURD! CONGRATULATIONS! \n\nHERE'S YOUR AWARD.";
        RandChoice[1] = "DON'T TRY TO FIND MEANING AND JOY OUT OF THIS GAME. \n\nI DIDNT.\n" +
                        "\nbut since you're here, quick fact.\n\n 2 + 2 = 1 + 1 + 1 + 1.";
        RandChoice[2] = "HELP ME PASS THIS CLASS ALREADY AND FINISH THE GAME MAN!";
        RandChoice[3] = "YOU FOUND THE GOLDEN TURD! \n\nCONGRADULATIONS!\n\n That was a lie, here are your tears.";
        RandChoice[4] = "The golden turd represents this game.\n\nThis really is a badly designed game. But by wasting your time it shines up my day like gold just thinking about it.\n"
                        + "\nhahhhahahahahahahahhahahahahhahahahahahahahahahaaha.";
        RandChoice[5] = "Ya know. \n\nIf you ever have trouble sleeping, just hold your breath till you pass out.\n\nSeriously though, don't try that please.";
        RandChoice[6] = "Congradulations!\n\n You found the SILVER TURD!";
        RandChoice[7] = "Did you know that i always finish my java assignments minutes before it's due?\n\n Its like dancing with ";
        RandChoice[8] = "I was suppose to put models behind the case buttons like deal or no deal.\n\n but i'm running out of time i hope this will do for you.";
        RandChoice[9] = "A man woke up in a hospital after a serious accident.\n\n He shouted\n\n Doctor, doctor, i can't feel my legs!\n\n The doctor replied\n\n"
                        + "I know you can't I've cut off your arms!";
        RandChoice[10] = "If you're watching this, you're probably inside the math building.\n\n Its always freezing in the math building.";
        RandChoice[11] = "You should watch game of thrones instead of playing this game.\n\nReally go watch a full season first and then come back.\n\nYou'll feel like you got slapped for playing this game instead.";
        RandChoice[12] = "You just had to open all these cases huh?\n\n Every case you open, a college student fails their exam.\n\nyou happy now?";
        RandChoice[13] = "Remember to keep hydrated if you want to live.";
        RandChoice[14] = "The moral of this story is everything is up to chances.";
        RandChoice[15] = "One of the best ways to finish this game faster is to just quit the game. Really.";
        RandChoice[16] = "Remember to always bee nice to people. \n\n it's nicer that way.";
        RandChoice[17] = "Don't be sad if you can't finish the game. Just keep watching my gifs";
        RandChoice[18] = "Error. Error. Error. This Case is bugged.";
        RandChoice[19] = "If you got the Error case, just know that i don't make mistakes.";
        RandChoice[20] = "Bush did 9/11. \n\nConfirmed.\n\n I kid I kid.";
        RandChoice[21] = "Never gonna give you up\n" +
                        "Never gonna let you down\n" +
                        "Never gonna run around and desert you\n" +
                        "Never gonna make you cry\n" +
                        "Never gonna say goodbye\n" +
                        "Never gonna tell a lie and hurt you.\n";
        RandChoice[22] = "My friend thinks he is smart.\n\nHe told me an onion is the only food that makes you cry, so I threw a coconut at his face.";
        RandChoice[23] = "Shoutout to all the programmers out there who's going to make bank once we get our degree.";
                
    }
 
       public class ImagePopUp extends javax.swing.JFrame 
    {
    
        ImagePopUp()
        {
            setLayout(new FlowLayout());

            image = new ImageIcon(getClass().getResource(imageURL));
            
            label = new JLabel(image);
            add(label);
            
//            ImagePopUp gui = new ImagePopUp(URL);
//            gui.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
//            gui.setVisible(true);
//            gui.pack();
        }
    }
    
        public void ImageInputToCase(int caseNumber)
        {
//            String imageURL = "";
            
            if(list.get(caseNumber) == 0)//#3
            {
                imageURL = "Golden-Turd-Award1.jpg";

            }
            
            if(list.get(caseNumber) == 1)//#3
            {
                imageURL = "nice_reaction.gif";
 
            }
            
            else if(list.get(caseNumber) == 2)//#3
            {
                imageURL = "damnit.gif";

            }
            
            else if(list.get(caseNumber) == 3)//#3
            {
                imageURL = "i_cri.gif";

            }
                       
            else if(list.get(caseNumber) == 4)//#3
            {
                imageURL = "oprah_laugh.gif";
            
            }
            
            else if(list.get(caseNumber) == 5)//#3
            {
                imageURL = "sleep.gif";
         
            }
            
            else if(list.get(caseNumber) == 6)//#3
            {
                imageURL = "silver_turd.gif";
              
            }
            
            else if(list.get(caseNumber) == 7)//#3
            {
                imageURL = "dance.gif";
            
            }
            
            else if(list.get(caseNumber) == 8)//#3
            {
                imageURL = "zoolander.gif";
            
            }
            
            else if(list.get(caseNumber) == 9)//#3
            {
                imageURL = "doctor.gif";
            
            }
            
            else if(list.get(caseNumber) == 10)//#3
            {
                imageURL = "freezing.gif";
            
            }
            
            else if(list.get(caseNumber) == 11)
            {
                imageURL = "gameofthrones.gif";
            }  
             
            else if(list.get(caseNumber) == 12)//#3
            {
                imageURL = "failing.gif";
           
            }
            
            else if(list.get(caseNumber) == 13)//#3
            {
                imageURL = "hydration.gif";
       
            }
            
            else if(list.get(caseNumber) == 14)//#3
            {
                imageURL = "good_luck.gif";
             
            }
            
            else if(list.get(caseNumber) == 15)//#3
            {
                imageURL = "quit.gif";
          
            }
            
            else if(list.get(caseNumber) == 16)//#3
            {
                imageURL = "nice.gif";
    
            }
            
            else if(list.get(caseNumber) == 17)//#3
            {
                imageURL = "gifgif.gif";

            }
            
            else if(list.get(caseNumber) == 19)//#3
            {
                imageURL = "wink.gif";

            }
            
            else if(list.get(caseNumber) == 20)//#3
            {
                imageURL = "bush.gif";

            }
            
            else if(list.get(caseNumber) == 21)//#3
            {
                imageURL = "rick.gif";

            }
            
            else if(list.get(caseNumber) == 22)//#3
            {
                imageURL = "coconut.gif";

            }
            
            else if(list.get(caseNumber) == 23)//#3
            {
                imageURL = "bank.gif";

            }
              
                ImagePopUp gui = new ImagePopUp();
                //gui.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                gui.setVisible(true);
                gui.pack();

            imageURL = "";
           
        }
        
//        public void imagepopsetup(String imageURL)
//        {
//            image
//        }
    
    
    public void CaseAction(int caseNumber, int flagNumber)
    {
         if(started)
        {
            if(flag[flagNumber] == 0)
            {
            CaseMatchingToText(caseNumber);
            
            flag[flagNumber] = 1;
            
            ImageInputToCase(caseNumber);
            
            CaseOpenedMessage = "Case " + (caseNumber + 1) + " Opened.\n" + CaseOpenedMessage;
            CaseOpenedTextArea.setText(CaseOpenedMessage);
            }
            else
            {
                Instructions = "You already opened this case. You're wasting time trying to see if i programmed correctly!\nJUST GIVEME THAT A.";
            }
        }
        else
        {
            Instructions = "You didn't start the game yet mate.\n";  
        }
        TextArea.setText(Instructions);
        textToSpeech();
    }  
    

    
    public void CaseMatchingToText(int caseNumber)
    {
        Instructions = RandChoice[list.get(caseNumber)];
        
        //What this does is set the instruction to the case by their case number
        //the instruction is randomized throught the list
        //pretty neat huh
    }
    
    
    public static void setFlagsToZeroAndRandNum()
    {
        for(int i=0; i < flag.length; i++)
        {
            flag[i] = 0;
        }
        
        for (int i=0; i<24; i++) 
        {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        
        for (int i=0; i<24; i++) 
        {
            System.out.println(list.get(i) + "   Case #" + (i + 1));
        }
    }
    
    public static void setInstructions()
    {
        Instructions = "You must comeplete the game as fast as you can by finding "
                + "the golden turd by opening the cases. \nThe Game has already started. \nYou cannot open another case untill you finish the case you opened before. \n"
                + "May the odds ever be in your favor.";
    
    }
    

    public void textToSpeech()
    {
        Voice voice;
        VoiceManager vm =VoiceManager.getInstance();
        voice =vm.getVoice(VOICENAME);
        
        voice.allocate();
        
        try
        {
            voice.speak(TextArea.getText());
        }
        catch(Exception e)
        {
            
        }
    }
    
    private void CASE_1ActionPerformed(java.awt.event.ActionEvent evt) {                                       

            CaseAction(0, 0);

    }                                      

    private void CASE_6ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        CaseAction(5, 5);
    }                                      

    private void CASE_11ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(10, 10);
    }                                       

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        if(flagstart == 0)
        {
            setInstructions();
            Instructions = "Too bad, you're still going to have to play. That's life now listen.\n" + Instructions;
            flagstart = 1;
            started = true;
//            timer.start();
        }
        else 
        {
            Instructions = "You already started the game mate. FINISH IT.\n";
        }
        TextArea.setText(Instructions);
        textToSpeech();
    }                                  

    private void YESActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(flagstart == 0)
        {
            flagstart = 1;
            started = true;
            setInstructions();
//            timer.start();
        }
        else 
        {
            Instructions = "You already started the game mate. FINISH IT.\n";
        }
        TextArea.setText(Instructions);
        textToSpeech();
    }                                   

    private void CASE_2ActionPerformed(java.awt.event.ActionEvent evt) {                                       

            // TODO add your handling code here:
            CaseAction(1, 1);
    }                                      

    private void CASE_3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
 
            CaseAction(2, 2);
  
        
    }                                      

    private void CASE_4ActionPerformed(java.awt.event.ActionEvent evt) {                                       

            CaseAction(3, 3);

        
    }                                      

    private void CASE_5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
            CaseAction(4, 4);

    }                                      

    private void CASE_7ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        CaseAction(6, 6);
    }                                      

    private void CASE_8ActionPerformed(java.awt.event.ActionEvent evt) {                                       
       CaseAction(7, 7);
    }                                      

    private void CASE_9ActionPerformed(java.awt.event.ActionEvent evt) {                                       
       CaseAction(8, 8);
    }                                      

    private void CASE_10ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(9, 9);
    }                                       

    private void CASE_12ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(11, 11);
    }                                       

    private void CASE_13ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       CaseAction(12, 12);
    }                                       

    private void CASE_14ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(13, 13);
    }                                       

    private void CASE_15ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(14, 14);
    }                                       

    private void CASE_16ActionPerformed(java.awt.event.ActionEvent evt) {                                        
      CaseAction(15, 15);
    }                                       

    private void CASE_17ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(16, 16);
    }                                       

    private void CASE_18ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(17, 17);
    }                                       

    private void CASE_19ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       CaseAction(18, 18);
    }                                       

    private void CASE_20ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(19, 19);
    }                                       

    private void CASE_21ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(20, 20);
    }                                       

    private void CASE_22ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(21, 21);
    }                                       

    private void CASE_23ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CaseAction(22, 22);
    }                                       

    private void CASE_24ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       CaseAction(23, 23);
    }                                       

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                setInstructions();
                setFlagsToZeroAndRandNum();
                populateStringArray();
                
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CASE_1;
    private javax.swing.JButton CASE_10;
    private javax.swing.JButton CASE_11;
    private javax.swing.JButton CASE_12;
    private javax.swing.JButton CASE_13;
    private javax.swing.JButton CASE_14;
    private javax.swing.JButton CASE_15;
    private javax.swing.JButton CASE_16;
    private javax.swing.JButton CASE_17;
    private javax.swing.JButton CASE_18;
    private javax.swing.JButton CASE_19;
    private javax.swing.JButton CASE_2;
    private javax.swing.JButton CASE_20;
    private javax.swing.JButton CASE_21;
    private javax.swing.JButton CASE_22;
    private javax.swing.JButton CASE_23;
    private javax.swing.JButton CASE_24;
    private javax.swing.JButton CASE_3;
    private javax.swing.JButton CASE_4;
    private javax.swing.JButton CASE_5;
    private javax.swing.JButton CASE_6;
    private javax.swing.JButton CASE_7;
    private javax.swing.JButton CASE_8;
    private javax.swing.JButton CASE_9;
    private javax.swing.JTextArea CaseOpenedTextArea;
    private javax.swing.JButton NO;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton YES;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration                   
}
