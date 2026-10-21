package com.finalshell.ui.dialog;

import com.finalshell.core.CH;
import com.finalshell.core.Fl4;
import com.finalshell.core.UpdateManifestLegacy;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Au2;
import com.finalshell.task.K4;
import com.finalshell.task.YD;
import com.finalshell.task.Zy2;
import com.finalshell.ui.frame.UpdateFrame;
import com.finalshell.ui.listener.OX3;
import com.finalshell.ui.listener.Ux4;
import com.finalshell.ui.listener.ZE;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import net.miginfocom.swing.MigLayout;

public class UpdateDialog extends JDialog implements CH {
   public Fl4 g;
   public JTextArea I;
   public boolean C;
   public JButton G;
   public JButton i;
   public JButton F;
   public JTextArea h;
   public JScrollPane O;
   public boolean L;
   public final int a;
   public boolean d;
   public boolean p;
   public long D;
   public static String[] b;
   public static String[] c;
   public static String[] e;
   public static long[] f;
   public static Integer[] j;
   public static long k;

   public UpdateDialog(JFrame var1, Fl4 var2) {
   super();
   boolean var63;
   boolean var64;
   long var9;
      label63: {
         y();
         Registry.lookupField(356414783958618676L).setBoolean(this, false);
         Registry.lookupField(557137373509279378L).setBoolean(this, true);
         this.a = a(30823, 5309129010538402951L);
         Registry.lookupField(131753499707603434L).setBoolean(this, false);
         Registry.lookupField(509757470572563007L).setBoolean(this, false);
         long var10001 = k;
         Registry.lookupField(633275544900052147L).setLong(this, var10001);
         this.setDefaultCloseOperation(0);
         this.setTitle(a(25129, 11465));
         long var7 = 354794456661762655L;
         Ref.s(354794456661762655L, var2, var7);
         JPanel var4 = (JPanel)this.getContentPane();
         var4.setLayout(new MigLayout(a(25139, 14069), "", ""));
         JTextArea var10003 = new JTextArea();
         var9 = 246965589172664073L;
         JTextArea var8 = var10003;
         Ref.s(246965589172664073L, var8, var9);
         Object var10 = 246965589172664073L;
         ((JTextArea)Ref.g(246965589172664073L, var10)).setOpaque(false);
         Object var12 = 246965589172664073L;
         ((JTextArea)Ref.g(246965589172664073L, var12)).setEditable(false);
         Object var14 = 246965589172664073L;
         ((JTextArea)Ref.g(246965589172664073L, var14)).setRows(2);
         Object var16 = 246965589172664073L;
         this.add((JTextArea)Ref.g(246965589172664073L, var16), a(25147, -25713));
         JPanel var5 = new JPanel();
         var5.setLayout(new MigLayout(a(25146, 1422), "", a(25149, -1854)));
         var4.add(var5, a(25141, -29311));
         JButton var10008 = new JButton(a(25143, 19346));
         long var19 = 431024753703482543L;
         JButton var18 = var10008;
         Ref.s(431024753703482543L, var18, var19);
         Object var20 = 431024753703482543L;
         ((JButton)Ref.g(431024753703482543L, var20)).addActionListener(new ZE(this));
         Object var22 = 431024753703482543L;
         this.add((JButton)Ref.g(431024753703482543L, var22), a(25138, 12476));
         JButton var10010 = new JButton(a(25128, 12849));
         long var25 = 484654819353749686L;
         JButton var24 = var10010;
         Ref.s(484654819353749686L, var24, var25);
         Object var26 = 484654819353749686L;
         ((JButton)Ref.g(484654819353749686L, var26)).addActionListener(new Ux4(this, var2));
         Object var28 = 484654819353749686L;
         this.add((JButton)Ref.g(484654819353749686L, var28), a(25150, -12310));
         JButton var10013 = new JButton(a(25140, 10324));
         long var31 = 497567577586291331L;
         JButton var30 = var10013;
         Ref.s(497567577586291331L, var30, var31);
         Object var32 = 497567577586291331L;
         ((JButton)Ref.g(497567577586291331L, var32)).addActionListener(new OX3(this, var2));
         Object var34 = 497567577586291331L;
         this.add((JButton)Ref.g(497567577586291331L, var34), a(25150, -12310));
         if (this == null) {
            Registry.emptyArgs();
            long var36 = 561847341732101275L;
            Object var10016 = Ref.h2(561847341732101275L, var36);

            try {
               var63 = (Boolean)var10016;
            } catch (InvocationTargetException var62) {
               throw var62.getTargetException();
            }

            if (!var63) {
               Registry.emptyArgs();
               long var38 = 454647487873911743L;
               Object var10017 = Ref.h2(454647487873911743L, var38);

               try {
                  var64 = (Boolean)var10017;
               } catch (InvocationTargetException var61) {
                  throw var61.getTargetException();
               }

               if (!var64) {
                  break label63;
               }
            }

            JTextArea var65 = new JTextArea();
            long var41 = 209593506021318868L;
            JTextArea var40 = var65;
            Ref.s(209593506021318868L, var40, var41);
            JScrollPane var10019;
            Object var42 = 209593506021318868L;
            // [VF-super] super((JTextArea)Ref.g(209593506021318868L, var42));
            long var45 = 160285884699057566L;
            JScrollPane var44 = var10019;
            Ref.s(160285884699057566L, var44, var45);
            Object var46 = 160285884699057566L;
            ((JScrollPane)Ref.g(160285884699057566L, var46)).setBorder(BorderFactory.createTitledBorder(a(25142, 10458)));
         }

         Object var48 = 160285884699057566L;
         this.add((JScrollPane)Ref.g(160285884699057566L, var48), a(25145, -31820));
      }

      Object[] var66 = Registry.emptyArgs();
      long var51 = 448870905616495851L;
      Object[] var50 = var66;
      Ref.h(448870905616495851L, var50, var51);

      try {
         ;
      } catch (InvocationTargetException var60) {
         throw var60.getTargetException();
      }

      this.pack();
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10018 = Registry.packArgs(new Zy2(this));
      long var53 = 434592463220957006L;
      Object[] var52 = var10018;
      Ref.h(434592463220957006L, var52, var53);

      try {
         ;
      } catch (InvocationTargetException var59) {
         throw var59.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var67 = Registry.packArgs(new K4(this), a(4061, 7262940743782900543L));
      long var55 = 201859364639460244L;
      Object[] var54 = var67;
      Ref.h(201859364639460244L, var54, var55);
      Object[] var10020 = Registry.packArgs("");
      long var57 = 585355110671849242L;
      Object[] var56 = var10020;
      Ref.h(585355110671849242L, var56, var57);

      try {
         ;
      } catch (InvocationTargetException var58) {
         throw var58.getTargetException();
      }

      if (this != null) {
         Ky4.K(new String[4]);
      }
   }

   @Override
   public void d(String var1) {
      SwingUtilities.invokeLater(new Au2(this, var1));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void I(JTextArea var1) {
      BadLocationException var10;
      int var9;
      String[] var10000 = y();
      int var3 = var1.getLineCount() - a(11841, 8627037662698472096L);
      String[] var2 = var10000;

      label30: {
         label29: {
            try {
               var9 = var3;
               if (var2 != null) {
                  break label29;
               }

               if (var3 <= 0) {
                  return;
               }
            } catch (BadLocationException var7) {
               throw a(var7);
            }

            try {
               var9 = var1.getLineEndOffset(var3 - 1);
            } catch (BadLocationException var6) {
               var10 = var6;
               boolean var10001 = false;
               break label30;
            }
         }

         try {
            int var8 = var9;
            var1.replaceRange("", 0, var8);
            return;
         } catch (BadLocationException var5) {
            var10 = var5;
            boolean var11 = false;
         }
      }

      BadLocationException var4 = var10;
      var4.printStackTrace();
   }

   public void N(String var1) {
      long var9;
      y();
      Object var4 = 209593506021318868L;
      ((JTextArea)Ref.g(209593506021318868L, var4)).append(var1);
      Object var6 = 209593506021318868L;
      Object[] var10004 = Registry.packArgs(Ref.g(209593506021318868L, var6));
      var9 = 584802178139769689L;
      Object[] var8 = var10004;
      Ref.h(584802178139769689L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      if (this != null || Registry.lookupField(557137373509279378L).getBoolean(this)) {
         Object var10 = 160285884699057566L;
         JScrollBar var3 = ((JScrollPane)Ref.g(160285884699057566L, var10)).getVerticalScrollBar();
         var3.setValue(var3.getMaximum());
      }
   }

   public void C() {
      Object[] var10;
      String[] var1 = y();
      long var16;
      Object var10000 = (var16 = System.currentTimeMillis() - Registry.lookupField(633275544900052147L).getLong(this)) == 0L ? 0 : (var16 < 0L ? -1 : 1);
      if (var1 == null) {
         if (!(var10000 > 0)) {
            return;
         }

         var10000 = Registry.emptyArgs();
         long var2 = 561847341732101275L;
         Object var10001 = Ref.h2(561847341732101275L, var2);

         try {
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }
      }

      if (var10000 == null) {
         Object var4 = 354794456661762655L;
         Ref.g(354794456661762655L, var4);
         Object[] var10002 = Registry.emptyArgs();
         long var7 = 119751058421524022L;
         Object[] var6 = var10002;
         Ref.h(119751058421524022L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         if (var1 == null) {
            return;
         }
      }

      Object var8 = 354794456661762655L;
      Ref.g(354794456661762655L, var8);
      Object[] var15 = Registry.emptyArgs();
      long var11 = 119751058421524022L;
      var10 = var15;
      Ref.h(119751058421524022L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   @Override
   public void setVisible(boolean var1) {
      UpdateDialog var9;
      String[] var10000 = y();
      Object var3 = this.isVisible();
      super.setVisible((boolean)var1);
      String[] var2 = var10000;
      var9 = (UpdateDialog)var1;
      if (var2 == null) {
         if (var1 != false) {
            Registry.lookupField(356414783958618676L).setBoolean(this, true);
            this.toFront();
            this.requestFocus();
         }

         var9 = (UpdateDialog)var3;
      }

      if (var2 == null) {
         if (var9 == null) {
            return;
         }

         var9 = (UpdateDialog)var1;
      }

      if (var2 == null) {
         if (var9 == null) {
            return;
         }

         var9 = this;
         Object var4 = 484654819353749686L;
         ((JButton)Ref.g(484654819353749686L, var4)).isEnabled();
      }

      if (var9 == null) {
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10001 = Registry.packArgs(new YD(this));
         long var7 = 434592463220957006L;
         Object[] var6 = var10001;
         Ref.h(434592463220957006L, var6, var7);

         try {
            ;
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }
      }
   }

   public void N() {
      boolean var176;
      boolean var194;
      boolean var198;
      boolean var202;
      Long var205;
      boolean var216;
      boolean var219;
      boolean var222;
      Long var224;
      long var63;
      long var9;
      y();
      String var2 = a(25131, 20027);
      Object var6 = 354794456661762655L;
      Ref.g(354794456661762655L, var6);
      UpdateManifestLegacy var10003 = (UpdateManifestLegacy)(Registry.emptyArgs());
      var9 = 187528749319748416L;
      Object var8 = var10003;
      var10003 = Ref.h(187528749319748416L, var8, var9);

      try {
         var10003 = (UpdateManifestLegacy)var10003;
      } catch (InvocationTargetException var160) {
         throw var160.getTargetException();
      }

      UpdateManifestLegacy var3 = var10003;
      Object var10 = 354794456661762655L;
      Object var10004 = Ref.g(354794456661762655L, var10);
      String var10005 = (String)(Registry.emptyArgs());
      long var13 = 384899068105386845L;
      Object var12 = var10005;
      var10005 = Ref.h(384899068105386845L, var12, var13);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var159) {
         throw var159.getTargetException();
      }

      String var4 = var10005;
      Object var1 = var10004;
      if (var3 != null) {
         Object var14 = 354794456661762655L;
         Ref.g(354794456661762655L, var14);
         Boolean var10006 = (Boolean)(Registry.emptyArgs());
         long var17 = 262117569331123961L;
         Object var16 = var10006;
         var10006 = Ref.h(262117569331123961L, var16, var17);

         try {
            var10006 = (Boolean)var10006;
         } catch (InvocationTargetException var158) {
            throw var158.getTargetException();
         }

         label475: {
            if (var1 == null) {
               if (var10006 == null) {
                  var2 = a(25137, 10635);
                  if (var1 == null) {
                     break label475;
                  }
               }

               var10006 = this;
               Object var18 = 354794456661762655L;
               Ref.g(354794456661762655L, var18);
               Object[] var10008 = Registry.emptyArgs();
               long var21 = 478235290671807435L;
               Object[] var20 = var10008;
               var10008 = Ref.h(478235290671807435L, var20, var21);

               try {
               } catch (InvocationTargetException var157) {
                  throw var157.getTargetException();
               }
            }

            if (var1 == null) {
               if (var10006 == null) {
                  break label475;
               }

               var10006 = this;
               Object var22 = 354794456661762655L;
               Ref.g(354794456661762655L, var22);
               Object[] var169 = Registry.emptyArgs();
               long var25 = 494928284843292484L;
               Object[] var24 = var169;
               var169 = Ref.h(494928284843292484L, var24, var25);

               try {
               } catch (InvocationTargetException var156) {
                  throw var156.getTargetException();
               }
            }

            if (var1 == null) {
               if (var10006 == null) {
                  if (var3 != null) {
                     new StringBuilder().append(a(25148, -15329));
                     String var171 = (String)(Registry.emptyArgs());
                     long var27 = 226996047220245423L;
                     Object var26 = var171;
                     var171 = Ref.h(226996047220245423L, var26, var27);

                     try {
                        var171 = (String)var171;
                     } catch (InvocationTargetException var155) {
                        throw var155.getTargetException();
                     }

                     var2 = var3.append((String)var171).append("\n").toString();
                  }

                  Object var28 = 354794456661762655L;
                  Ref.g(354794456661762655L, var28);
                  Object var174 = Registry.emptyArgs();
                  long var31 = 529735557312904033L;
                  Object var30 = var174;
                  var174 = Ref.h(529735557312904033L, var30, var31);

                  try {
                     var176 = (Boolean)var174;
                  } catch (InvocationTargetException var154) {
                     throw var154.getTargetException();
                  }

                  if (var1 == null) {
                     if (var176) {
                        new StringBuilder().append(var2).append(a(25136, -7869));
                        Object var32 = 354794456661762655L;
                        Object var10010 = Ref.g(354794456661762655L, var32);
                        String var10011 = (String)(Registry.emptyArgs());
                        long var35 = 183894823848696366L;
                        Object var34 = var10011;
                        var10011 = Ref.h(183894823848696366L, var34, var35);

                        try {
                           var10011 = (String)var10011;
                        } catch (InvocationTargetException var153) {
                           throw var153.getTargetException();
                        }

                        var10010.append((String)var10011).append(" ");
                        Object var36 = 354794456661762655L;
                        Ref.g(354794456661762655L, var36);
                        Object var10013 = Registry.emptyArgs();
                        long var39 = 510595481607148382L;
                        Object var38 = var10013;
                        var10013 = Ref.h(510595481607148382L, var38, var39);

                        try {
                           var205 = (Long)var10013;
                        } catch (InvocationTargetException var152) {
                           throw var152.getTargetException();
                        }

                        var10013 = Registry.e(var205);
                        long var40 = 408529162510360196L;
                        Object var10014 = Ref.h2(408529162510360196L, var40);

                        try {
                           var10014 = (String)var10014;
                        } catch (InvocationTargetException var151) {
                           throw var151.getTargetException();
                        }

                        var10013.append((String)var10014).append("/");
                        Object var42 = 354794456661762655L;
                        Ref.g(354794456661762655L, var42);
                        Object var10016 = Registry.emptyArgs();
                        long var45 = 295779105922796909L;
                        Object var44 = var10016;
                        var10016 = Ref.h(295779105922796909L, var44, var45);

                        try {
                           var224 = (Long)var10016;
                        } catch (InvocationTargetException var150) {
                           throw var150.getTargetException();
                        }

                        var10016 = Registry.e(var224);
                        long var46 = 408529162510360196L;
                        Object var10017 = Ref.h2(408529162510360196L, var46);

                        try {
                           var10017 = (String)var10017;
                        } catch (InvocationTargetException var149) {
                           throw var149.getTargetException();
                        }

                        var2 = var10016.append((String)var10017).toString();
                     }

                     var176 = Registry.lookupField(356414783958618676L).getBoolean(this);
                  }

                  if (var1 == null) {
                     if (var176) {
                        break label475;
                     }

                     this.setLocationRelativeTo(null);
                     var176 = false;
                  }

                  label482: {
                     boolean var5 = var176;
                     UpdateFrame var177 = (UpdateFrame)Registry.lookupField(529321737223656579L).get(null);
                     if (var1 == null) {
                        if (var177 == null) {
                           var5 = true;
                           if (var1 == null) {
                              break label482;
                           }
                        }

                        var177 = (UpdateFrame)Registry.lookupField(529321737223656579L).get(null);
                     }

                     boolean var178 = var177.isVisible();
                     if (var1 == null) {
                        if (!var178) {
                           var5 = true;
                        }

                        var178 = var5;
                     }

                     if (var178) {
                        Object[] var10009 = Registry.packArgs(true);
                        long var49 = 351503280654568600L;
                        Object[] var48 = var10009;
                        Ref.h(351503280654568600L, var48, var49);

                        try {
                           ;
                        } catch (InvocationTargetException var148) {
                           throw var148.getTargetException();
                        }
                     }
                  }

                  if (var1 == null) {
                     break label475;
                  }
               }

               var10006 = this;
               Object var50 = 354794456661762655L;
               Ref.g(354794456661762655L, var50);
               Object[] var179 = Registry.emptyArgs();
               long var53 = 191013569818870817L;
               Object[] var52 = var179;
               var179 = Ref.h(191013569818870817L, var52, var53);

               try {
               } catch (InvocationTargetException var147) {
                  throw var147.getTargetException();
               }
            }

            if (var10006 == null) {
               var2 = a(25144, -27266);
               if (var1 == null) {
                  break label475;
               }
            }

            var2 = a(25151, 2335);
         }

         label430: {
            String var167 = var4;
            if (var1 == null) {
               if (var4 == null) {
                  break label430;
               }

               var167 = var4;
            }

            var2 = var167;
         }

         Object var54 = 246965589172664073L;
         ((JTextArea)Ref.g(246965589172664073L, var54)).setText(var2);
         Registry.emptyArgs();
         long var56 = 253808553645062345L;
         Object var181 = Ref.h2(253808553645062345L, var56);

         try {
            var181 = (Boolean)var181;
         } catch (InvocationTargetException var146) {
            throw var146.getTargetException();
         }

         if (var1 == null) {
            if (var181 == null) {
               Object var58 = 484654819353749686L;
               JButton var183 = (JButton)Ref.g(484654819353749686L, var58);
               Object var60 = 354794456661762655L;
               Object var190 = Ref.g(354794456661762655L, var60);
               boolean var10012 = (boolean)Registry.emptyArgs();
               var63 = 539567672930282978L;
               Object var62 = var10012;
               var10012 = Ref.h(539567672930282978L, var62, var63);

               try {
                  var10012 = (Boolean)var10012;
               } catch (InvocationTargetException var145) {
                  throw var145.getTargetException();
               }

               label418: {
                  label486: {
                     if (var1 == null) {
                        if (var194 != false) {
                           break label486;
                        }

                        var194 = this;
                        Object var64 = 354794456661762655L;
                        Ref.g(354794456661762655L, var64);
                        Object[] var208 = Registry.emptyArgs();
                        long var67 = 262117569331123961L;
                        Object[] var66 = var208;
                        var208 = Ref.h(262117569331123961L, var66, var67);

                        try {
                        } catch (InvocationTargetException var144) {
                           throw var144.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label418;
                     }

                     if (var194 == false) {
                        var194 = true;
                        break label418;
                     }
                  }

                  var194 = false;
               }

               var190.setEnabled((boolean)var194);
               Object var68 = 497567577586291331L;
               JButton var195 = (JButton)Ref.g(497567577586291331L, var68);
               Object var70 = 354794456661762655L;
               Object var210 = Ref.g(354794456661762655L, var70);
               boolean var10015 = (boolean)Registry.emptyArgs();
               long var73 = 539567672930282978L;
               Object var72 = var10015;
               var10015 = Ref.h(539567672930282978L, var72, var73);

               try {
                  var10015 = (Boolean)var10015;
               } catch (InvocationTargetException var143) {
                  throw var143.getTargetException();
               }

               label406: {
                  label488: {
                     if (var1 == null) {
                        if (var216 != false) {
                           break label488;
                        }

                        var216 = this;
                        Object var74 = 354794456661762655L;
                        Ref.g(354794456661762655L, var74);
                        Object[] var227 = Registry.emptyArgs();
                        long var77 = 262117569331123961L;
                        Object[] var76 = var227;
                        var227 = Ref.h(262117569331123961L, var76, var77);

                        try {
                        } catch (InvocationTargetException var142) {
                           throw var142.getTargetException();
                        }
                     }

                     if (var1 == null) {
                        if (var216 != false) {
                           break label488;
                        }

                        var216 = this;
                        Object var78 = 354794456661762655L;
                        Ref.g(354794456661762655L, var78);
                        Object[] var229 = Registry.emptyArgs();
                        long var81 = 494928284843292484L;
                        Object[] var80 = var229;
                        var229 = Ref.h(494928284843292484L, var80, var81);

                        try {
                        } catch (InvocationTargetException var141) {
                           throw var141.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label406;
                     }

                     if (var216 != false) {
                        var216 = true;
                        break label406;
                     }
                  }

                  var216 = false;
               }

               var210.setEnabled((boolean)var216);
               if (var1 == null) {
                  return;
               }
            }

            var181 = Registry.emptyArgs();
            long var82 = 454647487873911743L;
            Object var184 = Ref.h2(454647487873911743L, var82);

            try {
            } catch (InvocationTargetException var140) {
               throw var140.getTargetException();
            }
         }

         if (var1 == null) {
            if (var181 == null) {
               Object var84 = 484654819353749686L;
               JButton var185 = (JButton)Ref.g(484654819353749686L, var84);
               Object var86 = 354794456661762655L;
               Object var191 = Ref.g(354794456661762655L, var86);
               boolean var196 = (boolean)Registry.emptyArgs();
               long var89 = 539567672930282978L;
               Object var88 = var196;
               var196 = Ref.h(539567672930282978L, var88, var89);

               try {
                  var196 = (Boolean)var196;
               } catch (InvocationTargetException var139) {
                  throw var139.getTargetException();
               }

               label381: {
                  label493: {
                     if (var1 == null) {
                        if (var198 != false) {
                           break label493;
                        }

                        var198 = this;
                        Object var90 = 354794456661762655L;
                        Ref.g(354794456661762655L, var90);
                        Object[] var211 = Registry.emptyArgs();
                        long var93 = 262117569331123961L;
                        Object[] var92 = var211;
                        var211 = Ref.h(262117569331123961L, var92, var93);

                        try {
                        } catch (InvocationTargetException var138) {
                           throw var138.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label381;
                     }

                     if (var198 == false) {
                        var198 = true;
                        break label381;
                     }
                  }

                  var198 = false;
               }

               var191.setEnabled((boolean)var198);
               Object var94 = 497567577586291331L;
               JButton var199 = (JButton)Ref.g(497567577586291331L, var94);
               Object var96 = 354794456661762655L;
               Object var213 = Ref.g(354794456661762655L, var96);
               boolean var217 = (boolean)Registry.emptyArgs();
               long var99 = 539567672930282978L;
               Object var98 = var217;
               var217 = Ref.h(539567672930282978L, var98, var99);

               try {
                  var217 = (Boolean)var217;
               } catch (InvocationTargetException var137) {
                  throw var137.getTargetException();
               }

               label369: {
                  label495: {
                     if (var1 == null) {
                        if (var219 != false) {
                           break label495;
                        }

                        var219 = this;
                        Object var100 = 354794456661762655L;
                        Ref.g(354794456661762655L, var100);
                        Object[] var231 = Registry.emptyArgs();
                        long var103 = 262117569331123961L;
                        Object[] var102 = var231;
                        var231 = Ref.h(262117569331123961L, var102, var103);

                        try {
                        } catch (InvocationTargetException var136) {
                           throw var136.getTargetException();
                        }
                     }

                     if (var1 == null) {
                        if (var219 != false) {
                           break label495;
                        }

                        var219 = this;
                        Object var104 = 354794456661762655L;
                        Ref.g(354794456661762655L, var104);
                        Object[] var233 = Registry.emptyArgs();
                        long var107 = 494928284843292484L;
                        Object[] var106 = var233;
                        var233 = Ref.h(494928284843292484L, var106, var107);

                        try {
                        } catch (InvocationTargetException var135) {
                           throw var135.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label369;
                     }

                     if (var219 != false) {
                        var219 = true;
                        break label369;
                     }
                  }

                  var219 = false;
               }

               var213.setEnabled((boolean)var219);
               if (var1 == null) {
                  return;
               }
            }

            var181 = Registry.emptyArgs();
            long var108 = 561847341732101275L;
            Object var186 = Ref.h2(561847341732101275L, var108);

            try {
            } catch (InvocationTargetException var134) {
               throw var134.getTargetException();
            }
         }

         if (var181 == null) {
            Object var110 = 484654819353749686L;
            JButton var187 = (JButton)Ref.g(484654819353749686L, var110);
            Object var112 = 354794456661762655L;
            Object var192 = Ref.g(354794456661762655L, var112);
            Object var200 = Registry.emptyArgs();
            long var115 = 262117569331123961L;
            Object var114 = var200;
            var200 = Ref.h(262117569331123961L, var114, var115);

            try {
               var202 = (Boolean)var200;
            } catch (InvocationTargetException var133) {
               throw var133.getTargetException();
            }

            if (var1 == null) {
               var202 = !var202;
            }

            var192.setEnabled(var202);
            Object var116 = 497567577586291331L;
            JButton var203 = (JButton)Ref.g(497567577586291331L, var116);
            Object var118 = 354794456661762655L;
            Object var214 = Ref.g(354794456661762655L, var118);
            boolean var220 = (boolean)Registry.emptyArgs();
            long var121 = 539567672930282978L;
            Object var120 = var220;
            var220 = Ref.h(539567672930282978L, var120, var121);

            try {
               var220 = (Boolean)var220;
            } catch (InvocationTargetException var132) {
               throw var132.getTargetException();
            }

            label343: {
               label499: {
                  if (var1 == null) {
                     if (var222 != false) {
                        break label499;
                     }

                     var222 = this;
                     Object var122 = 354794456661762655L;
                     Ref.g(354794456661762655L, var122);
                     Object[] var235 = Registry.emptyArgs();
                     long var125 = 262117569331123961L;
                     Object[] var124 = var235;
                     var235 = Ref.h(262117569331123961L, var124, var125);

                     try {
                     } catch (InvocationTargetException var131) {
                        throw var131.getTargetException();
                     }
                  }

                  if (var1 == null) {
                     if (var222 != false) {
                        break label499;
                     }

                     var222 = this;
                     Object var126 = 354794456661762655L;
                     Ref.g(354794456661762655L, var126);
                     Object[] var237 = Registry.emptyArgs();
                     long var129 = 494928284843292484L;
                     Object[] var128 = var237;
                     var237 = Ref.h(494928284843292484L, var128, var129);

                     try {
                     } catch (InvocationTargetException var130) {
                        throw var130.getTargetException();
                     }
                  }

                  if (var1 != null) {
                     break label343;
                  }

                  if (var222 != false) {
                     var222 = true;
                     break label343;
                  }
               }

               var222 = false;
            }

            var214.setEnabled((boolean)var222);
         }
      }
   }

   public static void r(String[] var0) {
      b = var0;
   }

   public static String[] y() {
      return b;
   }

   public static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 25145) & 65535;
      if (e[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 87;
               break;
            case 1:
               var10000 = 79;
               break;
            case 2:
               var10000 = 51;
               break;
            case 3:
               var10000 = 64;
               break;
            case 4:
               var10000 = 202;
               break;
            case 5:
               var10000 = 185;
               break;
            case 6:
               var10000 = 180;
               break;
            case 7:
               var10000 = 190;
               break;
            case 8:
               var10000 = 82;
               break;
            case 9:
               var10000 = 46;
               break;
            case 10:
               var10000 = 153;
               break;
            case 11:
               var10000 = 168;
               break;
            case 12:
               var10000 = 7;
               break;
            case 13:
               var10000 = 123;
               break;
            case 14:
               var10000 = 89;
               break;
            case 15:
               var10000 = 223;
               break;
            case 16:
               var10000 = 84;
               break;
            case 17:
               var10000 = 113;
               break;
            case 18:
               var10000 = 53;
               break;
            case 19:
               var10000 = 65;
               break;
            case 20:
               var10000 = 118;
               break;
            case 21:
               var10000 = 69;
               break;
            case 22:
               var10000 = 127;
               break;
            case 23:
               var10000 = 144;
               break;
            case 24:
               var10000 = 49;
               break;
            case 25:
               var10000 = 229;
               break;
            case 26:
               var10000 = 73;
               break;
            case 27:
               var10000 = 228;
               break;
            case 28:
               var10000 = 6;
               break;
            case 29:
               var10000 = 70;
               break;
            case 30:
               var10000 = 2;
               break;
            case 31:
               var10000 = 187;
               break;
            case 32:
               var10000 = 230;
               break;
            case 33:
               var10000 = 67;
               break;
            case 34:
               var10000 = 110;
               break;
            case 35:
               var10000 = 167;
               break;
            case 36:
               var10000 = 201;
               break;
            case 37:
               var10000 = 115;
               break;
            case 38:
               var10000 = 94;
               break;
            case 39:
               var10000 = 130;
               break;
            case 40:
               var10000 = 85;
               break;
            case 41:
               var10000 = 129;
               break;
            case 42:
               var10000 = 221;
               break;
            case 43:
               var10000 = 179;
               break;
            case 44:
               var10000 = 34;
               break;
            case 45:
               var10000 = 178;
               break;
            case 46:
               var10000 = 163;
               break;
            case 47:
               var10000 = 158;
               break;
            case 48:
               var10000 = 253;
               break;
            case 49:
               var10000 = 154;
               break;
            case 50:
               var10000 = 114;
               break;
            case 51:
               var10000 = 93;
               break;
            case 52:
               var10000 = 250;
               break;
            case 53:
               var10000 = 88;
               break;
            case 54:
               var10000 = 173;
               break;
            case 55:
               var10000 = 24;
               break;
            case 56:
               var10000 = 22;
               break;
            case 57:
               var10000 = 174;
               break;
            case 58:
               var10000 = 47;
               break;
            case 59:
               var10000 = 104;
               break;
            case 60:
               var10000 = 109;
               break;
            case 61:
               var10000 = 10;
               break;
            case 62:
               var10000 = 244;
               break;
            case 63:
               var10000 = 193;
               break;
            case 64:
               var10000 = 152;
               break;
            case 65:
               var10000 = 198;
               break;
            case 66:
               var10000 = 209;
               break;
            case 67:
               var10000 = 116;
               break;
            case 68:
               var10000 = 169;
               break;
            case 69:
               var10000 = 213;
               break;
            case 70:
               var10000 = 35;
               break;
            case 71:
               var10000 = 200;
               break;
            case 72:
               var10000 = 29;
               break;
            case 73:
               var10000 = 16;
               break;
            case 74:
               var10000 = 121;
               break;
            case 75:
               var10000 = 54;
               break;
            case 76:
               var10000 = 14;
               break;
            case 77:
               var10000 = 241;
               break;
            case 78:
               var10000 = 30;
               break;
            case 79:
               var10000 = 138;
               break;
            case 80:
               var10000 = 26;
               break;
            case 81:
               var10000 = 44;
               break;
            case 82:
               var10000 = 134;
               break;
            case 83:
               var10000 = 27;
               break;
            case 84:
               var10000 = 107;
               break;
            case 85:
               var10000 = 203;
               break;
            case 86:
               var10000 = 119;
               break;
            case 87:
               var10000 = 204;
               break;
            case 88:
               var10000 = 155;
               break;
            case 89:
               var10000 = 66;
               break;
            case 90:
               var10000 = 236;
               break;
            case 91:
               var10000 = 205;
               break;
            case 92:
               var10000 = 148;
               break;
            case 93:
               var10000 = 132;
               break;
            case 94:
               var10000 = 36;
               break;
            case 95:
               var10000 = 246;
               break;
            case 96:
               var10000 = 247;
               break;
            case 97:
               var10000 = 160;
               break;
            case 98:
               var10000 = 143;
               break;
            case 99:
               var10000 = 17;
               break;
            case 100:
               var10000 = 11;
               break;
            case 101:
               var10000 = 38;
               break;
            case 102:
               var10000 = 176;
               break;
            case 103:
               var10000 = 196;
               break;
            case 104:
               var10000 = 76;
               break;
            case 105:
               var10000 = 245;
               break;
            case 106:
               var10000 = 164;
               break;
            case 107:
               var10000 = 216;
               break;
            case 108:
               var10000 = 21;
               break;
            case 109:
               var10000 = 83;
               break;
            case 110:
               var10000 = 101;
               break;
            case 111:
               var10000 = 217;
               break;
            case 112:
               var10000 = 181;
               break;
            case 113:
               var10000 = 165;
               break;
            case 114:
               var10000 = 208;
               break;
            case 115:
               var10000 = 139;
               break;
            case 116:
               var10000 = 182;
               break;
            case 117:
               var10000 = 175;
               break;
            case 118:
               var10000 = 100;
               break;
            case 119:
               var10000 = 92;
               break;
            case 120:
               var10000 = 218;
               break;
            case 121:
               var10000 = 239;
               break;
            case 122:
               var10000 = 96;
               break;
            case 123:
               var10000 = 81;
               break;
            case 124:
               var10000 = 105;
               break;
            case 125:
               var10000 = 61;
               break;
            case 126:
               var10000 = 31;
               break;
            case 127:
               var10000 = 231;
               break;
            case 128:
               var10000 = 72;
               break;
            case 129:
               var10000 = 9;
               break;
            case 130:
               var10000 = 233;
               break;
            case 131:
               var10000 = 136;
               break;
            case 132:
               var10000 = 248;
               break;
            case 133:
               var10000 = 71;
               break;
            case 134:
               var10000 = 156;
               break;
            case 135:
               var10000 = 125;
               break;
            case 136:
               var10000 = 150;
               break;
            case 137:
               var10000 = 28;
               break;
            case 138:
               var10000 = 5;
               break;
            case 139:
               var10000 = 215;
               break;
            case 140:
               var10000 = 157;
               break;
            case 141:
               var10000 = 74;
               break;
            case 142:
               var10000 = 186;
               break;
            case 143:
               var10000 = 12;
               break;
            case 144:
               var10000 = 149;
               break;
            case 145:
               var10000 = 43;
               break;
            case 146:
               var10000 = 255;
               break;
            case 147:
               var10000 = 32;
               break;
            case 148:
               var10000 = 98;
               break;
            case 149:
               var10000 = 18;
               break;
            case 150:
               var10000 = 42;
               break;
            case 151:
               var10000 = 212;
               break;
            case 152:
               var10000 = 243;
               break;
            case 153:
               var10000 = 224;
               break;
            case 154:
               var10000 = 106;
               break;
            case 155:
               var10000 = 235;
               break;
            case 156:
               var10000 = 141;
               break;
            case 157:
               var10000 = 183;
               break;
            case 158:
               var10000 = 131;
               break;
            case 159:
               var10000 = 234;
               break;
            case 160:
               var10000 = 210;
               break;
            case 161:
               var10000 = 8;
               break;
            case 162:
               var10000 = 37;
               break;
            case 163:
               var10000 = 226;
               break;
            case 164:
               var10000 = 191;
               break;
            case 165:
               var10000 = 142;
               break;
            case 166:
               var10000 = 102;
               break;
            case 167:
               var10000 = 41;
               break;
            case 168:
               var10000 = 59;
               break;
            case 169:
               var10000 = 252;
               break;
            case 170:
               var10000 = 120;
               break;
            case 171:
               var10000 = 13;
               break;
            case 172:
               var10000 = 58;
               break;
            case 173:
               var10000 = 56;
               break;
            case 174:
               var10000 = 166;
               break;
            case 175:
               var10000 = 39;
               break;
            case 176:
               var10000 = 111;
               break;
            case 177:
               var10000 = 170;
               break;
            case 178:
               var10000 = 50;
               break;
            case 179:
               var10000 = 19;
               break;
            case 180:
               var10000 = 25;
               break;
            case 181:
               var10000 = 159;
               break;
            case 182:
               var10000 = 57;
               break;
            case 183:
               var10000 = 52;
               break;
            case 184:
               var10000 = 192;
               break;
            case 185:
               var10000 = 62;
               break;
            case 186:
               var10000 = 188;
               break;
            case 187:
               var10000 = 146;
               break;
            case 188:
               var10000 = 55;
               break;
            case 189:
               var10000 = 162;
               break;
            case 190:
               var10000 = 117;
               break;
            case 191:
               var10000 = 251;
               break;
            case 192:
               var10000 = 33;
               break;
            case 193:
               var10000 = 103;
               break;
            case 194:
               var10000 = 86;
               break;
            case 195:
               var10000 = 97;
               break;
            case 196:
               var10000 = 225;
               break;
            case 197:
               var10000 = 91;
               break;
            case 198:
               var10000 = 254;
               break;
            case 199:
               var10000 = 219;
               break;
            case 200:
               var10000 = 77;
               break;
            case 201:
               var10000 = 137;
               break;
            case 202:
               var10000 = 60;
               break;
            case 203:
               var10000 = 199;
               break;
            case 204:
               var10000 = 220;
               break;
            case 205:
               var10000 = 112;
               break;
            case 206:
               var10000 = 214;
               break;
            case 207:
               var10000 = 45;
               break;
            case 208:
               var10000 = 227;
               break;
            case 209:
               var10000 = 63;
               break;
            case 210:
               var10000 = 20;
               break;
            case 211:
               var10000 = 122;
               break;
            case 212:
               var10000 = 184;
               break;
            case 213:
               var10000 = 80;
               break;
            case 214:
               var10000 = 23;
               break;
            case 215:
               var10000 = 147;
               break;
            case 216:
               var10000 = 3;
               break;
            case 217:
               var10000 = 99;
               break;
            case 218:
               var10000 = 78;
               break;
            case 219:
               var10000 = 133;
               break;
            case 220:
               var10000 = 75;
               break;
            case 221:
               var10000 = 126;
               break;
            case 222:
               var10000 = 95;
               break;
            case 223:
               var10000 = 135;
               break;
            case 224:
               var10000 = 151;
               break;
            case 225:
               var10000 = 240;
               break;
            case 226:
               var10000 = 108;
               break;
            case 227:
               var10000 = 206;
               break;
            case 228:
               var10000 = 145;
               break;
            case 229:
               var10000 = 207;
               break;
            case 230:
               var10000 = 40;
               break;
            case 231:
               var10000 = 194;
               break;
            case 232:
               var10000 = 0;
               break;
            case 233:
               var10000 = 249;
               break;
            case 234:
               var10000 = 128;
               break;
            case 235:
               var10000 = 189;
               break;
            case 236:
               var10000 = 222;
               break;
            case 237:
               var10000 = 1;
               break;
            case 238:
               var10000 = 171;
               break;
            case 239:
               var10000 = 68;
               break;
            case 240:
               var10000 = 172;
               break;
            case 241:
               var10000 = 195;
               break;
            case 242:
               var10000 = 161;
               break;
            case 243:
               var10000 = 232;
               break;
            case 244:
               var10000 = 197;
               break;
            case 245:
               var10000 = 15;
               break;
            case 246:
               var10000 = 124;
               break;
            case 247:
               var10000 = 90;
               break;
            case 248:
               var10000 = 177;
               break;
            case 249:
               var10000 = 48;
               break;
            case 250:
               var10000 = 237;
               break;
            case 251:
               var10000 = 211;
               break;
            case 252:
               var10000 = 140;
               break;
            case 253:
               var10000 = 4;
               break;
            case 254:
               var10000 = 238;
               break;
            default:
               var10000 = 242;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11488;
      if (j[var3] == null) {
         j[var3] = (int)(f[var3] ^ var1);
      }

      return j[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      byte[] var9;
      String[] var15 = new String[19];
      int var13 = 0;
      r(null);
      String var12 = "îé\u0002\u009cI¦f\u0095\u0002\u009cÝKA»q\u0095 ÜÈ¼\u0013\u0086\"þ\u0088\u0007\u00ad%\u0018¤\t書攓旐亣崖亸輍室戯\u0010Á\u009dç\u0012õwñ¯ðÛ\u0083£\u0095±\u001f6\u000ep\u0096\u001b\u0085\u0083å´ÄÞ¼N\u0018\"\u001b\u0002û}\u0006卸珪敶爢柍Ê\u0006崛纚曂柴斫爹\fHv\u000fÙB\u007f\u0096ûÿà¨\u001d\t段坊桛朐曎攄\u0083]ù\b殦坝仲轪晉旀gË\u0012RÂ_\u000f\u000b´¥ììë\bàº\u0006\u0016Øä\u009e\f¡n2Úå\u001fb÷aa{-\u0011gÈê\u000eþ\u0085\u0001¤\r\u000bö`ÔY\u0014\u009fì\t忤妕嬷衔庡八长轊丅\u0004曕斎攗弱\u0004孤蠈旳强\f>\"\u0005ðæïKô,\u0019昁旻";
      int var14 = "îé\u0002\u009cI¦f\u0095\u0002\u009cÝKA»q\u0095 ÜÈ¼\u0013\u0086\"þ\u0088\u0007\u00ad%\u0018¤\t書攓旐亣崖亸輍室戯\u0010Á\u009dç\u0012õwñ¯ðÛ\u0083£\u0095±\u001f6\u000ep\u0096\u001b\u0085\u0083å´ÄÞ¼N\u0018\"\u001b\u0002û}\u0006卸珪敶爢柍Ê\u0006崛纚曂柴斫爹\fHv\u000fÙB\u007f\u0096ûÿà¨\u001d\t段坊桛朐曎攄\u0083]ù\b殦坝仲轪晉旀gË\u0012RÂ_\u000f\u000b´¥ììë\bàº\u0006\u0016Øä\u009e\f¡n2Úå\u001fb÷aa{-\u0011gÈê\u000eþ\u0085\u0001¤\r\u000bö`ÔY\u0014\u009fì\t忤妕嬷衔庡八长轊丅\u0004曕斎攗弱\u0004孤蠈旳强\f>\"\u0005ðæïKô,\u0019昁旻"
         .length();
      char var11 = 30;
      int var18 = -1;

      label61:
      while (true) {
         byte var10000 = 59;
         String var10001 = var12.substring(++var18, var18 + var11);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var38 = var10001.toCharArray();
               int var10004 = var38.length;
               int var16 = 0;
               byte var41 = var10000;
               var33 = var38;
               int var24 = var10004;
               byte var47;
               char[] var52;
               int var10006;
               if (var10004 <= 1) {
                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               } else {
                  var41 = var10000;
                  var24 = var10004;
                  if (var10004 <= var16) {
                     break label56;
                  }

                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var61 = var52[var10006];
                  byte var62;
                  switch (var16 % 7) {
                     case 0:
                        var62 = 66;
                        break;
                     case 1:
                        var62 = 20;
                        break;
                     case 2:
                        var62 = 54;
                        break;
                     case 3:
                        var62 = 79;
                        break;
                     case 4:
                        var62 = 19;
                        break;
                     case 5:
                        var62 = 90;
                        break;
                     default:
                        var62 = 32;
                  }

                  var52[var10006] = (char)(var61 ^ var47 ^ var62);
                  var16++;
                  if (var41 == 0) {
                     var10006 = var41;
                     var52 = var33;
                     var47 = var41;
                  } else {
                     if (var24 <= var16) {
                        break;
                     }

                     var52 = var33;
                     var47 = var41;
                     var10006 = var16;
                  }
               }
            }

            String var43 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var43;
                  if ((var18 += var11) >= var14) {
                     c = var15;
                     e = new String[19];
                     long var2 = 8048985971626810207L;
                     long[] var8 = new long[3];
                     int var5 = 0;
                     String var6 = "j>\"\u009bK6Ix\u0014.ü\u0092]å\u009f_*\u0014\u0003i¹\u000f;\u0088";
                     int var7 = "j>\"\u009bK6Ix\u0014.ü\u0092]å\u009f_*\u0014\u0003i¹\u000f;\u0088".length();
                     byte var4 = 0;

                     do {
                        byte var26 = var4;
                        var4 += 8;
                        var9 = var6.substring(var26, var4).getBytes("ISO-8859-1");
                        int var27 = var5++;
                        long var51 = (
                              ((long)var9[0] & 255L) << 56
                                 | ((long)var9[1] & 255L) << 48
                                 | ((long)var9[2] & 255L) << 40
                                 | ((long)var9[3] & 255L) << 32
                                 | ((long)var9[4] & 255L) << 24
                                 | ((long)var9[5] & 255L) << 16
                                 | ((long)var9[6] & 255L) << 8
                                 | (long)var9[7] & 255L
                           )
                           ^ var2;
                        byte var44 = -1;
                        var8[var27] = var51;
                     } while (var4 < var7);

                     f = var8;
                     j = new Integer[3];
                     long var0 = 869738723196198792L;
                     long var37 = 869739375539430870L ^ var0;
                     byte var28 = -1;
                     k = var37;
                     return;
                  }

                  var11 = var12.charAt(var18);
                  break;
               default:
                  var15[var13++] = var43;
                  if ((var18 += var11) < var14) {
                     var11 = var12.charAt(var18);
                     continue label61;
                  }

                  var12 = "栂杰晴敌\u0006嶙继暨条旜犱";
                  var14 = "栂杰晴敌\u0006嶙继暨条旜犱".length();
                  var11 = 4;
                  var18 = -1;
            }

            var10000 = 34;
            var10001 = var12.substring(++var18, var18 + var11);
            var10002 = 0;
         }
      }
   }
}





