package com.finalshell.ui.dialog;

import com.finalshell.core.B02;
import com.finalshell.core.Lv4_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.ZS;
import com.finalshell.ui.frame.Kb2;
import com.finalshell.ui.frame.Km4;
import com.finalshell.ui.frame.MainFrame;
import com.finalshell.ui.listener.YM3;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.panel.F8;
import com.finalshell.ui.panel.ShowDeletedPanel;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Window;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class KQ extends JDialog {
   public long R;
   public boolean B;
   public boolean A;
   public MainFrame r;
   public Window m;
   public long g;
   public ShowDeletedPanel a;
   public Dimension K;
   public Point V;
   public int i;
   public static String b;
   public static long[] c;
   public static Integer[] d;

   public KQ(Window var1) {
      Registry.lookupField(632784343757357398L).setBoolean(this, false);
      Registry.lookupField(154418486518278678L).setBoolean(this, false);
      this.setFocusableWindowState(false);
      this.setIconImage((Image)Registry.lookupField(582605604039442414L).get(null));
      Object var10001 = Registry.packArgs(b);
      long var2 = 517287540690064504L;
      Object var10002 = Ref.h2(517287540690064504L, var2);

      try {
         var10002 = (String)var10002;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      var10001.setTitle((String)var10002);
      var10002 = new ShowDeletedPanel();
      long var5 = 144581259712304790L;
      ShowDeletedPanel var4 = (ShowDeletedPanel)var10002;
      Ref.s(144581259712304790L, var4, var5);
      Object var6 = 144581259712304790L;
      this.setContentPane((ShowDeletedPanel)Ref.g(144581259712304790L, var6));
      this.addComponentListener(new YM3(this));
      this.addWindowFocusListener(new B02(this));
      Object[] var10004 = Registry.emptyArgs();
      long var9 = 615229640085119640L;
      Object[] var8 = var10004;
      Ref.h(615229640085119640L, var8, var9);

      try {
         ;
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }
   }

   @Override
   public void setVisible(boolean var1) {
      super.setVisible(var1);
      if (var1) {
         SwingUtilities.invokeLater(new ZS(this));
      }
   }

   public void c(Ck4 var1, DefaultMutableTreeNode var2) {
      F8.y();
      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10003 = Registry.emptyArgs();
      long var10 = 410905379772103887L;
      Object[] var9 = var10003;
      Ref.h(410905379772103887L, var9, var10);
      File var10005 = (File)(Registry.emptyArgs());
      long var12 = 272998330038223631L;
      Object var11 = var10005;
      var10005 = Ref.h(272998330038223631L, var11, var12);

      try {
         var10005 = (File)var10005;
      } catch (InvocationTargetException var53) {
         throw var53.getTargetException();
      }

      var10005 = Registry.packArgs(var10005.getAbsolutePath());
      long var14 = 489768706953623433L;
      Object var13 = var10005;
      var10005 = Ref.h(489768706953623433L, var13, var14);

      try {
         var10005 = (Lv4_2)var10005;
      } catch (InvocationTargetException var52) {
         throw var52.getTargetException();
      }

      Lv4_2 var4 = var10005;
      Registry.emptyArgs();
      long var15 = 270389152141252877L;
      Ref.h2(270389152141252877L, var15);
      Object[] var10006 = Registry.emptyArgs();
      long var18 = 271043866899908885L;
      Object[] var17 = var10006;
      Ref.h(271043866899908885L, var17, var18);
      JFrame var10008 = (JFrame)(Registry.emptyArgs());
      long var20 = 292557478156152530L;
      Object var19 = var10008;
      var10008 = Registry.packArgs(Ref.h(292557478156152530L, var19, var20));
      long var22 = 285199883764466291L;
      Object var21 = var10008;
      var10008 = Ref.h(285199883764466291L, var21, var22);

      try {
         var10008 = (JFrame)var10008;
      } catch (InvocationTargetException var51) {
         throw var51.getTargetException();
      }

      JFrame var5 = var10008;
      Integer var10009 = (Integer)(Registry.emptyArgs());
      long var24 = 528672956857361353L;
      Object var23 = var10009;
      var10009 = Ref.h(528672956857361353L, var23, var24);

      try {
         var10009 = (Integer)var10009;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      int var10010 = Registry.lookupField(590765520000496083L).getInt(null);
      if (var1 == null) {
         if (var10009 == var10010) {
            label157: {
               JFrame var65 = var5;
               if (var1 == null) {
                  if (var5 == null) {
                     break label157;
                  }

                  var65 = var5;
               }

               Km4 var6 = (Km4)var65;
               Object[] var67 = Registry.packArgs(true);
               long var26 = 433716955203722428L;
               Object[] var25 = var67;
               Ref.h(433716955203722428L, var25, var26);

               try {
                  ;
               } catch (InvocationTargetException var49) {
                  throw var49.getTargetException();
               }

               if (var1 == null) {
                  return;
               }
            }

            File var10013 = Registry.emptyArgs();
            long var28 = 272998330038223631L;
            Object var27 = var10013;
            var10013 = Ref.h(272998330038223631L, var27, var28);

            try {
               var10013 = (File)var10013;
            } catch (InvocationTargetException var48) {
               throw var48.getTargetException();
            }

            var10013.getParent();
            Object[] var10016 = Registry.emptyArgs();
            long var30 = 249886410317960768L;
            Object[] var29 = var10016;
            Ref.h(249886410317960768L, var29, var30);
            var10016 = Registry.emptyArgs();
            long var31 = 513527511121793373L;
            Object var10017 = Ref.h2(513527511121793373L, var31);

            try {
               var10017 = (JDialog)var10017;
            } catch (InvocationTargetException var47) {
               throw var47.getTargetException();
            }

            // [VF-super] super(this, var10016, (Window)var10017, var4, var2);
            if (var1 == null) {
               return;
            }
         }

         var10009 = var1;
         Object[] var68 = Registry.emptyArgs();
         long var34 = 528672956857361353L;
         Object[] var33 = var68;
         Object var69 = Ref.h(528672956857361353L, var33, var34);

         try {
            var10010 = (Integer)var69;
         } catch (InvocationTargetException var46) {
            throw var46.getTargetException();
         }

         Registry.lookupField(292712586650823274L).getInt(null);
      }

      if (var10009 == var10010) {
         label159: {
            JFrame var66 = var5;
            if (var1 == null) {
               if (var5 == null) {
                  break label159;
               }

               var66 = var5;
            }

            Kb2 var54 = (Kb2)var66;
            Object[] var70 = Registry.packArgs(true);
            long var36 = 583190785470630532L;
            Object[] var35 = var70;
            Ref.h(583190785470630532L, var35, var36);

            try {
               ;
            } catch (InvocationTargetException var45) {
               throw var45.getTargetException();
            }

            if (var1 == null) {
               return;
            }
         }

         File var73 = Registry.emptyArgs();
         long var38 = 272998330038223631L;
         Object var37 = var73;
         var73 = Ref.h(272998330038223631L, var37, var38);

         try {
            var73 = (File)var73;
         } catch (InvocationTargetException var44) {
            throw var44.getTargetException();
         }

         var73.getParent();
         Object[] var77 = Registry.emptyArgs();
         long var40 = 249886410317960768L;
         Object[] var39 = var77;
         Ref.h(249886410317960768L, var39, var40);
         var77 = Registry.emptyArgs();
         long var41 = 513527511121793373L;
         Object var80 = Ref.h2(513527511121793373L, var41);

         try {
            var80 = (JDialog)var80;
         } catch (InvocationTargetException var43) {
            throw var43.getTargetException();
         }

         // [VF-super] super(this, var77, (Window)var80, var4, var2);
      }
   }

   public boolean MainFrame(JComponent var1) {
      Point var2 = var1.getLocationOnScreen();
      Point var3 = new Point(var2);
      var3.x = var2.x - a(3636, 792709501032229249L);
      var3.y = var2.y + var1.getHeight() + 3;
      return this.getLocationOnScreen().equals(var3);
   }

   public boolean O() {
      String[] var1 = F8.y();
      this.getLocationOnScreen();
      Object var2 = 135812835324310756L;
      boolean var10001 = this.equals((Point)Ref.g(135812835324310756L, var2));
      if (var1 == null) {
         var10001 = !var10001;
      }

      return var10001;
   }

   public void s(JComponent var1) {
      Point var2 = var1.getLocationOnScreen();
      Point var3 = new Point(var2);
      var3.x = var2.x - a(5354, 7574992466992395101L);
      var3.y = var2.y + var1.getHeight() + 3;
      this.setLocation(var3);
      Object var4 = 144581259712304790L;
      Ref.g(144581259712304790L, var4);
      Object[] var10002 = Registry.packArgs(this);
      long var7 = 284342787991930477L;
      Object[] var6 = var10002;
      Ref.h(284342787991930477L, var6, var7);

      try {
         ;
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      Object var8 = 144581259712304790L;
      this.setContentPane((ShowDeletedPanel)Ref.g(144581259712304790L, var8));
      Object[] var10004 = Registry.packArgs(true);
      long var11 = 634601920284847200L;
      Object[] var10 = var10004;
      Ref.h(634601920284847200L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      Point var10005 = this.getLocationOnScreen();
      long var13 = 135812835324310756L;
      Point var12 = var10005;
      Ref.s(135812835324310756L, var12, var13);
      Registry.packArgs(this);
      long var14 = 214213921318960935L;
      Ref.h2(214213921318960935L, var14);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public void G() {
      String[] var1;
      int var4;
      int var9;
      label52: {
         String[] var10000 = F8.y();
         int var2 = a(13367, 3601017576235750278L);
         var1 = var10000;
         int var3 = a(27896, 6877644600401201992L);
         var4 = this.getPreferredSize().height;
         var9 = var4;
         int var10001 = var3;
         if (var1 == null) {
            if (var4 > var3) {
               var4 = var3;
            }

            var9 = var4;
            if (var1 != null) {
               break label52;
            }

            var10001 = var2;
         }

         if (var9 < var10001) {
            var4 = var2;
         }

         var9 = a(23281, 4985566960271048005L);
      }

      int var5 = var9;
      int var6 = this.getPreferredSize().width + a(8706, 4893108247915644340L);
      var9 = var6;
      int var11 = var5;
      if (var1 == null) {
         if (var6 < var5) {
            var6 = var5;
         }

         var9 = var6;
         var11 = Registry.lookupField(348629674041412846L).getInt(this);
      }

      label41: {
         label54: {
            if (var1 == null) {
               if (var9 > var11) {
                  Registry.lookupField(348629674041412846L).setInt(this, var6);
               }

               var9 = var6;
               if (var1 != null) {
                  break label54;
               }

               var11 = Registry.lookupField(348629674041412846L).getInt(this);
            }

            if (var9 >= var11) {
               break label41;
            }

            var9 = Registry.lookupField(348629674041412846L).getInt(this);
         }

         var6 = var9;
      }

      this.setSize(new Dimension(var6, var4));
      Dimension var12 = this.getSize();
      long var8 = 577511382867416570L;
      Dimension var7 = var12;
      Ref.s(577511382867416570L, var7, var8);
   }

   public long w() {
      return Registry.lookupField(584953157861614821L).getLong(this);
   }

   public void B(long var1) {
      Registry.lookupField(584953157861614821L).setLong(this, var1);
   }

   public boolean k() {
      return Registry.lookupField(632784343757357398L).getBoolean(this);
   }

   public void s(boolean var1) {
      Registry.lookupField(632784343757357398L).setBoolean(this, var1);
   }

   public boolean y() {
      return Registry.lookupField(154418486518278678L).getBoolean(this);
   }

   public void r(boolean var1) {
      Registry.lookupField(154418486518278678L).setBoolean(this, var1);
   }

   public MainFrame S() {
      Object var1 = 333623818237666798L;
      return (MainFrame)Ref.g(333623818237666798L, var1);
   }

   public void Y(MainFrame var1) {
      long var3 = 333623818237666798L;
      Ref.s(333623818237666798L, var1, var3);
      long var5 = 144451340501842917L;
      Ref.s(144451340501842917L, var1, var5);
   }

   public Window Z() {
      Object var1 = 144451340501842917L;
      return (Window)Ref.g(144451340501842917L, var1);
   }

   public void O(Window var1) {
      long var3 = 144451340501842917L;
      Ref.s(144451340501842917L, var1, var3);
   }

   public long r() {
      return Registry.lookupField(174659894326967944L).getLong(this);
   }

   public void g(long var1) {
      Registry.lookupField(174659894326967944L).setLong(this, var1);
   }

   public ShowDeletedPanel i() {
      Object var1 = 144581259712304790L;
      return (ShowDeletedPanel)Ref.g(144581259712304790L, var1);
   }

   public static boolean F(KQ var0) {
      return Registry.lookupField(632784343757357398L).getBoolean(var0);
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26548;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "=Ot\u001a\u0012?j\u0013Wi\u0004\u0005UF3tv\t\u0003Xz8nI+,;j\u0007a\u0019\u0017jdY/ \u000ey\u0005nn%s{=9U".toCharArray();
      int var10004 = var10003.length;
      int var8 = 0;
      byte var34 = 2;
      char[] var10002 = var10003;
      int var19 = var10004;
      char[] var42;
      byte var50;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var42 = var10003;
         var10005 = var8;
         char var10008 = var10003[var8];
         var10007 = 2;
         var10006 = var10008;
         switch (var8 % 7) {
            case 0:
               var50 = 104;
               break;
            case 1:
               var50 = 27;
               break;
            case 2:
               var50 = 35;
               break;
            case 3:
               var50 = 76;
               break;
            case 4:
               var50 = 67;
               break;
            case 5:
               var50 = 15;
               break;
            default:
               var50 = 42;
         }
      } else {
         var34 = 2;
         var19 = var10004;
         if (var10004 <= var8) {
            String var39 = new String(var10003).intern();
            int var25 = -1;
            b = var39;
            long var9 = 4390531491311959915L;
            long[] var14 = new long[6];
            int var11 = 0;
            String var12 = "x\u0010\n\\L1\u0083ÚÊ;OÆAÊÖà¼\u00961\u0097Î[z÷j÷\u0081ÃÙ\u0087Ì=";
            int var13 = "x\u0010\n\\L1\u0083ÚÊ;OÆAÊÖà¼\u00961\u0097Î[z÷j÷\u0081ÃÙ\u0087Ì=".length();
            byte var10 = 0;

            label71:
            while (true) {
               var25 = var10;
               var10 += 8;
               byte[] var16 = var12.substring(var25, var10).getBytes("ISO-8859-1");
               long[] var18 = var14;
               var25 = var11++;
               long var32 = ((long)var16[0] & 255L) << 56
                  | ((long)var16[1] & 255L) << 48
                  | ((long)var16[2] & 255L) << 40
                  | ((long)var16[3] & 255L) << 32
                  | ((long)var16[4] & 255L) << 24
                  | ((long)var16[5] & 255L) << 16
                  | ((long)var16[6] & 255L) << 8
                  | (long)var16[7] & 255L;
               byte var40 = -1;

               while (true) {
                  long var48 = var32 ^ var9;
                  switch (var40) {
                     case 0:
                        var18[var25] = var48;
                        if (var10 >= var13) {
                           c = var14;
                           d = new Integer[6];
                           return;
                        }
                        break;
                     default:
                        var18[var25] = var48;
                        if (var10 < var13) {
                           continue label71;
                        }

                        var12 = "V%ük8\u009c¶©u×R\u007f\u000f¨ì%";
                        var13 = "V%ük8\u009c¶©u×R\u007f\u000f¨ì%".length();
                        var10 = 0;
                  }

                  byte var28 = var10;
                  var10 += 8;
                  var16 = var12.substring(var28, var10).getBytes("ISO-8859-1");
                  var18 = var14;
                  var25 = var11++;
                  var32 = ((long)var16[0] & 255L) << 56
                     | ((long)var16[1] & 255L) << 48
                     | ((long)var16[2] & 255L) << 40
                     | ((long)var16[3] & 255L) << 32
                     | ((long)var16[4] & 255L) << 24
                     | ((long)var16[5] & 255L) << 16
                     | ((long)var16[6] & 255L) << 8
                     | (long)var16[7] & 255L;
                  var40 = 0;
               }
            }
         }

         var42 = var10003;
         var10005 = var8;
         char var51 = var10003[var8];
         var10007 = 2;
         var10006 = var51;
         switch (var8 % 7) {
            case 0:
               var50 = 104;
               break;
            case 1:
               var50 = 27;
               break;
            case 2:
               var50 = 35;
               break;
            case 3:
               var50 = 76;
               break;
            case 4:
               var50 = 67;
               break;
            case 5:
               var50 = 15;
               break;
            default:
               var50 = 42;
         }
      }

      while (true) {
         var42[var10005] = (char)(var10006 ^ var10007 ^ var50);
         var8++;
         if (var34 == 0) {
            var42 = var10002;
            var10005 = var34;
            char var53 = var10002[var34];
            var10007 = var34;
            var10006 = var53;
            switch (var8 % 7) {
               case 0:
                  var50 = 104;
                  break;
               case 1:
                  var50 = 27;
                  break;
               case 2:
                  var50 = 35;
                  break;
               case 3:
                  var50 = 76;
                  break;
               case 4:
                  var50 = 67;
                  break;
               case 5:
                  var50 = 15;
                  break;
               default:
                  var50 = 42;
            }
         } else {
            if (var19 <= var8) {
               String var36 = new String(var10002).intern();
               int var21 = -1;
               b = var36;
               long var0 = 4390531491311959915L;
               long[] var6 = new long[6];
               int var3 = 0;
               String var4 = "x\u0010\n\\L1\u0083ÚÊ;OÆAÊÖà¼\u00961\u0097Î[z÷j÷\u0081ÃÙ\u0087Ì=";
               int var5 = "x\u0010\n\\L1\u0083ÚÊ;OÆAÊÖà¼\u00961\u0097Î[z÷j÷\u0081ÃÙ\u0087Ì=".length();
               byte var2 = 0;

               label37:
               while (true) {
                  var21 = var2;
                  var2 += 8;
                  byte[] var7 = var4.substring(var21, var2).getBytes("ISO-8859-1");
                  long[] var10000 = var6;
                  var21 = var3++;
                  long var30 = ((long)var7[0] & 255L) << 56
                     | ((long)var7[1] & 255L) << 48
                     | ((long)var7[2] & 255L) << 40
                     | ((long)var7[3] & 255L) << 32
                     | ((long)var7[4] & 255L) << 24
                     | ((long)var7[5] & 255L) << 16
                     | ((long)var7[6] & 255L) << 8
                     | (long)var7[7] & 255L;
                  byte var37 = -1;

                  while (true) {
                     long var46 = var30 ^ var0;
                     switch (var37) {
                        case 0:
                           var10000[var21] = var46;
                           if (var2 >= var5) {
                              c = var6;
                              d = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var10000[var21] = var46;
                           if (var2 < var5) {
                              continue label37;
                           }

                           var4 = "V%ük8\u009c¶©u×R\u007f\u000f¨ì%";
                           var5 = "V%ük8\u009c¶©u×R\u007f\u000f¨ì%".length();
                           var2 = 0;
                     }

                     byte var24 = var2;
                     var2 += 8;
                     var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                     var10000 = var6;
                     var21 = var3++;
                     var30 = ((long)var7[0] & 255L) << 56
                        | ((long)var7[1] & 255L) << 48
                        | ((long)var7[2] & 255L) << 40
                        | ((long)var7[3] & 255L) << 32
                        | ((long)var7[4] & 255L) << 24
                        | ((long)var7[5] & 255L) << 16
                        | ((long)var7[6] & 255L) << 8
                        | (long)var7[7] & 255L;
                     var37 = 0;
                  }
               }
            }

            var42 = var10002;
            var10005 = var8;
            char var52 = var10002[var8];
            var10007 = var34;
            var10006 = var52;
            switch (var8 % 7) {
               case 0:
                  var50 = 104;
                  break;
               case 1:
                  var50 = 27;
                  break;
               case 2:
                  var50 = 35;
                  break;
               case 3:
                  var50 = 76;
                  break;
               case 4:
                  var50 = 67;
                  break;
               case 5:
                  var50 = 15;
                  break;
               default:
                  var50 = 42;
            }
         }
      }
   }
}





