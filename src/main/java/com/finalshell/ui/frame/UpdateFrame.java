package com.finalshell.ui.frame;

import com.finalshell.core.CH;
import com.finalshell.core.UpdateManifest;
import com.finalshell.core.Yy4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.J3;
import com.finalshell.task.Kx2;
import com.finalshell.task.M7;
import com.finalshell.task.Ue4;
import com.finalshell.ui.listener.Cb2;
import com.finalshell.ui.listener.Fx2;
import com.finalshell.ui.listener.UZ;
import com.finalshell.ui.panel.Ky4;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import net.miginfocom.swing.MigLayout;

public class UpdateFrame extends JFrame implements CH {
   public Yy4_2 s;
   public JTextArea b;
   public boolean Y;
   public JButton P;
   public JButton H;
   public JButton r;
   public JTextArea m;
   public JScrollPane u;
   public boolean a;
   public final int T;
   public boolean E;
   public boolean M;
   public static String[] X;
   public static String[] c;
   public static String[] d;
   public static long[] e;
   public static Integer[] f;

   public UpdateFrame(JFrame var1) {
   super();
   boolean var73;
   boolean var74;
   long var9;
      JPanel var5;
      label80: {
         Registry.lookupField(618853683069368772L).setBoolean(this, false);
         Registry.lookupField(198290463385639860L).setBoolean(this, true);
         this.T = a(9134, 2451920808905915374L);
         Registry.lookupField(210161519549432120L).setBoolean(this, false);
         q();
         Registry.lookupField(602217905248930587L).setBoolean(this, false);
         this.setTitle(a(-11780, -20663));
         Registry.emptyArgs();
         long var6 = 270389152141252877L;
         Ref.h2(270389152141252877L, var6);
         Object[] var10004 = Registry.emptyArgs();
         var9 = 479882039388176646L;
         Object[] var8 = var10004;
         var10004 = Ref.h(479882039388176646L, var8, var9);
         long var11 = 215526989813745242L;
         Object var10 = var10004;
         Ref.s(215526989813745242L, var10, var11);
         JPanel var3 = (JPanel)this.getContentPane();
         var3.setLayout(new MigLayout(a(-11807, -25544), "", ""));
         JLabel var4 = new JLabel(a(-11796, 14553) + (String)Registry.lookupField(621025023751330046L).get(null));
         var3.add(var4, a(-11802, -13178));
         JTextArea var10005 = new JTextArea();
         long var13 = 459690401541671742L;
         JTextArea var12 = var10005;
         Ref.s(459690401541671742L, var12, var13);
         Object var14 = 459690401541671742L;
         ((JTextArea)Ref.g(459690401541671742L, var14)).setOpaque(false);
         Object var16 = 459690401541671742L;
         ((JTextArea)Ref.g(459690401541671742L, var16)).setEditable(false);
         Object var18 = 459690401541671742L;
         ((JTextArea)Ref.g(459690401541671742L, var18)).setRows(2);
         Object var20 = 459690401541671742L;
         this.add((JTextArea)Ref.g(459690401541671742L, var20), a(-11793, -3318));
         var5 = new JPanel();
         var5.setLayout(new MigLayout(a(-11799, -1637), "", a(-11806, -10877)));
         var3.add(var5, a(-11778, -30052));
         JButton var10010 = new JButton(a(-11808, -30265));
         long var23 = 528028079952531070L;
         JButton var22 = var10010;
         Ref.s(528028079952531070L, var22, var23);
         Object var24 = 528028079952531070L;
         ((JButton)Ref.g(528028079952531070L, var24)).addActionListener(new Cb2(this));
         Object var26 = 528028079952531070L;
         this.add((JButton)Ref.g(528028079952531070L, var26), a(-11800, 30960));
         JButton var10012 = new JButton(a(-11794, 27698));
         long var29 = 141748913226340279L;
         JButton var28 = var10012;
         Ref.s(141748913226340279L, var28, var29);
         Object var30 = 141748913226340279L;
         ((JButton)Ref.g(141748913226340279L, var30)).addActionListener(new Fx2(this));
         Object var32 = 141748913226340279L;
         this.add((JButton)Ref.g(141748913226340279L, var32), a(-11777, -13948));
         JButton var10015 = new JButton(a(-11797, 16853));
         long var35 = 175547947792914580L;
         JButton var34 = var10015;
         Ref.s(175547947792914580L, var34, var35);
         Object var36 = 175547947792914580L;
         ((JButton)Ref.g(175547947792914580L, var36)).addActionListener(new UZ(this));
         Object var38 = 175547947792914580L;
         this.add((JButton)Ref.g(175547947792914580L, var38), a(-11777, -13948));
         if (var5 == null) {
            Registry.emptyArgs();
            long var40 = 561847341732101275L;
            Object var10018 = Ref.h2(561847341732101275L, var40);

            try {
               var73 = (Boolean)var10018;
            } catch (InvocationTargetException var71) {
               throw var71.getTargetException();
            }

            if (!var73) {
               Registry.emptyArgs();
               long var42 = 454647487873911743L;
               Object var10019 = Ref.h2(454647487873911743L, var42);

               try {
                  var74 = (Boolean)var10019;
               } catch (InvocationTargetException var70) {
                  throw var70.getTargetException();
               }

               if (!var74) {
                  break label80;
               }
            }

            JTextArea var75 = new JTextArea();
            long var45 = 406171939123952740L;
            JTextArea var44 = var75;
            Ref.s(406171939123952740L, var44, var45);
            JScrollPane var10021;
            Object var46 = 406171939123952740L;
            // [VF-super] super((JTextArea)Ref.g(406171939123952740L, var46));
            long var49 = 286993704937759947L;
            JScrollPane var48 = var10021;
            Ref.s(286993704937759947L, var48, var49);
            Object var50 = 286993704937759947L;
            ((JScrollPane)Ref.g(286993704937759947L, var50)).setBorder(BorderFactory.createTitledBorder(a(-11801, 6160)));
         }

         Object var52 = 286993704937759947L;
         this.add((JScrollPane)Ref.g(286993704937759947L, var52), a(-11798, 29239));
      }

      Object[] var76 = Registry.emptyArgs();
      long var55 = 611344775103445562L;
      Object[] var54 = var76;
      Ref.h(611344775103445562L, var54, var55);

      try {
         ;
      } catch (InvocationTargetException var69) {
         throw var69.getTargetException();
      }

      this.pack();
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10020 = Registry.packArgs(new J3(this));
      long var57 = 434592463220957006L;
      Object[] var56 = var10020;
      Ref.h(434592463220957006L, var56, var57);

      try {
         ;
      } catch (InvocationTargetException var68) {
         throw var68.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var77 = Registry.packArgs(new M7(this), a(27223, 1972071948725449238L));
      long var59 = 201859364639460244L;
      Object[] var58 = var77;
      Ref.h(201859364639460244L, var58, var59);
      Object[] var10022 = Registry.packArgs("");
      long var61 = 457138384657962408L;
      Object[] var60 = var10022;
      Ref.h(457138384657962408L, var60, var61);

      try {
         ;
      } catch (InvocationTargetException var67) {
         throw var67.getTargetException();
      }

      Registry.emptyArgs();
      long var62 = 270389152141252877L;
      Ref.h2(270389152141252877L, var62);
      Object[] var10024 = Registry.emptyArgs();
      long var65 = 223833355588839652L;
      Object[] var64 = var10024;
      Ref.h(223833355588839652L, var64, var65);

      try {
         ;
      } catch (InvocationTargetException var66) {
         throw var66.getTargetException();
      }

      if (var5 != null) {
         Ky4.K(new String[3]);
      }
   }

   @Override
   public void d(String var1) {
      SwingUtilities.invokeLater(new Ue4(this, var1));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void s(JTextArea var1) {
      BadLocationException var10;
      int var9;
      String[] var10000 = q();
      int var3 = var1.getLineCount() - a(30243, 5602459892254731872L);
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

   public void g(String var1) {
      long var9;
      q();
      Object var4 = 406171939123952740L;
      ((JTextArea)Ref.g(406171939123952740L, var4)).append(var1);
      Object var6 = 406171939123952740L;
      Object[] var10003 = Registry.packArgs(Ref.g(406171939123952740L, var6));
      var9 = 545163393621250611L;
      Object[] var8 = var10003;
      Ref.h(545163393621250611L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      if (this != null || Registry.lookupField(198290463385639860L).getBoolean(this)) {
         Object var10 = 286993704937759947L;
         JScrollBar var3 = ((JScrollPane)Ref.g(286993704937759947L, var10)).getVerticalScrollBar();
         var3.setValue(var3.getMaximum());
      }
   }

   public void j() {
      Object[] var10;
      boolean var15;
      label37: {
         String[] var1 = q();
         if (var1 == null) {
            Registry.emptyArgs();
            long var2 = 561847341732101275L;
            Object var10001 = Ref.h2(561847341732101275L, var2);

            try {
               var15 = (Boolean)var10001;
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            if (var15) {
               break label37;
            }

            Object var4 = 215526989813745242L;
            Ref.g(215526989813745242L, var4);
            Object[] var10003 = Registry.emptyArgs();
            long var7 = 373868045552747003L;
            Object[] var6 = var10003;
            Ref.h(373868045552747003L, var6, var7);

            try {
               ;
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }
         }

         if (var1 == null) {
            return;
         }
      }

      Object var8 = 215526989813745242L;
      Ref.g(215526989813745242L, var8);
      Object[] var10002 = Registry.emptyArgs();
      long var11 = 373868045552747003L;
      var10 = var10002;
      Ref.h(373868045552747003L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }
   }

   @Override
   public void setVisible(boolean var1) {
      UpdateFrame var9;
      String[] var10000 = q();
      Object var3 = this.isVisible();
      String[] var2 = var10000;
      super.setVisible((boolean)var1);
      var9 = (UpdateFrame)var1;
      if (var2 == null) {
         if (var1 != false) {
            Registry.lookupField(618853683069368772L).setBoolean(this, true);
            this.toFront();
            this.requestFocus();
         }

         var9 = (UpdateFrame)var3;
      }

      if (var2 == null) {
         if (var9 == null) {
            return;
         }

         var9 = (UpdateFrame)var1;
      }

      if (var2 == null) {
         if (var9 == null) {
            return;
         }

         var9 = this;
         Object var4 = 141748913226340279L;
         ((JButton)Ref.g(141748913226340279L, var4)).isEnabled();
      }

      if (var9 == null) {
         Registry.lookupField(388376917454860932L).get(null);
         Object[] var10001 = Registry.packArgs(new Kx2(this));
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

   public void t() {
      Object[] var15;
      boolean var175;
      boolean var191;
      boolean var195;
      boolean var199;
      Long var202;
      boolean var213;
      boolean var216;
      boolean var219;
      Long var221;
      long var30;
      String var2 = a(-11805, -12181);
      Object var5 = 215526989813745242L;
      Ref.g(215526989813745242L, var5);
      UpdateManifest var10002 = (UpdateManifest)(Registry.emptyArgs());
      long var8 = 158188277888657185L;
      Object var7 = var10002;
      var10002 = Ref.h(158188277888657185L, var7, var8);

      try {
         var10002 = (UpdateManifest)var10002;
      } catch (InvocationTargetException var159) {
         throw var159.getTargetException();
      }

      UpdateManifest var3 = var10002;
      q();
      Object var9 = 215526989813745242L;
      Object var10004 = Ref.g(215526989813745242L, var9);
      String var10005 = (String)(Registry.emptyArgs());
      long var12 = 443433712666304670L;
      Object var11 = var10005;
      var10005 = Ref.h(443433712666304670L, var11, var12);

      try {
         var10005 = (String)var10005;
      } catch (InvocationTargetException var158) {
         throw var158.getTargetException();
      }

      String var4 = var10005;
      Object var1 = var10004;
      if (var3 != null) {
         Object var13 = 215526989813745242L;
         Ref.g(215526989813745242L, var13);
         Boolean var10006 = (Boolean)(Registry.emptyArgs());
         long var16 = 187198425743999659L;
         var15 = var10006;
         var10006 = Ref.h(187198425743999659L, var15, var16);

         try {
            var10006 = (Boolean)var10006;
         } catch (InvocationTargetException var157) {
            throw var157.getTargetException();
         }

         label457: {
            if (var1 == null) {
               if (var10006 == null) {
                  var2 = a(-11779, -23122);
                  if (var1 == null) {
                     break label457;
                  }
               }

               var10006 = this;
               Object var17 = 215526989813745242L;
               Ref.g(215526989813745242L, var17);
               Object[] var10008 = Registry.emptyArgs();
               long var20 = 491698642839551398L;
               Object[] var19 = var10008;
               var10008 = Ref.h(491698642839551398L, var19, var20);

               try {
               } catch (InvocationTargetException var156) {
                  throw var156.getTargetException();
               }
            }

            if (var1 == null) {
               if (var10006 == null) {
                  break label457;
               }

               var10006 = this;
               Object var21 = 215526989813745242L;
               Ref.g(215526989813745242L, var21);
               Object[] var168 = Registry.emptyArgs();
               long var24 = 349126551903164149L;
               Object[] var23 = var168;
               var168 = Ref.h(349126551903164149L, var23, var24);

               try {
               } catch (InvocationTargetException var155) {
                  throw var155.getTargetException();
               }
            }

            if (var1 == null) {
               if (var10006 == null) {
                  if (var3 != null) {
                     new StringBuilder().append(a(-11795, -11989));
                     String var170 = (String)(Registry.emptyArgs());
                     long var26 = 542847412748824793L;
                     Object var25 = var170;
                     var170 = Ref.h(542847412748824793L, var25, var26);

                     try {
                        var170 = (String)var170;
                     } catch (InvocationTargetException var154) {
                        throw var154.getTargetException();
                     }

                     var2 = var3.append((String)var170).append("\n").toString();
                  }

                  Object var27 = 215526989813745242L;
                  Ref.g(215526989813745242L, var27);
                  Object var173 = Registry.emptyArgs();
                  var30 = 547240307566989756L;
                  Object var29 = var173;
                  var173 = Ref.h(547240307566989756L, var29, var30);

                  try {
                     var175 = (Boolean)var173;
                  } catch (InvocationTargetException var153) {
                     throw var153.getTargetException();
                  }

                  label463: {
                     if (var1 == null) {
                        if (var175) {
                           new StringBuilder().append(var2).append(a(-11784, 28411));
                           Object var31 = 215526989813745242L;
                           Object var10010 = Ref.g(215526989813745242L, var31);
                           String var10011 = (String)(Registry.emptyArgs());
                           long var34 = 423681337208045927L;
                           Object var33 = var10011;
                           var10011 = Ref.h(423681337208045927L, var33, var34);

                           try {
                              var10011 = (String)var10011;
                           } catch (InvocationTargetException var152) {
                              throw var152.getTargetException();
                           }

                           var10010.append((String)var10011).append(" ");
                           Object var35 = 215526989813745242L;
                           Ref.g(215526989813745242L, var35);
                           Object var10013 = Registry.emptyArgs();
                           long var38 = 365646851315276411L;
                           Object var37 = var10013;
                           var10013 = Ref.h(365646851315276411L, var37, var38);

                           try {
                              var202 = (Long)var10013;
                           } catch (InvocationTargetException var151) {
                              throw var151.getTargetException();
                           }

                           var10013 = Registry.e(var202);
                           long var39 = 408529162510360196L;
                           Object var10014 = Ref.h2(408529162510360196L, var39);

                           try {
                              var10014 = (String)var10014;
                           } catch (InvocationTargetException var150) {
                              throw var150.getTargetException();
                           }

                           var10013.append((String)var10014).append("/");
                           Object var41 = 215526989813745242L;
                           Ref.g(215526989813745242L, var41);
                           Object var10016 = Registry.emptyArgs();
                           long var44 = 369915737473924171L;
                           Object var43 = var10016;
                           var10016 = Ref.h(369915737473924171L, var43, var44);

                           try {
                              var221 = (Long)var10016;
                           } catch (InvocationTargetException var149) {
                              throw var149.getTargetException();
                           }

                           var10016 = Registry.e(var221);
                           long var45 = 408529162510360196L;
                           Object var10017 = Ref.h2(408529162510360196L, var45);

                           try {
                              var10017 = (String)var10017;
                           } catch (InvocationTargetException var148) {
                              throw var148.getTargetException();
                           }

                           var2 = var10016.append((String)var10017).toString();
                        }

                        if (var1 != null) {
                           break label463;
                        }

                        var175 = Registry.lookupField(618853683069368772L).getBoolean(this);
                     }

                     if (var175) {
                        break label457;
                     }

                     this.setLocationRelativeTo(null);
                  }

                  Object[] var10009 = Registry.packArgs(true);
                  long var48 = 610529704363663802L;
                  Object[] var47 = var10009;
                  Ref.h(610529704363663802L, var47, var48);

                  try {
                     ;
                  } catch (InvocationTargetException var147) {
                     throw var147.getTargetException();
                  }

                  if (var1 == null) {
                     break label457;
                  }
               }

               var10006 = this;
               Object var49 = 215526989813745242L;
               Ref.g(215526989813745242L, var49);
               Object[] var176 = Registry.emptyArgs();
               long var52 = 357995794655649354L;
               Object[] var51 = var176;
               var176 = Ref.h(357995794655649354L, var51, var52);

               try {
               } catch (InvocationTargetException var146) {
                  throw var146.getTargetException();
               }
            }

            if (var10006 == null) {
               var2 = a(-11803, -8243);
               if (var1 == null) {
                  break label457;
               }
            }

            var2 = a(-11804, 28414);
         }

         label413: {
            String var166 = var4;
            if (var1 == null) {
               if (var4 == null) {
                  break label413;
               }

               var166 = var4;
            }

            var2 = var166;
         }

         Object var53 = 459690401541671742L;
         ((JTextArea)Ref.g(459690401541671742L, var53)).setText(var2);
         Registry.emptyArgs();
         long var55 = 253808553645062345L;
         Object var178 = Ref.h2(253808553645062345L, var55);

         try {
            var178 = (Boolean)var178;
         } catch (InvocationTargetException var145) {
            throw var145.getTargetException();
         }

         if (var1 == null) {
            if (var178 == null) {
               Object var57 = 141748913226340279L;
               JButton var180 = (JButton)Ref.g(141748913226340279L, var57);
               Object var59 = 215526989813745242L;
               Object var187 = Ref.g(215526989813745242L, var59);
               boolean var10012 = (boolean)Registry.emptyArgs();
               long var62 = 349881537638593262L;
               Object var61 = var10012;
               var10012 = Ref.h(349881537638593262L, var61, var62);

               try {
                  var10012 = (Boolean)var10012;
               } catch (InvocationTargetException var144) {
                  throw var144.getTargetException();
               }

               label401: {
                  label469: {
                     if (var1 == null) {
                        if (var191 != false) {
                           break label469;
                        }

                        var191 = this;
                        Object var63 = 215526989813745242L;
                        Ref.g(215526989813745242L, var63);
                        Object[] var205 = Registry.emptyArgs();
                        long var66 = 187198425743999659L;
                        Object[] var65 = var205;
                        var205 = Ref.h(187198425743999659L, var65, var66);

                        try {
                        } catch (InvocationTargetException var143) {
                           throw var143.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label401;
                     }

                     if (var191 == false) {
                        var191 = true;
                        break label401;
                     }
                  }

                  var191 = false;
               }

               var187.setEnabled((boolean)var191);
               Object var67 = 175547947792914580L;
               JButton var192 = (JButton)Ref.g(175547947792914580L, var67);
               Object var69 = 215526989813745242L;
               Object var207 = Ref.g(215526989813745242L, var69);
               boolean var10015 = (boolean)Registry.emptyArgs();
               long var72 = 349881537638593262L;
               Object var71 = var10015;
               var10015 = Ref.h(349881537638593262L, var71, var72);

               try {
                  var10015 = (Boolean)var10015;
               } catch (InvocationTargetException var142) {
                  throw var142.getTargetException();
               }

               label389: {
                  label471: {
                     if (var1 == null) {
                        if (var213 != false) {
                           break label471;
                        }

                        var213 = this;
                        Object var73 = 215526989813745242L;
                        Ref.g(215526989813745242L, var73);
                        Object[] var224 = Registry.emptyArgs();
                        long var76 = 187198425743999659L;
                        Object[] var75 = var224;
                        var224 = Ref.h(187198425743999659L, var75, var76);

                        try {
                        } catch (InvocationTargetException var141) {
                           throw var141.getTargetException();
                        }
                     }

                     if (var1 == null) {
                        if (var213 != false) {
                           break label471;
                        }

                        var213 = this;
                        Object var77 = 215526989813745242L;
                        Ref.g(215526989813745242L, var77);
                        Object[] var226 = Registry.emptyArgs();
                        long var80 = 349126551903164149L;
                        Object[] var79 = var226;
                        var226 = Ref.h(349126551903164149L, var79, var80);

                        try {
                        } catch (InvocationTargetException var140) {
                           throw var140.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label389;
                     }

                     if (var213 != false) {
                        var213 = true;
                        break label389;
                     }
                  }

                  var213 = false;
               }

               var207.setEnabled((boolean)var213);
               if (var1 == null) {
                  return;
               }
            }

            var178 = Registry.emptyArgs();
            long var81 = 454647487873911743L;
            Object var181 = Ref.h2(454647487873911743L, var81);

            try {
            } catch (InvocationTargetException var139) {
               throw var139.getTargetException();
            }
         }

         if (var1 == null) {
            if (var178 == null) {
               Object var83 = 141748913226340279L;
               JButton var182 = (JButton)Ref.g(141748913226340279L, var83);
               Object var85 = 215526989813745242L;
               Object var188 = Ref.g(215526989813745242L, var85);
               boolean var193 = (boolean)Registry.emptyArgs();
               long var88 = 349881537638593262L;
               Object var87 = var193;
               var193 = Ref.h(349881537638593262L, var87, var88);

               try {
                  var193 = (Boolean)var193;
               } catch (InvocationTargetException var138) {
                  throw var138.getTargetException();
               }

               label364: {
                  label476: {
                     if (var1 == null) {
                        if (var195 != false) {
                           break label476;
                        }

                        var195 = this;
                        Object var89 = 215526989813745242L;
                        Ref.g(215526989813745242L, var89);
                        Object[] var208 = Registry.emptyArgs();
                        long var92 = 187198425743999659L;
                        Object[] var91 = var208;
                        var208 = Ref.h(187198425743999659L, var91, var92);

                        try {
                        } catch (InvocationTargetException var137) {
                           throw var137.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label364;
                     }

                     if (var195 == false) {
                        var195 = true;
                        break label364;
                     }
                  }

                  var195 = false;
               }

               var188.setEnabled((boolean)var195);
               Object var93 = 175547947792914580L;
               JButton var196 = (JButton)Ref.g(175547947792914580L, var93);
               Object var95 = 215526989813745242L;
               Object var210 = Ref.g(215526989813745242L, var95);
               boolean var214 = (boolean)Registry.emptyArgs();
               long var98 = 349881537638593262L;
               Object var97 = var214;
               var214 = Ref.h(349881537638593262L, var97, var98);

               try {
                  var214 = (Boolean)var214;
               } catch (InvocationTargetException var136) {
                  throw var136.getTargetException();
               }

               label352: {
                  label478: {
                     if (var1 == null) {
                        if (var216 != false) {
                           break label478;
                        }

                        var216 = this;
                        Object var99 = 215526989813745242L;
                        Ref.g(215526989813745242L, var99);
                        Object[] var228 = Registry.emptyArgs();
                        long var102 = 187198425743999659L;
                        Object[] var101 = var228;
                        var228 = Ref.h(187198425743999659L, var101, var102);

                        try {
                        } catch (InvocationTargetException var135) {
                           throw var135.getTargetException();
                        }
                     }

                     if (var1 == null) {
                        if (var216 != false) {
                           break label478;
                        }

                        var216 = this;
                        Object var103 = 215526989813745242L;
                        Ref.g(215526989813745242L, var103);
                        Object[] var230 = Registry.emptyArgs();
                        long var106 = 349126551903164149L;
                        Object[] var105 = var230;
                        var230 = Ref.h(349126551903164149L, var105, var106);

                        try {
                        } catch (InvocationTargetException var134) {
                           throw var134.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label352;
                     }

                     if (var216 != false) {
                        var216 = true;
                        break label352;
                     }
                  }

                  var216 = false;
               }

               var210.setEnabled((boolean)var216);
               if (var1 == null) {
                  return;
               }
            }

            var178 = Registry.emptyArgs();
            long var107 = 561847341732101275L;
            Object var183 = Ref.h2(561847341732101275L, var107);

            try {
            } catch (InvocationTargetException var133) {
               throw var133.getTargetException();
            }
         }

         if (var178 == null) {
            Object var109 = 141748913226340279L;
            JButton var184 = (JButton)Ref.g(141748913226340279L, var109);
            Object var111 = 215526989813745242L;
            Object var189 = Ref.g(215526989813745242L, var111);
            Object var197 = Registry.emptyArgs();
            long var114 = 187198425743999659L;
            Object var113 = var197;
            var197 = Ref.h(187198425743999659L, var113, var114);

            try {
               var199 = (Boolean)var197;
            } catch (InvocationTargetException var132) {
               throw var132.getTargetException();
            }

            if (var1 == null) {
               var199 = !var199;
            }

            var189.setEnabled(var199);
            Object var115 = 175547947792914580L;
            JButton var200 = (JButton)Ref.g(175547947792914580L, var115);
            Object var117 = 215526989813745242L;
            Object var211 = Ref.g(215526989813745242L, var117);
            boolean var217 = (boolean)Registry.emptyArgs();
            long var120 = 349881537638593262L;
            Object var119 = var217;
            var217 = Ref.h(349881537638593262L, var119, var120);

            try {
               var217 = (Boolean)var217;
            } catch (InvocationTargetException var131) {
               throw var131.getTargetException();
            }

            label326: {
               label482: {
                  if (var1 == null) {
                     if (var219 != false) {
                        break label482;
                     }

                     var219 = this;
                     Object var121 = 215526989813745242L;
                     Ref.g(215526989813745242L, var121);
                     Object[] var232 = Registry.emptyArgs();
                     long var124 = 187198425743999659L;
                     Object[] var123 = var232;
                     var232 = Ref.h(187198425743999659L, var123, var124);

                     try {
                     } catch (InvocationTargetException var130) {
                        throw var130.getTargetException();
                     }
                  }

                  if (var1 == null) {
                     if (var219 != false) {
                        break label482;
                     }

                     var219 = this;
                     Object var125 = 215526989813745242L;
                     Ref.g(215526989813745242L, var125);
                     Object[] var234 = Registry.emptyArgs();
                     long var128 = 349126551903164149L;
                     Object[] var127 = var234;
                     var234 = Ref.h(349126551903164149L, var127, var128);

                     try {
                     } catch (InvocationTargetException var129) {
                        throw var129.getTargetException();
                     }
                  }

                  if (var1 != null) {
                     break label326;
                  }

                  if (var219 != false) {
                     var219 = true;
                     break label326;
                  }
               }

               var219 = false;
            }

            var211.setEnabled((boolean)var219);
         }
      }
   }

   public static void r(String[] var0) {
      X = var0;
   }

   public static String[] q() {
      return X;
   }

   public static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -11796) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 172;
               break;
            case 1:
               var10000 = 114;
               break;
            case 2:
               var10000 = 189;
               break;
            case 3:
               var10000 = 238;
               break;
            case 4:
               var10000 = 15;
               break;
            case 5:
               var10000 = 96;
               break;
            case 6:
               var10000 = 246;
               break;
            case 7:
               var10000 = 133;
               break;
            case 8:
               var10000 = 57;
               break;
            case 9:
               var10000 = 241;
               break;
            case 10:
               var10000 = 148;
               break;
            case 11:
               var10000 = 118;
               break;
            case 12:
               var10000 = 85;
               break;
            case 13:
               var10000 = 48;
               break;
            case 14:
               var10000 = 193;
               break;
            case 15:
               var10000 = 80;
               break;
            case 16:
               var10000 = 254;
               break;
            case 17:
               var10000 = 159;
               break;
            case 18:
               var10000 = 248;
               break;
            case 19:
               var10000 = 230;
               break;
            case 20:
               var10000 = 46;
               break;
            case 21:
               var10000 = 192;
               break;
            case 22:
               var10000 = 242;
               break;
            case 23:
               var10000 = 30;
               break;
            case 24:
               var10000 = 105;
               break;
            case 25:
               var10000 = 129;
               break;
            case 26:
               var10000 = 128;
               break;
            case 27:
               var10000 = 25;
               break;
            case 28:
               var10000 = 209;
               break;
            case 29:
               var10000 = 116;
               break;
            case 30:
               var10000 = 201;
               break;
            case 31:
               var10000 = 142;
               break;
            case 32:
               var10000 = 135;
               break;
            case 33:
               var10000 = 43;
               break;
            case 34:
               var10000 = 178;
               break;
            case 35:
               var10000 = 169;
               break;
            case 36:
               var10000 = 240;
               break;
            case 37:
               var10000 = 132;
               break;
            case 38:
               var10000 = 176;
               break;
            case 39:
               var10000 = 106;
               break;
            case 40:
               var10000 = 130;
               break;
            case 41:
               var10000 = 69;
               break;
            case 42:
               var10000 = 117;
               break;
            case 43:
               var10000 = 61;
               break;
            case 44:
               var10000 = 97;
               break;
            case 45:
               var10000 = 196;
               break;
            case 46:
               var10000 = 217;
               break;
            case 47:
               var10000 = 153;
               break;
            case 48:
               var10000 = 29;
               break;
            case 49:
               var10000 = 216;
               break;
            case 50:
               var10000 = 42;
               break;
            case 51:
               var10000 = 160;
               break;
            case 52:
               var10000 = 45;
               break;
            case 53:
               var10000 = 18;
               break;
            case 54:
               var10000 = 36;
               break;
            case 55:
               var10000 = 32;
               break;
            case 56:
               var10000 = 1;
               break;
            case 57:
               var10000 = 224;
               break;
            case 58:
               var10000 = 147;
               break;
            case 59:
               var10000 = 188;
               break;
            case 60:
               var10000 = 62;
               break;
            case 61:
               var10000 = 70;
               break;
            case 62:
               var10000 = 191;
               break;
            case 63:
               var10000 = 49;
               break;
            case 64:
               var10000 = 164;
               break;
            case 65:
               var10000 = 225;
               break;
            case 66:
               var10000 = 210;
               break;
            case 67:
               var10000 = 166;
               break;
            case 68:
               var10000 = 190;
               break;
            case 69:
               var10000 = 31;
               break;
            case 70:
               var10000 = 121;
               break;
            case 71:
               var10000 = 7;
               break;
            case 72:
               var10000 = 200;
               break;
            case 73:
               var10000 = 235;
               break;
            case 74:
               var10000 = 72;
               break;
            case 75:
               var10000 = 144;
               break;
            case 76:
               var10000 = 83;
               break;
            case 77:
               var10000 = 100;
               break;
            case 78:
               var10000 = 253;
               break;
            case 79:
               var10000 = 122;
               break;
            case 80:
               var10000 = 158;
               break;
            case 81:
               var10000 = 98;
               break;
            case 82:
               var10000 = 94;
               break;
            case 83:
               var10000 = 11;
               break;
            case 84:
               var10000 = 195;
               break;
            case 85:
               var10000 = 154;
               break;
            case 86:
               var10000 = 127;
               break;
            case 87:
               var10000 = 228;
               break;
            case 88:
               var10000 = 8;
               break;
            case 89:
               var10000 = 203;
               break;
            case 90:
               var10000 = 99;
               break;
            case 91:
               var10000 = 185;
               break;
            case 92:
               var10000 = 73;
               break;
            case 93:
               var10000 = 84;
               break;
            case 94:
               var10000 = 165;
               break;
            case 95:
               var10000 = 167;
               break;
            case 96:
               var10000 = 124;
               break;
            case 97:
               var10000 = 244;
               break;
            case 98:
               var10000 = 88;
               break;
            case 99:
               var10000 = 123;
               break;
            case 100:
               var10000 = 170;
               break;
            case 101:
               var10000 = 229;
               break;
            case 102:
               var10000 = 202;
               break;
            case 103:
               var10000 = 13;
               break;
            case 104:
               var10000 = 194;
               break;
            case 105:
               var10000 = 67;
               break;
            case 106:
               var10000 = 22;
               break;
            case 107:
               var10000 = 101;
               break;
            case 108:
               var10000 = 112;
               break;
            case 109:
               var10000 = 245;
               break;
            case 110:
               var10000 = 220;
               break;
            case 111:
               var10000 = 146;
               break;
            case 112:
               var10000 = 140;
               break;
            case 113:
               var10000 = 138;
               break;
            case 114:
               var10000 = 12;
               break;
            case 115:
               var10000 = 120;
               break;
            case 116:
               var10000 = 131;
               break;
            case 117:
               var10000 = 226;
               break;
            case 118:
               var10000 = 53;
               break;
            case 119:
               var10000 = 232;
               break;
            case 120:
               var10000 = 250;
               break;
            case 121:
               var10000 = 51;
               break;
            case 122:
               var10000 = 77;
               break;
            case 123:
               var10000 = 187;
               break;
            case 124:
               var10000 = 76;
               break;
            case 125:
               var10000 = 33;
               break;
            case 126:
               var10000 = 93;
               break;
            case 127:
               var10000 = 16;
               break;
            case 128:
               var10000 = 40;
               break;
            case 129:
               var10000 = 233;
               break;
            case 130:
               var10000 = 236;
               break;
            case 131:
               var10000 = 87;
               break;
            case 132:
               var10000 = 63;
               break;
            case 133:
               var10000 = 75;
               break;
            case 134:
               var10000 = 214;
               break;
            case 135:
               var10000 = 10;
               break;
            case 136:
               var10000 = 91;
               break;
            case 137:
               var10000 = 212;
               break;
            case 138:
               var10000 = 86;
               break;
            case 139:
               var10000 = 239;
               break;
            case 140:
               var10000 = 58;
               break;
            case 141:
               var10000 = 68;
               break;
            case 142:
               var10000 = 161;
               break;
            case 143:
               var10000 = 107;
               break;
            case 144:
               var10000 = 184;
               break;
            case 145:
               var10000 = 198;
               break;
            case 146:
               var10000 = 65;
               break;
            case 147:
               var10000 = 181;
               break;
            case 148:
               var10000 = 119;
               break;
            case 149:
               var10000 = 55;
               break;
            case 150:
               var10000 = 134;
               break;
            case 151:
               var10000 = 182;
               break;
            case 152:
               var10000 = 156;
               break;
            case 153:
               var10000 = 28;
               break;
            case 154:
               var10000 = 137;
               break;
            case 155:
               var10000 = 78;
               break;
            case 156:
               var10000 = 175;
               break;
            case 157:
               var10000 = 251;
               break;
            case 158:
               var10000 = 218;
               break;
            case 159:
               var10000 = 183;
               break;
            case 160:
               var10000 = 21;
               break;
            case 161:
               var10000 = 56;
               break;
            case 162:
               var10000 = 108;
               break;
            case 163:
               var10000 = 113;
               break;
            case 164:
               var10000 = 125;
               break;
            case 165:
               var10000 = 64;
               break;
            case 166:
               var10000 = 223;
               break;
            case 167:
               var10000 = 136;
               break;
            case 168:
               var10000 = 221;
               break;
            case 169:
               var10000 = 177;
               break;
            case 170:
               var10000 = 47;
               break;
            case 171:
               var10000 = 104;
               break;
            case 172:
               var10000 = 115;
               break;
            case 173:
               var10000 = 213;
               break;
            case 174:
               var10000 = 162;
               break;
            case 175:
               var10000 = 14;
               break;
            case 176:
               var10000 = 199;
               break;
            case 177:
               var10000 = 186;
               break;
            case 178:
               var10000 = 215;
               break;
            case 179:
               var10000 = 9;
               break;
            case 180:
               var10000 = 145;
               break;
            case 181:
               var10000 = 17;
               break;
            case 182:
               var10000 = 81;
               break;
            case 183:
               var10000 = 243;
               break;
            case 184:
               var10000 = 109;
               break;
            case 185:
               var10000 = 231;
               break;
            case 186:
               var10000 = 59;
               break;
            case 187:
               var10000 = 4;
               break;
            case 188:
               var10000 = 126;
               break;
            case 189:
               var10000 = 2;
               break;
            case 190:
               var10000 = 211;
               break;
            case 191:
               var10000 = 20;
               break;
            case 192:
               var10000 = 3;
               break;
            case 193:
               var10000 = 24;
               break;
            case 194:
               var10000 = 19;
               break;
            case 195:
               var10000 = 74;
               break;
            case 196:
               var10000 = 249;
               break;
            case 197:
               var10000 = 90;
               break;
            case 198:
               var10000 = 66;
               break;
            case 199:
               var10000 = 141;
               break;
            case 200:
               var10000 = 60;
               break;
            case 201:
               var10000 = 204;
               break;
            case 202:
               var10000 = 79;
               break;
            case 203:
               var10000 = 163;
               break;
            case 204:
               var10000 = 50;
               break;
            case 205:
               var10000 = 237;
               break;
            case 206:
               var10000 = 102;
               break;
            case 207:
               var10000 = 150;
               break;
            case 208:
               var10000 = 143;
               break;
            case 209:
               var10000 = 222;
               break;
            case 210:
               var10000 = 27;
               break;
            case 211:
               var10000 = 173;
               break;
            case 212:
               var10000 = 26;
               break;
            case 213:
               var10000 = 208;
               break;
            case 214:
               var10000 = 151;
               break;
            case 215:
               var10000 = 23;
               break;
            case 216:
               var10000 = 34;
               break;
            case 217:
               var10000 = 41;
               break;
            case 218:
               var10000 = 44;
               break;
            case 219:
               var10000 = 139;
               break;
            case 220:
               var10000 = 247;
               break;
            case 221:
               var10000 = 6;
               break;
            case 222:
               var10000 = 38;
               break;
            case 223:
               var10000 = 168;
               break;
            case 224:
               var10000 = 205;
               break;
            case 225:
               var10000 = 52;
               break;
            case 226:
               var10000 = 149;
               break;
            case 227:
               var10000 = 174;
               break;
            case 228:
               var10000 = 227;
               break;
            case 229:
               var10000 = 89;
               break;
            case 230:
               var10000 = 54;
               break;
            case 231:
               var10000 = 111;
               break;
            case 232:
               var10000 = 171;
               break;
            case 233:
               var10000 = 82;
               break;
            case 234:
               var10000 = 157;
               break;
            case 235:
               var10000 = 255;
               break;
            case 236:
               var10000 = 103;
               break;
            case 237:
               var10000 = 180;
               break;
            case 238:
               var10000 = 207;
               break;
            case 239:
               var10000 = 234;
               break;
            case 240:
               var10000 = 155;
               break;
            case 241:
               var10000 = 152;
               break;
            case 242:
               var10000 = 179;
               break;
            case 243:
               var10000 = 197;
               break;
            case 244:
               var10000 = 110;
               break;
            case 245:
               var10000 = 39;
               break;
            case 246:
               var10000 = 252;
               break;
            case 247:
               var10000 = 37;
               break;
            case 248:
               var10000 = 219;
               break;
            case 249:
               var10000 = 5;
               break;
            case 250:
               var10000 = 71;
               break;
            case 251:
               var10000 = 92;
               break;
            case 252:
               var10000 = 35;
               break;
            case 253:
               var10000 = 0;
               break;
            case 254:
               var10000 = 206;
               break;
            default:
               var10000 = 95;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6209;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String var10;
      char[] var30;
      String[] var13 = new String[21];
      int var11 = 0;
      var10 = "彍勀狠板3\u0004\u0006厒猡攱牥柸¯\u0004梼枫暃攳\u0010+¨ \u008aÀé\u0011\u008e|å,¹í´â\u0006\fWVöã µ\u008cP,\u008fì-\u000e¼\u00ad\u0098Ü.CGâ0b\u00ad\u001eÓ\u009d\u001e\r<d\u0018X»\u0002Ä\u001e¬`\u0090{\u0086Ä¢\u008c\u0004\u0080*\\¦[à\u0099\u0019\u0002 \u001f\u0084\t很姛宠袣庎儘關迖仡\u0006巤總昧朾旊狭\t晲敐斛仵嶢仿违宾报\u0004>\u0005\u0007C\u0004宻衻攒彪\u0004暢敐旣忔\u0012æyÓFG\u0010j\u008a\u0085=\u001bçU \u0019\u009c\u001f(\u0002Ú~\u0006工縳昇柿旎狕\fÞo\u0003gû\u0090®é\u0000 暺攑\t歭圭桚柂昳旓zUV\u0011G\bô(àÌ\u0084\u007f-jÌ\u0091\u001e!¿\u0000\u0083";
      int var12 = "彍勀狠板3\u0004\u0006厒猡攱牥柸¯\u0004梼枫暃攳\u0010+¨ \u008aÀé\u0011\u008e|å,¹í´â\u0006\fWVöã µ\u008cP,\u008fì-\u000e¼\u00ad\u0098Ü.CGâ0b\u00ad\u001eÓ\u009d\u001e\r<d\u0018X»\u0002Ä\u001e¬`\u0090{\u0086Ä¢\u008c\u0004\u0080*\\¦[à\u0099\u0019\u0002 \u001f\u0084\t很姛宠袣庎儘關迖仡\u0006巤總昧朾旊狭\t晲敐斛仵嶢仿违宾报\u0004>\u0005\u0007C\u0004宻衻攒彪\u0004暢敐旣忔\u0012æyÓFG\u0010j\u008a\u0085=\u001bçU \u0019\u009c\u001f(\u0002Ú~\u0006工縳昇柿旎狕\fÞo\u0003gû\u0090®é\u0000 暺攑\t歭圭桚柂昳旓zUV\u0011G\bô(àÌ\u0084\u007f-jÌ\u0091\u001e!¿\u0000\u0083"
         .length();
      r(null);
      char var9 = 6;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 102;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 44;
                        break;
                     case 1:
                        var58 = 88;
                        break;
                     case 2:
                        var58 = 23;
                        break;
                     case 3:
                        var58 = 14;
                        break;
                     case 4:
                        var58 = 28;
                        break;
                     case 5:
                        var58 = 9;
                        break;
                     default:
                        var58 = 113;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     c = var13;
                     d = new String[21];
                     long var0 = 16358560411600082L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "_v{k\u0001\u00145,8º8!\u0006fù\u009c\u007fDFýäh,\u0012";
                     int var5 = "_v{k\u0001\u00145,8º8!\u0006fù\u009c\u007fDFýäh,\u0012".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
                              ((long)var7[0] & 255L) << 56
                                 | ((long)var7[1] & 255L) << 48
                                 | ((long)var7[2] & 255L) << 40
                                 | ((long)var7[3] & 255L) << 32
                                 | ((long)var7[4] & 255L) << 24
                                 | ((long)var7[5] & 255L) << 16
                                 | ((long)var7[6] & 255L) << 8
                                 | (long)var7[7] & 255L
                           )
                           ^ var0;
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     e = var6;
                     f = new Integer[3];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "\u0087EQ<éó\u0018%\u0003\u009c´ò\b毢坎仝辋曌旌,\u0005";
                  var12 = "\u0087EQ<éó\u0018%\u0003\u009c´ò\b毢坎仝辋曌旌,\u0005".length();
                  var9 = '\f';
                  var16 = -1;
            }

            var10000 = 49;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }
}





