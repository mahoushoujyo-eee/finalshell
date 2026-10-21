package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.Ky4;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import net.miginfocom.swing.MigLayout;

public class Na2 extends DefaultTreeCellRenderer {
   public static Border F;
   public static JT y;
   public static ImageIcon J;
   public static ImageIcon l;
   public static ImageIcon C;
   public static ImageIcon w;
   public JPanel x;
   public JLabel e;
   public JLabel V;
   public JLabel H;
   public JLabel O;
   public JLabel m;
   public int Q;
   public HashMap d;
   public int M;
   public static String[] a;
   public static String[] b;
   public static long[] c;
   public static Integer[] f;

   public Na2() {
      Registry.lookupField(473953447235666329L).setInt(this, a(30496, 9174425883681745552L));
      HashMap var10001 = new HashMap();
      long var3 = 269228622668640057L;
      HashMap var2 = var10001;
      Ref.s(269228622668640057L, var2, var3);
      Registry.lookupField(285702699307164542L).setInt(this, a(10916, 2811595078739572503L));
      com.finalshell.ui.panel.AA.z();
      JPanel var10003 = new JPanel();
      long var5 = 518604784742329380L;
      JPanel var4 = var10003;
      Ref.s(518604784742329380L, var4, var5);
      Object var6 = 518604784742329380L;
      ((JPanel)Ref.g(518604784742329380L, var6)).setOpaque(false);
      Object var8 = 518604784742329380L;
      ((JPanel)Ref.g(518604784742329380L, var8)).setLayout(new MigLayout(a(4096, -17585), a(4105, -4449), ""));
      JLabel var10006 = new JLabel();
      long var11 = 381547437801812312L;
      JLabel var10 = var10006;
      Ref.s(381547437801812312L, var10, var11);
      Object var12 = 381547437801812312L;
      ((JLabel)Ref.g(381547437801812312L, var12)).setOpaque(false);
      Object var14 = 381547437801812312L;
      ((JLabel)Ref.g(381547437801812312L, var14)).setText(" ");
      Object var16 = 518604784742329380L;
      JPanel var10008 = (JPanel)Ref.g(518604784742329380L, var16);
      Object var18 = 381547437801812312L;
      this.add((JLabel)Ref.g(381547437801812312L, var18), a(4111, 5522));
      JLabel var10010 = new JLabel();
      long var21 = 157407781884746303L;
      JLabel var20 = var10010;
      Ref.s(157407781884746303L, var20, var21);
      Object var22 = 157407781884746303L;
      ((JLabel)Ref.g(157407781884746303L, var22)).setOpaque(false);
      Object var24 = 518604784742329380L;
      JPanel var10012 = (JPanel)Ref.g(518604784742329380L, var24);
      Object var26 = 157407781884746303L;
      this.add((JLabel)Ref.g(157407781884746303L, var26), a(4102, -11542));
      JLabel var10014 = new JLabel();
      long var29 = 166835330888289814L;
      JLabel var28 = var10014;
      Ref.s(166835330888289814L, var28, var29);
      Object var30 = 166835330888289814L;
      ((JLabel)Ref.g(166835330888289814L, var30)).setOpaque(false);
      Object var32 = 518604784742329380L;
      JPanel var10016 = (JPanel)Ref.g(518604784742329380L, var32);
      Object var34 = 166835330888289814L;
      this.add((JLabel)Ref.g(166835330888289814L, var34), a(4098, -21257));
      JLabel var10018 = new JLabel();
      long var37 = 307638245160019981L;
      JLabel var36 = var10018;
      Ref.s(307638245160019981L, var36, var37);
      Object var38 = 307638245160019981L;
      ((JLabel)Ref.g(307638245160019981L, var38)).setOpaque(false);
      Object var40 = 518604784742329380L;
      JPanel var10020 = (JPanel)Ref.g(518604784742329380L, var40);
      Object var42 = 307638245160019981L;
      this.add((JLabel)Ref.g(307638245160019981L, var42), a(4108, 13912));
      JLabel var10022 = new JLabel();
      long var45 = 474258259865824289L;
      JLabel var44 = var10022;
      Ref.s(474258259865824289L, var44, var45);
      Object var46 = 474258259865824289L;
      ((JLabel)Ref.g(474258259865824289L, var46)).setOpaque(false);
      Object var48 = 474258259865824289L;
      ((JLabel)Ref.g(474258259865824289L, var48)).setBackground(Color.blue);
      Object var50 = 518604784742329380L;
      JPanel var10025 = (JPanel)Ref.g(518604784742329380L, var50);
      Object var52 = 474258259865824289L;
      this.add((JLabel)Ref.g(474258259865824289L, var52), a(4097, 29898));
      Object var54 = 518604784742329380L;
      ((JPanel)Ref.g(518604784742329380L, var54)).setBorder((Border)Registry.lookupField(362423258401477884L).get(null));
      Object var56 = 518604784742329380L;
      ((JPanel)Ref.g(518604784742329380L, var56)).setBackground(Color.yellow);
      if (Ky4.F$arrString() != null) {
         com.finalshell.ui.panel.AA.F("Syungc");
      }
   }

