import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import javax.swing.undo.UndoManager;

public class YJ extends JPopupMenu implements MouseListener, ActionListener {
   private static YJ L;
   private JMenuItem T;
   private JMenuItem l;
   private JMenuItem P;
   private JMenuItem k;
   static long q;
   boolean e;
   private static final String[] a;
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;

   public static void x(String[] var0) {
      JFrame var1 = new JFrame();
      var1.setDefaultCloseOperation(3);
      JTextField var2 = new JTextField(a(6068, 522663635941372887L));
      Object[] var10000 = com.c.a(var2);
      Method var8 = com.c.d(322267315291882359L);
      Object[] var22 = var10000;
      Object var15 = null;

      try {
         var8.invoke(var15, var22);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var1.add(var2, a(-742, 12887));
      JTextField var3 = new JTextField(a(22871, 5743972978871270711L));
      var10000 = com.c.a(var3);
      Method var10 = com.c.d(322267315291882359L);
      var22 = var10000;
      var15 = null;

      try {
         var10.invoke(var15, var22);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      var10000 = com.c.a(var3);
      Method var12 = com.c.d(322267315291882359L);
      var22 = var10000;
      var15 = null;

      try {
         var12.invoke(var15, var22);
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      var10000 = com.c.a(var3);
      Method var14 = com.c.d(363111814618574295L);
      var22 = var10000;
      var15 = null;

      try {
         var14.invoke(var15, var22);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      var1.add(var3, a(-743, 19550));
      var1.pack();
      var1.setLocationRelativeTo(null);
      var1.setVisible(true);
   }

   public static boolean b(JTextComponent var0) {
      String[] var10000 = F8.y();
      boolean var2 = true;
      String[] var1 = var10000;
      boolean var3 = var0.getClass().toString().contains(a(-738, 26465));
      if (var1 == null) {
         if (var3) {
            var2 = false;
         }

         var3 = var2;
      }

      return var3;
   }

   public static boolean o(JTextComponent var0) {
      Object[] var10000 = com.c.a(var0, true);
      Method var2 = com.c.d(370149877875067536L);
      Object[] var4 = var10000;
      Object var3 = null;

      try {
         return (Boolean)var2.invoke(var3, var4);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   public static boolean Y(JTextComponent var0, boolean var1) {
      String[] var10000 = F8.y();
      UndoManager var3 = new UndoManager();
      ks_4 var4 = new ks_4(var3);
      LL var5 = new LL(var3);
      byte var6 = 2;
      String[] var2 = var10000;
      Object[] var15 = com.c.f();
      Method var16 = com.c.d(454647487873911743L);
      Object[] var35 = var15;
      Object var24 = null;

      try {
         var17 = (Boolean)var16.invoke(var24, var35);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      if (var2 == null) {
         if (var17) {
            var6 = 4;
         }

         var0.getDocument().addUndoableEditListener(var3);
         var0.registerKeyboardAction(var4, KeyStroke.getKeyStroke(a(8146, 858434412037520308L), var6), 0);
         var0.registerKeyboardAction(var5, KeyStroke.getKeyStroke(a(10559, 882117388655267162L), var6), 0);
         Object[] var18 = com.c.a(var0);
         Method var19 = com.c.d(620575814828970493L);
         var35 = var18;
         var24 = null;

         try {
            var17 = (Boolean)var19.invoke(var24, var35);
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }
      }

      label91:
      if (var2 == null) {
         if (var17) {
            var17 = var1;
            if (var2 != null) {
               break label91;
            }

            if (var1) {
               Object[] var20 = com.c.a(var0);
               Method var21 = com.c.d(601491195246560697L);
               var35 = var20;
               var24 = null;

               try {
                  var21.invoke(var24, var35);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }
            }
         }

         var17 = false;
      }

      boolean var7 = var17;
      MouseListener[] var8 = var0.getMouseListeners();
      if (null != var8) {
         int var9 = 0;

         while (var9 < var8.length) {
            if (var2 != null) {
               return false;
            }

            MouseListener var22 = var8[var9];
            var24 = com.c.f();
            Method var30 = com.c.d(129058574427582046L);
            Object[] var44 = (Object[])var24;
            var35 = null;

            try {
               var24 = (YJ)var30.invoke(var35, var44);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            if (var22 == var24) {
               var7 = true;
            }

            var9++;
            if (var2 != null) {
               break;
            }
         }
      }

      if (var2 != null) {
         return var7;
      } else if (!var7) {
         var24 = com.c.f();
         Method var33 = com.c.d(129058574427582046L);
         Object[] var46 = (Object[])var24;
         var35 = null;

         try {
            var24 = (YJ)var33.invoke(var35, var46);
         } catch (InvocationTargetException var10) {
            throw var10.getTargetException();
         }

         var0.addMouseListener((MouseListener)var24);
         return true;
      } else {
         return false;
      }
   }

   public static void I(JTextComponent var0) {
      Object[] var10001 = com.c.f();
      Method var2 = com.c.d(129058574427582046L);
      Object[] var5 = var10001;
      Object var4 = null;

      try {
         var10001 = (YJ)var2.invoke(var4, var5);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      var0.removeMouseListener(var10001);
   }

   private static YJ F() {
      if (null == (YJ)com.c.c(618328928296237087L).get(null)) {
         com.c.c(618328928296237087L).set(null, new YJ());
      }

      return (YJ)com.c.c(618328928296237087L).get(null);
   }

   private YJ(String name, int ordinal) {
      com.c.c(391698271542952594L).setBoolean(this, false);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(553902588358973671L);
      Object[] var10002 = var10001;
      YJ var6 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var6, var10002);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(239647238212213637L);
      var10002 = var10001;
      YJ var8 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var8, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var10001 = com.c.f();
      var10003 = com.c.d(373062424149998186L);
      var10002 = var10001;
      YJ var10 = this;
      var10000 = var10003;

      try {
         var10000.invoke(var10, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }
   }

   private void x() {
      Object[] var10002 = com.c.a(a(-744, 23180));
      Method var10004 = com.c.d(290427176111019385L);
      Object[] var10003 = var10002;
      YJ var12 = this;
      Method var10001 = var10004;

      try {
         var5 = var10001.invoke(var12, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      com.c.c(523337937420027700L).set(this, var5);
      var10002 = com.c.a(a(-740, -24185));
      var10004 = com.c.d(290427176111019385L);
      var10003 = var10002;
      YJ var14 = this;
      var10001 = var10004;

      try {
         var7 = var10001.invoke(var14, var10003);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      com.c.c(275228187402431692L).set(this, var7);
      var10002 = com.c.a(a(-737, 21356));
      var10004 = com.c.d(290427176111019385L);
      var10003 = var10002;
      YJ var16 = this;
      var10001 = var10004;

      try {
         var9 = var10001.invoke(var16, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      com.c.c(556828725641436047L).set(this, var9);
      var10002 = com.c.a(a(-739, 28771));
      var10004 = com.c.d(290427176111019385L);
      var10003 = var10002;
      YJ var18 = this;
      var10001 = var10004;

      try {
         var11 = var10001.invoke(var18, var10003);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      com.c.c(195824488389063206L).set(this, var11);
      ((JMenuItem)com.c.c(523337937420027700L).get(this)).setMnemonic((char)a(5361, 5852033962280366229L));
      ((JMenuItem)com.c.c(275228187402431692L).get(this)).setMnemonic((char)a(22607, 3434261204481670189L));
      ((JMenuItem)com.c.c(556828725641436047L).get(this)).setMnemonic((char)a(26346, 5171883601454514827L));
      ((JMenuItem)com.c.c(195824488389063206L).get(this)).setMnemonic((char)a(9807, 1296162009252430376L));
      this.add((JMenuItem)com.c.c(523337937420027700L).get(this));
      this.add((JMenuItem)com.c.c(275228187402431692L).get(this));
      this.add((JMenuItem)com.c.c(556828725641436047L).get(this));
      this.addSeparator();
      this.add((JMenuItem)com.c.c(195824488389063206L).get(this));
      this.setFont((Font)com.c.c(395970988011231853L).get(null));
   }

   JMenuItem F(String var1) {
      JMenuItem var2 = new JMenuItem(var1);
      var2.setFont((Font)com.c.c(395970988011231853L).get(null));
      return var2;
   }

   private void z() {
   }

   private void X() {
      ((JMenuItem)com.c.c(523337937420027700L).get(this)).addActionListener(this);
      ((JMenuItem)com.c.c(275228187402431692L).get(this)).addActionListener(this);
      ((JMenuItem)com.c.c(556828725641436047L).get(this)).addActionListener(this);
      ((JMenuItem)com.c.c(195824488389063206L).get(this)).addActionListener(this);
   }

   static void H(JTextComponent var0) {
      var0.addFocusListener(new dR_3(var0));
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      String[] var2;
      Object var6;
      label63: {
         var2 = F8.y();
         int var10000 = var1.getSource() instanceof JTextComponent;
         if (var2 == null) {
            if (var10000 == 0) {
               return;
            }

            var6 = var1;
            if (var2 != null) {
               break label63;
            }

            var10000 = var1.getButton();
         }

         if (var10000 != 3) {
            return;
         }

         var6 = (Method)var1.getSource();
      }

      JTextComponent var3 = (JTextComponent)var6;
      boolean var7 = Boolean.TRUE.equals(var3.getClientProperty(a(-741, 14885)));
      if (var2 == null) {
         if (var7) {
            return;
         }

         var6 = com.c.a(var3);
         Method var9 = com.c.d(620575814828970493L);
         Object[] var14 = (Object[])var6;
         Object var11 = null;

         try {
            var7 = (Boolean)var9.invoke(var11, var14);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }
      }

      label66: {
         if (var2 == null) {
            if (!var7) {
               break label66;
            }

            var7 = var3.isFocusOwner();
         }

         if (var2 == null && !var7) {
            var3.selectAll();
            var3.requestFocusInWindow();
         }
      }

      Object[] var12 = com.c.a(var3, var1.getX(), var1.getY());
      Method var10003 = com.c.d(200270251075426170L);
      Object[] var15 = var12;
      YJ var13 = this;
      var6 = var10003;

      try {
         var6.invoke(var13, var15);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void show(Component var1, int var2, int var3) {
      String[] var4;
      JTextComponent var5;
      boolean var11;
      label97: {
         String[] var10000 = F8.y();
         var5 = (JTextComponent)var1;
         var4 = var10000;
         String var6 = var5.getSelectedText();
         if (null != var6) {
            var11 = var6.equals("");
            if (var4 != null) {
               break label97;
            }

            if (!var11) {
               var11 = true;
               break label97;
            }
         }

         var11 = false;
      }

      boolean var7;
      boolean var8;
      boolean var9;
      boolean var10;
      boolean var10001;
      label90: {
         label100: {
            var7 = var11;
            var8 = var5.isEnabled();
            var9 = var5.isEditable();
            var10 = var5 instanceof JPasswordField;
            var12 = (JMenuItem)com.c.c(523337937420027700L).get(this);
            var10001 = var7;
            if (var4 == null) {
               if (!var7) {
                  break label100;
               }

               var10001 = var8;
            }

            if (var4 == null) {
               if (!var10001) {
                  break label100;
               }

               var10001 = var9;
            }

            if (var4 == null) {
               if (!var10001) {
                  break label100;
               }

               var10001 = var10;
            }

            if (var4 != null) {
               break label90;
            }

            if (!var10001) {
               var10001 = true;
               break label90;
            }
         }

         var10001 = false;
      }

      label69: {
         label101: {
            var12.setEnabled(var10001);
            var13 = (JMenuItem)com.c.c(275228187402431692L).get(this);
            var10001 = var7;
            if (var4 == null) {
               if (!var7) {
                  break label101;
               }

               var10001 = var8;
            }

            if (var4 == null) {
               if (!var10001) {
                  break label101;
               }

               var10001 = var10;
            }

            if (var4 != null) {
               break label69;
            }

            if (!var10001) {
               var10001 = true;
               break label69;
            }
         }

         var10001 = false;
      }

      label53: {
         label102: {
            var13.setEnabled(var10001);
            var14 = (JMenuItem)com.c.c(556828725641436047L).get(this);
            var10001 = var8;
            if (var4 == null) {
               if (!var8) {
                  break label102;
               }

               var10001 = var9;
            }

            if (var4 != null) {
               break label53;
            }

            if (var10001) {
               var10001 = true;
               break label53;
            }
         }

         var10001 = false;
      }

      var14.setEnabled(var10001);
      ((JMenuItem)com.c.c(195824488389063206L).get(this)).setEnabled(var8);
      super.show(var1, var2, var3);
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var10000 = F8.y();
      JTextComponent var3 = (JTextComponent)this.getInvoker();
      String[] var2 = var10000;
      var10000 = (String[])var1.getSource();
      JMenuItem var10001 = (JMenuItem)com.c.c(523337937420027700L).get(this);
      if (var2 == null) {
         if (var10000 == var10001) {
            var3.cut();
            if (var2 == null) {
               return;
            }
         }

         var10000 = (String[])var1.getSource();
         var10001 = (JMenuItem)com.c.c(275228187402431692L).get(this);
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            var3.copy();
            if (var2 == null) {
               return;
            }
         }

         var10000 = (String[])var1.getSource();
         var10001 = (JMenuItem)com.c.c(556828725641436047L).get(this);
      }

      if (var2 == null) {
         if (var10000 == var10001) {
            var3.paste();
            if (var2 == null) {
               return;
            }
         }

         var10000 = (String[])var1.getSource();
         var10001 = (JMenuItem)com.c.c(195824488389063206L).get(this);
      }

      if (var10000 == var10001) {
         var3.selectAll();
      }
   }

   static YJ o() {
      return (YJ)com.c.c(618328928296237087L).get(null);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[8];
      int var11 = 0;
      String var10 = "姅勫SEN\u0005兡适\u000e¢å\bÒö\u0093èdZ\u0084\u009b\u0005簊趰\u008dy\u0095\u0005努刖5ö\u0082\u0005\u000f*Â8Ë";
      int var12 = "姅勫SEN\u0005兡适\u000e¢å\bÒö\u0093èdZ\u0084\u009b\u0005簊趰\u008dy\u0095\u0005努刖5ö\u0082\u0005\u000f*Â8Ë".length();
      char var9 = 5;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 99;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 10;
                        break;
                     case 1:
                        var65 = 5;
                        break;
                     case 2:
                        var65 = 33;
                        break;
                     case 3:
                        var65 = 36;
                        break;
                     case 4:
                        var65 = 11;
                        break;
                     case 5:
                        var65 = 68;
                        break;
                     default:
                        var65 = 106;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     a = var13;
                     b = new String[8];
                     long var0 = 5507968681187707525L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "ÿ¢\u009c\u0003 ò\u0088ìÈ0\u0006iô\\1k\u0011çé$$Õ\u0087\u0086M\u0098¼è[\u0015ºHÓàõæ\u0081g9X\u008a<X\u0082ó#vë";
                     int var5 = "ÿ¢\u009c\u0003 ò\u0088ìÈ0\u0006iô\\1k\u0011çé$$Õ\u0087\u0086M\u0098¼è[\u0015ºHÓàõæ\u0081g9X\u008a<X\u0082ó#vë".length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        long var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    c = var6;
                                    d = new Integer[8];
                                    com.c.c(618328928296237087L).set(null, new YJ());
                                    ((YJ)com.c.c(618328928296237087L).get(null)).addPopupMenuListener(new xY());
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "_ÇÍ_\u0090vÈX\u008f)>\t\u0089;÷¸";
                                 var5 = "_ÇÍ_\u0090vÈX\u008f)>\t\u0089;÷¸".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "ñµ\u0014\u0080dW\u0010ErxàPòEbI\tU\u000fóþy$";
                  var12 = "ñµ\u0014\u0080dW\u0010ErxàPòEbI\tU\u000fóþy$".length();
                  var9 = 6;
                  var17 = -1;
            }

            var10000 = 99;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -740) & 65535;
      if (b[var2] == null) {
         char[] var3 = a[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 165;
               break;
            case 1:
               var10000 = 54;
               break;
            case 2:
               var10000 = 52;
               break;
            case 3:
               var10000 = 193;
               break;
            case 4:
               var10000 = 82;
               break;
            case 5:
               var10000 = 84;
               break;
            case 6:
               var10000 = 157;
               break;
            case 7:
               var10000 = 218;
               break;
            case 8:
               var10000 = 3;
               break;
            case 9:
               var10000 = 224;
               break;
            case 10:
               var10000 = 26;
               break;
            case 11:
               var10000 = 170;
               break;
            case 12:
               var10000 = 168;
               break;
            case 13:
               var10000 = 229;
               break;
            case 14:
               var10000 = 245;
               break;
            case 15:
               var10000 = 176;
               break;
            case 16:
               var10000 = 117;
               break;
            case 17:
               var10000 = 46;
               break;
            case 18:
               var10000 = 34;
               break;
            case 19:
               var10000 = 175;
               break;
            case 20:
               var10000 = 145;
               break;
            case 21:
               var10000 = 235;
               break;
            case 22:
               var10000 = 182;
               break;
            case 23:
               var10000 = 70;
               break;
            case 24:
               var10000 = 249;
               break;
            case 25:
               var10000 = 164;
               break;
            case 26:
               var10000 = 45;
               break;
            case 27:
               var10000 = 32;
               break;
            case 28:
               var10000 = 64;
               break;
            case 29:
               var10000 = 172;
               break;
            case 30:
               var10000 = 39;
               break;
            case 31:
               var10000 = 223;
               break;
            case 32:
               var10000 = 180;
               break;
            case 33:
               var10000 = 101;
               break;
            case 34:
               var10000 = 94;
               break;
            case 35:
               var10000 = 158;
               break;
            case 36:
               var10000 = 14;
               break;
            case 37:
               var10000 = 65;
               break;
            case 38:
               var10000 = 130;
               break;
            case 39:
               var10000 = 86;
               break;
            case 40:
               var10000 = 68;
               break;
            case 41:
               var10000 = 212;
               break;
            case 42:
               var10000 = 200;
               break;
            case 43:
               var10000 = 53;
               break;
            case 44:
               var10000 = 189;
               break;
            case 45:
               var10000 = 138;
               break;
            case 46:
               var10000 = 154;
               break;
            case 47:
               var10000 = 33;
               break;
            case 48:
               var10000 = 162;
               break;
            case 49:
               var10000 = 4;
               break;
            case 50:
               var10000 = 243;
               break;
            case 51:
               var10000 = 20;
               break;
            case 52:
               var10000 = 183;
               break;
            case 53:
               var10000 = 163;
               break;
            case 54:
               var10000 = 88;
               break;
            case 55:
               var10000 = 118;
               break;
            case 56:
               var10000 = 18;
               break;
            case 57:
               var10000 = 137;
               break;
            case 58:
               var10000 = 105;
               break;
            case 59:
               var10000 = 22;
               break;
            case 60:
               var10000 = 190;
               break;
            case 61:
               var10000 = 67;
               break;
            case 62:
               var10000 = 251;
               break;
            case 63:
               var10000 = 181;
               break;
            case 64:
               var10000 = 115;
               break;
            case 65:
               var10000 = 166;
               break;
            case 66:
               var10000 = 129;
               break;
            case 67:
               var10000 = 201;
               break;
            case 68:
               var10000 = 253;
               break;
            case 69:
               var10000 = 171;
               break;
            case 70:
               var10000 = 128;
               break;
            case 71:
               var10000 = 213;
               break;
            case 72:
               var10000 = 161;
               break;
            case 73:
               var10000 = 77;
               break;
            case 74:
               var10000 = 204;
               break;
            case 75:
               var10000 = 211;
               break;
            case 76:
               var10000 = 6;
               break;
            case 77:
               var10000 = 139;
               break;
            case 78:
               var10000 = 91;
               break;
            case 79:
               var10000 = 58;
               break;
            case 80:
               var10000 = 127;
               break;
            case 81:
               var10000 = 146;
               break;
            case 82:
               var10000 = 140;
               break;
            case 83:
               var10000 = 216;
               break;
            case 84:
               var10000 = 143;
               break;
            case 85:
               var10000 = 98;
               break;
            case 86:
               var10000 = 49;
               break;
            case 87:
               var10000 = 79;
               break;
            case 88:
               var10000 = 244;
               break;
            case 89:
               var10000 = 87;
               break;
            case 90:
               var10000 = 186;
               break;
            case 91:
               var10000 = 120;
               break;
            case 92:
               var10000 = 149;
               break;
            case 93:
               var10000 = 207;
               break;
            case 94:
               var10000 = 177;
               break;
            case 95:
               var10000 = 203;
               break;
            case 96:
               var10000 = 112;
               break;
            case 97:
               var10000 = 90;
               break;
            case 98:
               var10000 = 225;
               break;
            case 99:
               var10000 = 113;
               break;
            case 100:
               var10000 = 147;
               break;
            case 101:
               var10000 = 167;
               break;
            case 102:
               var10000 = 41;
               break;
            case 103:
               var10000 = 35;
               break;
            case 104:
               var10000 = 131;
               break;
            case 105:
               var10000 = 111;
               break;
            case 106:
               var10000 = 63;
               break;
            case 107:
               var10000 = 92;
               break;
            case 108:
               var10000 = 199;
               break;
            case 109:
               var10000 = 122;
               break;
            case 110:
               var10000 = 205;
               break;
            case 111:
               var10000 = 72;
               break;
            case 112:
               var10000 = 62;
               break;
            case 113:
               var10000 = 194;
               break;
            case 114:
               var10000 = 155;
               break;
            case 115:
               var10000 = 19;
               break;
            case 116:
               var10000 = 50;
               break;
            case 117:
               var10000 = 8;
               break;
            case 118:
               var10000 = 102;
               break;
            case 119:
               var10000 = 15;
               break;
            case 120:
               var10000 = 61;
               break;
            case 121:
               var10000 = 152;
               break;
            case 122:
               var10000 = 222;
               break;
            case 123:
               var10000 = 209;
               break;
            case 124:
               var10000 = 198;
               break;
            case 125:
               var10000 = 78;
               break;
            case 126:
               var10000 = 220;
               break;
            case 127:
               var10000 = 16;
               break;
            case 128:
               var10000 = 56;
               break;
            case 129:
               var10000 = 1;
               break;
            case 130:
               var10000 = 151;
               break;
            case 131:
               var10000 = 42;
               break;
            case 132:
               var10000 = 178;
               break;
            case 133:
               var10000 = 96;
               break;
            case 134:
               var10000 = 116;
               break;
            case 135:
               var10000 = 119;
               break;
            case 136:
               var10000 = 233;
               break;
            case 137:
               var10000 = 236;
               break;
            case 138:
               var10000 = 60;
               break;
            case 139:
               var10000 = 13;
               break;
            case 140:
               var10000 = 97;
               break;
            case 141:
               var10000 = 108;
               break;
            case 142:
               var10000 = 132;
               break;
            case 143:
               var10000 = 121;
               break;
            case 144:
               var10000 = 214;
               break;
            case 145:
               var10000 = 126;
               break;
            case 146:
               var10000 = 44;
               break;
            case 147:
               var10000 = 66;
               break;
            case 148:
               var10000 = 104;
               break;
            case 149:
               var10000 = 76;
               break;
            case 150:
               var10000 = 221;
               break;
            case 151:
               var10000 = 59;
               break;
            case 152:
               var10000 = 124;
               break;
            case 153:
               var10000 = 255;
               break;
            case 154:
               var10000 = 187;
               break;
            case 155:
               var10000 = 73;
               break;
            case 156:
               var10000 = 150;
               break;
            case 157:
               var10000 = 75;
               break;
            case 158:
               var10000 = 81;
               break;
            case 159:
               var10000 = 232;
               break;
            case 160:
               var10000 = 141;
               break;
            case 161:
               var10000 = 17;
               break;
            case 162:
               var10000 = 206;
               break;
            case 163:
               var10000 = 24;
               break;
            case 164:
               var10000 = 144;
               break;
            case 165:
               var10000 = 43;
               break;
            case 166:
               var10000 = 217;
               break;
            case 167:
               var10000 = 69;
               break;
            case 168:
               var10000 = 57;
               break;
            case 169:
               var10000 = 197;
               break;
            case 170:
               var10000 = 237;
               break;
            case 171:
               var10000 = 173;
               break;
            case 172:
               var10000 = 230;
               break;
            case 173:
               var10000 = 83;
               break;
            case 174:
               var10000 = 25;
               break;
            case 175:
               var10000 = 51;
               break;
            case 176:
               var10000 = 169;
               break;
            case 177:
               var10000 = 240;
               break;
            case 178:
               var10000 = 148;
               break;
            case 179:
               var10000 = 29;
               break;
            case 180:
               var10000 = 156;
               break;
            case 181:
               var10000 = 40;
               break;
            case 182:
               var10000 = 23;
               break;
            case 183:
               var10000 = 254;
               break;
            case 184:
               var10000 = 89;
               break;
            case 185:
               var10000 = 174;
               break;
            case 186:
               var10000 = 55;
               break;
            case 187:
               var10000 = 114;
               break;
            case 188:
               var10000 = 107;
               break;
            case 189:
               var10000 = 21;
               break;
            case 190:
               var10000 = 159;
               break;
            case 191:
               var10000 = 219;
               break;
            case 192:
               var10000 = 85;
               break;
            case 193:
               var10000 = 93;
               break;
            case 194:
               var10000 = 48;
               break;
            case 195:
               var10000 = 227;
               break;
            case 196:
               var10000 = 234;
               break;
            case 197:
               var10000 = 12;
               break;
            case 198:
               var10000 = 241;
               break;
            case 199:
               var10000 = 123;
               break;
            case 200:
               var10000 = 215;
               break;
            case 201:
               var10000 = 188;
               break;
            case 202:
               var10000 = 134;
               break;
            case 203:
               var10000 = 202;
               break;
            case 204:
               var10000 = 252;
               break;
            case 205:
               var10000 = 125;
               break;
            case 206:
               var10000 = 0;
               break;
            case 207:
               var10000 = 247;
               break;
            case 208:
               var10000 = 2;
               break;
            case 209:
               var10000 = 27;
               break;
            case 210:
               var10000 = 28;
               break;
            case 211:
               var10000 = 109;
               break;
            case 212:
               var10000 = 184;
               break;
            case 213:
               var10000 = 99;
               break;
            case 214:
               var10000 = 208;
               break;
            case 215:
               var10000 = 153;
               break;
            case 216:
               var10000 = 106;
               break;
            case 217:
               var10000 = 136;
               break;
            case 218:
               var10000 = 250;
               break;
            case 219:
               var10000 = 242;
               break;
            case 220:
               var10000 = 228;
               break;
            case 221:
               var10000 = 37;
               break;
            case 222:
               var10000 = 238;
               break;
            case 223:
               var10000 = 239;
               break;
            case 224:
               var10000 = 74;
               break;
            case 225:
               var10000 = 135;
               break;
            case 226:
               var10000 = 30;
               break;
            case 227:
               var10000 = 179;
               break;
            case 228:
               var10000 = 38;
               break;
            case 229:
               var10000 = 192;
               break;
            case 230:
               var10000 = 246;
               break;
            case 231:
               var10000 = 80;
               break;
            case 232:
               var10000 = 195;
               break;
            case 233:
               var10000 = 231;
               break;
            case 234:
               var10000 = 160;
               break;
            case 235:
               var10000 = 110;
               break;
            case 236:
               var10000 = 100;
               break;
            case 237:
               var10000 = 9;
               break;
            case 238:
               var10000 = 10;
               break;
            case 239:
               var10000 = 11;
               break;
            case 240:
               var10000 = 36;
               break;
            case 241:
               var10000 = 5;
               break;
            case 242:
               var10000 = 7;
               break;
            case 243:
               var10000 = 71;
               break;
            case 244:
               var10000 = 248;
               break;
            case 245:
               var10000 = 95;
               break;
            case 246:
               var10000 = 196;
               break;
            case 247:
               var10000 = 185;
               break;
            case 248:
               var10000 = 103;
               break;
            case 249:
               var10000 = 210;
               break;
            case 250:
               var10000 = 191;
               break;
            case 251:
               var10000 = 142;
               break;
            case 252:
               var10000 = 226;
               break;
            case 253:
               var10000 = 31;
               break;
            case 254:
               var10000 = 133;
               break;
            default:
               var10000 = 47;
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9319;
      if (d[var3] == null) {
         d[var3] = (int)(c[var3] ^ var1);
      }

      return d[var3];
   }
}





