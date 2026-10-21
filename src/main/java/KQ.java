import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Window;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class KQ extends JDialog {
   private long R;
   private boolean B;
   private boolean A;
   U r;
   Window m;
   long g;
   nj_2 a;
   Dimension K;
   Point V;
   int i;
   private static final String b;
   private static final long[] c;
   private static final Integer[] d;

   public KQ(Window var1) {
      com.c.c(632784343757357398L).setBoolean(this, false);
      com.c.c(154418486518278678L).setBoolean(this, false);
      this.setFocusableWindowState(false);
      this.setIconImage((Image)com.c.c(582605604039442414L).get(null));
      Object[] var10001 = com.c.a(b);
      Method var4 = com.c.d(517287540690064504L);
      Object[] var10 = var10001;
      Object var8 = null;

      try {
         var10001 = (String)var4.invoke(var8, var10);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      this.setTitle(var10001);
      com.c.c(144581259712304790L).set(this, new nj_2());
      this.setContentPane((nj_2)com.c.c(144581259712304790L).get(this));
      this.addComponentListener(new yM_3(this));
      this.addWindowFocusListener(new b0_2(this));
      var10001 = com.c.f();
      Method var11 = com.c.d(615229640085119640L);
      var8 = var10001;
      KQ var7 = this;
      Method var10000 = var11;

      try {
         var10000.invoke(var7, (Object[])var8);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void setVisible(boolean var1) {
      super.setVisible(var1);
      if (var1) {
         SwingUtilities.invokeLater(new zS(this));
      }
   }

   public void c(ck_4 var1, DefaultMutableTreeNode var2) {
      String[] var10000 = F8.y();
      Object[] var10001 = com.c.f();
      Method var42 = com.c.d(270389152141252877L);
      Object[] var88 = var10001;
      Method var65 = null;

      try {
         var10001 = (Object[])var42.invoke(var65, var88);
      } catch (InvocationTargetException var24) {
         throw var24.getTargetException();
      }

      var65 = com.c.f();
      Method var10004 = com.c.d(410905379772103887L);
      var88 = (Object[])var65;
      var65 = var10001;
      Method var44 = var10004;

      try {
         var10001 = (Object[])var44.invoke(var65, var88);
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      var88 = com.c.f();
      Method var10005 = com.c.d(272998330038223631L);
      Object[] var104 = var88;
      ck_4 var91 = var1;
      var65 = var10005;

      try {
         var69 = (File)var65.invoke(var91, var104);
      } catch (InvocationTargetException var22) {
         throw var22.getTargetException();
      }

      Object[] var70 = com.c.a(var69.getAbsolutePath());
      var10004 = com.c.d(489768706953623433L);
      var88 = var70;
      var65 = var10001;
      Method var46 = var10004;

      try {
         var10001 = (lv_4)var46.invoke(var65, var88);
      } catch (InvocationTargetException var21) {
         throw var21.getTargetException();
      }

      lv_4 var4 = var10001;
      String[] var3 = var10000;
      Object[] var26 = com.c.f();
      Method var27 = com.c.d(270389152141252877L);
      Object[] var73 = var26;
      var10001 = null;

      try {
         var10000 = (String[])var27.invoke(var10001, var73);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      var10001 = com.c.f();
      Method var93 = com.c.d(271043866899908885L);
      Object[] var74 = var10001;
      var10001 = var10000;
      Method var29 = var93;

      try {
         var10000 = (String[])var29.invoke(var10001, var74);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      Object[] var75 = com.c.f();
      var10004 = com.c.d(292557478156152530L);
      var88 = var75;
      lv_4 var76 = var4;
      Method var52 = var10004;

      try {
         var10001 = (Object[])var52.invoke(var76, var88);
      } catch (InvocationTargetException var18) {
         throw var18.getTargetException();
      }

      var10001 = com.c.a(var10001);
      Method var95 = com.c.d(285199883764466291L);
      Object[] var77 = var10001;
      var10001 = var10000;
      Method var31 = var95;

      try {
         var32 = (JFrame)var31.invoke(var10001, var77);
      } catch (InvocationTargetException var17) {
         throw var17.getTargetException();
      }

      JFrame var5 = var32;
      var10001 = com.c.f();
      Method var96 = com.c.d(528672956857361353L);
      Object[] var78 = var10001;
      ck_4 var57 = var1;
      Method var33 = var96;

      try {
         var34 = (Integer)var33.invoke(var57, var78);
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }

      int var58 = com.c.c(590765520000496083L).getInt(null);
      if (var3 == null) {
         if (var34 == var58) {
            label192: {
               JFrame var35 = var5;
               if (var3 == null) {
                  if (var5 == null) {
                     break label192;
                  }

                  var35 = var5;
               }

               km_4 var6 = (km_4)var35;
               var10001 = com.c.a(true);
               Method var97 = com.c.d(433716955203722428L);
               Object[] var79 = var10001;
               km_4 var60 = var6;
               Method var36 = var97;

               try {
                  var36.invoke(var60, var79);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               if (var3 == null) {
                  return;
               }
            }

            km_4 var37;
            var88 = com.c.f();
            var10005 = com.c.d(272998330038223631L);
            Object[] var107 = var88;
            ck_4 var99 = var1;
            var65 = var10005;

            try {
               var81 = (File)var65.invoke(var99, var107);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            String var82 = var81.getParent();
            Object[] var118 = com.c.f();
            Method var10007 = com.c.d(249886410317960768L);
            Object[] var10006 = var118;
            KQ var119 = this;
            var10004 = var10007;

            try {
               var10004.invoke(var119, var10006);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            Object[] var109 = com.c.f();
            var10004 = com.c.d(513527511121793373L);
            var10006 = var109;
            var10005 = null;

            try {
               var111 = (JDialog)var10004.invoke(var10005, var10006);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            var37 = new km_4(var82, this, var111, var4, var2);
            if (var3 == null) {
               return;
            }
         }

         var10001 = com.c.f();
         Method var100 = com.c.d(528672956857361353L);
         Object[] var83 = var10001;
         ck_4 var62 = var1;
         Method var38 = var100;

         try {
            var34 = (Integer)var38.invoke(var62, var83);
         } catch (InvocationTargetException var11) {
            throw var11.getTargetException();
         }

         var58 = com.c.c(292712586650823274L).getInt(null);
      }

      if (var34 == var58) {
         label194: {
            JFrame var39 = var5;
            if (var3 == null) {
               if (var5 == null) {
                  break label194;
               }

               var39 = var5;
            }

            Kb_2 var25 = (Kb_2)var39;
            var10001 = com.c.a(true);
            Method var101 = com.c.d(583190785470630532L);
            Object[] var84 = var10001;
            Kb_2 var64 = var25;
            Method var40 = var101;

            try {
               var40.invoke(var64, var84);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            if (var3 == null) {
               return;
            }
         }

         Kb_2 var41;
         var88 = com.c.f();
         var10005 = com.c.d(272998330038223631L);
         Object[] var112 = var88;
         ck_4 var103 = var1;
         var65 = var10005;

         try {
            var86 = (File)var65.invoke(var103, var112);
         } catch (InvocationTargetException var9) {
            throw var9.getTargetException();
         }

         String var87 = var86.getParent();
         Object[] var123 = com.c.f();
         Method var132 = com.c.d(249886410317960768L);
         Object[] var129 = var123;
         KQ var124 = this;
         var10004 = var132;

         try {
            var10004.invoke(var124, var129);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         Object[] var114 = com.c.f();
         var10004 = com.c.d(513527511121793373L);
         var129 = var114;
         var10005 = null;

         try {
            var116 = (JDialog)var10004.invoke(var10005, var129);
         } catch (InvocationTargetException var7) {
            throw var7.getTargetException();
         }

         var41 = new Kb_2(var87, this, var116, var4, var2);
      }
   }

   public boolean U(JComponent var1) {
      Point var2 = var1.getLocationOnScreen();
      Point var3 = new Point(var2);
      var3.x = var2.x - a(3636, 792709501032229249L);
      var3.y = var2.y + var1.getHeight() + 3;
      return this.getLocationOnScreen().equals(var3);
   }

   public boolean O() {
      String[] var1 = F8.y();
      boolean var10000 = this.getLocationOnScreen().equals((Point)com.c.c(135812835324310756L).get(this));
      if (var1 == null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   public void s(JComponent var1) {
      Point var2 = var1.getLocationOnScreen();
      Point var3 = new Point(var2);
      var3.x = var2.x - a(5354, 7574992466992395101L);
      var3.y = var2.y + var1.getHeight() + 3;
      this.setLocation(var3);
      Method var10000 = (Method)com.c.c(144581259712304790L).get(this);
      Object[] var10001 = com.c.a(this);
      Method var10003 = com.c.d(284342787991930477L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      this.setContentPane((nj_2)com.c.c(144581259712304790L).get(this));
      var10001 = com.c.a(true);
      var10003 = com.c.d(634601920284847200L);
      var10002 = var10001;
      KQ var13 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var13, var10002);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      com.c.c(135812835324310756L).set(this, this.getLocationOnScreen());
      Object[] var9 = com.c.a(this);
      var10000 = com.c.d(214213921318960935L);
      var10002 = var9;
      var10001 = null;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   void G() {
      String[] var1;
      int var4;
      int var7;
      label52: {
         String[] var10000 = F8.y();
         int var2 = a(13367, 3601017576235750278L);
         var1 = var10000;
         int var3 = a(27896, 6877644600401201992L);
         var4 = this.getPreferredSize().height;
         var7 = var4;
         int var10001 = var3;
         if (var1 == null) {
            if (var4 > var3) {
               var4 = var3;
            }

            var7 = var4;
            if (var1 != null) {
               break label52;
            }

            var10001 = var2;
         }

         if (var7 < var10001) {
            var4 = var2;
         }

         var7 = a(23281, 4985566960271048005L);
      }

      int var5 = var7;
      int var6 = this.getPreferredSize().width + a(8706, 4893108247915644340L);
      var7 = var6;
      int var9 = var5;
      if (var1 == null) {
         if (var6 < var5) {
            var6 = var5;
         }

         var7 = var6;
         var9 = com.c.c(348629674041412846L).getInt(this);
      }

      label41: {
         label54: {
            if (var1 == null) {
               if (var7 > var9) {
                  com.c.c(348629674041412846L).setInt(this, var6);
               }

               var7 = var6;
               if (var1 != null) {
                  break label54;
               }

               var9 = com.c.c(348629674041412846L).getInt(this);
            }

            if (var7 >= var9) {
               break label41;
            }

            var7 = com.c.c(348629674041412846L).getInt(this);
         }

         var6 = var7;
      }

      this.setSize(new Dimension(var6, var4));
      com.c.c(577511382867416570L).set(this, this.getSize());
   }

   public long w() {
      return com.c.c(584953157861614821L).getLong(this);
   }

   public void B(long var1) {
      com.c.c(584953157861614821L).setLong(this, var1);
   }

   public boolean k() {
      return com.c.c(632784343757357398L).getBoolean(this);
   }

   public void s(boolean var1) {
      com.c.c(632784343757357398L).setBoolean(this, var1);
   }

   public boolean y() {
      return com.c.c(154418486518278678L).getBoolean(this);
   }

   public void r(boolean var1) {
      com.c.c(154418486518278678L).setBoolean(this, var1);
   }

   public U S() {
      return (U)com.c.c(333623818237666798L).get(this);
   }

   public void Y(U var1) {
      com.c.c(333623818237666798L).set(this, var1);
      com.c.c(144451340501842917L).set(this, var1);
   }

   public Window Z() {
      return (Window)com.c.c(144451340501842917L).get(this);
   }

   public void O(Window var1) {
      com.c.c(144451340501842917L).set(this, var1);
   }

   public long r() {
      return com.c.c(174659894326967944L).getLong(this);
   }

   public void g(long var1) {
      com.c.c(174659894326967944L).setLong(this, var1);
   }

   public nj_2 i() {
      return (nj_2)com.c.c(144581259712304790L).get(this);
   }

   static boolean F(KQ var0) {
      return com.c.c(632784343757357398L).getBoolean(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26548;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