   public static ImageIcon F(Tf4 var0, boolean var1) {
      return !var1 ? (ImageIcon)Registry.lookupField(244400432181760905L).get(null) : (ImageIcon)Registry.lookupField(511182230017205609L).get(null);
   }

   public static ImageIcon Y(com.finalshell.ui.model.Ck4 var0) {
      String var1 = com.finalshell.ui.panel.AA.z();
      Integer var10001 = (Integer)(Registry.emptyArgs());
      long var3 = 528672956857361353L;
      Object var2 = var10001;
      var10001 = Ref.h(528672956857361353L, var2, var3);

      try {
         var10001 = (Integer)var10001;
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      int var10002 = Registry.lookupField(292712586650823274L).getInt(null);
      if (var1 == null) {
         if (var10001 == var10002) {
            return (ImageIcon)Registry.lookupField(392185280097364709L).get(null);
         }

         var10001 = (Integer)(var0);
         Object[] var10 = Registry.emptyArgs();
         long var5 = 528672956857361353L;
         Object[] var4 = var10;
         Object var11 = Ref.h(528672956857361353L, var4, var5);

         try {
            var10002 = (Integer)var11;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }

         Registry.lookupField(590765520000496083L).getInt(null);
      }

      return var10001 == var10002
         ? (ImageIcon)Registry.lookupField(478725326680392680L).get(null)
         : (ImageIcon)Registry.lookupField(478725326680392680L).get(null);
   }

   public JPanel t(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      boolean var166;
      boolean var174;
      Integer var179;
      String var8;
      Object var11;
      String var10000 = com.finalshell.ui.panel.AA.z();
      this.setBackgroundNonSelectionColor(new Color(0, 0, 0, 0));
      int var10 = a(3023, 2560562060492084862L);
      var8 = var10000;
      var11 = 0;
      label248:
      if (var2 != null) {
         Color var12 = Color.black;
         var10000 = (String)(var2.getClass());
         if (var8 == null) {
            if (!var10000.equals(DefaultMutableTreeNode.class)) {
               break label248;
            }

            var10000 = (String)var2;
         }

         DefaultMutableTreeNode var13 = (DefaultMutableTreeNode)var10000;
         Object var14 = var13.getUserObject();
         String var15 = " ";
         if (var8 == null) {
            File var145;
            label239: {
               label238:
               if (var14 != null) {
                  boolean var141 = var14.getClass().equals(Tf4.class);
                  if (var8 == null) {
                     if (var141) {
                        Tf4 var16 = (Tf4)var14;
                        var145 = Registry.emptyArgs();
                        long var26 = 543633160597441792L;
                        Object var25 = (Object[])var145;
                        var145 = Ref.h(543633160597441792L, var25, var26);

                        try {
                           var145 = (File)var145;
                        } catch (InvocationTargetException var128) {
                           throw var128.getTargetException();
                        }

                        label255: {
                           label256: {
                              String var17;
                              label230: {
                                 var17 = var145.getName();
                                 String var144 = var17;
                                 if (var8 == null) {
                                    if (!var17.equals(a(4107, -18934))) {
                                       break label230;
                                    }

                                    var144 = a(4099, -8609);
                                 }

                                 var15 = var144;
                                 if (var8 == null) {
                                    break label256;
                                 }
                              }

                              Registry.emptyArgs();
                              long var27 = 270389152141252877L;
                              Ref.h2(270389152141252877L, var27);
                              Object[] var10003 = Registry.emptyArgs();
                              long var30 = 410905379772103887L;
                              Object[] var29 = var10003;
                              Ref.h(410905379772103887L, var29, var30);
                              LO3 var10004 = (LO3)(Registry.packArgs(var17));
                              long var32 = 133273064107181210L;
                              Object var31 = var10004;
                              var10004 = Ref.h(133273064107181210L, var31, var32);

                              try {
                                 var10004 = (LO3)var10004;
                              } catch (InvocationTargetException var127) {
                                 throw var127.getTargetException();
                              }

                              LO3 var18 = var10004;
                              String var10005 = (String)(Registry.emptyArgs());
                              long var34 = 286931176286176762L;
                              Object var33 = var10005;
                              var10005 = Ref.h(286931176286176762L, var33, var34);

                              try {
                                 var10005 = (String)var10005;
                              } catch (InvocationTargetException var126) {
                                 throw var126.getTargetException();
                              }

                              var15 = var10005;
                              if (var8 != null) {
                                 break label255;
                              }

                              Registry.packArgs(var18);
                              long var35 = 366543685241882690L;
                              Object var10006 = Ref.h2(366543685241882690L, var35);

                              try {
                                 var166 = (Boolean)var10006;
                              } catch (InvocationTargetException var125) {
                                 throw var125.getTargetException();
                              }

                              if (var166) {
                                 var12 = Color.red;
                              }
                           }

                           Object var37 = 381547437801812312L;
                           JLabel var10002 = (JLabel)Ref.g(381547437801812312L, var37);
                           Object var151 = Registry.packArgs(var16, var4);
                           long var39 = 237585746261529104L;
                           Object var159 = Ref.h2(237585746261529104L, var39);

                           try {
                              var159 = (ImageIcon)var159;
                           } catch (InvocationTargetException var124) {
                              throw var124.getTargetException();
                           }

                           var151.setIcon((Icon)var159);
                           Object var41 = 157407781884746303L;
                           ((JLabel)Ref.g(157407781884746303L, var41)).setText("");
                           Object var43 = 166835330888289814L;
                           ((JLabel)Ref.g(166835330888289814L, var43)).setText("");
                           Object var45 = 307638245160019981L;
                           ((JLabel)Ref.g(307638245160019981L, var45)).setText("");
                           Object var47 = 474258259865824289L;
                           ((JLabel)Ref.g(474258259865824289L, var47)).setText("");
                        }

                        if (var8 == null) {
                           break label238;
                        }
                     }

                     var141 = var14.getClass().equals(com.finalshell.ui.model.Ck4.class);
                  }

                  var145 = (File)(var8);
                  if (var8 != null) {
                     break label239;
                  }

                  if (var141) {
                     com.finalshell.ui.model.Ck4 var134 = (com.finalshell.ui.model.Ck4)var14;
                     Object var49 = 381547437801812312L;
                     var145 = (File)((JLabel)Ref.g(381547437801812312L, var49));
                     Object[] var146 = Registry.packArgs(var134);
                     long var51 = 169066270618240407L;
                     String var152 = (String)Ref.h2(169066270618240407L, var51);

                     try {
                        var152 = (ImageIcon)var152;
                     } catch (InvocationTargetException var123) {
                        throw var123.getTargetException();
                     }

                     var146.setIcon((Icon)var152);
                     var152 = Registry.emptyArgs();
                     long var54 = 396085629172753019L;
                     Object var53 = (Object[])var152;
                     var152 = Ref.h(396085629172753019L, var53, var54);

                     try {
                        var152 = (String)var152;
                     } catch (InvocationTargetException var122) {
                        throw var122.getTargetException();
                     }

                     var15 = var152.replace(a(4104, 17200), "");
                     Registry.emptyArgs();
                     long var55 = 270389152141252877L;
                     Ref.h2(270389152141252877L, var55);
                     Object[] var164 = Registry.emptyArgs();
                     long var58 = 410905379772103887L;
                     Object[] var57 = var164;
                     Ref.h(410905379772103887L, var57, var58);
                     Lv4_2 var10007 = (Lv4_2)(Registry.emptyArgs());
                     long var60 = 605430732347023634L;
                     Object var59 = var10007;
                     var10007 = Registry.packArgs(Ref.h(605430732347023634L, var59, var60));
                     long var62 = 489768706953623433L;
                     Object var61 = var10007;
                     var10007 = Ref.h(489768706953623433L, var61, var62);

                     try {
                        var10007 = (Lv4_2)var10007;
                     } catch (InvocationTargetException var121) {
                        throw var121.getTargetException();
                     }

                     Lv4_2 var137 = var10007;
                     Lv4_2 var170 = var137;
                     if (var8 == null) {
                        if (var137 != null) {
                           String var10008 = (String)(Registry.emptyArgs());
                           long var64 = 286931176286176762L;
                           Object var63 = var10008;
                           var10008 = Ref.h(286931176286176762L, var63, var64);

                           try {
                              var10008 = (String)var10008;
                           } catch (InvocationTargetException var120) {
                              throw var120.getTargetException();
                           }

                           var15 = var10008;
                           Object var65 = 157407781884746303L;
                           JLabel var10009 = (JLabel)Ref.g(157407781884746303L, var65);
                           String var10011 = (String)(Registry.emptyArgs());
                           long var68 = 380415140795833934L;
                           Object var67 = var10011;
                           var10011 = Ref.h(380415140795833934L, var67, var68);

                           try {
                              var10011 = (String)var10011;
                           } catch (InvocationTargetException var119) {
                              throw var119.getTargetException();
                           }

                           var137.setText(var10011);
                           Object var69 = 166835330888289814L;
                           JLabel var177 = (JLabel)Ref.g(166835330888289814L, var69);
                           StringBuilder var10012 = new StringBuilder();
                           Object var10014 = Registry.emptyArgs();
                           long var72 = 255354522009994316L;
                           Object var71 = var10014;
                           var10014 = Ref.h(255354522009994316L, var71, var72);

                           try {
                              var179 = (Integer)var10014;
                           } catch (InvocationTargetException var118) {
                              throw var118.getTargetException();
                           }

                           var10012.setText(var137.append(var179).append("").toString());
                           Object var73 = 307638245160019981L;
                           JLabel var10013 = (JLabel)Ref.g(307638245160019981L, var73);
                           String var10015 = (String)(Registry.emptyArgs());
                           long var76 = 255973732097233937L;
                           Object var75 = var10015;
                           var10015 = Ref.h(255973732097233937L, var75, var76);

                           try {
                              var10015 = (String)var10015;
                           } catch (InvocationTargetException var117) {
                              throw var117.getTargetException();
                           }

                           var137.setText(var10015);
                           Object var77 = 474258259865824289L;
                           JLabel var182 = (JLabel)Ref.g(474258259865824289L, var77);
                           String var10017 = (String)(Registry.emptyArgs());
                           long var80 = 218711337515318169L;
                           Object var79 = var10017;
                           var10017 = Ref.h(218711337515318169L, var79, var80);

                           try {
                              var10017 = (String)var10017;
                           } catch (InvocationTargetException var116) {
                              throw var116.getTargetException();
                           }

                           var137.setText(var10017);
                        }

                        var170 = var137;
                     }

                     Registry.packArgs(var170);
                     long var81 = 366543685241882690L;
                     Object var173 = Ref.h2(366543685241882690L, var81);

                     try {
                        var174 = (Boolean)var173;
                     } catch (InvocationTargetException var115) {
                        throw var115.getTargetException();
                     }

                     if (var8 != null) {
                        break label239;
                     }

                     if (var174) {
                        var12 = Color.red;
                     }
                  }
               }

               Object var83 = 381547437801812312L;
               ((JLabel)Ref.g(381547437801812312L, var83)).setText(var15);
               var145 = (File)(Registry.lookupField(473953447235666329L).getInt(this) - var13.getLevel() * var10);
            }

            var11 = var145;
         }

         Object var85 = 381547437801812312L;
         Dimension var135 = ((JLabel)Ref.g(381547437801812312L, var85)).getPreferredSize();
         var135.setSize((double)var11, var135.getHeight());
         Object var87 = 381547437801812312L;
         ((JLabel)Ref.g(381547437801812312L, var87)).setMaximumSize(var135);
         Object var89 = 381547437801812312L;
         ((JLabel)Ref.g(381547437801812312L, var89)).setMinimumSize(var135);
         Object var91 = 381547437801812312L;
         ((JLabel)Ref.g(381547437801812312L, var91)).setPreferredSize(var135);
         Object var93 = 381547437801812312L;
         ((JLabel)Ref.g(381547437801812312L, var93)).setForeground(var12);
         Object var95 = 157407781884746303L;
         ((JLabel)Ref.g(157407781884746303L, var95)).setForeground(var12);
         Object var97 = 166835330888289814L;
         ((JLabel)Ref.g(166835330888289814L, var97)).setForeground(var12);
         Object var99 = 307638245160019981L;
         ((JLabel)Ref.g(307638245160019981L, var99)).setForeground(var12);
         Object var101 = 474258259865824289L;
         ((JLabel)Ref.g(474258259865824289L, var101)).setForeground(var12);
      }

      Object var103 = 518604784742329380L;
      Component[] var129 = ((JPanel)Ref.g(518604784742329380L, var103)).getComponents();
      String var130 = var2.hashCode() + "";
      Object var105 = 269228622668640057L;
      ArrayList var131 = (ArrayList)((HashMap)Ref.g(269228622668640057L, var105)).get(var130);
      ArrayList var147 = var131;
      if (var8 == null) {
         if (var131 == null) {
            var131 = new ArrayList();
         }

         var147 = var131;
      }

      var147.clear();
      Component[] var132 = var129;
      int var136 = var129.length;
      int var138 = 0;

      while (true) {
         if (var138 < var136) {
            Component var139 = var132[var138];
            JLabel var19 = (JLabel)var139;
            int var20 = 0;
            JLabel var148 = var19;
            if (var8 == null) {
               Icon var149 = var19.getIcon();
               if (var8 != null) {
                  break;
               }

               if (var149 != null) {
                  var20 = var19.getIcon().getIconWidth() + var19.getIconTextGap();
               }

               var148 = var19;
            }

            int var21;
            String var22;
            label195: {
               var21 = var148.getX();
               var22 = var19.getText();
               String var150 = var22;
               if (var8 == null) {
                  if (var22 != null) {
                     break label195;
                  }

                  var150 = "";
               }

               var22 = var150;
            }

            int var23 = var21 + var19.getFontMetrics(var19.getFont()).stringWidth(var22) + var20;
            int[] var24 = new int[]{var21, var23};
            var131.add(var24);
            var138++;
            if (var8 == null) {
               continue;
            }
         }

         Object var107 = 269228622668640057L;
         ((HashMap)Ref.g(269228622668640057L, var107)).put(var6, var131);
         break;
      }

      int var133 = Registry.lookupField(285702699307164542L).getInt(this) - (Registry.lookupField(473953447235666329L).getInt(this) - var11);
      Object var109 = 518604784742329380L;
      JPanel var161 = (JPanel)Ref.g(518604784742329380L, var109);
      Dimension var165;
      Object var111 = 518604784742329380L;
var133 = new Na2((int)this, ((JPanel)Ref.g(518604784742329380L, var111)).getPreferredSize().height);
      var165.setPreferredSize(var165);
      Object var113 = 518604784742329380L;
      return (JPanel)Ref.g(518604784742329380L, var113);
   }

   public boolean C(int var1, int var2) {
      com.finalshell.ui.panel.AA.z();
      Object var11 = 269228622668640057L;
      ArrayList var4 = (ArrayList)((HashMap)Ref.g(269228622668640057L, var11)).get(var1);
      Na2 var3 = this;
      int var5 = 0;
      Iterator var6 = var4.iterator();

      int var10001;
      while (true) {
         label45:
         if (var6.hasNext()) {
            int[] var7 = (int[])var6.next();
            int var8 = var7[0];
            int var9 = var7[1];
            var10001 = var2;
            if (var3 != null) {
               break;
            }

            label42: {
               label41: {
                  int var10002 = var8;
                  if (var3 == null) {
                     if (var2 < var8) {
                        break label41;
                     }

                     var10001 = var2;
                     if (var3 != null) {
                        break label42;
                     }

                     var10002 = var9;
                  }

                  if (var10001 <= var10002) {
                     var10001 = 1;
                     break label42;
                  }
               }

               var10001 = 0;
            }

            label31: {
               int var10 = var10001;
               var10001 = var10;
               if (var3 == null) {
                  if (var10 == 0) {
                     break label31;
                  }

                  var10001 = 1;
               }

               var5 = var10001;
               if (var3 == null) {
                  break label45;
               }
            }

            if (var3 == null) {
               continue;
            }
         }

         var10001 = var5;
         break;
      }

      return var10001 != 0;
   }

   @Override
   public Component getTreeCellRendererComponent(JTree var1, Object var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
      Object var10001 = Registry.packArgs(var1, var2, var3, var4, var5, var6, var7);
      long var9 = 509376097621868884L;
      Object var8 = var10001;
      var10001 = Ref.h(509376097621868884L, var8, var9);

      try {
         return (JPanel)var10001;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ 4106) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 73;
               break;
            case 1:
               var10000 = 129;
               break;
            case 2:
               var10000 = 190;
               break;
            case 3:
               var10000 = 149;
               break;
            case 4:
               var10000 = 140;
               break;
            case 5:
               var10000 = 104;
               break;
            case 6:
               var10000 = 98;
               break;
            case 7:
               var10000 = 4;
               break;
            case 8:
               var10000 = 1;
               break;
            case 9:
               var10000 = 85;
               break;
            case 10:
               var10000 = 23;
               break;
            case 11:
               var10000 = 55;
               break;
            case 12:
               var10000 = 186;
               break;
            case 13:
               var10000 = 79;
               break;
            case 14:
               var10000 = 124;
               break;
            case 15:
               var10000 = 175;
               break;
            case 16:
               var10000 = 84;
               break;
            case 17:
               var10000 = 35;
               break;
            case 18:
               var10000 = 91;
               break;
            case 19:
               var10000 = 226;
               break;
            case 20:
               var10000 = 136;
               break;
            case 21:
               var10000 = 133;
               break;
            case 22:
               var10000 = 197;
               break;
            case 23:
               var10000 = 234;
               break;
            case 24:
               var10000 = 134;
               break;
            case 25:
               var10000 = 223;
               break;
            case 26:
               var10000 = 69;
               break;
            case 27:
               var10000 = 18;
               break;
            case 28:
               var10000 = 132;
               break;
            case 29:
               var10000 = 80;
               break;
            case 30:
               var10000 = 13;
               break;
            case 31:
               var10000 = 221;
               break;
            case 32:
               var10000 = 76;
               break;
            case 33:
               var10000 = 245;
               break;
            case 34:
               var10000 = 166;
               break;
            case 35:
               var10000 = 116;
               break;
            case 36:
               var10000 = 28;
               break;
            case 37:
               var10000 = 165;
               break;
            case 38:
               var10000 = 53;
               break;
            case 39:
               var10000 = 163;
               break;
            case 40:
               var10000 = 239;
               break;
            case 41:
               var10000 = 243;
               break;
            case 42:
               var10000 = 205;
               break;
            case 43:
               var10000 = 36;
               break;
            case 44:
               var10000 = 3;
               break;
            case 45:
               var10000 = 168;
               break;
            case 46:
               var10000 = 57;
               break;
            case 47:
               var10000 = 252;
               break;
            case 48:
               var10000 = 139;
               break;
            case 49:
               var10000 = 33;
               break;
            case 50:
               var10000 = 143;
               break;
            case 51:
               var10000 = 48;
               break;
            case 52:
               var10000 = 179;
               break;
            case 53:
               var10000 = 110;
               break;
            case 54:
               var10000 = 19;
               break;
            case 55:
               var10000 = 177;
               break;
            case 56:
               var10000 = 218;
               break;
            case 57:
               var10000 = 38;
               break;
            case 58:
               var10000 = 247;
               break;
            case 59:
               var10000 = 101;
               break;
            case 60:
               var10000 = 141;
               break;
            case 61:
               var10000 = 246;
               break;
            case 62:
               var10000 = 103;
               break;
            case 63:
               var10000 = 21;
               break;
            case 64:
               var10000 = 224;
               break;
            case 65:
               var10000 = 29;
               break;
            case 66:
               var10000 = 194;
               break;
            case 67:
               var10000 = 207;
               break;
            case 68:
               var10000 = 87;
               break;
            case 69:
               var10000 = 120;
               break;
            case 70:
               var10000 = 160;
               break;
            case 71:
               var10000 = 20;
               break;
            case 72:
               var10000 = 182;
               break;
            case 73:
               var10000 = 15;
               break;
            case 74:
               var10000 = 137;
               break;
            case 75:
               var10000 = 61;
               break;
            case 76:
               var10000 = 176;
               break;
            case 77:
               var10000 = 112;
               break;
            case 78:
               var10000 = 231;
               break;
            case 79:
               var10000 = 93;
               break;
            case 80:
               var10000 = 253;
               break;
            case 81:
               var10000 = 41;
               break;
            case 82:
               var10000 = 119;
               break;
            case 83:
               var10000 = 122;
               break;
            case 84:
               var10000 = 146;
               break;
            case 85:
               var10000 = 77;
               break;
            case 86:
               var10000 = 131;
               break;
            case 87:
               var10000 = 156;
               break;
            case 88:
               var10000 = 164;
               break;
            case 89:
               var10000 = 152;
               break;
            case 90:
               var10000 = 159;
               break;
            case 91:
               var10000 = 59;
               break;
            case 92:
               var10000 = 9;
               break;
            case 93:
               var10000 = 216;
               break;
            case 94:
               var10000 = 255;
               break;
            case 95:
               var10000 = 25;
               break;
            case 96:
               var10000 = 153;
               break;
            case 97:
               var10000 = 114;
               break;
            case 98:
               var10000 = 170;
               break;
            case 99:
               var10000 = 92;
               break;
            case 100:
               var10000 = 45;
               break;
            case 101:
               var10000 = 138;
               break;
            case 102:
               var10000 = 2;
               break;
            case 103:
               var10000 = 40;
               break;
            case 104:
               var10000 = 230;
               break;
            case 105:
               var10000 = 105;
               break;
            case 106:
               var10000 = 173;
               break;
            case 107:
               var10000 = 195;
               break;
            case 108:
               var10000 = 10;
               break;
            case 109:
               var10000 = 68;
               break;
            case 110:
               var10000 = 235;
               break;
            case 111:
               var10000 = 248;
               break;
            case 112:
               var10000 = 121;
               break;
            case 113:
               var10000 = 237;
               break;
            case 114:
               var10000 = 83;
               break;
            case 115:
               var10000 = 70;
               break;
            case 116:
               var10000 = 161;
               break;
            case 117:
               var10000 = 51;
               break;
            case 118:
               var10000 = 97;
               break;
            case 119:
               var10000 = 88;
               break;
            case 120:
               var10000 = 115;
               break;
            case 121:
               var10000 = 227;
               break;
            case 122:
               var10000 = 187;
               break;
            case 123:
               var10000 = 204;
               break;
            case 124:
               var10000 = 24;
               break;
            case 125:
               var10000 = 50;
               break;
            case 126:
               var10000 = 185;
               break;
            case 127:
               var10000 = 54;
               break;
            case 128:
               var10000 = 58;
               break;
            case 129:
               var10000 = 145;
               break;
            case 130:
               var10000 = 75;
               break;
            case 131:
               var10000 = 225;
               break;
            case 132:
               var10000 = 181;
               break;
            case 133:
               var10000 = 178;
               break;
            case 134:
               var10000 = 202;
               break;
            case 135:
               var10000 = 191;
               break;
            case 136:
               var10000 = 67;
               break;
            case 137:
               var10000 = 56;
               break;
            case 138:
               var10000 = 94;
               break;
            case 139:
               var10000 = 8;
               break;
            case 140:
               var10000 = 169;
               break;
            case 141:
               var10000 = 211;
               break;
            case 142:
               var10000 = 206;
               break;
            case 143:
               var10000 = 193;
               break;
            case 144:
               var10000 = 171;
               break;
            case 145:
               var10000 = 100;
               break;
            case 146:
               var10000 = 189;
               break;
            case 147:
               var10000 = 167;
               break;
            case 148:
               var10000 = 151;
               break;
            case 149:
               var10000 = 210;
               break;
            case 150:
               var10000 = 148;
               break;
            case 151:
               var10000 = 127;
               break;
            case 152:
               var10000 = 196;
               break;
            case 153:
               var10000 = 203;
               break;
            case 154:
               var10000 = 174;
               break;
            case 155:
               var10000 = 128;
               break;
            case 156:
               var10000 = 81;
               break;
            case 157:
               var10000 = 123;
               break;
            case 158:
               var10000 = 157;
               break;
            case 159:
               var10000 = 254;
               break;
            case 160:
               var10000 = 34;
               break;
            case 161:
               var10000 = 74;
               break;
            case 162:
               var10000 = 5;
               break;
            case 163:
               var10000 = 63;
               break;
            case 164:
               var10000 = 109;
               break;
            case 165:
               var10000 = 244;
               break;
            case 166:
               var10000 = 126;
               break;
            case 167:
               var10000 = 183;
               break;
            case 168:
               var10000 = 17;
               break;
            case 169:
               var10000 = 22;
               break;
            case 170:
               var10000 = 90;
               break;
            case 171:
               var10000 = 49;
               break;
            case 172:
               var10000 = 241;
               break;
            case 173:
               var10000 = 198;
               break;
            case 174:
               var10000 = 219;
               break;
            case 175:
               var10000 = 6;
               break;
            case 176:
               var10000 = 208;
               break;
            case 177:
               var10000 = 251;
               break;
            case 178:
               var10000 = 86;
               break;
            case 179:
               var10000 = 180;
               break;
            case 180:
               var10000 = 52;
               break;
            case 181:
               var10000 = 27;
               break;
            case 182:
               var10000 = 150;
               break;
            case 183:
               var10000 = 71;
               break;
            case 184:
               var10000 = 82;
               break;
            case 185:
               var10000 = 62;
               break;
            case 186:
               var10000 = 228;
               break;
            case 187:
               var10000 = 238;
               break;
            case 188:
               var10000 = 43;
               break;
            case 189:
               var10000 = 108;
               break;
            case 190:
               var10000 = 89;
               break;
            case 191:
               var10000 = 158;
               break;
            case 192:
               var10000 = 242;
               break;
            case 193:
               var10000 = 65;
               break;
            case 194:
               var10000 = 201;
               break;
            case 195:
               var10000 = 250;
               break;
            case 196:
               var10000 = 99;
               break;
            case 197:
               var10000 = 188;
               break;
            case 198:
               var10000 = 39;
               break;
            case 199:
               var10000 = 214;
               break;
            case 200:
               var10000 = 147;
               break;
            case 201:
               var10000 = 249;
               break;
            case 202:
               var10000 = 78;
               break;
            case 203:
               var10000 = 46;
               break;
            case 204:
               var10000 = 32;
               break;
            case 205:
               var10000 = 192;
               break;
            case 206:
               var10000 = 47;
               break;
            case 207:
               var10000 = 232;
               break;
            case 208:
               var10000 = 106;
               break;
            case 209:
               var10000 = 135;
               break;
            case 210:
               var10000 = 118;
               break;
            case 211:
               var10000 = 113;
               break;
            case 212:
               var10000 = 155;
               break;
            case 213:
               var10000 = 184;
               break;
            case 214:
               var10000 = 130;
               break;
            case 215:
               var10000 = 117;
               break;
            case 216:
               var10000 = 60;
               break;
            case 217:
               var10000 = 215;
               break;
            case 218:
               var10000 = 229;
               break;
            case 219:
               var10000 = 233;
               break;
            case 220:
               var10000 = 154;
               break;
            case 221:
               var10000 = 0;
               break;
            case 222:
               var10000 = 31;
               break;
            case 223:
               var10000 = 240;
               break;
            case 224:
               var10000 = 26;
               break;
            case 225:
               var10000 = 172;
               break;
            case 226:
               var10000 = 96;
               break;
            case 227:
               var10000 = 217;
               break;
            case 228:
               var10000 = 220;
               break;
            case 229:
               var10000 = 7;
               break;
            case 230:
               var10000 = 200;
               break;
            case 231:
               var10000 = 11;
               break;
            case 232:
               var10000 = 37;
               break;
            case 233:
               var10000 = 44;
               break;
            case 234:
               var10000 = 142;
               break;
            case 235:
               var10000 = 212;
               break;
            case 236:
               var10000 = 125;
               break;
            case 237:
               var10000 = 95;
               break;
            case 238:
               var10000 = 14;
               break;
            case 239:
               var10000 = 107;
               break;
            case 240:
               var10000 = 162;
               break;
            case 241:
               var10000 = 199;
               break;
            case 242:
               var10000 = 222;
               break;
            case 243:
               var10000 = 12;
               break;
            case 244:
               var10000 = 72;
               break;
            case 245:
               var10000 = 111;
               break;
            case 246:
               var10000 = 102;
               break;
            case 247:
               var10000 = 144;
               break;
            case 248:
               var10000 = 209;
               break;
            case 249:
               var10000 = 16;
               break;
            case 250:
               var10000 = 30;
               break;
            case 251:
               var10000 = 236;
               break;
            case 252:
               var10000 = 66;
               break;
            case 253:
               var10000 = 64;
               break;
            case 254:
               var10000 = 213;
               break;
            default:
               var10000 = 42;
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

         b[var2] = new String(var3).intern();
      }

      return b[var2];
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7601;
      if (f[var3] == null) {
         f[var3] = (int)(c[var3] ^ var1);
      }

      return f[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var42;
      String[] var13 = new String[14];
      int var11 = 0;
      String var10 = "ÆsÓ3\r\nñWë\u0002a\u009b\"!z¬\u0086\u007fh¨>a\u0004\u001f\u0012¬T\u0005ê\u0016ëpQ\u0012;¹\"fpóÓ¸a\u0092½¦HÉ\u000fâ¤\r\u0011ö§Õ©ÍYé=èO\u00012.\u0017ä\u0017«\u000e»}¤eKâ\u0088 %\u0083Zg\u009bó\fYôøTÀÄóá\u000b\u001cÖÙ\u0013ÏÝòæ)°u\u0012qäp\u00964A$;;\u0018!\f*<\u0096M\rçD\u00852\u009eñF\u0002轑揸\u000e÷1ç\u001aÊm5íÒ\u0095¤ë\u0004Í\u000bÖ#\t®þ\u009b>\nóc\u0088";
      int var12 = "ÆsÓ3\r\nñWë\u0002a\u009b\"!z¬\u0086\u007fh¨>a\u0004\u001f\u0012¬T\u0005ê\u0016ëpQ\u0012;¹\"fpóÓ¸a\u0092½¦HÉ\u000fâ¤\r\u0011ö§Õ©ÍYé=èO\u00012.\u0017ä\u0017«\u000e»}¤eKâ\u0088 %\u0083Zg\u009bó\fYôøTÀÄóá\u000b\u001cÖÙ\u0013ÏÝòæ)°u\u0012qäp\u00964A$;;\u0018!\f*<\u0096M\rçD\u00852\u009eñF\u0002轑揸\u000e÷1ç\u001aÊm5íÒ\u0095¤ë\u0004Í\u000bÖ#\t®þ\u009b>\nóc\u0088"
         .length();
      char var9 = 22;
      int var28 = -1;

      label61:
      while (true) {
         byte var10000 = 117;
         String var10001 = var10.substring(++var28, var28 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var47 = var10001.toCharArray();
               int var10004 = var47.length;
               int var14 = 0;
               byte var50 = var10000;
               var42 = var47;
               int var34 = var10004;
               byte var57;
               char[] var63;
               int var10006;
               if (var10004 <= 1) {
                  var63 = var47;
                  var57 = var10000;
                  var10006 = var14;
               } else {
                  var50 = var10000;
                  var34 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var63 = var47;
                  var57 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var74 = var63[var10006];
                  byte var75;
                  switch (var14 % 7) {
                     case 0:
                        var75 = 94;
                        break;
                     case 1:
                        var75 = 11;
                        break;
                     case 2:
                        var75 = 62;
                        break;
                     case 3:
                        var75 = 64;
                        break;
                     case 4:
                        var75 = 67;
                        break;
                     case 5:
                        var75 = 71;
                        break;
                     default:
                        var75 = 5;
                  }

                  var63[var10006] = (char)(var74 ^ var57 ^ var75);
                  var14++;
                  if (var50 == 0) {
                     var10006 = var50;
                     var63 = var42;
                     var57 = var50;
                  } else {
                     if (var34 <= var14) {
                        break;
                     }

                     var63 = var42;
                     var57 = var50;
                     var10006 = var14;
                  }
               }
            }

            String var52 = new String(var42).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var52;
                  if ((var28 += var9) >= var12) {
                     a = var13;
                     b = new String[14];
                     long var0 = 3628691881662373830L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "Û`\u001dðÅ-I¡¬5T\u0084Ë+µ¬\u0082\b\"\u0015\u008dVj[";
                     int var5 = "Û`\u001dðÅ-I¡¬5T\u0084Ë+µ¬\u0082\b\"\u0015\u008dVj[".length();
                     byte var2 = 0;

                     do {
                        byte var36 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                        int var37 = var3++;
                        long var61 = (
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
                        byte var53 = -1;
                        var6[var37] = var61;
                     } while (var2 < var5);

                     c = var6;
                     f = new Integer[3];
                     Registry.lookupField(362423258401477884L).set(null, BorderFactory.createEmptyBorder(2, 1, 2, 1));
                     Registry.emptyArgs();
                     long var15 = 270389152141252877L;
                     Ref.h2(270389152141252877L, var15);
                     Object[] var46 = Registry.emptyArgs();
                     long var18 = 182098455520953031L;
                     Object[] var17 = var46;
                     Registry.lookupField(565108164140781067L).set(null, Ref.h(182098455520953031L, var17, var18));
                     Registry.lookupField(565108164140781067L).get(null);
                     Object[] var54 = Registry.packArgs(a(4106, -16413));
                     long var20 = 563115472405786955L;
                     Object[] var19 = var54;
                     Registry.lookupField(511182230017205609L).set(null, Ref.h(563115472405786955L, var19, var20));
                     Registry.lookupField(565108164140781067L).get(null);
                     Object[] var62 = Registry.packArgs(a(4110, -19276));
                     long var22 = 563115472405786955L;
                     Object[] var21 = var62;
                     Registry.lookupField(244400432181760905L).set(null, Ref.h(563115472405786955L, var21, var22));
                     Registry.lookupField(565108164140781067L).get(null);
                     Object[] var67 = Registry.packArgs(a(4109, -21911));
                     long var24 = 563115472405786955L;
                     Object[] var23 = var67;
                     Registry.lookupField(478725326680392680L).set(null, Ref.h(563115472405786955L, var23, var24));
                     Registry.lookupField(565108164140781067L).get(null);
                     Object[] var71 = Registry.packArgs(a(4103, 30273));
                     long var26 = 563115472405786955L;
                     Object[] var25 = var71;
                     Registry.lookupField(392185280097364709L).set(null, Ref.h(563115472405786955L, var25, var26));
                     return;
                  }

                  var9 = var10.charAt(var28);
                  break;
               default:
                  var13[var11++] = var52;
                  if ((var28 += var9) < var12) {
                     var9 = var10.charAt(var28);
                     continue label61;
                  }

                  var10 = "Ä\u0097ë\u0098\u0002ý\u0002e·M«\u0018fz\u0011ÙÃ\u0090\u0085Å|H,pd>*T´\u0094Ã\u0005";
                  var12 = "Ä\u0097ë\u0098\u0002ý\u0002e·M«\u0018fz\u0011ÙÃ\u0090\u0085Å|H,pd>*T´\u0094Ã\u0005".length();
                  var9 = 14;
                  var28 = -1;
            }

            var10000 = 81;
            var10001 = var10.substring(++var28, var28 + var9);
            var10002 = 0;
         }
      }
   }
}





